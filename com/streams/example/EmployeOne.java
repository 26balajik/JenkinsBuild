package com.streams.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeOne {
	
	public static void main(String arg[]) {
		
		List<EmployeDTO> emp =EmployeDAO.getEmplyeData();
		System.out.println("Employee from DAO"+ emp);
		
		//Collections.sort(emp,(o1,o2) -> o2.getName().compareTo(o1.getName()));
		//System.out.println("Employee from Sort"+ emp);
		//emp.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).(s->System.out.println("Emplye-->"+s));
		emp.stream().sorted(Comparator.comparing(em->em.getSalary())).forEach(s->System.out.println("*************"+s));
		List<EmployeDTO> emp1= emp.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());
		List<String> e = emp1.stream().filter(s->s.getSalary()>300000).map(s->s.getName()).collect(Collectors.toList());
		System.out.println("----"+e);
		int cnt=(int) emp1.stream().filter(s->s.getSalary()>300000).count();
		System.out.println("----"+cnt);
		
      // List<String[]> ls= emp.stream().map(s->s.getPhone()).collect(Collectors.toList());
      // System.out.println("----"+ls);
     //  ls.stream().flatMap(l->Collectors.toList()).forEach(s->System.out.println("Phone"+s));
       //emp.stream().sorted(Comparator.(em->getSalary())).forEach(s->System.out.println("Revisor order->"+s));
       
       Map<String,Integer> mp=new HashMap<String,Integer>();
       mp.put("eight",8);
       mp.put("two",2);
       mp.put("four",4);
       mp.put("three",3);
       mp.put("ten",10);
       
       List<Entry<String, Integer>> entryList = new ArrayList<>(mp.entrySet());
       
       Collections.sort(entryList,(o1, o2) -> o2.getValue()-o1.getValue());
       
       for(Entry<String, Integer> ent : entryList)
       {
    	 //  System.out.println(ent.getKey()+"   "+ent.getValue());
       }
       mp.entrySet().stream().sorted((o1, o2) -> o2.getValue()-o1.getValue()).forEach(s->System.out.println(s.getKey() +"==="+s.getValue()));
       
       
       Stream.of("a","b","c").map(s->s.toUpperCase()).forEach(System.out::println);
       
       List<List<String>> phone= emp.stream().map(em->em.getPhone()).collect(Collectors.toList());
       //System.out.println("---->"+phone);
       
       List<String> phoneCombine= phone.stream().flatMap(p->p.stream()).collect(Collectors.toList());
       System.out.println("---->"+phoneCombine);
       
      // String s= getMatichingName("A4") ?"Name Found in DB":"Not Found";
       System.out.println(getMatichingName("A5"));
       
       Integer indt= Stream.of(1,2,3,4,5).reduce(0,(a,b)->a+b);
      // System.out.print(indt);
       
       List<Integer> num=Arrays.asList(6,2,3,4,5,6,6);
       int sum=0;
       for(Integer i : num)
       {
    	  sum=sum+i; 
       }
      // System.out.print("================>>>"+sum);
       
       //int dta=num.stream().mapToInt(i->i).`().findAny().orElse(0);
       //System.out.print("======dta==========>>>"+dta);
       
       int a,b,c;
       a=5;
       a++;
       System.out.println(a);
       
       a=5;
       b=a++;
       System.out.println(b);
       
       a=5;
       c=++a;
       System.out.println(c);
       
       a=5;
       ++a;
       System.out.println(a);
       
       
       int arr[]= {34,5,2,90,3,200,0,500,3,4,500,600,6,600,6,7};
       
       int big=0;
       
       for(int i=0;i<arr.length;i++)
       {
    	   if(big<arr[i])
    	   {
    		   big=arr[i];
    	   }
       }
       System.out.println("the greatest number in arr is"+big);
       
       
       
       
     
		
	}
	
	static  double getMatichingName(String name)
	{
		List<EmployeDTO> emp =EmployeDAO.getEmplyeData();
		return emp.stream()
		.filter(emp1->emp1.getName().equalsIgnoreCase(name)).
		findAny().map(s->s.getSalary()).get();
		
		
	}
	

}



/*
 * class Mycollection implements Comparator<EmployeDTO> {
 * 
 * @Override public int compare(EmployeDTO o1, EmployeDTO o2) { // TODO
 * Auto-generated method stub //return o1.getId()-o2.getId(); //return (int)
 * (o2.getSalary()-o1.getSalary()); return o2.getName().compareTo(o1.getName());
 * }
 * 
 * }
 */


