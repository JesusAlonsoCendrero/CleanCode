/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajocleancode;

/**
 *
 * @author jesus
 */
public class MalasPracticasBloque3 {

    /**
     * Método para sumar dos números.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la suma.
     */
    static int operacionSuma(int a, int b) {
        // Comentario 13: Los comentarios mienten
        // En este comentario se menciona la suma, pero en realidad estamos restando.
        return a - b;
    }

    /**
     * Método que realiza operación matemática compleja.
     *
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @return Resultado de la operación.
     */
    static int operacionCompleja(int a, int b, int c) {
        // Comentario 16: Los comentarios dicen qué hace el código, no cómo lo hace
        // En este comentario se explica cómo funciona la operación paso a paso.
        // Aunque podría ser útil, este nivel de detalle debería estar en el código, no en el comentario.
        int resultadoParcial1 = a * b;
        int resultadoParcial2 = resultadoParcial1 + c;
        int resultadoParcial3 = resultadoParcial2 / 2;
        return resultadoParcial3;
    }

    /**
     * Método principal que muestra ejemplos de uso.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Comentario 14: Usa código autoexplicativo
        // El siguiente comentario es innecesario porque el nombre del método ya indica que es una operación de suma.
        int resultadoSuma = operacionSuma(5, 3);

        // Comentario 15: A veces los comentarios son necesarios
        // En este caso, el comentario es innecesario y no aporta información adicional.
        int resultadoOperacionCompleja = operacionCompleja(2, 4, 6);

        // Impresión de resultados
        System.out.println("Resultado de la suma: " + resultadoSuma);
        System.out.println("Resultado de la operación compleja: " + resultadoOperacionCompleja);
    }
}
