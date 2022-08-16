package com.bytedance.android.btm.api.cache;

import com.bytedance.covode.number.Covode;

/* loaded from: classes.dex */
public interface ISavable<T> {
    static {
        Covode.recordClassIndex(11291);
    }

    /* renamed from: parse */
    T mo25318parse(String str);

    String save();
}
