/*
 * CLASE PADRE
     JERARQUIA CLUB DE FUTBOL
 */
package edu.utp.poo.clases;
/**
 * Versión 1.0
 * @author Jhoel RN MH U17106156@utp.edu.pe
 */
public class SeleccionFutbol {
    
    // ATRIBUTOS
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected int edad;
    
    //CONSTRUCTORES
    public SeleccionFutbol(){  // primer constructor
        this.id = 0;
        this.nombres = "";
        this.apellidos = "";
        this.edad = 0;
        
    }
    
    public SeleccionFutbol(int id, String nombres, String apellidos, int edad) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
    //METODOS GETTER Y SETTER
    public int getId() {        return id;    }
    public void setId(int id) {        this.id = id;    }
    public String getNombres() {        return nombres;    }
    public void setNombres(String nombres) {        this.nombres = nombres;    }
    public String getApellidos() {        return apellidos;    }
    public void setApellidos(String apellidos) {        this.apellidos = apellidos;    }
    public int getEdad() {        return edad;    }
    public void setEdad(int edad) {        this.edad = edad;    }

    //METODOS PUBLICOS
    public void concentrarse() {
        System.out.println("Concentradose ...");
    }


    public void viajar() {
        System.out.println("Viajando ...");
    }
   
}
