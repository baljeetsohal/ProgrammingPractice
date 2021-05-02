

public final class StudentImmutable {
    
	private final int id;
	private final String name;
	private final Address address;
	
	public int getId() {
		return id;
	}

	public StudentImmutable(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		Address cloneAddress=new Address(address.getBlock(),address.getPlotno(),address.getArea());
		
		this.address = cloneAddress;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address coneaddress=new Address(address.getBlock(),address.getPlotno(),address.getArea());
		return address;
	}
	

	
}
