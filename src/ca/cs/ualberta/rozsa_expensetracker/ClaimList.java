package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;

/*
 * ClaimList class that has an arraylist of claims and listeners.
 * Whenever a claim is added or removed notifyListeners() will call
 * update on each of listener.
 */

public class ClaimList {

	private ArrayList<Claim> claims;
	private ArrayList<Listener> listeners;
	
	public ClaimList() {
		claims = new ArrayList<Claim>();
		listeners = new ArrayList<Listener>();
	}
	
	public void addClaim(Claim claim) {
		claims.add(claim);
		notifyListeners();
	}
	
	public void removeClaim(Claim claim) {
		claims.remove(claim);
		notifyListeners();
	}
	
	//Calls specific instance of listener for each listener is listener
	
	public void notifyListeners() {
		for (Listener l: listeners) {
			l.update();
		}
	}
	
	public void addListener(Listener l) {
		listeners.add(l);
	}
	
	public void removeListener(Listener l) {
		listeners.remove(l);
	}
	
	//Removes all claims from the claimlist

	public void clear() {
		for (Claim c: claims) {
			claims.remove(c);
		}
	}
	
	//Adds all claims from one list into another

	public void addAll(ArrayList<Claim> newclaims) {
		for (Claim c: newclaims) {
			claims.add(c);
		}
	}

	public ArrayList<Claim> getClaims() {
		return claims;
	}
}
