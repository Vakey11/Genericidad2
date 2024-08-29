/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generacidad_tarea;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Generacidad_Tarea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserte numero de persona: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt() - 1;
        LocalDate dateOfBirth = LocalDate.of(2004, 6, 8);
        LocalDate dateOfBirth2 = LocalDate.of(2004, 10, 11);

        
        PersonaDatos persona1 = new PersonaDatos("Jesus", 20 , "Famisanar",dateOfBirth );
        PersonaDatos persona2 = new PersonaDatos("Valentina",19 , "Sanitas",dateOfBirth2);
        
        List<PersonaDatos> lista = new ArrayList<PersonaDatos>();
        lista.add(persona1);
        lista.add(persona2);
        
        Pair<String, Integer> PairDatosP = new Pair<String, Integer>();
        Pair<String, LocalDate> PairDatosEps = new Pair<String, LocalDate>();
        
        PairDatosP.agregar(lista.get(i).getNombre(), lista.get(i).getEdad());
        PairDatosEps.agregar(lista.get(i).getEps(), lista.get(i).getFecha());
        
        System.out.println("Nombre: " + PairDatosP.getFirst());
        System.out.println("Edad: " + PairDatosEps.getSecond());
        System.out.println("Datos del paciente: " + PairDatosP.toString() + PairDatosEps.toString());
    }
 }
    

