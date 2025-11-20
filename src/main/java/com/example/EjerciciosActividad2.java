package com.example;

public class EjerciciosActividad2 {
    public static void main(String[] args) {
        // --- While ---       

        //Numeros del 1 al 10
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        //Suma acumulativa
        int n = 5;
        int suma = 0;
        int contador = 1;
        while (contador <= n) {
            suma += contador;
            contador++;
        }
        System.out.println("Suma de 1 a " + n + " = " + suma);

        //Ciclo que busca en un array
        int[] numerosBuscar = {2, 5, 8, 3, 9};
        int buscar = 8;
        int pos = 0;
        boolean encontrado = false;
        while (pos < numerosBuscar.length) {
            if (numerosBuscar[pos] == buscar) {
                encontrado = true;
                break;
            }
            pos++;
        }
        System.out.println("Número " + buscar + " encontrado: " + encontrado);
        


        // --- Do-while ---       

        //Menú interactivo con la opcion de salir
        int opcion = 3; // Valor fijo para salir
        do {
            System.out.println("1. Opción A");
            System.out.println("2. Opción B");
            System.out.println("3. Salir");
            System.out.println("Elegiste: " + opcion);
        } while (opcion != 3);
        System.out.println("Saliendo...");


        // --- For ---       

        //Numeros pares del 2 al 20
        for (int j = 2; j <= 20; j += 2) {
            System.out.print(j + " ");
        }

        //Numero factorial
        int numFact = 5;
        long factorial = 1;
        for (int k = 1; k <= numFact; k++) {
            factorial *= k;
        }
        System.out.println("Factorial de " + numFact + " = " + factorial);
        



        // --- For-each ---       


        //Suma de elementos de un arreglo

        int[] datos = {1, 2, 3, 4, 5};
        int sumaForEach = 0;
        for (int valor : datos) {
            sumaForEach += valor;
        }
        System.out.println("Suma = " + sumaForEach);

        // --- Break y Continue ---       

        //Break en ciclo for
        for (int x = 1; x <= 10; x++) {
            if (x == 6) {
                System.out.println("Encontrado 6 - break");
                break;
            }
            System.out.print(x + " ");
        }

    }
}