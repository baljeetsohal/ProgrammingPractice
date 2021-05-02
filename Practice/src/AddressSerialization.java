import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AddressSerialization {

	public static void main(String[] args) {
		Address add=new Address("F",106,"Kirti Nagar");
		System.out.println(System.getProperty("user.dir"));
		File f=new File(System.getProperty("user.dir")+"\\address.txt");
		try{
		FileOutputStream file=new FileOutputStream(f);
		ObjectOutputStream outputstream=new ObjectOutputStream(file);
		outputstream.writeObject(add);
		outputstream.flush();outputstream.close();
	
	   
	   
		}
	
	catch(Exception exp){
	}

	}
}
