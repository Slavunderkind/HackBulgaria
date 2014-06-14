import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateLogger extends Logger {
	public DateLogger() {
		super();
	}

	public DateLogger(int level) {
		super(level);

	}

	@Override
	public void log(Integer level, String message) {
		DateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		Calendar time = Calendar.getInstance();
		if (level <= this.level) {
			StringBuilder text = new StringBuilder();
			text.append(String.format("|%s| ",
					dateFormatter.format(time.getTime())));
			text.append(String.format("%d => %s", level, message));

			System.out.println(text.toString());

		}
	}

	@Override
	public void log(String message) {
		int defaultLevel = 3;

		DateFormat dateFormatter = new SimpleDateFormat("HH:mm:ss dd.MM.yyyy");
		Calendar time = Calendar.getInstance();

		if (defaultLevel <= this.level) {
			StringBuilder text = new StringBuilder();
			text.append(String.format("|%s| ",
					dateFormatter.format(time.getTime())));
			text.append(String.format("%d => %s", level, message));

			System.out.println(text.toString());
		}
	}

}
