package com.example.myfirstapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//"192.168.0.11"

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    Socket socket;
    PrintWriter out;
    BufferedReader in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    socket = new Socket("99.252.203.77", 27015);
                    out = new PrintWriter(socket.getOutputStream(),
                            true);
                    in = new BufferedReader(new InputStreamReader(
                            socket.getInputStream()));
                    out.print("1");
                    out.flush();
                    out.print(("1000,1000" + new String(new char[260]).replace('\0','-')).substring(0,260));
                    out.flush();

                }
                catch  (Exception e) {
                    System.out.println("No I/O");
                    System.exit(1);
                }
                //Your code goes here
            }
        });

        thread.start();
        //Create socket connection



    }
    public void sendMessage(View view) {
        EditText messageText = (EditText) findViewById(R.id.messageText);
        EditText typeText = (EditText) findViewById(R.id.typeText);
        String message = messageText.getText().toString();
        String type = typeText.getText().toString();


    }

}
