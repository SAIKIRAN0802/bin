import java.util.*;
import java.util.Map.Entry;
public class LengthStrings {
	public static void main(String[] args) {
		Map<Integer,Integer> lens=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		for(String s:input.split(" "))
		{
			int leng=s.length();
			lens.put(leng,lens.getOrDefault(leng,0)+1);
		}
		Set<Map.Entry<Integer, Integer>> st=lens.entrySet();
		System.out.println(st.toString());
	}
}
