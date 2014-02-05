package westend.play.jabberwocky;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
//import android.view.KeyEvent;
import android.view.Menu;
import android.webkit.WebView;
import android.content.Intent; 
import android.net.Uri; 
import android.view.View;

public class MainActivity extends Activity {
	MediaPlayer sound;
	WebView pointer;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView pointer = (WebView) findViewById(R.id.webView1);
		pointer.getSettings().setBuiltInZoomControls(true);
		pointer.loadUrl("file:///android_asset/jabberwocky.html");
		
		// sound.start();
	}

	@Override
	protected void onResume() {
		sound = MediaPlayer.create(this, R.raw.scary_sound);
		sound.start(); 
		sound.setLooping(true);
		super.onResume();
}
	@Override
	protected void onPause() {
		sound.stop();
		super.onPause();
}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	public void openWiki(View v) { 
		
		    String url = "http://en.wikipedia.org/wiki/Jabberwocky"; 
		    Intent i = new Intent(Intent.ACTION_VIEW); 
		    i.setData(Uri.parse(url)); 
		    startActivity(i); 
		} 
	
/*@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && pointer.canGoBack()) {
            pointer.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, 
        //  bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }*/

	public void openImage(View v) { 
		
		String url = "file:///android_asset/256px-jabberwocky.jpg";
        WebView pointer = (WebView) findViewById(R.id.webView1);
        //Intent i = new Intent(Intent.ACTION_VIEW);
        pointer.loadUrl(url);
        //startActivity(i);
        
    	/*// This method alternates between show the jpg or the html files
    	// onClick event of the button
    		// If the button text is equals to "Show Picture"
    		if ((pointer.getText().toString()) == "Image") {
    			// Open asset/jabberwocky.jpg
    			pointer.loadUrl("file:///android_asset/256px-jabberwocky.jpg");
    			// Change button text to "Show Text"
    			pointer.setText("Text");
    			// If the button text is not equals to "Show Picture"
    		} else {
    			// Open asset/jabberwocky.html
    			pointer.loadUrl("file:///android_asset/jabberwocky.html");
    			// Change button text to "Show Picture"
    			pointer.setText("Image");
    		}*/

    	}
        
	}

