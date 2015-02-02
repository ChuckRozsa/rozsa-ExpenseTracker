package ca.cs.ualberta.rozsa_expensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class NewExpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_new_expense);
		
		Button button = (Button) findViewById(R.id.saveExpenseButton);
		button.setOnClickListener(new OnClickListener() {
			 @Override
	         public void onClick(View arg0) {
				 
				 //Similar to the NewClaimActivity a new expense would be created and added to expense
				 //list. May have required a ExpenseListController?
				 
				 Toast.makeText(NewExpenseActivity.this, "New Claim", Toast.LENGTH_LONG).show();
				 Intent intent = new Intent(NewExpenseActivity.this, ClaimListActivity.class);
				 startActivity(intent); 
			 }
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.new_expense, menu);
		return true;
	}

}
