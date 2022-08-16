package com.bytedance.android.annie.depend;

import com.bytedance.covode.number.Covode;

/* loaded from: classes7.dex */
public interface IRetrofit {
    static {
        Covode.recordClassIndex(10797);
    }

    <T> T create(Class<T> cls);
}
