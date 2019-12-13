import java.util.*;
import java.util.Map.Entry;
public class uniquekeyss {
  public static void main(String[] args) {
    Map<String,Integer> lens=new HashMap<>();
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a string");
    String input=sc.nextLine();
    for(String s:input.split(" "))
    {
      lens.put(s,lens.getOrDefault(s,0)+1);
    }
    Set<Map.Entry<String, Integer>> st=lens.entrySet();
    System.out.println(st.toString());
  }
}