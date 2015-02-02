package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ClaimListActivity extends Activity {

	private ClaimList claims;
	private ArrayAdapter<Claim> adapter;
	
	private ListView claims_list;
	private ClaimListController ct = new ClaimListController();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_claim_list);
		
		
		claims = ClaimListController.getClaimList();
		Claim claim = new Claim();
		claim.setTrip_name("Hello");
		
		ClaimListController.getClaimList().addListener(new Listener() {
			
			@Override
			public void update() {
				claims.clear();
				ArrayList<Claim> newclaims = ClaimListController.getClaimList().getClaims();
				claims.addAll(newclaims);
				adapter.notifyDataSetChanged();
			}
		});
		
		
		Toast.makeText(ClaimListActivity.this, claim.getTrip_name(), Toast.LENGTH_LONG).show();
		
		Button button = (Button) findViewById(R.id.addClaimButton);
		button.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 Toast.makeText(ClaimListActivity.this, "New Claim", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(ClaimListActivity.this, NewClaimActivity.class);
				 startActivity(intent); 
			 }
		});
		
	}
	
	protected void onStart() {
		super.onStart();
		
		Claim claim = new Claim();
		claim.setTrip_name("Hello");
		
		adapter = new ClaimListAdapter(this, ClaimListController.getClaimList().getClaims());
		claims_list.setAdapter(adapter);
		ct.addClaim(claim);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claim_list, menu);
		return true;
	}
	
	
	
}