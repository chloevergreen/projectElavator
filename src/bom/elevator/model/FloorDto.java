package bom.elevator.model;

public class Floor {
	int floorNum;
	
	public Floor() {}
	
	public int getFloorNum() {
		return floorNum;
	}
	public void setFloorNum(int floorNum) {
		this.floorNum = floorNum;
	}

	@Override
	public String toString() {
		return "Floor [floorNum=" + floorNum + "]";
	}
}
