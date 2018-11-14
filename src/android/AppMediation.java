package com.codemech.appmediation;

//import android.R;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.Gravity;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
//import org.apache.cordova.test.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.appmediation.sdk.AMBanner;
import com.appmediation.sdk.AMInterstitial;
import com.appmediation.sdk.AMRewardedVideo;
import com.appmediation.sdk.AMSDK;
import com.appmediation.sdk.listeners.AMBannerListener;
import com.appmediation.sdk.listeners.AMListener;
import com.appmediation.sdk.listeners.AMRewardedListener;
import com.appmediation.sdk.listeners.GdprDialogListener;
import com.appmediation.sdk.models.AMError;

public class AppMediation extends CordovaPlugin {
	 /** Cordova Actions. */
	private static final String INIT = "init"; 
	private static final String REFRESH_BANNER_AD = "refreshBannerAd";
	private static final String LOAD_AD = "load";
	private static final String LOAD_INTERSTITIAL = "loadInterstitial";
	private static final String SHOW_VIEW = "showView";
	private static final String HIDE_VIEW = "hideView";
	
	@Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	};
	
	@Override
    public boolean execute(String action, JSONArray inputs, CallbackContext callbackContext) throws JSONException {
        PluginResult result = null;
        if(INIT.equals(action)){
        	JSONObject options = inputs.optJSONObject(0);
            result = initMediation(options, callbackContext);
			Log.d("appmediation", "init");
			return true;
        } else if(LOAD_AD.equals(action)){
			Log.d("appmediation", "load");
			AMBanner.show(cordova.getActivity(), Gravity.BOTTOM);
			return true;
		} else {
			return false;
		}
	}
	
	private PluginResult initMediation(final JSONObject options, CallbackContext context) {
       
        cordova.getActivity().runOnUiThread(new Runnable(){
            @Override
            public void run() {
				AMSDK.setTestMode(true);
				
				AMSDK.init(cordova.getActivity(), "a1cdd0c4-de3b-421f-a7b3-5c264c16df91");//"a1cdd0c4-de3b-421f-a7b3-5c264c16df91" options.toString()
			}
		});
		
		return null;
	}
}