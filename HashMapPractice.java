import java.util.HashMap;
/**
 * HashMap Practice
 *
 * @author Zackery Loy
 * @version 1/12/2026
 */
public class HashMapPractice
{
   public static void main(String[] args) {
       
       // a hashmap is key-value pairs
       
       HashMap<String,Integer> employee = new HashMap<>();
       
       
       employee.put("Zack",920011542);
       employee.put("John",8675309);
       
       
       System.out.println(employee);
       
       System.out.println(employee.get("Zack"));
       
       System.out.println(employee.containsKey("John"));
       
       System.out.println(employee.containsValue(8675309));
       
       employee.put("Zack", 1111);
       System.out.println(employee);
       
       employee.replace("Zack",2222);
       System.out.println(employee);
       
       employee.putIfAbsent("Zoey",1232);
       System.out.println(employee);
       
       employee.remove("John");
       System.out.println(employee);
       
        
       
   }
}
