import java.util.*;
public class HashSetter {

	public static void main(String[] args) {
		HashSet<String> ss=new HashSet<String>();
		ss.add("One");
		ss.add("Two");
		ss.add("Three");
		ss.add("Four");
		ss.add("Five");
		System.out.println(ss);
//		ss.remove("hello");
		System.out.println(ss);
		System.out.println("Set size ="+ss.size());
		System.out.println("Set Status"+ss.isEmpty());

	}

}
