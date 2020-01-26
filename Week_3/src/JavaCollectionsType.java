
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaCollectionsType {

    public static void main(String[] args) {

        // Simple create list
        List<String> list = Arrays.asList("Likes", "Coleman");

        // You can also create a list like this:
        List<String> anotherList = new ArrayList<>();
        anotherList.add("Likes");
        anotherList.add("Coleman");


        // This prints each element to the console using method references
        list.forEach(System.out::println);
        anotherList.forEach(System.out::println);

    }
}