

	import java.util.ArrayList;
	import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
	import java.util.Iterator;
	import java.util.List;

	//using comparator  to use the experience attribute of Employee to sort the Employees:

public class SortEmployeesUsingComparatorByExp implements Comparator<Employee> {
	public static void main(String[] str){
		
		List<Employee> h=new ArrayList<Employee>(); 
		Employee e1=new Employee("Baljeet","Newgen",5,8);
		Employee e2=new Employee("jaspreet","MetLife",6,5);
		Employee e3=new Employee("Gurjas","GlogalLogic",4,16);
		h.add(e1);h.add(e2);h.add(e3);
		
		for(Employee r:h){
			System.out.println(r.getName()+ " "+r.getCompany()+ " "+ r.getExp()+" "+r.getSalpackage());
		}
		SortEmployeesUsingComparatorByExp obj=new SortEmployeesUsingComparatorByExp();
		Collections.sort(h,obj);
		for(Employee r:h){
			System.out.println(r.getName()+ " "+r.getCompany()+ " "+ r.getExp()+" "+r.getSalpackage());
		}
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getExp()<o2.getExp())return -1;
		else if(o1.getExp()==o2.getExp())return 0;
		else
		return 1;
	}

	

		
	}
		


