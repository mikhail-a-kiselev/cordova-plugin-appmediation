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

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
//import org.apache.cordova.test.R;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppMediation extends CordovaPlugin {
	 /** Cordova Actions. */
	private static final String INIT_BANNER_VIEW = "initBannerView"; 
	private static final String REFRESH_BANNER_AD = "refreshBannerAd";
	private static final String LOAD_AD = "loadAd";
	private static final String LOAD_INTERSTITIAL = "loadInterstitial";
	private static final String SHOW_VIEW = "showView";
	private static final String HIDE_VIEW = "hideView";
	
	@Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
		super.initialize(cordova, webView);
	};
}