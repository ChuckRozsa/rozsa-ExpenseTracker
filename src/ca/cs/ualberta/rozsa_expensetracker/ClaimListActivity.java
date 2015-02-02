 /*Expense Tracker Assignment for use in CMPUT 301
    Copyright (C) 2015  Charles Rozsa

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
*/


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
				//adapter.notifyDataSetChanged();
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
		
		
		//adapter = new ClaimListAdapter(this, ClaimListController.getClaimList().getClaims());
		//claims_list.setAdapter(adapter);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.claim_list, menu);
		return true;
	}
	
	
	
}