import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
	private  Date timeDate;

	public Time(Date time2) {
		timeDate = time2;

	}

	@Override
	public String toString() {
		DateFormat dateFormatter = new SimpleDateFormat("hh:mm:ss dd.MM.YY");
		System.out.println(dateFormatter.format(timeDate));
		return dateFormatter.format(timeDate);
	}

}
