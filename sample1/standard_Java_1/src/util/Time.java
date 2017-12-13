package util;

public class Time {

	private int hour;
	private int minute;
	private int second;
	private boolean am = true; // am pm

	public Time() {
		super();
	}

	public Time(int hour, int minute, int second) {

		// 유효성검사위해 여기서도 셋터 겟터 이용
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);

		/*
		 * this.hour = hour; this.minute = minute; this.second = second;
		 */
	}

	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		if(hour>=12) am = false;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute >= 60)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second >= 60)
			return;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + ", am=" + (am==true?"오전":"오후") + "]";
	}

}
