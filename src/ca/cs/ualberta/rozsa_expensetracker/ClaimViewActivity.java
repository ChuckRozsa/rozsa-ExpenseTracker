package ca.cs.ualberta.rozsa_expensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

//Claim view. Did not implement because could not get claimlist to work.

public class ClaimViewActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_claim_view);
		
		//Would have created a custom adapter as well as implemented onclick listeners
		//in order to access specifics of each expense.
		
		Button button = (Button) findViewById(R.id.addExpenseButton);
		button.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 Toast.makeText(ClaimViewActivity.this, "New Claim", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(ClaimViewActivity.this, NewExpenseActivity.class);
				 startActivity(intent); 
			 }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claim_view, menu);
		return true;
	}

}
