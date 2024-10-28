package Library_Management_System;

public class AuthorMismatch extends RuntimeException
{
	@Override
	public String toString()
	{
		return getClass()+": The author should be Scott or James or Tom";
	}

}
