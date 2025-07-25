package lab4_2;

public class Date 
{
	private int Day;
	private int Month;
	private int Year;
	
	public Date(int day, int month, int year) {
		Day = day;
		Month = month;
		Year = year;
	}

	public int getDay() {
		return Day;
	}

	public void setDay(int day) {
		if(Day >= 1 && Day <= 31)
	     Day = day;
	}

	public int getMonth() {
		return Month;
	}

	public void setMonth(int month) {
		if(Month >= 1 && Month <= 12)
		   Month = month;
	}

	public int getYear() {
		return Year+543;
	}

	public void setYear(int year) {
		Year = year;
	}
	

}
