package com.flippity.ei.common.constants;

public class CableConstants {
	//if true, this will make the player take no damage from touching the cable if the cable has power
	public static boolean isInsulated;
	public static boolean isPowered;

	
	//copper
	//amount of energy loss per tick
	public static int copperLoss = 4;
	//amount of energy that can be stored 
	public static int copperBuffer = 12800;
	//amount of energy that can be moved
	public static int copperTransfer = 64;
	
	//superconductor
	//amount of energy loss per tick
	public static int superLoss = 0;
	//amount of energy that can be stored
	public static int superBuffer = 100240;
	//amount of energy that can be moved
	public static int superTransfer = 1024;
	
}
