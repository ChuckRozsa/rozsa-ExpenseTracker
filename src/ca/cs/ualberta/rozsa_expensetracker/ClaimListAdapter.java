package ca.cs.ualberta.rozsa_expensetracker;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//Half baked custom adapter that should have updated the claimListView to show
//the name of claims in the list. Not sure what is wrong.

public class ClaimListAdapter extends ArrayAdapter<Claim> {
	
	public ClaimListAdapter(Context context, ArrayList<Claim> claims) {
	       super(context, R.id.claimListView, claims);
	    }

	    @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	    
	       Claim claim = getItem(position);    
	       
	       if (convertView == null) {
	          convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_2, parent, false);
	       }
	       
	       TextView tv1 = (TextView) convertView.findViewById(android.R.id.text1);
	       TextView tv2 = (TextView) convertView.findViewById(android.R.id.text2);
	       tv1.setText(claim.getTrip_name());
	       tv2.setText(claim.getDescription());
	       
	       return convertView;
	   }
}
