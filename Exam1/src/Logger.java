public class Logger {
	protected int level;

	public Logger() {
		this.level = 3;
	}

	public Logger(int LEVEL) {
		this.level = LEVEL;
	}

	public void log(String message) {
		int defaultLevel = 3;
		if (defaultLevel <= this.level) {
			System.out
					.println(String.format("%d => %s", defaultLevel, message));

		}

	}

	public void log(Integer level, String message) {
		if (level <= this.level) {
			System.out.println(String.format("%d => %s", level, message));

		}

	}

	public void setLevel(int newLevel) {
		this.level = newLevel;

	}
}
