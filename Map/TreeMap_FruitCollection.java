package Anudip;
import java.util.*;
import java.util.TreeMap;


public class TreeMap_FruitCollection {
	
	public static void main(String[] args){
	//TODO Auto-Generated method stub
	TreeMap<String, Integer> fruits= new TreeMap<String, Integer>();
	
	//inserting element to the tree
	fruits.put("Apple", 200);
	fruits.put("Banana",100);
	fruits.put("Cherry",50);
	fruits.put("Mango",200);
	System.out.println(fruits);
	
	Map<String, Integer> morefruits= new TreeMap<String, Integer>();
	
	morefruits.put("Strawberry", 150);
	morefruits.put("jackfruit", 80);
	morefruits.put("lichi", 180);
	
	fruits.putAll(morefruits);
	
	System.out.println(fruits);
	
	//get the element
	System.out.println("The value of searched key is" +fruits.get("Mango"));
	
	//remove the element
	fruits.remove("Cherry");
	System.out.println("List after removing cherry");
	System.out.println(fruits);
	
	//remove all
	fruits.clear();
	System.out.println(fruits);
	
	//add
	fruits.put("Watermelon", 230);
	System.out.println(fruits);
	
}
}

