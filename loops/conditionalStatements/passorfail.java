package conditionalStatements;

import java.util.Scanner;

public  class passorfail{
 public  static void main(String args[]){



Scanner sc = new Scanner(System.in);
int input =  sc.nextInt();


 String reportCard =(input>=33) ?"pass": "fail";
  System.out.println(reportCard);

}
}
