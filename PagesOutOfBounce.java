package Library_Management_System;

public class PagesOutOfBounce  extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": you should enter the pages in between 500 t0 1000 pages";
	}

}
