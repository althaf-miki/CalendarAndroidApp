package merseez.calendarapp1;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.Toast;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    RelativeLayout rl;
    CalendarView calendar;


    @SuppressLint({ "NewApi", "NewApi" })
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void initializeCalendar() {
        calendar = (CalendarView) findViewById(R.id.calendar);

        // sets whether to show the week number.
        calendar.setShowWeekNumber(false);

        // sets the first day of week according to Calendar.
        // here we set Monday as the first day of the Calendar
        calendar.setFirstDayOfWeek(2);

        //The background color for the selected week.
        calendar.setSelectedWeekBackgroundColor(getResources().getColor(R.color.green));

        //sets the color for the dates of an unfocused month.
        calendar.setUnfocusedMonthDateColor(getResources().getColor(R.color.transparent));

        //sets the color for the separator line between weeks.
        calendar.setWeekSeparatorLineColor(getResources().getColor(R.color.transparent));

        //sets the color for the vertical bar shown at the beginning and at the end of the selected date.
        calendar.setSelectedDateVerticalBar(R.color.darkgreen);

        //sets the listener to be notified upon selected date change.
        calendar.setOnDateChangeListener(new OnDateChangeListener() {
                    //show the selected date as a toast
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int day) {
                Toast.makeText(getApplicationContext(), day + "/" + month + "/" + year, Toast.LENGTH_LONG).show();
            }
        });
    }
}