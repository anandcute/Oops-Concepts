import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;



public class StreamApiDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al =new ArrayList<Integer>(Arrays.asList(20,33,44,55,6,66,66,98,21));

        // STREAM API

        al.stream()
        .sorted(Comparator.reverseOrder())
        .filter(x -> x % 2 == 0)
        .distinct()
        .map(x-> x*2)
        .forEach(x -> System.out.println(x));

        Optional<Integer> m = al.stream()
        .max((a,b)-> a.compareTo(b));
        System.out.println("max " + m);

        Optional<Integer> ma = al.stream()
        .min((a,b)-> a.compareTo(b));
        System.out.println("min " + ma);
        
        

    }
}
