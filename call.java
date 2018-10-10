import java.util.*;
import java.io.*;

class procon

{
     static int s=1;
    static int full=0;
    static int empty=5;
    int ch;
       procon()
       {
         Scanner sc=new Scanner(System.in);
        while(true)
        {
           System.out.println("1: For producer\n 2: For consumer\n 3: For exit\n");
           ch= sc.nextInt();
           switch(ch)
           {
               case 1:
               if(s==1 && empty!=0)
               {
               producer();
                }
               else
               {
               System.out.println("Producer is waiting.........");
           }
           
               break;
               
               case 2:
               consumer();
               break;
               
               case 3:
               System.exit(0);
               break;
           }
             
        }
       }
    
       void producer()
       {
           s=wait(s);
           full= signal(full);
           empty= wait(empty);
           System.out.println("poducer producing....");
           s=signal(s);
       }void consumer()
       {
           s=wait(s);
           full= wait(full);
           empty= signal(empty);
           System.out.println("consumer consuming....");
           s=signal(s);
       }
       int wait(int s)
       {
           return s--;
           
       }
       int signal(int s)
       {
           return s++;
           
       }
    
        
}
public class call
{
    public static void main(String a[])
    {
         new procon();
    }
    
}