package volley.begi.com.volleyapplication.requests;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;

import volley.begi.com.volleyapplication.ApplicationController;
import volley.begi.com.volleyapplication.Constants;
import volley.begi.com.volleyapplication.R;

public class StringRequestActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_stringrequest);

		StringRequest req = new StringRequest(Constants.stringRequestUrl,
				new Response.Listener<String>() {
					@Override
					public void onResponse(String response) {
						System.out.println("request result ->"+response);
					}
				}, new Response.ErrorListener() {
					@Override
					public void onErrorResponse(VolleyError error) {
						VolleyLog.e("Error: ", error.getMessage());
					}
				});

		ApplicationController.getInstance().addToRequestQueue(req);
	}
}
