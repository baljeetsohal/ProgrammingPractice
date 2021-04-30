

public class Employee implements Comparable<Employee> {
 
	
	private String name;
	private String company;
	private int exp;
	private float Salpackage;
	
	public Employee(){
			
		}

	public Employee(String name, String company, int exp, float salpackage) {
		super();
		this.name = name;
		this.company = company;
		this.exp = exp;
		this.Salpackage = salpackage;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	public float getSalpackage() {
		return Salpackage;
	}
	public void setSalpackage(float salpackage) {
		Salpackage = salpackage;
	}

	@Override
	public int compareTo(Employee  o) {
		// TODO Auto-generated method stub
		return Integer.compare(getExp(),((Employee) o).getExp());
	
	}


	
	
}
