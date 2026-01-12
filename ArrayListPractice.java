import java.util.ArrayList;
import java.util.Collections;
/**
 * Practing syntax and methods of an ArrayList.
 *
 * @author Zackery Loy
 * @version 1/12/2026
 */
public class ArrayListPractice
{

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        
        
        
        names.add("Z");
        names.add("C");
        
        // this sorts the ArrayList alphabetically
        Collections.sort(names);
        
        //traversing an ArrayList and printing each term method #1
        for (int i = 0; i < names.size(); i++) {
            System.out.printf("%s, ",names.get(i));
        }
        
        System.out.println();
        
        // method #2 
        for (String name: names) {
            System.out.println(name);
        }
        
        //System.out.println(names);
        
        
    }
    
    
    
}
