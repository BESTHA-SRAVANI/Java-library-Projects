package Library_Management_System;
import java.util.*;
public class Book
{
	private String title;
	private int bookid;
	private int cost;
	private int noOfPages;
	private String Author;
	
	public Book() {}

	public Book(String title, int bookid, int cost, int noOfPages, String Author)
	{
		//validate Id
		if(ValidateTitle(title))
		{
			this.title = title;
		}
		else
		{
			throw new BookTitileMismatch();
		}
		//validate Id
		if(ValidateId(bookid))
		{
			this.bookid = bookid;
		}
		else
		{
			throw new IdOutOfBounce();
		}
		
		//validate Cost
		if(ValidateCost(cost))
		{
			this.cost = cost;
		}
		else
		{
			throw new CostOutOfBounce();
		}
		
		
		// validate pages
		if(Validatepages(noOfPages))
		{
			this.noOfPages = noOfPages;
		}
		else
		{
			throw new PagesOutOfBounce();
		}
		this.Author = Author;
		
		//validate Author
		if(ValidateAuthor(Author))
		{
			this.Author=Author;
		}
		else
		{
			throw new AuthorMismatch();
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}
	

	@Override
	public String toString() {
		return "Books \n" + title + "\n bookid=" + bookid + "\n cost=" + cost + "\n noOfPages=" + noOfPages
				+ "\n  Author=" + Author + "\n----------------";
	}
    
	//validate title
	public boolean ValidateTitle(String title)
	{
		if(title.equals("Java") || title.equals("Sql")|| title.equals("Pyhton"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//validate book id
	public boolean ValidateId(int id)
	{
		if(id%2==0)
		{
			return true;
		}
		else
			return false;
	}
	
	//validate Cost
	
	public boolean ValidateCost(int cost)
	{
		if(cost>=300 || cost<=1000)
		{
			return true;
		}
		else
			return false;
	}
	
	//validate Pages
	public boolean Validatepages(int Pages)
	{
		if(Pages>=500 || Pages<=1000)
		{
			return true;
		}
		else
			return false;
	}
	
	// public boolean ValidateAuthor
	public boolean ValidateAuthor(String Author)
	{
		if(Author.equals("Scott")|| Author.equals("James") || Author.equals("Tom"))
		{
			return true;
		}
		else
			return false;
	}
	public void display()
	{
		System.out.println("------------------------------------");
		System.out.println("Book Title : "+getTitle());
		System.out.println("Book Id : "+getBookid());
		System.out.println("Book cost is : "+getCost());
		System.out.println("NoOf Pages of Book : "+getNoOfPages());
		System.out.println("Author of the Book  :"+getAuthor());
		System.out.println("------------------------------------");
	}

}
