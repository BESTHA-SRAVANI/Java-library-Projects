package Library_Management_System;

public class CostOutOfBounce extends RuntimeException 
{
	@Override
	public String toString()

	{
		return getClass()+"The Book cost should in between 300 to 1000";
	}
}
