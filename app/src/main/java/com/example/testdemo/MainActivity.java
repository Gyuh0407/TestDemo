package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.support.v7.widget.RecyclerView;

import android.widget.ListAdapter;
import android.widget.SimpleAdapter;




import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    private int[] imgIds = new int[]{R.drawable.blank,R.drawable.ranking,R.drawable.number,R.drawable.star_red,R.drawable.star_red, R.drawable.star_red,R.drawable.star_yellow,R.drawable.star_yellow,R.drawable.star_yellow};
    private String[]names=new String[]{"","","姓名","陈*兵","张*玲","林*凯","陈* ","魏*可","陈*宗"};
    private String[]score=new String[]{"","","分数","98","98","96","93","92","90"};
    private String[]local=new String[]{"","查看更多","单位部门","湖里分局第一支队","海沧分局第一支队","思明分局第一支队","集美分局第一支队","思明分局第一支队","同安分局第一支队"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        List<Map<String, Object>> listitem = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<>();
            showitem.put("imgIds", imgIds[i]);
            showitem.put("names", names[i]);
            showitem.put("score", score[i]);
            showitem.put("local", local[i]);
            listitem.add(showitem);
        }
        //创建一个simpleAdapter
        recyclerView = findViewById(R.id.Recycler_view);
        ListAdapter myAdapter = new SimpleAdapter(getApplicationContext(), listitem, R.layout.simplesdapteractivity, new String[]{"imgIds", "names", "score","local"}, new int[]{R.id.img_star, R.id.person_name, R.id.person_score, R.id.person_local});

        recyclerView.setAdapter(myAdapter);





    }


    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}