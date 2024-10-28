package Library_Management_System;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {

	private int  LibraryId;
	private String Location;
	private Book b;
	
	private ArrayList<Book> book=new ArrayList<Book>();
	
	// AddBooks
	public void addBook(Book b)
	{
		book.add(b);
		System.out.println("Books  are added Successfully");
	}
	// Display Books
	public void displayBooks()
    {
		if(book.isEmpty())
		{
			System.out.println("Books are not added yet.....");
		}
		else
		{
			for(Book b1:book)
			{
				b1.display();
			}
		}
	}
	// SearchBookBasedOnId
	public void SearchBookBasedOnID(int id)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not added Yet...");
		}
		else
		{
			for(Book b1:book)
			{
			   if(b1.getBookid()==id)
			   {
				   System.out.println("Book is Found...."+b1.getTitle());
				   isFound=true;
			   }
			}
			
		}
		if(isFound==false)
		{
			throw new IdOutOfBounce();
		}
	}
	
	// SearchBookBasedOnAuthor
	public void SearchBookBasedOnAuthor(String Author)
	{
		boolean isFound=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not added yet.....");
		}
		else
		{
			for(Book b1:book)
			{
				if(b1.getAuthor().equals(Author))
				{
					System.out.println("Book is Found "+b1.getTitle());
					isFound=true;
				}
			}
		}
		if(isFound==false)
		{
			throw new AuthorMismatch();
		}
		
	}
	
	//UpdateBookCostBasedOnTitle
	public void UpdateBookBasedOnTitle(String Title)
	{
		boolean isUpdate=false;
		if(book.isEmpty())
		{
			System.out.println("Books are not added yet...");
		}
		else
		{
			for(Book b1:book)
			{
			if(b1.getTitle().equals(Title))
			{
				b1.setCost(1000);
				System.out.println("Book is updated..");
				isUpdate=true;
			}
			}
		}	
		if(isUpdate==false)
		{
			throw new BookTitileMismatch();
		}
	
		
	}
	
	//RemoveBookBasedOnID
	public void  RemoveBookBasedOnId(int id)
	{
			Iterator<Book> itr=book.iterator();
			boolean isRemoved=false;
			if(book.isEmpty())
			{
				System.out.println("Books are not added yet.....");
			}
			else
			{
			while(itr.hasNext())
			{
				Book b1=itr.next();
				if(b1.getBookid()==id)
				{
					itr.remove();
					System.out.println("Book is Removed...");
					isRemoved=true;
				}	
		      }
			}
			if(isRemoved!=true)
			{
				System.out.println("Book id is invalid ");
			}
	}
}
