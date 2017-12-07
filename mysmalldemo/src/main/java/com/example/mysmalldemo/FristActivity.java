package com.example.mysmalldemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioButton;

import java.util.ArrayList;

import Fragments.OneFragment;
import Fragments.TwoFragment;

public class FristActivity extends FragmentActivity implements View.OnClickListener{
    private ArrayList<Fragment>fragments=new ArrayList<>();
    private int ids[]={R.id.one,R.id.two,R.id.three,R.id.shouye,R.id.wodeke,R.id.gerezhongxin};
    private RadioButton btns[]=new RadioButton[ids.length];
    private FragmentTransaction transaction;
    private FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        for(int a=0;a<ids.length;a++){
            btns[a]= (RadioButton) findViewById(ids[a]);
            btns[a].setOnClickListener(this);
        }
        fm = getSupportFragmentManager();
        transaction = fm.beginTransaction();
        transaction.add(R.id.bigPager,new OneFragment());
        transaction.commit();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one:
                FragmentTransaction transaction1 = fm.beginTransaction();
                transaction1.replace(R.id.bigPager,new OneFragment());
                transaction1.commit();
                break;
            case R.id.two:
                FragmentTransaction transaction2 = fm.beginTransaction();
                transaction2.replace(R.id.bigPager,new TwoFragment());
                transaction2.commit();
            break;
            case R.id.three:

                break;
        }
    }

    //    class MyAdapte extends PagerAdapter{
//        @Override
//        public int getCount() {
//            if(lists.size()>0){
//                return Integer.MAX_VALUE;
//            }
//            return 0;
//        }
//
//        @Override
//        public boolean isViewFromObject(View view, Object object) {
//
//            return view==object;
//        }
//
//        @Override
//        public Object instantiateItem(ViewGroup container, int position) {
//
//            position%=lists.size();
//            ViewGroup gop= (ViewGroup) lists.get(position).getParent();
//            if(gop!=null){
//                container.removeView(lists.get(position));
//            }
//            container.addView(lists.get(position));
//            return lists.get(position);
//        }
//
//        @Override
//        public void destroyItem(ViewGroup container, int position, Object object) {
//
//        }
//    }
    class MyAdapte extends FragmentPagerAdapter{
    ArrayList<Fragment>lists;
    public MyAdapte(FragmentManager fm,ArrayList<Fragment>lists) {
        super(fm);
        this.lists=lists;
    }

    @Override
    public Fragment getItem(int position) {
        return lists.get(position);
    }

    @Override
    public int getCount() {
        return lists.size();
    }
}
}
