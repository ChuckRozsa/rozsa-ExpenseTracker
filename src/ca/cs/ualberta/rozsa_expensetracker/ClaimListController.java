package ca.cs.ualberta.rozsa_expensetracker;

public class ClaimListController {

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
	
}
