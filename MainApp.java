package Library_Management_System;

import java.util.*;
public class MainApp
{
       public static void main(String[] args) 
       {
    	   String title;
    	   int id;
    	   int cost;
    	   int pages;
    	   String Author;
    	   Library l=new Library();
           Scanner s=new Scanner(System.in);
           boolean isStart=true;
           while(isStart)
           {
        	   System.out.println("Enter the Choice \n 1.Adding of Books \n 2.DisplayBooks \n 3.Search Book Based On Id \n 4.Search Book Based On Author \n 5.Update Book Cost Based On Title \n 6.Remove Book Based on ID \n 7.Exit");
           
           int choice=s.nextInt();
           switch(choice)
           {
           case 1: {
        	   while(true)
        	   {
        		   try {
        			   System.out.println("Enter the Book Title");
                	   title=s.next();
                	   System.out.println("Enter the Book id");
                	   id=s.nextInt();
                	   System.out.println("Enter the  Book Cost");
                	   cost=s.nextInt();
                	   System.out.println("Enter the BookPages");
                	   pages=s.nextInt();
                	   System.out.println("Enter the Book Author");
                	   Author=s.next();
                	   l.addBook(new Book(title, id, cost, pages, Author));
                	   break;
                	  
        		   }
        		   catch(BookTitileMismatch e)
        		   {
        			   System.out.println("Enter the Valid Title");
        			   title=s.next();
        		   }
        		   catch(IdOutOfBounce e1)
        		   {
        			   System.out.println("Enter the Valid Id");
        			   id=s.nextInt(); 
        		   }
        		   catch(CostOutOfBounce e2)
        		   {
        			   System.out.println("Enter the Valid Cost");
        			   cost=s.nextInt();
        		   }
        		   catch(PagesOutOfBounce e3)
        		   {
        			   System.out.println("Enter the valid no Of Pages");
        			   pages=s.nextInt();
        		   }
        		   catch(AuthorMismatch e4)
        		   {
        			   System.out.println("Enter the Valid Author Name");
        			   Author=s.next();
        		   }
        	   }
        	  
           } 
           case 2:
           {
        	   l.displayBooks();
           }
           break;
           
           case 3:{
        	   System.out.println("Enter the id to search Book");
        	    id=s.nextInt();
        	   l.SearchBookBasedOnID(id);
           }
           break;
           
           case 4:
           {
        	   System.out.println("Enter the Author of the Book");
        	   Author=s.next();
        	   l.SearchBookBasedOnAuthor(Author);
           }
           break;
           
           case 5:
           {
        	   System.out.println("Enter the Book title");
        	    title=s.next();
        	   l.UpdateBookBasedOnTitle(title);
           }
           break;
           
           case 6:
           {
        	   System.out.println("Enter id to Remove Book");
        	    id=s.nextInt();
        	   l.RemoveBookBasedOnId(id);
           }
           break;
           
           case 7:
           {
        	   isStart=false;
        	   System.out.println("Thank You....");
           }
           break;
           
           default:System.out.println("enter valid Choice....");
           }
          }
	}	
}
