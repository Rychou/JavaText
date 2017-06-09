package Review.Night;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by Administrator on 2017/6/7.
 */
public class Text {
    public static void main(String[] args){
        Worker w1 = new Worker("wang",19,2903.3);
        Worker w2 = new Worker("song",19,2923.3);
        Worker w3 = new Worker("wang",19,2222.3);
        Worker w4 = new Worker("song",20,2903.3);
        Set<Worker> set = new HashSet<Worker>();
        set.add(w1);
        set.add(w2);
        set.add(w3);
        set.add(w4);
        System.out.println(set.toString());
    }
}
