package com.example.keyboardapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editText);
        MyKeyBoard keyboard = (MyKeyBoard) findViewById(R.id.keyboard);
        editText.setRawInputType(InputType.TYPE_CLASS_TEXT);
        editText.setTextIsSelectable(true);

        InputConnection ic = editText.onCreateInputConnection(new EditorInfo());
        keyboard.setInputConnection(ic);
    }
}
