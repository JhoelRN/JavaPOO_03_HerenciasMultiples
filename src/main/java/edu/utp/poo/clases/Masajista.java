/*
   CLASE DERIVADA de SeleccionFutbol
        JERARQUIA CLUB DE FUTBOL
 */
package edu.utp.poo.clases;

/**
 * Versión 1.0
 * @author Jhoel RN MH U17106156@utp.edu.pe
 */
public class Masajista extends SeleccionFutbol{

    //ATRIBUTOS
    private String titulacion;
    private int añosExperiencia;

    //CONSTRUCTORES
    public Masajista() {
    }
    
    public Masajista( int id, String nombres, String apellidos, int edad,String titulacion, int añosExperiencia) {
        super(id, nombres, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    
    
    
    //METODOS
    public void darMasaje() {
        System.out.println("Dando masaje . . .");
    }
}
