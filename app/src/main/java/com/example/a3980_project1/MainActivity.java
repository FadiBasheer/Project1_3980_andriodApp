package com.example.a3980_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView = (TextView) findViewById(R.id.text);
    }


    public void send_beacon(View view) {
        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://127.0.0.1:8081";

// Instantiate the RequestQueue.


        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                response -> {
                    // Display the first 500 characters of the response string.
                    //textView.setText("Response is: " + response.substring(0, 500));
                }, error -> {
        });
        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
}