package com.android.ttcjpaysdk.base.service.bean;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class H5SchemeParamBuilder {
    public Context context;
    public JSONObject hostInfo;
    public boolean isFromBanner;
    public String url;
    public int callbackId = -1;
    public Map<String, String> extendParams = new HashMap();

    static {
        Covode.recordClassIndex(6547);
    }

    public int getCallbackId() {
        return this.callbackId;
    }

    public Context getContext() {
        return this.context;
    }

    public Map<String, String> getExtendParams() {
        return this.extendParams;
    }

    public JSONObject getHostInfo() {
        return this.hostInfo;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isFromBanner() {
        return this.isFromBanner;
    }

    public H5SchemeParamBuilder setCallbackId(int i) {
        this.callbackId = i;
        return this;
    }

    public H5SchemeParamBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public H5SchemeParamBuilder setExtendParams(Map<String, String> map) {
        this.extendParams = map;
        return this;
    }

    public H5SchemeParamBuilder setFromBanner(boolean z) {
        this.isFromBanner = z;
        return this;
    }

    public H5SchemeParamBuilder setHostInfo(JSONObject jSONObject) {
        this.hostInfo = jSONObject;
        return this;
    }

    public H5SchemeParamBuilder setUrl(String str) {
        this.url = str;
        return this;
    }
}
