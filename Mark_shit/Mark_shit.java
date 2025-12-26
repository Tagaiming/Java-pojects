package Mark_shit;
// Mark shit 

import java.util.Scanner;

public class Mark_shit {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("***mark shit maker");
    System.out.println("Enter your Marks:");
    int num=sc.nextInt();
    System.out.println("Enter your name:");
    String username=sc.next();
    if (num<=100 && num>=80) {
     System.out.println("You got A+ "+username);     
    }
    else if (num<=79 && num>=70) {
      System.out.println("You got A "+username);
      
    }
    else if (num<=69 && num>=60 ) {
      System.out.println("You got A- "+username);
    }
    else if (num<=59 && num>=50) {
      System.out.println("You got B "+username);
      
    }
    else if (num<=49 && num>=40) {
      System.out.println("You got C "+username);
      
    }
    else if (num<=39 && num>=33) {
      System.out.println("You got D "+username);
      
    }
    else if (num<=32 && num>=00) {
      System.out.println("You Fail in exam "+username);
      
    }
    else{
      System.out.println("Invalid input \n");
    }


    sc.close();
   
  }
}