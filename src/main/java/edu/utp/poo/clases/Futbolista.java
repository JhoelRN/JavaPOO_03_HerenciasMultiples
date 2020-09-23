/*
   CLASE DERIVADA de SeleccionFutbol
        JERARQUIA CLUB DE FUTBOL
 */
package edu.utp.poo.clases;

/**
 * Versión 1.0
 * @author Jhoel RN MH U17106156@utp.edu.pe
 */
public class Futbolista extends SeleccionFutbol {

    //ATRIBUTOS
    private int dorsal;
    private String demarcacion;

    //CONSTRUCTORES
    public Futbolista() {
        super(); // para el primer constructor de selecxcion futbol
    }
    

    public Futbolista(int id, String nombres, String apellidos, int edad,
                        int dorsal, String demarcacion) {
        super(id, nombres, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    
    
    
    //METODOS
    public void jugarPartido() {
        System.out.println("Jugando . . .");

    }

    public void entrenar() {
        System.out.println("Entrenando . . .");
    }

 
    
    
    
}
