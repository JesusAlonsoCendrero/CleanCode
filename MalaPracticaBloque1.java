/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajocleancode;

/**
 *
 * @author jesus
 */
public class MalaPracticaBloque1 {

    // Mala Práctica 1: Nombres sin significado
    static int calc(int[] a) {
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s / a.length;
    }

    // Mala Práctica 2: Nombres difíciles de pronunciar
    static void mtrMen(String m) {
        System.out.println(m);
    }

    // Mala Práctica 3: Nombres que no se pueden buscar fácilmente
    static final int D = 7;

    static void ImprimirDias() {
        for (int d = 1; d <= D; d++) {
            System.out.println("Día " + d);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] edades = {25, 30, 22, 28, 35};
        int PromedioAgeee = calc(edades);

        mtrMen("Promedio de edades: " + PromedioAgeee);

        ImprimirDias();
    }
}