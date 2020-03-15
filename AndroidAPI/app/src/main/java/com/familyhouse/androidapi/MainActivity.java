package com.familyhouse.androidapi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import android.util.log;

import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private RequestQueue  requestQueue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        requestQueue = Volley.newRequestQueue(context: this);


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Resquest.Method.GET,
                jsonResquest: "https://jsonplaceholder.typicode.com/todos/1", listener: null,
                @Override
                public void onResponse(JSONObject response) {
                    Log.d(tag: "JSON:", msg: "onResponse: " + response);
        }

        }
    }
}
