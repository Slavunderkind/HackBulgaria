import java.nio.file.Path;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TimeTracker {
	public static void main(String[] args) throws ParseException {
		TimeTracker timeTracker = new TimeTracker();

		timeTracker.start("Wait a second");
		timeTracker.finish("Wait a second");
		System.out.println(timeTracker.getReport("Wait a second"));
	}

	private final Map<String, Date> map = new HashMap<>();

	public void copy(Path path1, Path parh2) {

	}

	public void finish(String operation) {
		Date finishDate = new Date();
		map.put(operation + "f", finishDate);
	}

	public String getReport(String operation) throws ParseException {
		if (map.containsKey(operation + "f")) {
			DateFormat dateFormater = new SimpleDateFormat("hh:mm dd.MM.YY");
			Date finishedTime = dateFormater.parse(dateFormater.format(map
					.get(operation + "f")));

			Date startedTime = dateFormater.parse(dateFormater.format(map
					.get(operation + "s")));
			long timeOperation = finishedTime.getTime() - startedTime.getTime();
			return ("Operation " + operation + "took " + timeOperation
					+ System.lineSeparator() + map.get(operation + "s")
					+ " -started" + System.lineSeparator()
					+ map.get(operation + "f") + " -finished");
		} else {
			return map.get(operation + "s") + " -started";
		}
	}

	public void start(String operation) {

		Date date = new Date();
		map.put(operation + "s", date);
	}

	public void update(String str) {

	}
}