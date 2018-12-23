package Masroka;
import java.util.*;
public class UserController
{
	public Database db= new Database();
	static User user=new User();
	static boolean UpdateAccount(int id)
	{
		boolean updated=false;
		id=user.getUserID();
		return updated;
	}
	static boolean DeleteAccount(User user,Database db)
	{
		boolean deleted=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter User ID");
		int x=scan.nextInt();
		for(int i=0;i<db.user.size();i++)
		{
			if(x==db.user.get(i).getUserID())
			{
				db.user.remove(i);
				deleted=true;
			}
			else
			{
				System.out.println("Cannot Find User");
			}
		}
		return deleted;
	}
	static void MentionUser(String username)
	{
		username=user.getUsername();
	}
	static void Register(User user)
	{
		String Username="";
		String Password="";
		String Email="";
		int Age=0;
		String Gender="";
		String Phonenumber="";
		int PostalCode=0;
		int UserID=0;
		System.out.println("Enter Username");
		Scanner scan=new Scanner(System.in);
		Username=scan.nextLine();
		user.setUsername(Username);
		System.out.println("Enter Password");
		Password=scan.nextLine();
		user.setPassword(Password);
		System.out.println("Enter Email");
		Email=scan.nextLine();
		user.setEmail(Email);
		System.out.println("Enter Gender");
		Gender=scan.nextLine();
		user.setGender(Gender);
		System.out.println("Enter Phone number");
		Phonenumber=scan.nextLine();
		user.setPhonenumber(Phonenumber);
		System.out.println("Enter Age");
		Age=scan.nextInt();
		user.setAge(Age);
		System.out.println("Enter Postal Code");
		PostalCode=scan.nextInt();
		System.out.println("Enter User ID");
		UserID=scan.nextInt();
		user.setPostalCode(PostalCode);
		user.setUserID(UserID);
		user.setIPAddress();
		
	}
	public void PrintUser(User user)
	{
		System.out.print("    " + user.getUsername());
		System.out.print("    " + user.getUserID());
		System.out.print("    " + user.getAge());
		System.out.print("    " + user.getEmail());
		System.out.print("    " + user.getGender());
		System.out.print("    " + user.getIPAddress());
		System.out.print("    " + user.getPassword());
		System.out.print("    " + user.getPhonenumber());
		System.out.println("    " + user.getPostalCode());
	}
	public void UpdateAccount(User user,Database db)
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter User ID");
		boolean exists=false;
		int x=scan.nextInt();
		for(int i=0;i<db.user.size();i++)
		{
			if(x==db.user.get(i).getUserID())
			{
				exists=true;
				System.out.println("Enter new Username\n");
				String s=scan.nextLine();
				db.user.get(i).setUsername(s);
				System.out.println("Enter new Password\n");
				s=scan.nextLine();
				db.user.get(i).setPassword(s);
				System.out.println("Enter new Postal Code\n");
				x=scan.nextInt();
				db.user.get(i).setPostalCode(x);
				System.out.println("Enter new Email");
				s=scan.nextLine();
				db.user.get(i).setEmail(s);
				System.out.print("Enter new Phone Number");
				s=scan.nextLine();
				db.user.get(i).setPhonenumber(s);
			}
			else
			{
				System.out.println("Cannot Find User");
			}
		}
	}
	public static void main(String[] args)
	{

	}
}
