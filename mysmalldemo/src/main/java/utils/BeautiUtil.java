package utils;

import com.google.gson.Gson;

import bean.NewBean;

/**
 * Created by 威威 on 2017/11/23.
 */

public class BeautiUtil {
    public NewBean getData(String json){
        Gson gson=new Gson();
        NewBean newBean = gson.fromJson(json, NewBean.class);
        return  newBean;
    }
}
