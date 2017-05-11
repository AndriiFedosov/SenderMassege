package com.example.andry.sender;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Создаем метод по которому передается сообщение на другую активность
    public void onSendMessage(View view) {
        //создаем поле правки текста и привязываем его по id
        EditText messageView= (EditText)findViewById(R.id.message);

        //создаем строковый ресурс которій принимает текст который вводим  в поле правки текста
        String messageText = messageView.getText().toString();

        //Создаем интент и указываем активность на которую он создается
       // Intent intent = new Intent(this,ReceiveMessageActivity.class);


        //передаем параметры текста на вторую активность
        //intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,messageText);

        //создаем интент в котором указываем какие активности вызывать из других приложений
        Intent intent = new Intent(Intent.ACTION_SEND);

        //указываем тип данных которые будет использывать интент
        intent.setType("text/plain");

        //передаем с помощю интента параметры в другую активность
        intent.putExtra(Intent.EXTRA_TEXT,messageText);

        String chosenTitel = getString(R.string.choser);


        Intent chooseIntent = Intent.createChooser(intent,chosenTitel);

        //включаем другую активность c выбором интента
        startActivity(chooseIntent);
    }
}
