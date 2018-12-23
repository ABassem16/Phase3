package Masroka;
import java.util.*;

public class Posts
{
	private int NumofQuestions;
	private int PostID;
	private Items item=new Items();
	private ArrayList<Comment> comments=new ArrayList<>();
	public PostController pc=new PostController();
	public ArrayList<VerifyQuestion> questions=new ArrayList<>();
	public int getNumofQuestions() {
		return NumofQuestions;
	}
	public void setNumofQuestions(int numofQuestions) {
		NumofQuestions = numofQuestions;
	}
	public int getPostID() {
		return PostID;
	}
	public void setPostID() {
		Random r=new Random();
		int rand=r.nextInt(100)+1;
		PostID = rand;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public ArrayList<Comment> getComments() {
		return comments;
	}
	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	public void getQuestions() {
		for(int i=0;i<this.questions.size();i++)
		{
			System.out.println(this.questions.get(i));
		}
	}
	public void setQuestions(ArrayList<VerifyQuestion> questions) {
		this.questions = questions;
	}
}
