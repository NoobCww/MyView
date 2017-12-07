package com.example.mysmalldemo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.animation.ObjectAnimator.ofFloat;
import static com.example.mysmalldemo.R.id.jing;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView img1;
    private ImageView img2;
    private AnimatorSet set;
    private TextView choose;
    private int num=0;
    private  int ids[]={R.id.work, R.id.life,R.id.ztitle,R.id.face,
           R.id.huazhuan,R.id.meijia,R.id.meifa,R.id.meirong,R.id.meixue,

    };
    private int ids2[]={   R.id.zhuanzhuan,R.id.zmeijia,R.id.zmeifa,R.id.zmeirong,R.id.zmeixue,
            R.id.caiwu, R.id.jingyi, R.id.tuandui, R.id.qiye, R.id.yeji,  R.id.ziben};
    private ImageView imgs2[]=new ImageView[ids2.length];
    private ImageView imgs[]=new ImageView[ids.length];
    private  int b=0;
    private ImageView chu1;
    private ImageView zai1;
    private ImageView jing1;
    private ImageView startBtu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findId();

    }
    public void setLis(boolean bl){
        chu1.setEnabled(bl);
        zai1.setEnabled(bl);
        jing1.setEnabled(bl);
    }
    public void closetImg(int num,AnimatorSet set){
        if(num==1){
            choose.setEnabled(false);
            ObjectAnimator tran1= ofFloat(img1,"translationX",-64.3f,-10f);
            ObjectAnimator alpha= ofFloat(img2,"alpha",0.3f,0);
            ObjectAnimator tran2= ofFloat(img2,"translationX",135.7f,-10f);
            tran1.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    for(int a=0;a<4;a++){
                        imgs[a]= (ImageView) findViewById(ids[a]);
                        imgs[a].setVisibility(View.VISIBLE);
                        imgs[a].setOnClickListener(new SmallSelect());
                    }
                    AnimatorSet set1=new AnimatorSet();
                    ObjectAnimator tra= ofFloat(imgs[0],"translationX",0,-165);
                    ObjectAnimator tra1= ofFloat(imgs[3],"translationX",0,165);
                    ObjectAnimator tra2= ofFloat(imgs[1],"translationX",0,-120);
                    ObjectAnimator tra02= ofFloat(imgs[1],"translationY",0,-160);
                    ObjectAnimator tra3= ofFloat(imgs[2],"translationX",0,90);
                    ObjectAnimator tra03= ofFloat(imgs[2],"translationY",0,-176);
                    set1.play(tra).with(tra1).with(tra2).with(tra02).with(tra3).with(tra03);
                    set1.setDuration(2000);
                    set1.start();
                    tra.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            choose.setEnabled(true);
                            startBtu.setVisibility(View.VISIBLE);
                        }
                    });
                }
            });

            set.play(tran2).with(tran1).with(alpha);
        }else if (num==2){
            choose.setEnabled(false);
            ObjectAnimator tran1= ofFloat(img1,"translationX",-64.3f,-10f);
            ObjectAnimator alpha= ofFloat(img1,"alpha",0.3f,0);
            ObjectAnimator tran2= ofFloat(img2,"translationX",135.7f,-10f);
            tran1.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    AnimatorSet set2=new AnimatorSet();
                    chu1.setVisibility(View.VISIBLE);
                    zai1.setVisibility(View.VISIBLE);
                    jing1.setVisibility(View.VISIBLE);
                    setLis(false);
                    ObjectAnimator tra= ofFloat(chu1,"translationY",0,210);
                    ObjectAnimator tra1= ofFloat(chu1,"translationX",0,-165);
                    ObjectAnimator tra2= ofFloat(zai1,"translationY",0,210);
                    ObjectAnimator tra03= ofFloat(jing1,"translationY",0,210);
                    ObjectAnimator tra3= ofFloat(jing1,"translationX",0,165);
                    set2.play(tra).with(tra1).with(tra2).with(tra3).with(tra03);
                    set2.setDuration(2000);
                    set2.start();
                    tra.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            choose.setEnabled(true);
                            setLis(true);
                        }
                    });
                }
            });
            set.play(tran1).with(tran2).with(alpha);
        }
        set.setDuration(2000);
        stopImg(false);
        set.start();
    }

    private void findId() {
        img1 = (ImageView) findViewById(R.id.img01);
        img2 = (ImageView) findViewById(R.id.img02);
        choose = (TextView) findViewById(R.id.choose);
        chu1 = (ImageView) findViewById(R.id.chu);
        zai1 = (ImageView) findViewById(R.id.zai);
        jing1 = (ImageView) findViewById(jing);
        startBtu = (ImageView) findViewById(R.id.startBtu);
        startBtu.setOnClickListener(this);
        chu1.setOnClickListener(this);
        zai1.setOnClickListener(this);
        jing1.setOnClickListener(this);
        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        choose.setOnClickListener(this);
        set = new AnimatorSet();
        ObjectAnimator tran1= ofFloat(img1,"translationX",35.7f,-100f);
        ObjectAnimator tran2= ofFloat(img2,"translationX",35.7f,100f);
        set.play(tran1).with(tran2);
       for(int a=0;a<ids.length;a++){
           imgs[a]= (ImageView) findViewById(ids[a]);
           chu1.setVisibility(View.GONE);
           zai1.setVisibility(View.GONE);
           jing1.setVisibility(View.GONE);
           startBtu.setVisibility(View.GONE);
           imgs[a].setVisibility(View.GONE);
       }
       for (int b=0;b<ids2.length;b++){
           imgs2[b]= (ImageView) findViewById(ids2[b]);
           chu1.setVisibility(View.GONE);
           zai1.setVisibility(View.GONE);
           jing1.setVisibility(View.GONE);
           startBtu.setVisibility(View.GONE);
           imgs2[b].setVisibility(View.GONE);
       }
        set.start();
    }
    public void stopImg(boolean bl){
        img2.setEnabled(bl);
        img1.setEnabled(bl);
    }
    public void chuListen(){
        choose.setVisibility(View.GONE);
        img1.setVisibility(View.GONE);
        img2.setVisibility(View.GONE);
        zai1.setVisibility(View.GONE);
        jing1.setVisibility(View.GONE);
        for(int a=0;a<4;a++){
            imgs[a]= (ImageView) findViewById(ids[a]);
            imgs[a].setVisibility(View.GONE);
        }
        for (int b=0;b<ids2.length;b++) {
            imgs2[b] = (ImageView) findViewById(ids2[b]);
            imgs2[b].setVisibility(View.GONE);
        }
        AnimatorSet aset=new AnimatorSet();
        ObjectAnimator chu2=ObjectAnimator.ofFloat(chu1,"translationX",-165,0);
        ObjectAnimator chu02=ObjectAnimator.ofFloat(chu1,"translationY",200,0);
        aset.play(chu2).with(chu02);
        aset.setDuration(2000);
        aset.start();
        chu1.setEnabled(false);
        chu2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                for (int a=4;a<9;a++){
                    imgs[a]= (ImageView) findViewById(ids[a]);
                    imgs[a].setVisibility(View.VISIBLE);
                    imgs[a].setOnClickListener(new ChuSmallselect());
                    chu1.setEnabled(false);
                }
                AnimatorSet set=new AnimatorSet();
                ObjectAnimator hua1=ObjectAnimator.ofFloat(imgs[4],"translationX",0,-121.7f);
                ObjectAnimator jia1=ObjectAnimator.ofFloat(imgs[5],"translationX",0,-70f);
                ObjectAnimator jia01=ObjectAnimator.ofFloat(imgs[5],"translationY",0,-120.3f);
                ObjectAnimator fa1=ObjectAnimator.ofFloat(imgs[6],"translationX",0,101.7f);
                ObjectAnimator fa01=ObjectAnimator.ofFloat(imgs[6],"translationY",0,-101.7f);
                ObjectAnimator ron1=ObjectAnimator.ofFloat(imgs[7],"translationX",0,131.7f);
                ObjectAnimator xue1=ObjectAnimator.ofFloat(imgs[8],"translationX",0,100f);
                ObjectAnimator xue01=ObjectAnimator.ofFloat(imgs[8],"translationY",0,101.7f);
                set.setDuration(2000);
                set.play(jia1).with(jia01).with(fa1).with(fa01).with(ron1).with(xue1).with(xue01).with(hua1);
                hua1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        startBtu.setVisibility(View.VISIBLE);
                    }
                });
                set.start();
            }
        });
    }
    public void zaiListen(){
        choose.setVisibility(View.GONE);
        img1.setVisibility(View.GONE);
        img2.setVisibility(View.GONE);
        chu1.setVisibility(View.GONE);
        jing1.setVisibility(View.GONE);
        for(int a=5;a<11;a++){
            imgs2[a]= (ImageView) findViewById(ids2[a]);
            imgs2[a].setVisibility(View.GONE);
        }
        AnimatorSet aset=new AnimatorSet();
        ObjectAnimator chu2=ObjectAnimator.ofFloat(zai1,"translationX",-165,0);
        ObjectAnimator chu02=ObjectAnimator.ofFloat(zai1,"translationY",200,0);
        aset.play(chu2).with(chu02);
        aset.setDuration(2000);
        aset.start();
        zai1.setEnabled(false);
        chu2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                for (int a=0;a<5;a++){
                    imgs2[a]= (ImageView) findViewById(ids2[a]);
                    imgs2[a].setVisibility(View.VISIBLE);
                    imgs2[a].setOnClickListener(new ZaiSmallselect());
                    zai1.setEnabled(false);
                }
                AnimatorSet set=new AnimatorSet();
                ObjectAnimator hua1=ObjectAnimator.ofFloat(imgs2[0],"translationX",0,-121.7f);
                ObjectAnimator jia1=ObjectAnimator.ofFloat(imgs2[1],"translationX",0,-70f);
                ObjectAnimator jia01=ObjectAnimator.ofFloat(imgs2[1],"translationY",0,-120.3f);
                ObjectAnimator fa1=ObjectAnimator.ofFloat(imgs2[2],"translationX",0,101.7f);
                ObjectAnimator fa01=ObjectAnimator.ofFloat(imgs2[2],"translationY",0,-101.7f);
                ObjectAnimator ron1=ObjectAnimator.ofFloat(imgs2[3],"translationX",0,131.7f);
                ObjectAnimator xue1=ObjectAnimator.ofFloat(imgs2[4],"translationX",0,100f);
                ObjectAnimator xue01=ObjectAnimator.ofFloat(imgs2[4],"translationY",0,101.7f);
                set.setDuration(2000);
                set.play(jia1).with(jia01).with(fa1).with(fa01).with(ron1).with(xue1).with(xue01).with(hua1);
                hua1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        startBtu.setVisibility(View.VISIBLE);
                    }
                });
                set.start();
            }
        });
    }
    public void jingListen(){
        choose.setVisibility(View.GONE);
        img1.setVisibility(View.GONE);
        img2.setVisibility(View.GONE);
        chu1.setVisibility(View.GONE);
        zai1.setVisibility(View.GONE);
        for(int a=0;a<5;a++){
            imgs2[a]= (ImageView) findViewById(ids2[a]);
            imgs2[a].setVisibility(View.GONE);
        }
        AnimatorSet aset1=new AnimatorSet();
        ObjectAnimator jing2=ObjectAnimator.ofFloat(jing1,"translationX",-165,0);
        ObjectAnimator jing02=ObjectAnimator.ofFloat(jing1,"translationY",200,0);
        aset1.play(jing2).with(jing02);
        aset1.setDuration(2000);
        aset1.start();
        jing1.setEnabled(false);
        jing2.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                for (int a=5;a<11;a++){
                    imgs2[a]= (ImageView) findViewById(ids2[a]);
                    imgs2[a].setVisibility(View.VISIBLE);
                    imgs2[a].setOnClickListener(new JingSmallselect());
                    jing1.setEnabled(false);
                }
                AnimatorSet set=new AnimatorSet();
                ObjectAnimator hua1=ObjectAnimator.ofFloat(imgs2[5],"translationX",0,-121.7f);
                ObjectAnimator jia1=ObjectAnimator.ofFloat(imgs2[6],"translationX",0,-70f);
                ObjectAnimator jia01=ObjectAnimator.ofFloat(imgs2[6],"translationY",0,-120.3f);
                ObjectAnimator fa1=ObjectAnimator.ofFloat(imgs2[7],"translationX",0,121.7f);
                ObjectAnimator fa01=ObjectAnimator.ofFloat(imgs2[8],"translationY",0,-121.7f);
                ObjectAnimator ron1=ObjectAnimator.ofFloat(imgs2[8],"translationX",0,100.7f);
                ObjectAnimator xue1=ObjectAnimator.ofFloat(imgs2[9],"translationX",0,90f);
                ObjectAnimator xue01=ObjectAnimator.ofFloat(imgs2[9],"translationY",0,110.7f);
                ObjectAnimator tuandui1=ObjectAnimator.ofFloat(imgs2[10],"translationX",0,-90f);
                ObjectAnimator tuandui01=ObjectAnimator.ofFloat(imgs2[10],"translationY",0,110.7f);
                set.setDuration(2000);
                set.play(jia1).with(jia01).with(fa1).with(fa01).with(ron1).with(xue1).with(xue01).with(hua1)
                        .with(tuandui1).with(tuandui01)
                ;
                fa1.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        startBtu.setVisibility(View.VISIBLE);
                    }
                });
                set.start();
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.choose:
                if(num>0) {
                    num=0;
                    findId();
                    ObjectAnimator alpha2 = ofFloat(img2, "alpha", 1, 1);
                    ObjectAnimator alpha1 = ofFloat(img1, "alpha", 1, 1);
                    alpha1.start();
                    alpha2.start();
                    stopImg(true);
                }
                break;
            case R.id.img01:
                num++;
                closetImg(1,set);
                break;
            case R.id.img02:
                num++;
                closetImg(2,set);
                break;
            case R.id.chu:
                jing1.setEnabled(false);
                zai1.setEnabled(false);
              chuListen();
                break;
            case R.id.zai:
                zaiListen();
                jing1.setEnabled(false);
                chu1.setEnabled(false);
                break;
            case R.id.jing:
                jingListen();
                zai1.setEnabled(false);
                chu1.setEnabled(false);
                break;
            case R.id.startBtu:
               // new HttpUtil(this,this).getData("http://api.dameiketang.com/Appapi/select/selectImg.json");
                startActivity(new Intent(MainActivity.this,FristActivity.class));
                break;
        }
    }
    class SmallSelect implements View.OnClickListener{

        @Override
        public void onClick(View v) {
                int c=0;
            switch (v.getId()){
                case R.id.work:
                    c=0;
                    break;
                case R.id.life:
                    c=1;
                    break;
                case R.id.ztitle:
                    c=2;
                    break;
                case R.id.face:
                    c=3;
                    break;
            }
            if(imgs[c].isSelected()){
                imgs[c].setSelected(false);
            }else{
                imgs[c].setSelected(true);
            }
        }
    }
    class  ChuSmallselect implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int c=0;
            switch (v.getId()){
                case R.id.huazhuan:
                    c=4;
                    break;
                case R.id.meijia:
                    c=5;
                    break;
                case R.id.meifa:
                    c=6;
                    break;
                case R.id.meirong:
                    c=7;
                    break;
                case R.id.meixue:
                    c=8;
                    break;
            }
            if(imgs[c].isSelected()){
                imgs[c].setSelected(false);
            }else{
                imgs[c].setSelected(true);
            }
        }
    }
    class  ZaiSmallselect implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int c=0;
            switch (v.getId()){
                case R.id.zhuanzhuan:
                    c=0;
                    break;
                case R.id.zmeijia:
                    c=1;
                    break;
                case R.id.zmeifa:
                    c=2;
                    break;
                case R.id.zmeirong:
                    c=3;
                    break;
                case R.id.zmeixue:
                    c=4;
                    break;
            }
            if(imgs2[c].isSelected()){
                imgs2[c].setSelected(false);
            }else{
                imgs2[c].setSelected(true);
            }
        }
    }
    class  JingSmallselect implements View.OnClickListener{

        @Override
        public void onClick(View v) {
            int c=0;
            switch (v.getId()){
                case R.id.caiwu:
                    c=5;
                    break;
                case R.id.jingyi:
                    c=6;
                    break;
                case R.id.tuandui:
                    c=7;
                    break;
                case R.id.qiye:
                    c=8;
                    break;
                case R.id.yeji:
                    c=9;
                    break;
                case R.id.ziben:
                    c=10;
                    break;
            }
            if(imgs2[c].isSelected()){
                imgs2[c].setSelected(false);
            }else{
                imgs2[c].setSelected(true);
            }
        }
    }
}
