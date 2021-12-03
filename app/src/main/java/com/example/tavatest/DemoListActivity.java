package com.example.tavatest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import android.util.Log;

import com.example.tavatest.com.example.Data;
import com.example.tavatest.com.example.Example;
import com.example.tavatest.databinding.ActivityDemoListBinding;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DemoListActivity extends AppCompatActivity {
public   APIInterface apiInterface;
public   Example[] exampleList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_list);
        ActivityDemoListBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_demo_list);
        MyListAdapter adapter = new MyListAdapter();
        binding.recyclerView.setHasFixedSize(true);
        binding.recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        binding.recyclerView.setAdapter(adapter);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        apiCalling();
    }
    public void apiCalling(){
        Call<Example> call = apiInterface.doGetUserList("0","100");
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                Log.d("TAG",response.code()+"");
            }

            @Override

            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("TAG",t.getLocalizedMessage()+"");
            }
        });
    }
}