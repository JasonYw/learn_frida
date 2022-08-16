package com.alibaba.sdk.android.utils;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.alibaba.sdk.android.utils.c */
/* loaded from: classes13.dex */
public class C1109c {

    /* renamed from: b */
    public boolean f21714b;

    static {
        Covode.recordClassIndex(4525);
    }

    /* renamed from: a */
    public void m19799a(Application application, Map<String, String> map) {
    }

    public void sendCustomHit(String str, long j, Map<String, String> map) {
        C1118d.m19777a("Utils:DataTracker", "no ut version, do nothing");
    }
}
