import java.util.*;
public class typecasting {

    public static void main(String args[]){

        Scanner  sc = new Scanner(System.in);
       //     int number = sc.nextInt();
        // System.out.println(number);


float marks = 9.8f;
int marks2 = (int)marks;

System.out.println(marks);

 //char ch = 'a';
 //int number = ch;
 //System.out.print(number);


    }

    
}






/*Type Conversion ka matlab hai jab Java khud automatically ek type ko doosre mein badal de — isme tumhe kuch nahi karna hota.
Jaise agar tumhare paas int hai aur tum use double mein daal do, to Java khud convert kar leta hai kyunki double bada hai aur koi data loss nahi hoga.

Typecasting ka matlab hai jab tum khud forcefully ek type ko doosre mein badlo — ye tab karna padta hai jab bada type chote mein jaaye.
Jaise double mein 10.9 hai aur tum use int mein store karna chaho, to tumhe (int) likhna padega. Lekin dhyan raho — .9 wala decimal part cut ho jaayega, sirf 10 bachega. Isko data loss kehte hain.

Ek line mein samjho:

Conversion = Java karta hai, safe hota hai 
Typecasting = tum karte ho, data loss ho sakta hai */