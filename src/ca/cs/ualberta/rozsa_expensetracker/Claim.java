package ca.cs.ualberta.rozsa_expensetracker;


import java.util.ArrayList;
import java.util.GregorianCalendar;

/* Claim class that deals with individual claims. Has a list of expenses 
 * and the ability to get the total currency of expenses of a given 
 * type.
 */ 
 
public class Claim {
	private String trip_name;
	private GregorianCalendar start_date;
	private GregorianCalendar end_date;
	private String status;
	private String description;
	private ArrayList<Expense> expenses;
	
	
	public Claim(){
		this.status = "Open";	
	}
	
	public String getTrip_name() {
		return trip_name;
	}
	public void setTrip_name(String trip_name) {
		this.trip_name = trip_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void addExpense(Expense expense){
		expenses.add(expense);
	}
	
	public void removeExpense(Expense expense) {
		expenses.remove(expense);
	}

	public GregorianCalendar getEnd_date() {
		return end_date;
	}

	//Takes in a string from the UI in a given format and parses it into
	//its caledar date
	
	public void setEnd_date(String date) {
		this.end_date = new GregorianCalendar(Integer.parseInt(date.substring(0,3)), Integer.parseInt(date.substring(5,6))
				, Integer.parseInt(date.substring(8,9)));
	}

	public GregorianCalendar getStart_date() {
		return start_date;
	}

	public void setStart_date(String date) {
		this.start_date = new GregorianCalendar(Integer.parseInt(date.substring(0,3)), Integer.parseInt(date.substring(5,6))
				, Integer.parseInt(date.substring(8,9)));
	}
	
	//Gets the total amount of money spent in a given currency for all expenses
	
	public double getCurrency(String type){
		double sum = 0;
		for (Expense e: expenses) {
			if (e.getCurrency_type().equals(type)) {
				sum += e.getAmount();
			}
		}
		return sum;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}