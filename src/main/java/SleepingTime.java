import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class SleepingTime {
    public static void main(String[] args) {
        String S = "Sun 10:00-20:00\n" +
                "Fri 05:00-10:00\n" +
                "Fri 16:30-23:50\n" +
                "Sat 10:00-24:00\n" +
                "Sun 01:00-04:00\n" +
                "Sat 02:00-06:00\n" +
                "Tue 03:30-18:15\n" +
                "Tue 19:00-20:00\n" +
                "Wed 04:25-15:14\n" +
                "Wed 15:14-22:40\n" +
                "Thu 00:00-23:59\n" +
                "Mon 05:00-13:00\n" +
                "Mon 15:00-21:00";
        
        
        List<Date> dates = new ArrayList<>();
        for(String s: S.split("\n")){
            String day = s.split(" ")[0];
            String timeStart = (s.split(" ")[1]).split("-")[0];
            String timeEnd = (s.split(" ")[1]).split("-")[1];
            dates.add(getDate(day, timeStart));
            dates.add(getDate(day, timeEnd));
        }
        Collections.sort(dates);
        System.out.println(dates);
    }

    private static Date getDate(String day, String timeStart) {
        SimpleDateFormat sdf = new SimpleDateFormat("E H:mm");
        long MILLISECONDS_PER_WEEK = 7L * 24 * 60 * 60 * 1000;
        Date date = sdf.parse(day +" "+ timeStart, new ParsePosition(0));
        Calendar c = Calendar.getInstance();
        int todayDSTOffset = c.get(Calendar.DST_OFFSET);
        c.setTime(date);
        int epochDSTOffset = c.get(Calendar.DST_OFFSET);
        long parsedMillis = date.getTime() + (epochDSTOffset - todayDSTOffset);
        long millisInThePast = System.currentTimeMillis() - parsedMillis;
        long weeksInThePast = millisInThePast / MILLISECONDS_PER_WEEK;
        Date output = new Date(parsedMillis + (weeksInThePast + 1) * MILLISECONDS_PER_WEEK);
        return output;
    }
}
