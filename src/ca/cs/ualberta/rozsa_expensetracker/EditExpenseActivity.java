package ca.cs.ualberta.rozsa_expensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//Similar to EdiiClaimActivity it would have taken the values of the expense
//and put them into the input fields for editing.

public class EditExpenseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_expense);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_expense, menu);
		return true;
	}

}
