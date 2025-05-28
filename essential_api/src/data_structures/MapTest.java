package data_structures;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> examMarks = new TreeMap<String,Integer>();
		//Map<String,Integer> examMarks = new LinkedHashMap<String,Integer>();
		//Map<String,Integer> examMarks = new HashMap<String,Integer>();
		examMarks.put("mgmg", 200);
		examMarks.put("masapal", 500);
		examMarks.put("zawzaw", 1000);
		examMarks.put("kyawkyawa", 1000);
		examMarks.put("aungaung", 800);
		
		System.out.println(examMarks);
		
		System.out.println("aung aung mark : " + examMarks.get("aungaung"));
		//examMarks.remove("mgmg");
		
		examMarks.remove("mgmg", 200);
		System.out.println(examMarks);
		
		///examMarks.replace("masapal", 400);
		examMarks.replace("masapal", 500, 400);
		System.out.println(examMarks);
		
		System.out.println("contain key ? " + examMarks.containsKey("aungaung"));
		System.out.println("contain value ? " + examMarks.containsValue(200));
		
		
		Set<Entry<String,Integer>> entries = examMarks.entrySet();
		
		for(final Entry<String,Integer> entry:entries){
			System.out.println("Key = " + entry.getKey() + " , " +  " Value = " + entry.getValue());
		}
		
		
		
		
	}

}
