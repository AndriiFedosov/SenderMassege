package com.example.andry.sender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    //создаем строковую переменную для приемки сообщения с первой активности
    public static final String EXTRA_MESSAGE = "massege";

    //при создании активноси указываем какой шаблон xml использывать
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        //принимаем интент с прошлой активности
        Intent intent = getIntent();

        //создаем строковую переменную которая принимает текст через интенет с первой активности
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);

        // создаем вывод текста и привязываем его по id
        TextView messageView = (TextView)findViewById(R.id.message);

        //передаем текстовому полю текст переданій в интент
        messageView.setText(messageText);
    }
}
