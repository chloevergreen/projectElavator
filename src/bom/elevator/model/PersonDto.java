package bom.elevator.model;

public class PersonDto {
	private int destinationFloor;
	private int inOutState;
	
	public PersonDto() {}
	
	public int getDestinationFloor() {
		return destinationFloor;
	}
	public void setDestinationFloor(int destinationFloor) {
		this.destinationFloor = destinationFloor;
	}
	public int getInOutState() {
		return inOutState;
	}
	public void setInOutState(int inOutState) {
		this.inOutState = inOutState;
	}
	@Override
	public String toString() {
		return "Person [destinationFloor=" + destinationFloor + ", inOutState=" + inOutState + "]";
	}
}
