import java.util.HashSet;
import java.util.Set;

public class SetCollection {

	

	public static void main(String[] args) {
		Set setobj=new HashSet<>();
		setobj.add("Hello");
		setobj.add("Hello");
		Employee e4=new Employee("Baljeet","Newgen",5,8);
		Employee e5=new Employee("Baljeet","Newgen",5,8);
		Employee e6=e5;
		setobj.add(e4);
		setobj.add(e4);
		setobj.add(e5);
		setobj.add(e6);
		System.out.println(setobj);
	}




}
