package com.alipay.sdk.tid;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class Tid {
    public final String key;
    public final String tid;
    public final long time;

    static {
        Covode.recordClassIndex(4951);
    }

    public String getTid() {
        return this.tid;
    }

    public String getTidSeed() {
        return this.key;
    }

    public long getTimestamp() {
        return this.time;
    }

    public static boolean isEmpty(Tid tid) {
        if (tid != null && !TextUtils.isEmpty(tid.tid)) {
            return false;
        }
        return true;
    }

    public Tid(String str, String str2, long j) {
        this.tid = str;
        this.key = str2;
        this.time = j;
    }
}
