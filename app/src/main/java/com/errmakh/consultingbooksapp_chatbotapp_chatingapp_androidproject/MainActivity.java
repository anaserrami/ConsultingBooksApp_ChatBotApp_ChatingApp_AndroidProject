package com.errmakh.consultingbooksapp_chatbotapp_chatingapp_androidproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.errmakh.consultingbooksapp_chatbotapp_chatingapp_androidproject.booksConsultingApp.MainActivityBooksConsulting;
import com.errmakh.consultingbooksapp_chatbotapp_chatingapp_androidproject.chatBotApp.MainActivityChatBot;
//import com.errmakh.consultingbooksapp_chatbotapp_chatingapp_androidproject.chatBotApp.MainActivityChatingApp;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button booksButton = findViewById(R.id.books_button);
        booksButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityBooksConsulting.class);
                startActivity(intent);
            }
        });

        Button chatbotButton = findViewById(R.id.chatbot_button);
        chatbotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityChatBot.class);
                startActivity(intent);
            }
        });

        // For chattingApp
        /*
        Button chatingButton = findViewById(R.id.chating_button);
        chatbotButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivityChatingApp.class);
                startActivity(intent);
            }
        });*/
    }
}
