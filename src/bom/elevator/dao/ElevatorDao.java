package bom.elevator.dao;

interface ElevatorDao {
	int move();
	int stop();
	int openDoor();
	int closeDoor();
}
