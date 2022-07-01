import java.util.Scanner;

public class Exercise2 {
    public Exercise2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text");
        String text = scanner.nextLine();
        /*
        String textR="";
        int x = text.length();
        System.out.println(x);
        for (int i =x-1;i>=0;i--){
            textR=textR+text.charAt(i);
            System.out.println(textR);
        }
        System.out.println(textR);
         */
        StringBuffer stringBuffer = new StringBuffer(text);
        String textR = String.valueOf(stringBuffer.reverse());
        System.out.println(text.equalsIgnoreCase(textR));
    }
}
