package com.luu.minh.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends AppCompatActivity {
    private EditText etEditItem;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        position = getIntent().getIntExtra("position", -1);
        String item = getIntent().getStringExtra("item");
        setContentView(R.layout.activity_edit_item);
        etEditItem = (EditText) findViewById(R.id.etEditItem);
        etEditItem.append(item);
    }

    public void onSave(View v) {
        String item = etEditItem.getText().toString();
        Intent data = new Intent();
        data.putExtra("item", item);
        data.putExtra("position", position);
        setResult(RESULT_OK, data);
        finish();
    }
}
