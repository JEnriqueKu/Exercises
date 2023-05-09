import java.util.Scanner;

//Find the most consecutive occurence character in a String

public class PTS_Exercise6 {
    PTS_Exercise6(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = input.nextLine();
        mostConsecutive(frase);
    }

    public static void mostConsecutive(String frase) {
        int contador = 1;
        int contadorMax = 0;
        char caracter = ' ';
        boolean consecutivo = false;
        for (int i = 0; i < frase.length() - 1; i++) {
            if (frase.charAt(i) == frase.charAt(i + 1)) {
                contador++;
                consecutivo = true;
            } else {
                if (contadorMax >= contador) {
                    contador = 1;
                }
            }
            if (contadorMax < contador) {
                caracter = frase.charAt(i);
                contadorMax = contador;
            }
        }
        if (!consecutivo) {
            System.out.println("Sin caracteres repetidos");
        } else {
            System.out.println("El caracter más repetido es: " + caracter);
        }
    }
}
