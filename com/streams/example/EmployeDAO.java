package com.streams.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeDAO {
	
	public static List<EmployeDTO> getEmplyeData()
	{
		List<EmployeDTO> emp=new ArrayList<EmployeDTO>();
		emp.add(new EmployeDTO(4,"A4",200000,Arrays.asList("3333","166666","6999999"))) ;
		emp.add(new EmployeDTO(2,"A2",300000,Arrays.asList("2222","266666","7999999"))) ;
		emp.add(new EmployeDTO(1,"A1",100000,Arrays.asList("8888","366666","8999999"))) ;
		emp.add(new EmployeDTO(3,"A3",500000,Arrays.asList("4444","466666","9999999"))) ;
		emp.add(new EmployeDTO(5,"A5",500000,Arrays.asList("7777","566666","10999999"))) ;
		return emp;
	}

}
