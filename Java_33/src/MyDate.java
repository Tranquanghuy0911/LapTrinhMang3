
public class MyDate {
private int day , month, year;

public MyDate(int d, int m, int y) {
	super();
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
	return day;
}

public void setDay(int d) {
	
	if (d >= 1 && d <= 31) {
		this.day = d;
	}
}

public int getMonth() {
	return month;
}

public void setMonth(int m) {
	if (m >= 1 && m <= 12) {
		this.month = m;
	}
}

public int getYear() {
	return year;
}

public void setYear(int y) {
	if (y >= 0) {
		this.year = y;
	}
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.day+ " / " + this.month + " / " + this.year;	
	}
}
