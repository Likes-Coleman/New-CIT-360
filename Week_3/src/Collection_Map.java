import java.util.HashMap;

public class Collection_Map {
    public static void main(String[] args) {

        // Creates a HashMap object called name
        HashMap<String, String> personInfo = new HashMap<String, String>();

        // Pairs togethor two separate values.
        personInfo.put("John", "First Name");
        personInfo.put("Smith", "Last Name");
        personInfo.put("Age", "43");

        // Outputs the values.
        System.out.println(personInfo);

    }
}
