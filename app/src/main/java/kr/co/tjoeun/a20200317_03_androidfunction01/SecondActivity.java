package kr.co.tjoeun.a20200317_03_androidfunction01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import kr.co.tjoeun.a20200317_03_androidfunction01.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_second);

        String sendMessage = getIntent().getStringExtra("message");

        Log.d("받아온 String", sendMessage);

        binding.messageTxt.setText(sendMessage);

    }
}
