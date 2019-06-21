package user.simfi.com.myapplication.waysToDefineFragment;


import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import user.simfi.com.myapplication.R;

public class ActivityAddFragUsingFragManager extends AppCompatActivity

    {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_add_frag_using_frag_manager);
        FragmentA fragmentA=new FragmentA();
            android.app.FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.linear_layout_container,fragmentA,"FragA");
            fragmentTransaction.commit();

    }
    }
