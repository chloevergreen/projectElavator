package bom.elevator.util;

import bom.elevator.model.BuildingDto;
import bom.elevator.model.ElevatorDto;

public class drawElevatorUtil 
{
	public String draqElevatorUtil(int floorType)
	{
		ElevatorDto elv = new ElevatorDto();
		BuildingDto bulding = new BuildingDto();
		
		floorType = elv.getFloorType();
		
		String tblElv = "<table class='' name=''><tr>";
		 
		for(int i=0; i<bulding.getFloorCount(); i++)
		{
			tblElv = "<td></td>";
		}
		tblElv = "</tr></table>";
		return tblElv;
	}
}
