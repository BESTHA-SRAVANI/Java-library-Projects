package Library_Management_System;

public class IdOutOfBounce  extends RuntimeException
{
	public String toString()
	{
		return getClass()+" The Book id should be even";
	}

}
