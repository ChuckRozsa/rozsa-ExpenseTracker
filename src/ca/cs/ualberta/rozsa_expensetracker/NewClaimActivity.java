package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import ca.cs.ualberta.rozsa_expensetracker.Claim;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
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

	private Claim claim = new Claim();
	private ClaimListController cl = new ClaimListController();
	private EditText claim_name_input;
	private EditText claim_description;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_claim);
	
	
		claim_name_input = (EditText) findViewById(R.id.expenseNameInput);
		claim_description = (EditText) findViewById(R.id.expenseDescriptionInput);
		
		Button saveButton = (Button) findViewById(R.id.saveExpenseButton);
		saveButton.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {

				 //Would generate a claim from all the input fields and add them to cl
				 //Could not generate code without errors.
				 claim.setTrip_name(claim_name_input.getText().toString());
				 claim.setDescription(claim_description.getText().toString());
				 cl.addClaim(claim);
					 
				 Toast.makeText(NewClaimActivity.this, "Claim has been Saved.", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(NewClaimActivity.this, ClaimListActivity.class);
				 startActivity(intent); 
			 }
		});
		
		Button deleteButton = (Button) findViewById(R.id.deleteExpenseButton);
		deleteButton.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 Toast.makeText(NewClaimActivity.this, "Claim has been Deleted.", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(NewClaimActivity.this, ClaimListActivity.class);
				 startActivity(intent); 
			 }
		});
	}
	
	protected void onStart() {
		super.onStart();
		
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_claim, menu);
		return true;
	}

}