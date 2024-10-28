package Library_Management_System;

public class BookTitileMismatch  extends RuntimeException
{
	@Override
	public String toString() 
	{
		return getClass()+": Book title should be Java || Sql || Python";
	}
}
