package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;

import ca.cs.ualberta.rozsa_expensetracker.Claim;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class NewClaimActivity extends Activity {

	private Claim claim;
	private ArrayList<String> claims;
	private ListView claims_list;
	private ArrayAdapter<String> adapter;
	
	private EditText claim_name_input;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_claim);
		
		claims_list = (ListView) findViewById(R.id.list_of_claims_text);
		claim_name_input = (EditText) findViewById(R.id.claimNameInput);
		
		Button saveButton = (Button) findViewById(R.id.saveClaimButton);
		saveButton.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 
				 String claim_name = claim_name_input.getText().toString();
				 //claim.setTrip_name(claim_name);
				 
				 
				 claims.add(claim_name);
				 adapter.notifyDataSetChanged();
				 
				 Toast.makeText(NewClaimActivity.this, "Claim has been Saved.", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(NewClaimActivity.this, ClaimListActivity.class);
				 startActivity(intent); 
			 }
		});
		
		Button deleteButton = (Button) findViewById(R.id.deleteClaimButton);
		deleteButton.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 Toast.makeText(NewClaimActivity.this, "Claim has been Deleted.", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(NewClaimActivity.this, ClaimListActivity.class);
				 startActivity(intent); 
			 }
		});
	}
	
	@Override
	protected void onStart() {
		super.onStart();
		adapter = new ArrayAdapter<String>(this, R.id.list_of_claims_text, claims);
		claims_list.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_claim, menu);
		return true;
	}

}