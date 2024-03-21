
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int d, int m, int y) {
		if (d >= 1 && d <= 31) {
			this.day = d;
		} else {
			this.day = 1;
		}

		if (m >= 1 && m <= 12) {
			this.month = m;
		} else {
			this.day = 1;
		}

		if (y >= 0) {
			this.year = y;
		} else {
			this.year = 1;
		}
	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		if(month>=1 && month<=12)
		this.month = month;
	}
	
	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		if(year>=1)
		this.year = year;
	}
}
