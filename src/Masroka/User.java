package Masroka;
import java.util.*;
public class User
{
	private String Username;
	private String Password;
	private String Email;
	private int Age;
	private String Gender;
	private String Phonenumber;
	private int PostalCode;
	private int IPAddress;
	private int UserID;
	public UserController uc=new UserController();
	public int getUserID() {
		return UserID;
	}
	public void setUserID(int userid) {
		/*Random r=new Random();
		int rand=r.nextInt(100)+1;
		UserID = rand;*/
		UserID=userid;
	}
	public int getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress() {
		Random r=new Random();
		int rand=r.nextInt(100)+1;
		IPAddress = rand;
	}
	public int getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}
	public String getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public static void main(String[] args)
	{
		Database db=new Database();
		int x=0;
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("1- Add Account\n"
					+ "2- Add Post\n"
					+ "3- Delete Account\n"
					+ "4- Search Item\n"
					+ "5- Update Account\n"
					+ "6- Print Posts List\n"
					+ "7- Print Users List\n"
					+ "8- Print Items List\n"
					+ "9- Exit\n ");
			x=scan.nextInt();
			if(x==1) //Add Account
			{
				User user=new User();
				user.uc.Register(user);
				db.user.add(user);
			}
			else if(x==2) //Add Post
			{
				Posts post=new Posts();
				post.pc.AddPost(post);
				db.post.add(post);
				db.item.add(post.getItem());
			}
			else if(x==3) // Delete Account
			{
				User user=new User();
				user.uc.DeleteAccount(user, db);
			}
			else if(x==4) //Search Item
			{
				Items item=new Items();
				item.ic.searchitem(item, db);
			}
			else if(x==5) //Update Account
			{
				User user= new User();
				user.uc.UpdateAccount(user, db);
			}
			else if(x==6) // Print Posts Lists
			{
				for(int i=0;i<db.post.size();i++)
				{
					db.post.get(i).pc.PrintPost(db.post.get(i));
				}
			}
			else if(x==7) // Print User
			{
				for(int i=0;i<db.user.size();i++)
				{
					db.user.get(i).uc.PrintUser(db.user.get(i));
				}
			}
			else if(x==8) // Print Item 
			{
				for(int i=0;i<db.item.size();i++)
				{
					db.item.get(i).ic.PrintItem(db.item.get(i));
				}
			}
			else if(x==9)
			{
				break;
			}
		}
	}
}
