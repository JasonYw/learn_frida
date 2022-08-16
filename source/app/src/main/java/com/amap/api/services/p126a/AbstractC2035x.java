package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.x */
/* loaded from: classes19.dex */
public abstract class AbstractC2035x<T, V> extends AbstractC1843b<T, V> {
    static {
        Covode.recordClassIndex(5646);
    }

    /* renamed from: e */
    public boolean m16258e(String str) {
        if (str != null && !str.equals("") && !str.equals("[]")) {
            return false;
        }
        return true;
    }

    public AbstractC2035x(Context context, T t) {
        super(context, t);
    }
}
