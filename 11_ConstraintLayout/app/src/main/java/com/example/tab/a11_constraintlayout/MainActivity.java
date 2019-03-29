package com.example.tab.a11_constraintlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // パブリック定数で、次の activity で、このキーを使用してテキスト値を取得します。
    public static final String EXTRA_MESSAGE = "com.example.tab.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();

        // putExtra() メソッドは EditText の値を intent に追加します。
        // Intent では、extras というキーと値のペアでデータ型をやり取りします。
        // intent の extras のキーを、接頭語としてアプリのパッケージ名を付けて定義すると、
        // アプリが他のアプリとデータをやり取りしている場合に、キーを一意に識別できるようになります。
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
