package com.syntax.class04;

public class NestInElseIf {

	public static void main(String[] args) {
		
	/*	if student complete the quiz we will check the score
	 * if score >90---> great job
	 * if score  >80--->  well done
	 * if score >70--->you could have done better
	 * if student didn't complete thr quiz-->not good please do 
	 * homework
		
		*/
		boolean quizCompleted=true;
		int score=70;
		
	if(quizCompleted) {
			
	System.out.println("let's check your score");
		
		if(score>90) {
			System.out.println("Great job,you study a lot");
		
		}else if (score>80) {
			
			System.out.println("Well done");	
		}else if (score>70) {
			
			System.out.println("You could have done better");			
		
        }else {
	     System.out.println("You failed");
        }
		
} else {
			System.out.println("Please do HW ontime");
		}
		
	
	}

}
