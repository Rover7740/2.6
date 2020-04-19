 /*
 * Unit 2 summative
 * 18/04/2020
 * Rose Verma
 */
package pkg2.pkg6.summative;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Summative {
  
    
   
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
      Scanner keyedInput=new Scanner (System.in);
        int number;
        int choice;
        int incorrect =0;
        int correct =0;
        int num1,num2;
        String answer1;
        while (true)
        {
        System.out.println("Human body quiz");
        System.out.println("Select the answer you believe is correct"); 
        System.out.println("---------------------------------------------------");
        System.out.println("Question 1...");
        System.out.println("Question 2...");
        System.out.println("Question 3...");
        System.out.println("percent of correct answers (out of 3)-1... ");
        System.out.println("percent of incorrect answers (out of 3)-2... ");
        System.out.println("4..Exit quiz");
        number = keyedInput.nextInt();
        String [] questions;
          questions = new String[4];
        String [] answers =new String[4];
        questions [0]="What the biggest organ in your body?";
        questions [1]="The bones that make up yous spine are called...";
        questions [2]="Another name for your voice box is called...";
        questions [3]="What does the innermost of the bone contain?";
        answers[0]="skin";
        answers[1]="vertebrae";
        answers[2]="larynx";
        answers[3]="bonemarrow";
        if (number==1){
            System.out.println("questions [0]");
            answer1=keyboard.next();
        if ((answers[0]).equals(answer1)){
            System.out.println("Correct");
            correct++;
        }else{
            System.out.println("Incorrect");
            incorrect++;}
        }
        if (number==2){
            System.out.println("questions[1]");
            answer1 = keyboard.next();
            if ((answers [1]).equals(answer1)){
                System.out.println("Correct");
                correct++;
            }else{
                System.out.println("incorrect");
                incorrect++;}
        }
        if (number==3){
            System.out.println("questions[2]");
            answer1 = keyboard.next();
            if ((answers [2]).equals(answer1)){
                System.out.println("Correct");
                correct++;
            }else{
                System.out.println("incorrect");
                incorrect++;}
        }
                        
        if (number==-1){
            System.out.println("Enter how many questions you got correct");
            num1=keyedInput.nextInt();
            System.out.println("Enter how many questions were there in total (3)");
            num2= keyedInput.nextInt();
            System.out.println("This is your percent of correct answers" + addAndOut (num1,num2) );
        }
        if (number==-2){
            System.out.println("Enter how many questions you got wrong");
            num1= keyedInput.nextInt();
            System.out.println("Enter how many questions there are (3)");
            num2= keyedInput.nextInt();
            System.out.println("This is the percent of the amount you got wrong "+ multiAddOut (num1, num1) );
            }
        }
        }
         public static int addAndOut (int num1,int num2){
           int mark = num1*100/num2;
           return mark;
         }
         public static int multiAddOut (int num1,int num2){
              int mark = num1*100/num2;
             return mark; 
     

           }
               
 
            
            
    }
    


