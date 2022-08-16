package com.bytedance.android.live.broadcast.gamedetail;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.L9P;

/* loaded from: classes5.dex */
public enum VideoRotation {
    Vertical(0),
    Horizontal(1);
    
    public static final L9P Companion = new L9P((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static VideoRotation valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (VideoRotation) (proxy.isSupported ? proxy.result : Enum.valueOf(VideoRotation.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static VideoRotation[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (VideoRotation[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(16015);
    }

    VideoRotation(int i) {
        this.value = i;
    }
}
