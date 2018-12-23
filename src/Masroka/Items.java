package Masroka;

public class Items
{
	private String ItemName;
	private String Category;
	private boolean found;
	private String date;
	private String location;
	private int ItemID;
	private int PostID;
	public ItemController ic=new ItemController();
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getItemID() {
		return ItemID;
	}
	public void setItemID(int itemID) {
		ItemID = itemID;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isFound() {
		return found;
	}
	public void setFound(boolean found) {
		this.found = found;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getPostID() {
		return PostID;
	}
	public void setPostID(int postID) {
		PostID = postID;
	}
	
}
