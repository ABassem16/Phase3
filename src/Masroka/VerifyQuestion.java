package Masroka;
import java.util.*;
public class VerifyQuestion
{
	private String question;
	private String answer;
	private boolean verified;
	private Posts post=new Posts();
	private int questionID;
	public int getQuestionID() {
		return questionID;
	}
	public void setQuestionID() {
		Random r=new Random();
		int rand=r.nextInt(100)+1;
		this.questionID = rand;
	}
	public Posts getPost() {
		return post;
	}
	public void setPost(Posts post) {
		this.post = post;
	}
	public boolean isVerified() {
		return verified;
	}
	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	
}
