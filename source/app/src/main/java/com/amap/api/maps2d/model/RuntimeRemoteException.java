package com.amap.api.maps2d.model;

import android.os.RemoteException;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public final class RuntimeRemoteException extends RuntimeException {
    static {
        Covode.recordClassIndex(5388);
    }

    public RuntimeRemoteException(RemoteException remoteException) {
        super(remoteException);
    }

    public RuntimeRemoteException(String str) {
        super(str);
    }
}
