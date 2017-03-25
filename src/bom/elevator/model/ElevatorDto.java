package bom.elevator.model;

public class ElevatorDto {
	private int speedType;
	private int floorType;
	private String name;
	private int currentFloor;
	private double speed;
	private int peopleLimit;
	private double timer;
	private int upDownState;
	private int moveState;
	private int workState;
	private int fullState;
	private int doorState;
	
	public ElevatorDto() {	}
	
	public int getSpeedType() {
		return speedType;
	}
	public void setSpeedType(int speedType) {
		this.speedType = speedType;
	}
	public int getFloorType() {
		return floorType;
	}
	public void setFloorType(int floorType) {
		this.floorType = floorType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCurrentFloor() {
		return currentFloor;
	}
	public void setCurrentFloor(int currentFloor) {
		this.currentFloor = currentFloor;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public int getPeopleLimit() {
		return peopleLimit;
	}
	public void setPeopleLimit(int peopleLimit) {
		this.peopleLimit = peopleLimit;
	}
	public double getTimer() {
		return timer;
	}
	public void setTimer(double timer) {
		this.timer = timer;
	}
	public int getUpDownState() {
		return upDownState;
	}
	public void setUpDownState(int upDownState) {
		this.upDownState = upDownState;
	}
	public int getMoveState() {
		return moveState;
	}
	public void setMoveState(int moveState) {
		this.moveState = moveState;
	}
	public int getWorkState() {
		return workState;
	}
	public void setWorkState(int workState) {
		this.workState = workState;
	}
	public int getFullState() {
		return fullState;
	}
	public void setFullState(int fullState) {
		this.fullState = fullState;
	}
	public int getDoorState() {
		return doorState;
	}
	public void setDoorState(int doorState) {
		this.doorState = doorState;
	}
	@Override
	public String toString() {
		return "Elavator [speedType=" + speedType + ", floorType=" + floorType + ", name=" + name + ", currentFloor="
				+ currentFloor + ", speed=" + speed + ", peopleLimit=" + peopleLimit + ", timer=" + timer
				+ ", upDownState=" + upDownState + ", moveState=" + moveState + ", workState=" + workState
				+ ", fullState=" + fullState + ", doorState=" + doorState + "]";
	}
}
