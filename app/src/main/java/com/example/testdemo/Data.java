package com.example.testdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Data {
    private int[] imgIds = new int[]{R.drawable.blank,R.drawable.ranking,R.drawable.number,R.drawable.star_red,R.drawable.star_red, R.drawable.star_red,R.drawable.star_yellow,R.drawable.star_yellow,R.drawable.star_yellow};
    private String[]names=new String[]{"","","姓名","陈*兵","张*玲","林*凯","陈* ","魏*可","陈*宗"};
    private String[]score=new String[]{"","","分数","98","98","96","93","92","90"};
    private String[]local=new String[]{"","查看更多","单位部门","湖里分局第一支队","海沧分局第一支队","思明分局第一支队","集美分局第一支队","思明分局第一支队","同安分局第一支队"};
    private List<Map<String, Object>> listitem = new ArrayList<>();
    public  List<Map<String, Object>> setDataList(){
        for (int i = 0; i < names.length; i++) {
            Map<String, Object> showitem = new HashMap<>();
            showitem.put("imgIds", imgIds[i]);
            showitem.put("names", names[i]);
            showitem.put("score", score[i]);
            showitem.put("local", local[i]);
            listitem.add(showitem);
        }
 return listitem;

    }
}
