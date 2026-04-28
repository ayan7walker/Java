import java.util.Scanner;

public class sum {
    public static void main(String args[]){

// sum of 2 number 

//int length = 10;
//int breadth = 20;

//int sum = length+breadth;
//System.out.println(sum);
//area of rectangle 
//int area = length*breadth;
//System.out.println("the area of rectangle is "+area);

// advaned input 

Scanner sc = new Scanner(System.in);

int input1 = sc.nextInt();
int input2 = sc.nextInt();

int summ = input1 + input2;
int m = input1*input2;

System.out.println("Enter your First number"+input1);
System.out.println("enter your secnd number"+input2);


System.out.println("THE SUM OF TWO NUMBER IS :"+summ);

System.out.println("THE PRODUCT  OF TWO NUMBER IS :"+m);

    }
}