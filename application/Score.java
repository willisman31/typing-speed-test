package application;
import java.time.LocalDate;

public class Score {

	private LocalDate date;
	private int wpmValue;
	
	public Score() {
		this.date = LocalDate.now();
		wpmValue = 0;
	}
	
	public Score(int wpmValue) {
		this.date = LocalDate.now();
		this.wpmValue = wpmValue;
	}
	
	public Score(LocalDate date, int wpmValue) {
		
	}
	
	public int getWpmValue() {
		return this.wpmValue;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public String toString() {
		return this.getDate() + "***" + this.getWpmValue() + "/n";
	}
}
