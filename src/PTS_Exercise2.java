import java.util.Scanner;

// Checar si un string es palindromo

public class PTS_Exercise2 {
    public PTS_Exercise2(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        palindromo(palabra);
    }
        public static void palindromo(String palabra) {
            String aux1 = "";
            String aux2 = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                if (palabra.charAt(i) != ' ' && palabra.charAt(i) != ',' && palabra.charAt(i) != '.') {
                    aux1 += palabra.charAt(i);
                }
            }
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.charAt(i) != ' ' && palabra.charAt(i) != ',' && palabra.charAt(i) != '.') {
                    aux2 += palabra.charAt(i);
                }
            }
            aux1 = aux1.toUpperCase();
            aux2 = aux2.toUpperCase();
            System.out.println(aux2.equals(aux1));
        }

}
