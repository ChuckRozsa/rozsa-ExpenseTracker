package ca.cs.ualberta.rozsa_expensetracker;

public class ClaimListController {

	//ClaimListController that instanciates once in the app. Where all claims are
	//added and removed.
	
	private static ClaimList claimlist = null;
	public static ClaimList getClaimList(){
		if(claimlist == null){
			claimlist = new ClaimList();
		}
		return claimlist;
	}
	
	public void addClaim(Claim claim) {
		claimlist.addClaim(claim);
	}
	
	public void removeClaim(Claim claim) {
		claimlist.removeClaim(claim);
	}
}
