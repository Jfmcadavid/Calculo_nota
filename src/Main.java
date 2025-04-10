import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*desarollar un sistema de notas para un estudiante que desea saber su nota final de cada materia*/
        /*El sistema debe pedir: nombre del estudiante, documento, programa en el cual esta matriculado (menu de opciones: desarrollo de software, diseño grafico, gastronomia)
        el calculo de notas es de lam siguiente manera:
        debe permitir seleccionar la materia(menu de opciones):
        Desarrollo: Lógica, Metodología, Introducción
        Gastronomia: Costos, panadería dulce, cocina internacional
        Diseño: Tipografía, Iconografía, Semantica
        El calculo de las materias se es de la siguiente manera:
        * Para cada matería se evalua:
            -examen parcial que equivale al 20% de la nota.
            -Taller que equivale al 30% de la nota
            -Examen Final equivalente al 50% de la nota

        * De acuerdo al promedio determinar
            - Si la nota esta entre 0 y 2.0 el estudiante pierde sin opcion a plan de mejoramiento
            - Si la nota esta entre 2.1 y 2.9 el estudiante tendra la opcion de plan de mejoramiento calificando con maxima calificacion 3.0
            - Si la nota es igual o superior a 3.0 esta sera la nota definitiva de la materia

        Los datos de salida comprenden:
            - Informacion general del estudiante
            - nombre, documento, nota materia
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = leer.nextLine();
        System.out.println("Ingrese el documento del estudiante: ");
        String documentoEstudiante = leer.nextLine();

        /*Condicional multiple o sentencia switch*/
        System.out.println("Elija el programa que se encuentra cursando: \n1.Desarrollo de Software \n2.Diseño Gráfico \n3.Cocina");
        String Programa = leer.nextLine();
        switch (Programa){
            case "1":
                System.out.println("Programa de desarrollo de Software");
                System.out.println("Seleccione la materia a ingresar: \n1.Lógica de Programación \n2.Introducción a la programación \n3.Metologías ágiles");
                String Materia= leer.nextLine();
                        switch (Materia){
                            case"1":
                                System.out.println("Nota lógica de Programación");
                                break;
                            case"2":
                                System.out.println("Nota Introducción a la Programación");
                                break;
                            case"3":
                                System.out.println("Nota Metodologías ágiles");
                                break;
                        }
                break;
            case"2":
                System.out.println("Programa de Diseño grafico");
                break;
            case"3":
                System.out.println("Programa de cocina");
                break;
        }

    }
}