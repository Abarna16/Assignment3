package order;
import java.util.Date;
import java.text.SimpleDateFormat;
public class CurrentDate {
    public static void main(String args[])
{
   Date date=new Date();
   String date1,date2,date3,date4,date5;
   System.out.println("Current date and time is : "+date);
    SimpleDateFormat object=new SimpleDateFormat("dd-MM-YYYY hh:mm:ss");
     date1=object.format(date);
      System.out.println("Current date and time is in dd-MM-YYYY hh:mm:ss : "+date1);
      SimpleDateFormat object1=new SimpleDateFormat("dd MMM YYYY HH:mm:ss");
     date2=object1.format(date);
      System.out.println("Current date and time is dd MMM YYYY HH:mm:ss : "+date2);
      SimpleDateFormat object3=new SimpleDateFormat("MM/dd/YYYY hh:mm:ss");
    date3=object3.format(date);
     System.out.println("Current date and time is MM/dd/YYYY hh:mm:ss : "+date3);
      SimpleDateFormat object4=new SimpleDateFormat("dd-MMM-YYYY zzz");
    date4=object4.format(date);
     System.out.println("Current date and time is dd MMMM YYYY zzz "+date4);
      SimpleDateFormat object5=new SimpleDateFormat("E,dd-MMM-YYYY zzz");
    date5=object5.format(date);
     System.out.println("Current date and time is dd-MMM-YYYY zzz "+date5);
    
    
}
}
