import java.util.Arrays;
public class Main {
    public static void quicksort(int[] array, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particionar(array, inicio, fim);
            quicksort(array, inicio, indicePivo - 1);
            quicksort(array, indicePivo + 1, fim);
        }
    }
    private static int particionar(int[] array, int inicio, int fim) {
        int pivo = array[fim];
        int i = inicio - 1;
        for (int j = inicio; j < fim; j++) {

            if (array[j] <= pivo) {
                i++;
                trocar(array, i, j);
            }
        }
        trocar(array, i + 1, fim);
        return i + 1;
    }
    private static void trocar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5};
        System.out.println("Array original: " + Arrays.toString(array));
        quicksort(array, 0, array.length - 1);
        System.out.println("Array ordenado: " + Arrays.toString(array));
    }
}
