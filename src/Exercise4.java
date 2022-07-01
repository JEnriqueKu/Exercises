import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercise4 {
    public Exercise4(){
        // Find repeated elements in a list
        int[] list = {1,1,1,2,3,3,3,3,3,4,6,6};
        Set<Integer> temp = new HashSet<>();
        Set<Integer> repeatedList = new HashSet<>();
        String m = "There aren't repeated elements";

        for (int i=0;i< list.length;i++){
            boolean added = temp.add(list[i]);
            if (added==false){
                repeatedList.add(list[i]);
                m = "";
            }
        }
        for (Integer element : repeatedList){
            System.out.print(element+" ");
        }
        System.out.println(m);
    }

}
