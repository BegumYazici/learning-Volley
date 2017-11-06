package volley.begi.com.volleyapplication.requests;

import org.json.JSONArray;
import org.json.JSONException;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import volley.begi.com.volleyapplication.ApplicationController;
import volley.begi.com.volleyapplication.Constants;
import volley.begi.com.volleyapplication.R;

public class JsonArrayRequestActivity extends ActionBarActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jsonarrayrequest);
		JsonArrayRequest req = new JsonArrayRequest(Constants.jsonArrayUrl, new Response.Listener<JSONArray> () {
		    @Override
		    public void onResponse(JSONArray response) {
		        try {
		            System.out.println("request result -> "+ response.toString(4));
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
