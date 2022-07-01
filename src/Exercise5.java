import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise5 {
    public Exercise5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word");
        String text = scanner.nextLine();
        String m = "There's not a repeated char";

        char[] textChars = new char[text.length()];
        Set<Character> setChars = new HashSet<Character>();

        text.getChars(0,text.length(),textChars,0);

        for (int i = 0;i<text.length();i++){
            boolean add = setChars.add(Character.toLowerCase(textChars[i]));
            if (add==false){
                System.out.println(Character.toLowerCase(textChars[i]));
                m = "";
                i=text.length();
            }
        }
        System.out.println(m);
    }
}
