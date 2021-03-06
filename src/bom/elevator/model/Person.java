package bom.elevator.model;

public class Person {
	private int destinationFloor;
	private int inOutState;
	
	public Person() {}
	
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
