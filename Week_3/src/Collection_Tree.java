// TreeSet Type
import java.util.*; 
  
class Collection_Tree { 
    public static void main(String[] args) 
    { 
        //Creates the numbers object.
        TreeSet<String> animals = new TreeSet<String>(); 
  
        // String values inputted in.
        animals.add("Dog"); 
        animals.add("Zebra");
        animals.add("Cat"); 
        animals.add("Fish"); 
  
        // Will not allow same values to be entered in twice.
        animals.add("Dog"); 

        // Sorts strings alphabetically.
        for (Object str : animals) {
            System.out.println((String)str);
        }
    } 
} 