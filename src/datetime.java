import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;

public class datetime {
    public static void main(String[] args) {
//        SimpleDateFormat formatter = new SimpleDateFormat("dd");
////        Integer a = Integer.parseInt(formatter);
//        Date date = new Date();
//        String s = Date.format(date);
//        int output = Integer.valueOf(s);
//        System.out.println(formatter.format(date));
        LocalDate currentDate = LocalDate.now();

        // Extract the current day, month, and year as integers
        int currDate = currentDate.getDayOfMonth();
        int currMonth = currentDate.getMonthValue();
        int currYear = currentDate.getYear();

        System.out.println(currDate+" ");
        System.out.println(currMonth+" ");
        System.out.println(currYear+" ");
    }
}
