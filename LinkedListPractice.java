import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
/**
 * LinkedList Practice
 *
 * @author Zackery Loy
 * @version 1/12/2026
 */
public class LinkedListPractice
{
  public static void main(String[] args) {
      
      // LinkedLists are the same as an ArrayList until you get to
      // implementation. ArrayLists are just a dynamic array that 
      // copies the terms from the previous to a new array.
      // A linked list is a node that points to the next and previous
      // node
      
      
      // same init 
      LinkedList<String> names1 = new LinkedList<>();
      ArrayList<String> names2 = new ArrayList<>();
      
      names1.add("Zack");
      names1.add("Zoey");
      
      names2.add("Zack");
      names2.add("Zoey");
      
      // both are apart of the collections framework
      Collections.sort(names1);
      Collections.sort(names2);
      
      
      for (int i = 0; i < names1.size(); i++) {
          System.out.print(names1.get(i) + " ");
      }
      
      System.out.println();
      
      for (int i = 0; i < names2.size(); i++) {
          System.out.print(names2.get(i) + " ");
      }
      
      //System.out.println(names.get(0));
      
  }
}
