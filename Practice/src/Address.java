import java.io.Serializable;

public class Address implements Serializable {
	private static String state="kirti nagar";
	private String Block;
	private int plotno;
	private String Area;
	private transient int m=98;
	public void setBlock(String block) {
		Block = block;
	}
	public void setPlotno(int plotno) {
		this.plotno = plotno;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getBlock() {
		return Block;
	}
	public int getPlotno() {
		return plotno;
	}
	public String getArea() {
		return Area;
	}
	public Address(String block, int plotno, String area) {
		super();
		Block = block;
		this.plotno = plotno;
		Area = area;
	}
	public static String getState() {
		return state;
	}
	public int getM() {
		return m;
	}
	public static void setState(String state) {
		Address.state = state;
	}
	public void setM(int m) {
		this.m = m;
	}
}
