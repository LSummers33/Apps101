package westend.play.ihouse;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.content.Intent; 
import android.media.MediaPlayer;
import android.net.Uri; 
import android.view.View;


public class MainActivity extends Activity {
	MediaPlayer foudafafa;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// foudafafa.start();
		Log.e("Banana","onCreate!");
	}
@Override
protected void onResume() {
	foudafafa = MediaPlayer.create(this, R.raw.foudafafa);
	foudafafa.start();
	super.onResume();
	Log.e("Banana","onResume");
}
@Override
protected void onPause() {
	foudafafa.stop();
	foudafafa.release();
	super.onPause();
	Log.e("Banana","onPause!");
}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void openWebPage(View v) { 
		String url = "https://webapp.ihouse-nyc.org/StarRezPortal/Default.aspx?Params=L9ezxPcQnQtHT%2fDwvmM%2bxIES9DZMa6S7"; 
		Intent i = new Intent(Intent.ACTION_VIEW); 
		i.setData(Uri.parse(url)); 
		startActivity(i); }
}
