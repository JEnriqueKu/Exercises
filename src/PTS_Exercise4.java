import java.util.Random;

//Find repeated elements in a list
public class PTS_Exercise4 {
    public PTS_Exercise4(){
        int n = 10;
        int[] lista = new int[n];
        llenarLista(lista, n);
        mostrarLista(lista, n);
        repetidos(lista, n);
    }

    public static void llenarLista(int[] lista, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            lista[i] = rand.nextInt(10) + 1;
        }
    }

    public static void mostrarLista(int[] lista, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public static void repetidos(int[] lista, int n) {
        int[] duplicados = new int[n];
        boolean duplicado;
        System.out.print("Los repetidos son: ");
        for (int i = 0; i < n; i++) {
            duplicados[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (lista[i] == lista[j]) {
                    duplicado = false;
                    for (int k = 0; k < n; k++) {
                        if (duplicados[k] == lista[i]) {
                            duplicado = true;
                            k = n - 1;
                        }
                    }
                    if (!duplicado && i != j) {
                        duplicados[i] = lista[i];
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (duplicados[i] != 0) {
                System.out.print(duplicados[i] + " ");
            }
        }
        System.out.println();
    }

}
