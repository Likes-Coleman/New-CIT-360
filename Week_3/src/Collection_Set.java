
import java.util.Set;
import java.util.HashSet;

public class Collection_Set {
    public static void main(String[] args) {

        // This creates a value of setString and is added to the set.
        Set setString = new HashSet();
        String element = "String 1";
        setString.add(element);

        // Outputs if setString has been added to the collection set.
        System.out.println(setString.contains(element));

    }
}