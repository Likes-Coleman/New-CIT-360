import java.util.*;

public class CollectionTypes {

    public static void main(String[] args) {

        System.out.println("-- List --");
        //Collection<E>
        List<String> list = new ArrayList();
        list.add("This");
        list.add("is");
        list.add("an");
        list.add("example");
        list.add("of");
        list.add("a");
        list.add("List.");

        /*List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Chicken");
        animals.add("Rabbit");*/

        for (Object str : list) {
            System.out.println((String)str);
        }

        System.out.println("-- Set --");
        Set<String> set = new TreeSet();
        list.add("This");
        list.add("is");
        list.add("an");
        list.add("example");
        list.add("of");
        list.add("a");
        list.add("Set.");

        for (Object str : set) {
            System.out.println((String)str);
        }

        System.out.println("-- Queue --");
        Queue<String> queue = new PriorityQueue();
        queue.add("Hi");
        queue.add("my");
        queue.add("name");
        queue.add("is");
        queue.add("Troy");
        queue.add("Hi");

        Iterator iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }

        System.out.println("-- Map --");
        Map map = new HashMap();
        map.put(1,"Hi");
        map.put(2,"my");
        map.put(3,"name");
        map.put(4,"is");
        map.put(5,"Troy");
        map.put(4,"Hi");

        for (int i = 1; i < 6; i++) {
            String result = (String)map.get(i);
            System.out.println(result);
        }

        System.out.println("-- List using Generics --");
        List<DVDs> myList = new LinkedList<DVDs>();
        myList.add(new DVDs("Star Wars: Episode VII - The Force Awakens", "J.J. Abrams"));
        myList.add(new DVDs("Jurrasic World", "Colin Trevorrow"));
        myList.add(new DVDs("The Dark Knight", "Christopher Nolan"));
        myList.add(new DVDs("Shrek 2", "Andrew Adamson"));

        for (DVDs dvd : myList) {
            System.out.println(dvd);
        }

    }
}