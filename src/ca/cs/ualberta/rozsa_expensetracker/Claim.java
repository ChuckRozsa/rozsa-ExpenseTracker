package ca.cs.ualberta.rozsa_expensetracker;


import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Claim {
	private String trip_name;
	private GregorianCalendar start_date;
	private GregorianCalendar end_date;
	private String status;
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

	public void setEnd_date(GregorianCalendar end_date) {
		this.end_date = end_date;
	}

	public GregorianCalendar getStart_date() {
		return start_date;
	}

	public void setStart_date(GregorianCalendar start_date) {
		this.start_date = start_date;
	}
}