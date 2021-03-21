package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;


public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        FragmentManager fragmentManager2 = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction2 = fragmentManager2.beginTransaction();
        final Fragment firstFragment = new FirstFragment();
        fragmentTransaction2.replace(R.id.third_activity_fragment_1, firstFragment);
        final Fragment secondFragment = new SecondFragment();
        fragmentTransaction2.replace(R.id.third_activity_fragment_2, secondFragment);
        fragmentTransaction2.commit();
    }
}