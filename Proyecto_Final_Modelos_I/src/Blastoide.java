/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Ska1r3x
 */
public class Blastoide extends Carta {

	public Blastoide() {
	this.setVida(150);
            this.setAtaque(100);
		this.setName("Blastoide");
	}

	@Override
	public Carta clone() throws CloneNotSupportedException {
		return (Blastoide) super.clone();
	}
}