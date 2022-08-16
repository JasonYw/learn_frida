package com.alibaba.sdk.android.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* loaded from: classes13.dex */
public class AlicloudTracker {

    /* renamed from: a */
    public C1109c f21706a;

    /* renamed from: a */
    public String f21707a;

    /* renamed from: b */
    public String f21708b;

    /* renamed from: b */
    public Map<String, String> f21709b = new HashMap();

    static {
        Covode.recordClassIndex(4521);
    }

    public void removeGlobalProperty(String str) {
        if (!TextUtils.isEmpty(str) && this.f21709b.containsKey(str)) {
            this.f21709b.remove(str);
        }
    }

    public void sendCustomHit(String str, Map<String, String> map) {
        sendCustomHit(str, 0L, map);
    }

    public void setGlobalProperty(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str2 != null) {
            if (this.f21709b.containsKey(str)) {
                this.f21709b.remove(str);
            }
            this.f21709b.put(str, str2);
        }
    }

    public AlicloudTracker(C1109c c1109c, String str, String str2) {
        this.f21706a = c1109c;
        this.f21707a = str;
        this.f21708b = str2;
    }

    public void sendCustomHit(String str, long j, Map<String, String> map) {
        try {
            if (this.f21706a == null) {
                return;
            }
            if (map == null) {
                map = new HashMap<>();
            }
            map.putAll(this.f21709b);
            map.put("sdkId", this.f21707a);
            map.put("sdkVersion", this.f21708b);
            C1109c c1109c = this.f21706a;
            new StringBuilder();
            c1109c.sendCustomHit(C0002O.m25085C(this.f21707a, "_", str), j, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
