package com.example.tianhao.shopifychallengetianhaozhang;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        Api api = retrofit.create(Api.class);
        Call<List<ShoppingDetail>> call = api.getDetails();
        call.enqueue(new Callback<List<ShoppingDetail>>() {
            @Override
            public void onResponse(Call<List<ShoppingDetail>> call, Response<List<ShoppingDetail>> response) {
                List<ShoppingDetail>shoppingList=response.body();

                for(ShoppingDetail h: shoppingList){
                   Log.d("name", h.getTitle());
//                    Log.d("realname", h.getRealname());
//                    Log.d("imageurl",h.getImageurl());
                }
            }

            @Override
            public void onFailure(Call<List<ShoppingDetail>> call, Throwable t) {
                    Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}
