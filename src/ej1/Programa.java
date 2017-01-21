/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1;

/**
 *
 * @author educacionit
 */
public class Programa {

    public static void main(String[] args) {
        Vehiculo v1 = new Vehiculo(2, 3, 15);
        int alt = v1.getAlto();
        int anch = v1.getAncho();
        int larg = v1.getLargo();
        System.out.println("Alto " + alt + " Ancho " + anch + " largo " + larg);
        Persona p1 = new Persona("Marcelo", "Lignac", "21717647");
        int nomb = p1.getNombre();
        int apell = p1.getApellido();
        int doc = p1.getNumeroDocumento();
        System.out.println("Nombre " + nomb + " Apellido " + anch + " documento " + doc);
    }
}
