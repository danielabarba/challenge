package org.example;


import java.util.ArrayList;
import java.util.Arrays;

public class Main { // MyClass

    public static void main(String args[]) {

        

        // Nombre: David Grupo: 3 - A No. Lista: 24

        // Materia 1: Espaniol 75

        // Materia 2: Matematicas 43

        /*
            1. Separar el string, por saltos de linea
            2. iterar el arreglo
            3. Separar por comas
            4. Diferenciar si es S o N
            5A. Si la linea es S
                Identificar a que posición pertenece cada dato
            4A2. Identificar a que posición pertenece cada dato
            4B.

         */
//alt + enter, y me declara la variable
        String studentsNotes = getNotes();
        String[] lines = studentsNotes.split("\n");
        int n = 0;
        for (String line : lines) {
            String[] data = line.split(", ");
            if (data[0].equals("S")){
                String student = String.format("Nombre: %s Grupo: %s - %s No. Lista: %s", data[4], data[1], data[2], data[3]);
                System.out.println(student);
                n=0;
            }else {
                n++;
                String subject = String.format("Materia %s: %s %s", n, data[1], data[2]);
                System.out.println(subject);
            }
        }
        
        


    }


    public static String getNotes() {

        StringBuilder studentsNotes = new StringBuilder();


        /*

         * S = Student; Where the second value is the school grade,

         *       third is the group, fourth is the number list,

         *       and fifth is the student's name

         *

         * N = Note; Where the second value is the subject's name,

         *       and the third vaue is the final grade

         */

        studentsNotes.append("S, 3, A, 24, David\n");

        studentsNotes.append("N, Espaniol, 75\n");

        studentsNotes.append("N, Matematicas, 43\n");

        studentsNotes.append("S, 3, A, 22, Laura\n");

        studentsNotes.append("N, Espaniol, 96\n");

        studentsNotes.append("N, Matematicas, 75\n");

        studentsNotes.append("S, 3, B, 06, Jorge\n");

        studentsNotes.append("N, Espaniol, 55\n");

        studentsNotes.append("N, Matematicas, 67\n");

        studentsNotes.append("S, 4, A, 06, Maria\n");

        studentsNotes.append("N, Ciencias, 54\n");

        studentsNotes.append("N, Algebra, 72\n");




        return studentsNotes.toString();

    }


}