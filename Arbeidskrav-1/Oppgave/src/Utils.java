import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Utils {
    public static Date parseDate(String dateStr){
        SimpleDateFormat sdft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return sdft.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static int parseAge(int year){
        int currentYear = LocalDate.now().getYear();
        return currentYear - year;
    }

    public static int calculateAverage(List<Integer> param) {
        return (int) param.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0);
    }

}
