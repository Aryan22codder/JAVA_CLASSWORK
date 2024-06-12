package Anudip;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		//TODO Auto-genertaed method sub
		//You can not repeat key
		Map<String,String> map = new HashMap<String , String>();
		map.put("actor", "Sunil");
		map.put("ceo", "Aryan");
		map.put("clerkr", "Swapnil");
		map.put("accountant", "Raj");
		map.put("clerk", "Raman");
		
		System.out.println(map.get("doctor"));
		
		Set<String> designation=map.keySet();
		for(String key:designation)
		{
			System.out.println(map.get(key));
		}
		for(String key:designation)
		{
			System.out.println(key+" "+map.get(key));
		}
		
	}

}
