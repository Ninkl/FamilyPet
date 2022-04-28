package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

public class WebServiceApp extends AppCompatActivity {

    RequestQueue fileRequetesWS;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_service_app);
        fileRequetesWS = Volley.newRequestQueue(this);
        requestAnnonce();
    }

    public void requestAnnonce() {
        String url = "http://10.0.2.2/FamilyPetVs/public/get_annonce";
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                url,
                this::processAnnonce,
                this::getError);
        fileRequetesWS.add(stringRequest);
    }

    public void processAnnonce(String reponse) {
        try {
            JSONArray jo = new JSONArray(reponse);
            String res = jo.getJSONObject(0).getString("annonce_id");
            String sres = "" + res;
            TextView tv = findViewById(R.id.textView2);
            tv.setText(sres);
        } catch (JSONException jx) {
            getError(jx);
        }
    }

    public void getError(Throwable t) {
        Toast.makeText(this, "probleme serveur", Toast.LENGTH_LONG).show();
        Log.e("annonce", "probleme serveur", t);
    }
}