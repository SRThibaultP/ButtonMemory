package fr.free.pech.thibault.buttonmemoryjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView showInfo;
    SharedPreferences myPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);

        String info = myPrefs.getString("valeur", "Salut Vincent !");

        showInfo = (TextView) findViewById(R.id.affichageText);
        TextView showInfo = (TextView) findViewById(R.id.affichageText);
        showInfo.setText(info);
    }

    public void Arm(View view) {
        showInfo.setText("Arm");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "Arm");
        editor.apply();
    }

    public void b2(View view) {
        showInfo.setText("2");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "2");
        editor.apply();
    }

    public void b3(View view) {
        showInfo.setText("3");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "3");
        editor.apply();
    }

    public void b4(View view) {
        showInfo.setText("4");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "4");
        editor.apply();
    }

    public void b5(View view) {
        showInfo.setText("5");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "5");
        editor.apply();
    }

    public void b6(View view) {
        showInfo.setText("6");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "6");
        editor.apply();
    }

    public void b7(View view) {
        showInfo.setText("7");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "7");
        editor.apply();
    }

    public void b8(View view) {
        showInfo.setText("8");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "8");
        editor.apply();
    }

    public void b9(View view) {
        showInfo.setText("9");
        myPrefs = getSharedPreferences("prefID", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("valeur", "9");
        editor.apply();
    }
}
