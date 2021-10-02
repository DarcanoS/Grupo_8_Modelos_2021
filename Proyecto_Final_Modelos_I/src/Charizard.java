/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ska1r3x
 */
public class Charizard extends Carta {

	public Charizard() {
            this.setVida(100);
		this.setAtaque(120);
		this.setName("Charizard");
	}

	@Override
	public Carta clone() throws CloneNotSupportedException {
		return (Charizard) super.clone();
	}
}