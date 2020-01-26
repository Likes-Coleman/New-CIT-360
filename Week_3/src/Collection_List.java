import java.util.ArrayList;
import java.util.List;

public class Collection_List {
    public static void main(String[] args) {

        // Creates a List object called animals.
        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Chicken");
        animals.add("Rabbit");

        // Simple loop to output on each line.
        for (Object str : animals) {
            System.out.println((String) str);
        }

    }
}
