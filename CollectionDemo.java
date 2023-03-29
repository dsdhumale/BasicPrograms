import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Devendra");
        names.add("Deven");
        names.add(1, "Suchit");
        System.out.println(names);
        names.forEach(n -> System.out.println(n));
        ArrayList<String> name = new ArrayList<>();
        name.add("Devendr");
        name.add("Deve");
        name.add(1, "Suchit");
        System.out.println(name);
        names.addAll(name);
        System.out.println(names);
        names.remove(3);
        System.out.println(names);
        name.clear();
        System.out.println(name);
        names.set(0, "present");
        System.out.println(names);
        System.out.println(names.contains("presen"));
        System.out.println(names.size());
        
        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            System.out.println("Iterate "+ it.next());
        }


        


    }
}
