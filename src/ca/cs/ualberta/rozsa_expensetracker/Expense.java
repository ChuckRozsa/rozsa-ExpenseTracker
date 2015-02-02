package ca.cs.ualberta.rozsa_expensetracker;

import java.util.GregorianCalendar;

/*
 * Expense class that has a name, amount and type, category and date.
 * Is used by the claims class.
 */

public class Expense {
	private String name;
	private String category;
	private double amount;
	private String currency_type;
	private GregorianCalendar date;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getCurrency_type() {
		return currency_type;
	}
	public void setCurrency_type(String currency_type) {
		this.currency_type = currency_type;
	}
	public GregorianCalendar getDate() {
		return date;
	}
	
	//Similar to claims, the method parses the string into a calendar date.
	
	public void setDate(String date) {
		this.date = new GregorianCalendar(Integer.parseInt(date.substring(0,3)), Integer.parseInt(date.substring(5,6))
				, Integer.parseInt(date.substring(8,9)));
	}
	
}
