package pl.training.integration.lab01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeService implements DateTime {

    @Override
    public void print(String format) {
        System.out.println(get(format));
    }

    @Override
    public String get(String format) {
        return formatDateTime(format, new Date());
    }

    private String formatDateTime(String format, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

}
