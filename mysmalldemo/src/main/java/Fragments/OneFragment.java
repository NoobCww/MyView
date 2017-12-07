package Fragments;


import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mysmalldemo.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.NewBean;
import utils.BeautiUtil;
import utils.HttpUtil;

/**
 * A simple {@link Fragment} subclass.
 */
public class OneFragment extends Fragment implements HttpUtil.DownData {
    private String path = "http://api.dameiketang.com/manager.php?m=Admin&c=Threevesion&a=IndexPageData";
    private HashMap<String, String> map = new HashMap<>();
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
           if(msg.what==11){
                int num=pager01.getCurrentItem();
               num++;
                handler.sendEmptyMessageDelayed(11,1000);
               pager01.setCurrentItem(num);
           }else if(msg.what==12){
               int num=pager02.getCurrentItem();
               num++;
               handler.sendEmptyMessageDelayed(12,1000);
               pager02.setCurrentItem(num);
           }
        }
    };
    private ArrayList<View> lists = new ArrayList<>();
    private ArrayList<View> lists2 = new ArrayList<>();
    private List<NewBean.HBean> h = new ArrayList<>();
    private  List<NewBean.CBean> c = new ArrayList<>();
    private MyAdapte adapte;
    private MyAdapte2 adapte2;
    private GridAdpater adpater;
    private MsGridAdpater msAdapte;
    private ViewPager pager01;
    private ViewPager pager02;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View ve = inflater.inflate(R.layout.fragment_one, null);
        pager01 = (ViewPager) ve.findViewById(R.id.pager01);
        pager02 = (ViewPager) ve.findViewById(R.id.pager02);
        GridView gridView= (GridView) ve.findViewById(R.id.gridView);
        GridView msGridView= (GridView) ve.findViewById(R.id.msGridView);
        map.put("id", "6894681b-ad8b-47e4-9f17-1cf07324464c");
        new HttpUtil(getContext(), this).getData(path, map);
        adapte = new MyAdapte();
        adapte2 = new MyAdapte2();
        adpater = new GridAdpater();
        msAdapte = new MsGridAdpater();
        pager01.setAdapter(adapte);
        pager02.setAdapter(adapte2);
        gridView.setAdapter(adpater);
        msGridView.setAdapter(msAdapte);
        return ve;
    }

    @Override
    public void downData(String ss) {
        Log.i("tag", "=========" + ss);
        NewBean newBean = new BeautiUtil().getData(ss);
        List<NewBean.EBean> e = newBean.getE();
        for (int a = 0; a < e.size(); a++) {
            String imgs = e.get(a).getImgurl();
            View ve = LayoutInflater.from(getContext()).inflate(R.layout.pager_item, null);
            ImageView img = (ImageView) ve.findViewById(R.id.imgpa);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(getContext()).load(imgs).into(img);
            lists.add(ve);
        }
        if (lists != null && lists.size() > 0) {
            adapte.notifyDataSetChanged();
            handler.sendEmptyMessageDelayed(11,1000);
        }
        List<NewBean.LBean> l = newBean.getL();
        for (int a = 0; a < l.size(); a++) {
            String imgs =l.get(a).getImg();
            View ve = LayoutInflater.from(getContext()).inflate(R.layout.pager02_item, null);
            ImageView img = (ImageView) ve.findViewById(R.id.imgpa02);
            img.setScaleType(ImageView.ScaleType.FIT_XY);
            Picasso.with(getContext()).load(imgs).into(img);
            lists2.add(ve);
        }
        if (lists2 != null && lists2.size() > 0) {
            adapte2.notifyDataSetChanged();
            handler.sendEmptyMessageDelayed(12,1000);
        }
        List<NewBean.HBean> h2 = newBean.getH();
        for(int a=0;a<h2.size();a++){
            h.addAll(h2);
        }
        if (h != null && h.size() > 0) {
            adpater.notifyDataSetChanged();
        }
        List<NewBean.CBean> c1 = newBean.getC();
        for(int a=0;a<c1.size();a++){
            c.addAll(c1);
        }
        if (c != null && c.size() > 0) {
            msAdapte.notifyDataSetChanged();
        }
    }

    class MyAdapte extends PagerAdapter {
        @Override
        public int getCount() {
            if (lists.size() > 0) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            position %= lists.size();
            ViewGroup gop = (ViewGroup) lists.get(position).getParent();
            if (gop != null) {
                container.removeView(lists.get(position));
            }
            container.addView(lists.get(position));
            return lists.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

        }
    }
    class MyAdapte2 extends PagerAdapter {
        @Override
        public int getCount() {
            if (lists2.size() > 0) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {

            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {

            position %= lists2.size();
            ViewGroup gop = (ViewGroup) lists2.get(position).getParent();
            if (gop != null) {
                container.removeView(lists2.get(position));
            }
            container.addView(lists2.get(position));
            return lists2.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {

        }
    }
    class GridAdpater extends BaseAdapter{


        @Override
        public int getCount() {
            return h.size();
        }

        @Override
        public NewBean.HBean getItem(int position) {
            return h.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder ve;
            if(convertView==null){
                convertView=LayoutInflater.from(getContext()).inflate(R.layout.haoping_item,null);
                ve=new ViewHolder(convertView);
                convertView.setTag(ve);
            }else{
                ve= (ViewHolder) convertView.getTag();
            }
            NewBean.HBean hb=getItem(position);
            ve.hpText.setText(hb.getLesson_name());
            Picasso.with(getContext()).load(hb.getBig_img_url()).into(ve.hpImg);
            return convertView;
        }
        class ViewHolder{
            TextView hpText;
            ImageView hpImg;

            public ViewHolder(View ve) {
              hpImg= (ImageView) ve.findViewById(R.id.hpImg);
                hpText= (TextView) ve.findViewById(R.id.hpText);
            }
        }
    }
    class MsGridAdpater extends BaseAdapter{


        @Override
        public int getCount() {
            return c.size();
        }

        @Override
        public NewBean.CBean getItem(int position) {
            return c.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder ve;
            if(convertView==null){
                convertView=LayoutInflater.from(getContext()).inflate(R.layout.mingshi_item,null);
                ve=new ViewHolder(convertView);
                convertView.setTag(ve);
            }else{
                ve= (ViewHolder) convertView.getTag();
            }
            NewBean.CBean item = getItem(position);
            ve.msText.setText(item.getTeacher_name());
            Picasso.with(getContext()).load(item.getTeacher_img()).into(ve.msImg);
            return convertView;
        }
        class ViewHolder{
            TextView msText;
            ImageView msImg;

            public ViewHolder(View ve) {
                msImg= (ImageView) ve.findViewById(R.id.msImg);
                msText= (TextView) ve.findViewById(R.id.msText);
            }
        }
    }
}
