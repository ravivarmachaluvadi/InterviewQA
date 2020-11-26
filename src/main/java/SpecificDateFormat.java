
import java.text.SimpleDateFormat;
import java.util.Date;

public class SpecificDateFormat {

    public static void main(String[] args) {
        String pattern = "MM-dd-yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date = simpleDateFormat.format(new java.util.Date());

        String date1 = simpleDateFormat.format(new java.sql.Date(System.currentTimeMillis()));
        System.out.println(date); // 06-23-2020
        System.out.println(date1);
    }
}
