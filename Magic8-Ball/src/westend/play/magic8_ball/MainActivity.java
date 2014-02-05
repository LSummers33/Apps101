package westend.play.magic8_ball;

import java.util.Random;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView textViewToChange = (TextView) findViewById(R.id.textView2);
    int i1=0;
    Random r = new Random();
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
				
	}

	public void Button1_Click(View v) {
		i1=r.nextInt(0) + 7;
		textViewToChange.setText(i1);
		//Intent i = new Intent(Intent.ACTION_VIEW);
		//i.setData(Uri.parse(uriString));
		//startActivity(i);
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
