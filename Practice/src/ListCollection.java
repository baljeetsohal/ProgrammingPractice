

import java.util.ArrayList;
import java.util.List;

public class ListCollection {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Hello");
		System.out.println(list.add("Hello"));
		Employee e1=new Employee("Baljeet","Newgen",5,8);
		Employee e2=new Employee("Gurjas","GlobalLogic",4,16);
		Employee e3=new Employee("Jaspreet","MetLife",4,5);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e3);
		list.add(e3);
		System.out.println(list);
	}

}
