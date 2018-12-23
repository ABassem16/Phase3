package Masroka;

import java.util.ArrayList;
import java.util.Scanner;

public class PostController {
	public void AddPost(Posts post)
	{
		boolean finished=false;
		VerifyQuestion vq=new VerifyQuestion();
		int NumofQuestions=0;
		Items item=new Items();
		System.out.println("Enter Item Details");
		Scanner scan=new Scanner(System.in);
		item.ic.additem(item);
		post.setItem(item);
		System.out.println("Enter Number of Questions");
		NumofQuestions=scan.nextInt();
		post.setNumofQuestions(NumofQuestions);
		String question="";
		String answer="";
		for(int i=0;i<NumofQuestions;i++)
		{
			int m=i+1;
			System.out.println("Enter " + m + " Question");
			scan.nextLine();
			question=scan.nextLine();
			vq.setQuestion(question);
			System.out.println("Enter " + m + " Answer");
			answer=scan.nextLine();
			vq.setAnswer(answer);
			vq.setQuestionID();
			vq.setVerified(false);
			post.questions.add(vq);
		}
		post.setPostID();
		item.setPostID(post.getPostID());
		System.out.println("Post Added");
	}
	public void PrintPost(Posts post)
	{
		System.out.print("    " + post.getNumofQuestions());
		System.out.print("    " + post.getPostID());
		System.out.println("    " + post.getComments());
	}

}
