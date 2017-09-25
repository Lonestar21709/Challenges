package Maps;

import java.util.*;

public class Employees {
	public static String[][] employeeArray =
		{
			{"a1234", "Steve Jobs"},
			{"a1235", "Scott McNealy"},
			{"a1236", "Jeff Bezos"},
			{"a1237", "Larry Ellison"},
			{"a1238", "Bill Gates"}
		};
	
	
	public static Map<String, String> employeeMap = new HashMap<>();
	static {
		for(String[] employee: employeeArray){
			employeeMap.put(employee[0], employee[1]);
		}
	}
	
	
	public static String ID(String employeeID){
		return(employeeMap.getOrDefault(employeeID, "[NONE]"));
	}
	
	public static Map<String, String> getEmployeeMap(){
		return(employeeMap);
	}
	
	public static String[][] getEmployeeArray(){
		return(employeeArray);
	}
	
	private Employees(){} //cannot instantiate class, only call methods
}
