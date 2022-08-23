package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private MyRecyclerViewAdapter mRecyclerAdapter;
    private List<List<String>> mList;


    private String[] imgIds = new String[]{"@drawable/blank","@drawable/ranking","@drawable/number","@drawable/star_red", "@drawable/star_red", "@drawable/star_red","@drawable/star_yellow","@drawable/star_yellow","@drawable/star_yellow"};
    private  String[]names=new String[]{"","","姓名","陈*兵","张*玲","林*凯","陈* ","魏*可","陈*宗"};
    private String[]score=new String[]{"","","分数","98","98","96","93","92","90"};
    private String[]local=new String[]{"","查看更多","单位部门","湖里分局第一支队","海沧分局第一支队","思明分局第一支队","集美分局第一支队","思明分局第一支队","同安分局第一支队"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = this.findViewById(R.id.Recycler_view);
        // 设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        mList = getList();

        mRecyclerAdapter = new MyRecyclerViewAdapter(this, mList);

        mRecyclerView.setAdapter(mRecyclerAdapter);


    }

    private List<List<String>> getList() {
        List<List<String>> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        List<String> list4 = new ArrayList<>();
        for (int i = 0; i < imgIds.length; i++) {
            list1.add(imgIds[i]);
        }
        list.add(list1);
        for (int i = 0; i < names.length; i++) {
            list1.add(names[i]);
        }
        list.add(list2);
        for (int i = 0; i < score.length; i++) {
            list1.add(score[i]);
        }
        list.add(list3);
        for (int i = 0; i < local.length; i++) {
            list1.add(local[i]);
        }
        list.add(list4);
        return list;
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