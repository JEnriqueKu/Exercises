import java.util.Scanner;

//Find first repeated char in a String

public class PTS_Exercise5 {
    public PTS_Exercise5(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        primerRepetido(palabra);
    }

    public static void primerRepetido(String palabra) {
        boolean repetido = false;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) == palabra.charAt(i + 1)) {
                System.out.println(palabra.charAt(i));
                i = palabra.length();
                repetido = true;
            }
        }
        if (!repetido) {
            System.out.println("No hay caracter repetido");
        }
    }
}
