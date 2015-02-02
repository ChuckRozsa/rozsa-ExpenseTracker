package ca.cs.ualberta.rozsa_expensetracker;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//Editclaim activity that would have been slightly different then new
//claim activity in that it would have taken the values of the claim
//and put them into the input fields for editing.

public class EditClaimActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_edit_claim);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.edit_claim, menu);
		return true;
	}

}
