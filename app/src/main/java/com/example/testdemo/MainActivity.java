package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;


import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.testdemo.bean.ScoreRankBean;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ScoreRankAdapter mRecyclerAdapter;


    private static final String[]NAMES=new String[]{"陈*兵","张*玲","林*凯","陈* ","魏*可","陈*宗","陈*兵","蓝*国","魏*可","张*毅"};
    private static final int[]SCORES=new int[]{98,98,96,93,92,90,88,88,86,85};
    private static final String[]LOCALS=new String[]{"湖里分局第一支队","海沧分局第一支队","思明分局第一支队","集美分局第一支队","思明分局第一支队","同安分局第一支队","同安分局第一支队","海沧分局第一支队","思明分局第一支队","海沧分局第一支队"};





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = this.findViewById(R.id.Recycler_view);
        // 设置布局管理器
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        mRecyclerAdapter = new ScoreRankAdapter(this, getList());

        mRecyclerView.setAdapter(mRecyclerAdapter);
        TextView t = (TextView) findViewById(R.id.link);
        String webLinkText = "<a href='https://www.baidu.com'>查看更多</a>" ;
        t.setText(Html.fromHtml(webLinkText));



    }

    private List<ScoreRankBean> getList() {
        List<ScoreRankBean> list = new ArrayList<>();
        for (int i = 0; i < NAMES.length; i++) {
            ScoreRankBean bean = new ScoreRankBean();
            bean.rank = i + 1;
            bean.names = NAMES[i];
            bean.score = SCORES[i];
            bean.depart = LOCALS[i];
            list.add(bean);
        }
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