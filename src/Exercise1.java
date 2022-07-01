import java.util.Scanner;

public class Exercise1 {
    public Exercise1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your integer");
        int x = scanner.nextInt();
        /*
        int y = 0;
        while (x!=0){
            y=y*10 + x%10;
            x=x/10;
        }
        System.out.println(y);
         */
        String y;
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(x));
        y=String.valueOf(stringBuffer.reverse());

        System.out.println(Integer.valueOf(y));
    }
}
