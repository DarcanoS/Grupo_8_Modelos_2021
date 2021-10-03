
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/*
 * Esta clase realizara la ejecucion de la ventana del juego para ello
 * se extiende de la libreira Canvas e implementamos Runnable para realizar
 * la creacion de mas hilos (thread) para un mejor rendimiento del juego.
 */

/**
 *
 * @author Stivel
 */
public class Juego extends Canvas implements Runnable{
    
    private static JFrame ventana;
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
    private static final String TITULO = "Juego";
    
    private static Thread thread;
    //Variable que ayudara con el funcionamiento del while del hilo Thread_1
    private static volatile boolean enFuncionamiento = false;
    //Frames Por Segundo
    private static int fps = 0;
    
    private Juego(){
        //Dimensiones de la ventana
        setPreferredSize(new Dimension(ANCHO,ALTO));
        
        ventana = new JFrame(TITULO);
        //Permite cerrar el proceso despues de cerrar la ventan
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Impide cambiar el tamaño de la ventana manualmente
        ventana.setResizable(false);
        
        ventana.setLayout(new BorderLayout());
        ventana.add(this, BorderLayout.CENTER);
        ventana.pack();
        ventana.setLocationRelativeTo(null); //Posicion en el centro de la pantalla
        
        ventana.setVisible(true);
    }
    
    //Metodo para iniciar el hilo Thread_1
    public synchronized void iniciar() {
        enFuncionamiento = true;
        
        thread = new Thread(this, "Thread_1");
        thread.start();
    }
    
    //Metodo para detener el hilo 
    public synchronized void detener() throws InterruptedException {
        enFuncionamiento = false;
        //cierra el hilo de forma segura
        thread.join();
    }
    
    //Metodo que corre el Thread_1
    public void run() {
        //nano segundops por cada segundo
        final int NS_POR_SEGUNDO = 1000000000;
        final byte APS = 60; //actializaciones por segundo
        //nano segundos por actualizacion
        final double NS_X_A = NS_POR_SEGUNDO / APS;
        long refActu = System.nanoTime();
        long refCont = System.nanoTime();
        double tiempoTrasnc;
        double delta = 0;
        
        while(enFuncionamiento){
            final long inicioBucle = System.nanoTime();
            
            tiempoTrasnc = inicioBucle - refActu;
            refActu = inicioBucle;
            delta += tiempoTrasnc / NS_X_A;
            
            while(delta >=1){
                actualizar();
                delta--;
            }
            
            mostrar();
            
            //Se imprimiran las FPS en el nombre de la ventana
            //Despues podmeos inprimirlo dentro del canvas
            if(System.nanoTime() - refCont > NS_X_A){
                ventana.setTitle(TITULO + " || FPS: "+ fps);
                fps = 0;
                refCont = System.nanoTime();
            }
            
        }
    }
    
    public void actualizar(){
        
    }
    
    public void mostrar(){
        fps++;
    }
    
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.iniciar();
    }
}

//.