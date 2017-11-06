package volley.begi.com.volleyapplication;

import android.app.Application;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class ApplicationController extends Application{
	private RequestQueue requestQueue;
	private static ApplicationController instance;
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();
		instance = this;
	}
	
	public static synchronized ApplicationController getInstance(){ return instance; }
	
	public RequestQueue getRequestQueue() {
        if (requestQueue == null) {
        	requestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return requestQueue;
    }
	
	
	public <T> void addToRequestQueue(Request<T> req) {
        getRequestQueue().add(req);
    }
	
	public void cancelPendingRequests(Object tag) {
        if (requestQueue != null) {
            requestQueue.cancelAll(tag);
        }
    }
}
