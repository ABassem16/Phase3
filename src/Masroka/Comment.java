package Masroka;
import java.util.*;
public class Comment
{
	private Posts post=new Posts();
	private User user=new User();
	private Items item=new Items();
	private int CommentID;
	private String comment;
	public Posts getPost() {
		return post;
	}
	public int getPostID()
	{
		return post.getPostID();
	}
	public void setPost(Posts post) {
		this.post = post;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public int getCommentID() {
		return CommentID;
	}
	public void setCommentID(int commentID) {
		CommentID = commentID;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
