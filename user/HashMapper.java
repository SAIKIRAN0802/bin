import java.util.*;
public class HashMapper {
	public static void main(String args[])
	{
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Sumanth");
		hm.put(5,"sunil");
		hm.put(9,"rod");
		Set<Map.Entry<Integer, String>> st=hm.entrySet();
		for(Map.Entry<Integer, String> me:st)
		{
			System.out.println(me.getKey()+" "+me.getValue());
		}
		
	}
}
