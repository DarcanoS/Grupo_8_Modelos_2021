/**
 *
 * @author Ska1r3x
 */

/*clase abtracta */
public abstract class Carta implements Cloneable {
	private String name;
	private int ataque;
        private int vida;
	private int dañorecibido = 0;
//setter y getter para el denombre de la creatura.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
//setter y getter´para el ataque
	public int getAtaque() {
		return ataque;
	}
        
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
//setter y getter para la vida
        public int getVida() {
		return vida - this.dañorecibido;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
//planteamiento de los movimientos principales abierto a modificacion
        public int getmov1() {
		return (int) (ataque * 0.10);
	}
        
        public int getmov2() {
		return (int) (ataque * 0.50);
	}
//metodo de logica de juego puesto para para pruebas de ejecucion, removible.
	public void setDañorecibido(int dañorecibido) {
		this.dañorecibido = dañorecibido;
	}
//metodo clonar
        @Override
	public Carta clone() throws CloneNotSupportedException {
		return (Carta) super.clone();
	}
//pruebas de impresion por consola
	@Override
	public String toString() {
		return "----------\nNombre: "+getName()+"\nVida: " + getVida() + "\nDaño:" + getAtaque();
	}
}