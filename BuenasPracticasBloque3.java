
package trabajocleancode;

/**
 *
 * @author jesus
 */
public class BuenasPracticasBloque3 {

    /**
     * Método para sumar dos números.
     *
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return Resultado de la suma.
     */
    static int suma(int a, int b) {
        // Comentario 14: Usa código autoexplicativo
        // El nombre del método 'suma' indica claramente su función.
        return a + b;
    }

    /**
     * Método para multiplicar dos números.
     *
     * @param a Primer número a multiplicar.
     * @param b Segundo número a multiplicar.
     * @return Resultado de la multiplicación.
     */
    static int multiplicacion(int a, int b) {
        // Comentario 14: Usa código autoexplicativo
        // El nombre del método 'multiplicacion' indica claramente su función.
        return a * b;
    }

    /**
     * Método principal que muestra ejemplos de uso.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        // Comentario 13: Los comentarios mienten
        // El siguiente comentario es incorrecto ya que la suma es de a y b, no de a y c.
        // int resultado = suma(a, c);

        // Ejemplo de uso de la suma
        int a = 5;
        int b = 3;
        int resultado = suma(a, b);
        System.out.println("Resultado de la suma: " + resultado);

        // Ejemplo de uso de la multiplicación
        int c = 4;
        int resultadoMultiplicacion = multiplicacion(a, c);
        System.out.println("Resultado de la multiplicación: " + resultadoMultiplicacion);
    }
}
