/*
   CLASE DERIVADA de SeleccionFutbol
        JERARQUIA CLUB DE FUTBOL
 */
package edu.utp.poo.clases;

/**
 * Versión 1.0
 * @author Jhoel RN MH U17106156@utp.edu.pe
 */
public class Entrenador extends SeleccionFutbol{
    
    //ATRIBUTOS
    private String idFederacion;
    
    //CONSTRUCTORES
    public Entrenador() {
        super();
    }
    


    public Entrenador(int id, String nombres, String apellidos, int edad, 
                        String idFederacion) {
        super(id, nombres, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    
    
    //METODOS
    public void dirigirPartido() {
        System.out.println("Dirigiendo Partido . . .");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo Entrenamiento . . .");
    }
    
}
