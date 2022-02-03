import java.time.MonthDay;
import java.time.YearMonth;

public class MonthCalulator {
    int getDayCount(int year, int month){
        return YearMonth.of(year, month).lengthOfMonth();
    }
}
