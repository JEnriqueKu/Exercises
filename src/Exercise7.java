import java.util.HashSet;
import java.util.Set;

public class Exercise7 {
    public Exercise7(){
        int[] list = {13,57,22,1,1,1,13,57,49,22};
        Set<Integer> temp = new HashSet<Integer>();

        for (int i=0;i< list.length;i++){
            temp.add(list[i]);
        }
        temp.remove(temp.stream().max(Integer::compare).get());
        System.out.println(temp.stream().max(Integer::compare).get());
    }
}
