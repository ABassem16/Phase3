package Masroka;
import java.util.*;
public class Database
{
	static public ArrayList<User> user=new ArrayList<>();
	public ArrayList<Items> item=new ArrayList<>();
	public ArrayList<Posts> post=new ArrayList<>();
	public ArrayList<User> getUser() {
		return user;
	}
	public void setUser(ArrayList<User> user) {
		this.user = user;
	}
	public ArrayList<Items> getItem() {
		return item;
	}
	public void setItem(ArrayList<Items> item) {
		this.item = item;
	}
	public ArrayList<Posts> getPost() {
		return post;
	}
	public void setPost(ArrayList<Posts> post) {
		this.post = post;
	}
	static boolean updateuserlist()
	{
		boolean updated=false;
		return updated;
	}
	static boolean updateitemlist()
	{
		boolean updated=false;
		return updated;
	}
	static boolean updatepostlist()
	{
		boolean updated=false;
		return updated;
	}
	public void printuserlist()
	{
		for(int i=0;i<user.size();i++)
		{
		System.out.println(user.get(i).getUsername());
		}
	}
	public void printitemlist()
	{
		for(int i=0;i<item.size();i++)
		{
		System.out.println(item.get(i).getItemName());
		}
	}
	public void printpostlist()
	{
		for(int i=0;i<post.size();i++)
		{
		System.out.println(post.get(i).getPostID());
		}
	}
}
