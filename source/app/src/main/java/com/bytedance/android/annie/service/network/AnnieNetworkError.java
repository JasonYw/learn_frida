package com.bytedance.android.annie.service.network;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public final class AnnieNetworkError extends Throwable {
    public String message;
    public int statusCode;

    static {
        Covode.recordClassIndex(11122);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }
}
