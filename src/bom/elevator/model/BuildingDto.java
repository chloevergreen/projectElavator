package bom.elevator.model;

public class Building 
{
	private double floorCount;
	private double basementFloorRange;
	private double lowFloorRange;
	private double highFloorRange;
	
	public Building() {	}
	
	public double getFloorCount() {
		return floorCount;
	}
	public void setFloorCount(double floorCount) {
		this.floorCount = floorCount;
	}
	public double getBasementFloorRange() {
		return basementFloorRange;
	}
	public void setBasementFloorRange(double basementFloorRange) {
		this.basementFloorRange = basementFloorRange;
	}
	public double getLowFloorRange() {
		return lowFloorRange;
	}
	public void setLowFloorRange(double lowFloorRange) {
		this.lowFloorRange = lowFloorRange;
	}
	public double getHighFloorRange() {
		return highFloorRange;
	}
	public void setHighFloorRange(double highFloorRange) {
		this.highFloorRange = highFloorRange;
	}

	@Override
	public String toString() {
		return "Building [floorCount=" + floorCount + ", basementFloorRange=" + basementFloorRange + ", lowFloorRange="
				+ lowFloorRange + ", highFloorRange=" + highFloorRange + "]";
	}
	
}
