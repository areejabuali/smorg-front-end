/*A class where the home tab lives
 * 
 */

package app.smorg.files;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HomeTab extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);
		//	Resources resources = getResources(); // Object for resources
		TabHost tabHost = getTabHost();
		TabSpec tabSpec;
		// An intent for tab activity 
		Intent intent = new Intent();
	
		tabSpec = tabHost.newTabSpec("sign in").setIndicator("Timeline").setContent(intent.setClass(this, SplashScreen.class));
		tabHost.addTab(tabSpec);
		tabHost.setCurrentTab(0);
		
		tabSpec = tabHost.newTabSpec("tasks").setIndicator("Tasks").setContent(intent.setClass(this, SplashScreen.class));
		tabHost.addTab(tabSpec);
		
		tabSpec = tabHost.newTabSpec("goals").setIndicator("Goals").setContent(intent.setClass(this, SplashScreen.class));
		tabHost.addTab(tabSpec);
		
		tabSpec = tabHost.newTabSpec("notification").setIndicator("Notifications").setContent(intent.setClass(this, SplashScreen.class));
		tabHost.addTab(tabSpec);
		
		Intent intent2 = new Intent();
		tabSpec = tabHost.newTabSpec("calendar").setIndicator("Calendar").setContent(intent2.setClass(this,CalendarActivity.class));
		tabHost.addTab(tabSpec);
		
		
		
		
	}

	
}
