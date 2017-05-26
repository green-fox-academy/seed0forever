package com.greenfoxacademy.seed0forever.p2p_chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.greenfoxacademy.seed0forever.p2p_chat.adapter.MessageAdapter;
import com.greenfoxacademy.seed0forever.p2p_chat.model.Message;

public class MainActivity extends AppCompatActivity {

    private MessageAdapter messageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        messageAdapter = new MessageAdapter(this);

        Button sendButton = (Button) findViewById(R.id.button);
        final EditText editText = (EditText) findViewById(R.id.editText);
        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(messageAdapter);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                messageAdapter.add(new Message("Aze", editText.getText().toString()));
            }
        });
    }
}
