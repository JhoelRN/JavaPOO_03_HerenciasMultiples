/*
 * Ejemplo de Jerarquia de clases Club de futbol en base a Herencia
 */
package edu.utp.poo.ejemplo06_jerarquia_clubfutbol;
import edu.utp.poo.clases.*;
import java.util.ArrayList;
/**
 * Versión 1.0
 * @author Jhoel RN MH U17106156@utp.edu.pe
 */
public class mainClubFutbol {
    
    //LISTA DE INTEGRANTES DEL CLUB, INCLUYE: Futbolistas, entrenadores, y masajistas
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        
        //CREAMOS LAS INSTANCIAS
        Entrenador gareca = new Entrenador(1,"Ricardo","Gareca",60,"2574478");
        Futbolista paolo = new Futbolista(2,"Paolo","Guerrero",30,9,"Delantero");
        Masajista raul = new Masajista(3,"Raul","Martinez",41,"Licenciado en Fisoterapia",10);
        
        //AGREGAMOS INSTANCIA A LA LISTA
        integrantes.add(gareca);
        integrantes.add(paolo);
        integrantes.add(raul);
        
        //IMPRIMIR ELEMENTOS DE LA LISTA
        
        //CONCENTRACION
        System.out.println("CONCENTRACIÓN DEL EQUIPO");        
        for(SeleccionFutbol integrante : integrantes){
            
            System.out.print(integrante.getNombres() + " " 
                                        + integrante.getApellidos()+ " => ");
            integrante.concentrarse();
        }
        
        //VIAJE
        System.out.println("VIAJE DEL EQUIPO");        
        for(SeleccionFutbol integrante : integrantes){
            
            System.out.print(integrante.getNombres() + " " 
                                        + integrante.getApellidos()+ " => ");
            integrante.viajar();
        }
        
        //ENTRENAMIENTO
        System.out.println("ENTRENAMIENTO DEL EQUIPO");        
            System.out.print(gareca.getNombres() + " " 
                                        + gareca.getApellidos()+ " => ");
            gareca.dirigirEntrenamiento();
            
            System.out.print(paolo.getNombres() + " " 
                                        + paolo.getApellidos()+ " => ");
            paolo.entrenar();
        
            
        //DANDO MASAJES
        System.out.println("DANDO MASAJES AL EQUIPO");        
            System.out.print(raul.getNombres() + " " 
                                        + raul.getApellidos()+ " => ");
            raul.darMasaje();
        
            
            
        //filtrando los tipos de clases
        System.out.println("\n JUGANDO PARTIDO");        
        for(SeleccionFutbol integrante : integrantes){ // es un for each 
            // recorre a todos los integrantes
            
            // si el objeto es una instancia de la clase Entrenador
            if(integrante instanceof Entrenador){
                System.out.print(integrante.getNombres()+" "
                                    + integrante.getApellidos()+ " => ");
            
                ((Entrenador) integrante).dirigirPartido();
            }
            
            // si el objeto es una instancia de la clase Futbolista
            if(integrante instanceof Futbolista){ // ¿el integrante es de tipo Futbolista?
                System.out.print(integrante.getNombres()+" "
                                    + integrante.getApellidos()+ " => ");
            
                ((Futbolista) integrante).jugarPartido();
            }
        }
    }
}
