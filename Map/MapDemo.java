package Anudip;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {
	Map<Integer , String> user = new HashMap<Integer , String>();
	
	user.put(101, "Raj");
	user.put(102, "Sham");
	user.put(103, "Simran");
	user.put(104, "Viraj");
	
	System.out.println(user);
	
}

}