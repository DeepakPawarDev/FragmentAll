package user.simfi.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import user.simfi.com.myapplication.waysToDefineFragment.ActivityAddFragUsingFragManager;
import user.simfi.com.myapplication.waysToDefineFragment.ActivityAddFragXML;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }

    public void addFragUsingXML(View view) {

        Intent intent=new Intent(MainActivity.this,ActivityAddFragXML.class);
        startActivity(intent);


    }

    public void addFragUsingFragManager(View view) {

        Intent intent=new Intent(MainActivity.this,ActivityAddFragUsingFragManager.class);
        startActivity(intent);
    }
}
