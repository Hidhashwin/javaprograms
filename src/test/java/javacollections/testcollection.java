package javacollections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class testcollection {
	
	public void testig() {
		List<String> mylist=new ArrayList<String>();
		List<String> mylist2=new LinkedList<String>();
		
		Set<Integer> set1=new HashSet<Integer>();
		Set<String> set2=new LinkedHashSet<String>();
		TreeSet<String> tree=new TreeSet<String>();
		
		Map<String, Integer> map1=new HashMap<String, Integer>();
		Map<String, Integer> map2=new LinkedHashMap<String, Integer>();
		TreeMap<String, String> map3=new TreeMap<String, String>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
