package com.example.messageapp;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText num,txt_msg,loc;
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num=(EditText)findViewById(R.id.num);
        txt_msg=(EditText)findViewById(R.id.txt_msg);
        btn_send=(Button)findViewById(R.id.btn_send);
        loc=(EditText)findViewById(R.id.loc);

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1="7002764503";
                String no=num.getText().toString();
                String msg=txt_msg.getText().toString();
                String location=loc.getText().toString().trim();

//                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
//                PendingIntent pi=PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);

                SmsManager sms=SmsManager.getDefault();
                sms.sendTextMessage(no, null, msg,null,null);

                Toast.makeText(getApplicationContext(), "Message Sent successfully!",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
