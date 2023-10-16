import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //LocalDate class
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today date: "+date);
        System.out.println("Yesterday date: "+yesterday);
        System.out.println("Tomorrow date: "+tomorrow);

        //Leap year check
        LocalDate date1 = LocalDate.of(2017, 1, 13);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());

        //LocalDateTime class
        LocalDateTime datetime = date.atTime(1,50,9);
        System.out.println(datetime);

        //Date class
        long millis=System.currentTimeMillis();
        java.util.Date date3=new java.util.Date(millis);
        System.out.println(date3);

        //SimpleDateFormat
        Date date4 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        //format supported: https://jenkov.com/tutorials/java-internationalization/simpledateformat.html
        String strDate= formatter.format(date4);
        System.out.println(strDate);
    }
}