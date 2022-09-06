public class Times {
	private int hour;
	private int minute;

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getCalculate() {
		int totalAllToMinute = (this.hour * 60) + this.minute;

		return totalAllToMinute;
	}
}
