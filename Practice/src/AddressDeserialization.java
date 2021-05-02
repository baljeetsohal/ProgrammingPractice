import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AddressDeserialization {
public static void main(String[] args){
	try{
		Address.setState("Ramesh Nagar");
	   ObjectInputStream inputstream=new ObjectInputStream(new FileInputStream(System.getProperty("user.dir")+"//address.txt"));
	   Address add=(Address)inputstream.readObject();
	   
	   System.out.println(add.getState());
	   System.out.println(add.getM());

}catch(Exception e){
	
}}
}
