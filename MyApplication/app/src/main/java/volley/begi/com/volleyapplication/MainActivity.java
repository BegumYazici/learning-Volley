package volley.begi.com.volleyapplication;

//import com.gelecegiyazanlar.volleyexample.requests.JsonArrayRequestActivity;
//import com.gelecegiyazanlar.volleyexample.requests.JsonObjectRequestActivity;
//import com.gelecegiyazanlar.volleyexample.requests.StringRequestActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends ActionBarActivity implements OnClickListener {

	Button jsonObjectButton,jsonArrayButton,stringRequestButton;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		jsonObjectButton = (Button)findViewById(R.id.jsonObjectButton);
		jsonArrayButton = (Button)findViewById(R.id.jsonArrayButton);
		stringRequestButton = (Button)findViewById(R.id.stringRequestButton);
		jsonObjectButton.setOnClickListener(this);
		jsonArrayButton.setOnClickListener(this);
		stringRequestButton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.jsonObjectButton:
				changeActivity(this,volley.begi.com.volleyapplication.requests.JsonObjectRequestActivity.class);
			break;
		case R.id.jsonArrayButton:
				changeActivity(this, volley.begi.com.volleyapplication.requests.JsonArrayRequestActivity.class);
			break;
		case R.id.stringRequestButton:
				changeActivity(this, volley.begi.com.volleyapplication.requests.StringRequestActivity.class);
			break;
		}	
	}
	
	private void changeActivity(Context context, Class targetActivity){
		Intent intent = new Intent(context,targetActivity);
		context.startActivity(intent);
	}
}
