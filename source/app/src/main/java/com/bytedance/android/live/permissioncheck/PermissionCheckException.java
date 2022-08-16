package com.bytedance.android.live.permissioncheck;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public final class PermissionCheckException extends RuntimeException {
    public final String message;

    static {
        Covode.recordClassIndex(32794);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.message;
    }

    public PermissionCheckException(String str) {
        this.message = str;
    }
}
