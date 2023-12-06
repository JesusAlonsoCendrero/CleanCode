package trabajocleancode;

/**
 *
 * @author jesus
 */
public class BuenasPracticasBloque1 {

    // Punto 1: Usa nombres con significado
    static int calcularEdadPromedio(int[] edades) {
        int sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        return sumaEdades / edades.length;
    }

    // Punto 2: Usa nombres fáciles de pronunciar
    static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Punto 3: Usa nombres que puedan buscarse
    static final int DIAS_EN_LA_SEMANA = 7;

    static void imprimirDiasSemana() {
        for (int dia = 1; dia <= DIAS_EN_LA_SEMANA; dia++) {
            System.out.println("Día " + dia);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] edades = {25, 30, 22, 28, 35};
        int edadPromedio = calcularEdadPromedio(edades);

        mostrarMensaje("La edad promedio es: " + edadPromedio);

        imprimirDiasSemana();
    }
}
