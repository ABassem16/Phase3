package Masroka;
import java.util.*;
public class ItemController {

	public void additem(Items item)
	{
		String ItemName="";
		String Category="";
		boolean found=false;
		String date="";
		String location="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Item Name");
		ItemName=scan.nextLine();
		item.setItemName(ItemName);
		System.out.println("Enter Item Category");
		Category=scan.nextLine();
		item.setCategory(Category);
		System.out.println("Enter Date Found");
		date=scan.nextLine();
		item.setDate(date);
		System.out.println("Enter Item Location");
		location=scan.next();
		item.setLocation(location);
		System.out.println("Item Added");
	}
	public void searchitem(Items item,Database db)
	{
		String itemname;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Item Name");
		itemname=scan.nextLine();
		for(int i=0;i<db.item.size();i++)
		{
			if(itemname==db.item.get(i).getItemName())
			{
				PrintItem(db.item.get(i));
			}
			else
			{
				System.out.println("Item Not Found");
			}
		}
	}
	public void PrintItem(Items item)
	{
		System.out.print("    " +item.getItemName());
		System.out.print("    " +item.getCategory());
		System.out.print("    " +item.getDate());
		System.out.print("    " + item.getItemID());
		System.out.println("    " +item.getLocation());
	}
}
