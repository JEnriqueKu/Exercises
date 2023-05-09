import java.util.Scanner;

//Reverse an integer

public class PTS_Exercise1 {
    public PTS_Exercise1(){
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = input.nextInt();
        System.out.println(reverse(num));
    }
    public int reverse(int num) {
        int inverted = 0;
        while (num >= 1) {
            inverted = inverted * 10 + num % 10;
            num = num / 10;
        }
        return inverted;
    }
}
