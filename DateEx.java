
package order;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class DateEx {
public static void main(String args[])
{
    String date1;
    Date input = null;
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter date and time in dd/MM/yyyy hh:mm:ss");
    date1=scanner.nextLine();
    Date date=new Date();
    SimpleDateFormat formater=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    try{
     input=formater.parse(date1);
    }
    catch(ParseException e)
    {
        System.out.println(e);
    }
    long  a=date.getTime();
    long b=input.getTime();
   if(a>b)
    System.out.println("Input time is less current time ");
   else if(a<b)
       System.out.println("Input time is greater than current time ");
   else
       System.out.println("Input time is equal to current time ");
}
}
