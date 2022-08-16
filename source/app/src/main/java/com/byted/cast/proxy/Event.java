package com.byted.cast.proxy;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes8.dex */
public class Event {
    public String appId;
    public long costTime;
    public String packageName;
    public boolean success;
    public long timestamp = System.currentTimeMillis();

    static {
        Covode.recordClassIndex(9771);
    }

    public Event(Context context, String str) {
        this.appId = str;
        this.packageName = context.getPackageName();
    }

    public Event(Context context, String str, long j, boolean z) {
        this.appId = str;
        this.packageName = context.getPackageName();
        this.costTime = j;
        this.success = z;
    }
}
