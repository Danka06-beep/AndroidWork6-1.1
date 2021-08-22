package com.example.androidwork6_11;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    private static final String LOG = "MyLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        Log.d(LOG, "onCreate" +  savedInstanceState);
        textView.append("\n" + "onCreate" + ": " + savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG,"onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG,"OnResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG,"onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG,"onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG,"onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG,"onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
       Log.d(LOG,"onKeyDown");
        textView.append("\n" + "onKeyDown");
        return true;
    }

    @Override
    public boolean onKeyLongPress(int keyCode, KeyEvent event) {
        Log.d(LOG,"onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(LOG,"onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(LOG,"onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(LOG,"onRestoreInstanceState");
        textView.append("\n" + "onRestoreInstanceState");
    }
}