

public class StudentTest {

	public static void main(String[] args) {
		Address add=new Address("F",106,"Kirti Nagar");
		StudentImmutable student=new StudentImmutable(1,"Baljeet",add);
		System.out.println("Id:"+student.getId()+","+"Name:"+student.getName()+","+student.getAddress().getBlock()+"|"+student.getAddress().getPlotno()+"|"+student.getAddress().getArea());
		add.setArea("Ramesh nagar");
		System.out.println("Id:"+student.getId()+","+"Name:"+student.getName()+","+student.getAddress().getBlock()+"|"+student.getAddress().getPlotno()+"|"+student.getAddress().getArea());


	}

}
