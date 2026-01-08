import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        List<Integer> numInteiros = new ArrayList<>();

        numInteiros.add(5);
        numInteiros.add(3);
        numInteiros.add(4);
        numInteiros.add(1);
        numInteiros.add(2);

        Collections.sort(numInteiros);

        System.out.println(numInteiros);

    }
}
