import java.util.*;

public class Exercise6 {
    public Exercise6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.nextLine();

        char[] wordChars = new char[word.length()];
        ArrayList<Integer> temp = new ArrayList<>();
        int counter = 1;

        word.getChars(0,word.length(),wordChars,0);

        for (int i=1;i<word.length();i++){
            if (wordChars[i]==wordChars[i-1]){
                counter++;
            } else {
                counter=1;
            }
            temp.add(counter);
        }
        System.out.println(wordChars[temp.indexOf(temp.stream().max(Integer::compare).get())]);
    }
}
