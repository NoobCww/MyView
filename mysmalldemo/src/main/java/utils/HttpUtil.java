package utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by 威威 on 2017/11/23.
 */

public class HttpUtil {
    private Context context;
    private DownData data;
    private Handler han=new Handler();
    public HttpUtil(Context context,DownData data) {
        this.context = context;
        this.data=data;
    }

    public boolean isOK(){
        ConnectivityManager man= (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = man.getActiveNetworkInfo();

            return info.isConnected();


    }
    //json: 地址
    public void getData(String json, HashMap<String,String>map){
       if(!isOK()){
           return;
       }
        OkHttpClient client=new OkHttpClient.Builder().readTimeout(
                5, TimeUnit.SECONDS
        ).connectTimeout(5,TimeUnit.SECONDS).build();
        FormBody.Builder fom=new FormBody.Builder();
        for(String ss:map.keySet()){
            fom.add(ss,map.get(ss));
        }
        Request qu=new Request.Builder().url(json).post(fom.build()).build();
        Call call=client.newCall(qu);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String ss=response.body().string();
                han.post(new Runnable() {
                    @Override
                    public void run() {
                        data.downData(ss);
                    }
                });
            }
        });


    }
    public interface DownData{
        void downData(String ss);
    }

}
