package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;

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

	public void clear() {
		for (Claim c: claims) {
			claims.remove(c);
		}
	}

	public void addAll(ArrayList<Claim> newclaims) {
		// TODO Auto-generated method stub
		for (Claim c: newclaims) {
			claims.add(c);
		}
	}

	public ArrayList<Claim> getClaims() {
		// TODO Auto-generated method stub
		return claims;
	}
}
