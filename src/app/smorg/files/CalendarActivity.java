/*
 * Calendar tab view 
 */

package app.smorg.files;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class CalendarActivity extends TabActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.calendar);
		
		TabHost tabHost = getTabHost();
		TabSpec tabSpec; 
		Intent intent= new Intent();

		tabSpec= tabHost.newTabSpec("monthly").setIndicator("Monthly").setContent(intent.setClass(this,MonthlyView.class));
		tabHost.addTab(tabSpec);
		
		tabSpec= tabHost.newTabSpec("daily").setIndicator("Daily").setContent(intent.setClass(this,DailyView.class));
		tabHost.addTab(tabSpec);
		
		tabHost.setCurrentTab(0);
	}
	
	

}
