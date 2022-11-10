package com.balajiInfo.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Sample1 {

	public static void main(String[] args) {
	 		
		String s2=" This is a Word this is a word in sentence";
		String[] word=s2.split(" ");

		
		HashMap<String,Integer> map=new HashMap<>();
		
		for (String s3 : word) {
			
			System.out.println("Word-->"+s3.toUpperCase());
			
			if(map.containsKey(s3.toUpperCase()))
			{
				System.out.println("If Word-->"+s3.toUpperCase());
				int num=map.get(s3.toUpperCase());
				num++;
				map.put(s3.toUpperCase(),num);
			}
			else
			{
				System.out.println("else Word-->"+s3.toUpperCase());
				map.put(s3.toUpperCase(),1);
			}
			
		}
		Set<Entry<String, Integer>> s4=map.entrySet();
		System.out.println("set----------------->"+s4.size());
		List<Entry<String, Integer>> listMap =new ArrayList<>(s4);
		System.out.println("Map----------------->"+listMap.size());
		System.out.println("Map----------------->"+listMap.get(1));
		System.out.println("Map----------------->"+listMap);
		Collections.sort(listMap,new Mysorting());
		System.out.println("After Map----------->"+listMap);
	}
}


class Mysorting implements Comparator<Entry<String, Integer>>
{
	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getKey().compareTo(o2.getKey());
	}


}
