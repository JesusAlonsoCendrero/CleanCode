package trabajocleancode;

/**
 *
 * @author jesus
 */
public class MalasPracticasBloque2 {

    // Punto 6: Las funciones deben ser pequeñas
    // Punto 7: Haz una única cosa
    // Punto 8: No abuses de los switch/when
    static void procesarDatos(int[] datos, boolean aplicarAccion) {
        for (int dato : datos) {
            // Lógica de procesamiento combinada, difícil de entender
            if (aplicarAccion) {
                System.out.println("Procesando dato: " + dato);
            } else {
                System.out.println("Procesando dato alternativo: " + dato);
            }
            // Lógica de procesamiento adicional, dificulta la lectura
            // ...
        }
    }

    // Punto 9: ¿Cuántos argumentos debe tener una función?
    static void realizarOperacion(int numero1, int numero2, char operador) {
        // Lógica para realizar la operación con los números dados y el operador
        System.out.println("Resultado: " + calcularResultado(numero1, numero2, operador));
    }

    private static int calcularResultado(int numero1, int numero2, char operador) {
        // Lógica específica para calcular el resultado
        // Uso de switch con múltiples responsabilidades
        switch (operador) {
            case '+':
                return numero1 + numero2;
            case '-':
                return numero1 - numero2;
            case '*':
                return numero1 * numero2;
            case '/':
                return numero1 / numero2;
            default:
                return 0; // Valor predeterminado poco claro
        }
    }

    // Punto 10: Evita los "flag arguments"
    static void renderizar(boolean modoOscuro) {
        // Lógica de renderizado basada en el modo oscuro, pero poco claro
        System.out.println("Renderizando en modo " + (modoOscuro ? "oscuro" : "normal"));
    }

    // Punto 11: No generes "Side Effects" o efectos colaterales
    static int calcularCuadrado(int numero) {
        // Lógica para calcular el cuadrado del número, pero también imprime
        int resultado = numero * numero;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }

    // Punto 12: Don't Repeat Yourself (No te repitas)
    static void imprimirResultado(int resultado) {
        // Lógica para imprimir el resultado, duplicada de la función anterior
        System.out.println("Resultado: " + resultado);
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5};
        boolean aplicarAccion = true;

        // Ejemplos de uso
        procesarDatos(datos, aplicarAccion);

        realizarOperacion(10, 5, '+');

        renderizar(true);

        int cuadrado = calcularCuadrado(6);
        imprimirResultado(cuadrado);
    }
}
