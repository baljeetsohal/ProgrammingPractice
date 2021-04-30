


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;

	//using comparable in Array of objects
	public class SortEmployeesUsingComparableinArray {

	public static void main(String[] str){
		Employee e1=new Employee("Baljeet","Newgen",5,8);
		Employee e2=new Employee("jaspreet","MetLife",6,5);
		Employee e3=new Employee("Gurjas","GlogalLogic",4,16);
		Employee[] arr=new Employee[]{e1,e2,e3}; 
		
		
		
		for(Employee r:arr){
			System.out.println(r.getName()+ " "+r.getCompany()+ " "+ r.getExp()+" "+r.getSalpackage());
		}
		Arrays.sort(arr);
		for(Employee r:arr){
			System.out.println(r.getName()+ " "+r.getCompany()+ " "+ r.getExp()+" "+r.getSalpackage());
		}
	}

		
	}
		


