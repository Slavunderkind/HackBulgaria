public class Logger {
	protected int level;

	public Logger() {
		this.level = 3;
	}

	public Logger(Integer LEVEL) throws Exception {
		if (LEVEL < 1) {
			throw new Exception("LEVEL is out of range");
		}
		this.level = LEVEL;
	}

	public void log(String message)  {
		int defaultLevel = 3;
		if (defaultLevel <= this.level) {
			System.out
					.println(String.format("%d => %s", defaultLevel, message));

		}

	}

	public void log(int level, String message) throws Exception {
		if (level<1){
			throw new Exception("level is out of range");
			
		}
		if (level <= this.level) {
			System.out.println(String.format("%d => %s", level, message));

		}

	}

	public void setLevel(int newLevel)throws Exception {
		if (newLevel < 1){
			throw new Exception("newLevel is out of range");
		}
		this.level = newLevel;

	}
}
