

public class Address {
	private String Block;
	private int plotno;
	private String Area;
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
}
