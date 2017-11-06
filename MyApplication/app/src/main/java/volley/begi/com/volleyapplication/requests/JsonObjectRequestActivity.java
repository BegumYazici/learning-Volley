package volley.begi.com.volleyapplication.requests;

import org.json.JSONException;
import org.json.JSONObject;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import volley.begi.com.volleyapplication.ApplicationController;
import volley.begi.com.volleyapplication.Constants;
import volley.begi.com.volleyapplication.R;

public class JsonObjectRequestActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jsonobjectrequest);

		JsonObjectRequest req = new JsonObjectRequest(Constants.jsonObjectUrl,
				null, new Response.Listener<JSONObject>() {
					@Override
					public void onResponse(JSONObject response) {
						try {
							System.out.println("request result->" + response.toString(4));
						} catch (JSONException e) {
							e.printStackTrace();
						}
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
