package com.coolweather.android.util;

import android.text.TextUtils;

import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by Administrator on 2018/3/14.
 */

public class Utility {
    /**
     * 解析和处理服务器返回的省级数据
     */
    public static boolean handleProvinceResponse(String response){
        if (!TextUtils.isEmpty(response)){
            try {
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i < allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();


                }
            }
        }
    }
}
