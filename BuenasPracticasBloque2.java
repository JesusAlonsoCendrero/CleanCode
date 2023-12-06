package trabajocleancode;

/**
 *
 * @author jesus
 */
public class BuenasPracticasBloque2 {

   public class CleanCodePrinciples {

    // Punto 6: Las funciones deben ser pequeñas
    // Punto 7: Haz una única cosa
    // Punto 8: No abuses de los switch/when
    static void procesarDatos(int[] datos, boolean aplicarAccion) {
        for (int dato : datos) {
            if (aplicarAccion) {
                // Lógica de procesamiento
                procesarDato(dato);
            } else {
                // Otra lógica de procesamiento
                procesarDatoAlternativo(dato);
            }
        }
    }

    private static void procesarDato(int dato) {
        // Lógica específica para procesar un dato
        System.out.println("Procesando dato: " + dato);
    }

    private static void procesarDatoAlternativo(int dato) {
        // Otra lógica específica para procesar un dato de manera alternativa
        System.out.println("Procesando dato alternativo: " + dato);
    }

    // Punto 9: ¿Cuántos argumentos debe tener una función?
    static void realizarOperacion(int numero1, int numero2, char operador) {
        // Lógica para realizar la operación con los números dados y el operador
        System.out.println("Resultado: " + calcularResultado(numero1, numero2, operador));
    }

    private static int calcularResultado(int numero1, int numero2, char operador) {
        // Lógica específica para calcular el resultado
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
                throw new IllegalArgumentException("Operador no válido: " + operador);
        }
    }

    // Punto 10: Evita los "flag arguments"
    static void renderizar(boolean modoOscuro) {
        // Lógica de renderizado basada en el modo oscuro
        if (modoOscuro) {
            System.out.println("Renderizando en modo oscuro");
        } else {
            System.out.println("Renderizando en modo normal");
        }
    }

    // Punto 11: No generes "Side Effects" o efectos colaterales
    static int calcularCuadrado(int numero) {
        // Lógica para calcular el cuadrado del número
        return numero * numero;
    }

    // Punto 12: Don't Repeat Yourself (No te repitas)
    static void imprimirResultado(int resultado) {
        // Lógica para imprimir el resultado
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
}