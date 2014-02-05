package westend.play.jabberwocky;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;

public class WarActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_war);
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.getSettings().setBuiltInZoomControls(true);
		pointer.loadUrl("file:///android_asset/waroftheworlds.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.war, menu);
		return true;
	}
}
