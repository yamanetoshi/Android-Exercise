package jp.shuri.yamanetoshi.androidexercise;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class AndroidExercise extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    	WebView webView = new WebView(this);
    	webView.getSettings().setJavaScriptEnabled(true);
    	webView.loadUrl("file:///android_asset/index.html");
    	setContentView(webView);
    }
}