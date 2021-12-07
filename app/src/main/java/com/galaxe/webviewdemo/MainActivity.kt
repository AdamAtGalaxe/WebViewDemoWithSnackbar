package com.galaxe.webviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var tv : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById<TextView>(R.id.t1)
        var webview = findViewById<WebView>(R.id.myView)

        webview.webViewClient = WebViewClient()

        webview.loadUrl("http://www.google.com")
        webview.settings.javaScriptEnabled = true



    }
    fun click(v: View){
        var snackbar = Snackbar.make(tv, "Sample SnackBar", Snackbar.LENGTH_LONG)
        snackbar.show()
    }
}