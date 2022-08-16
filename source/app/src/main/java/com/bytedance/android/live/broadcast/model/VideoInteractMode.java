package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum VideoInteractMode {
    NONE(0, 2131587009, 0),
    CHATROOM(8, 2131588238, 1),
    KTV(13, 2131584795, 2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int labelID;
    public final int linkMicScene;
    public final int order;

    public static VideoInteractMode valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (VideoInteractMode) (proxy.isSupported ? proxy.result : Enum.valueOf(VideoInteractMode.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static VideoInteractMode[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (VideoInteractMode[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(16985);
    }

    VideoInteractMode(int i, int i2, int i3) {
        this.linkMicScene = i;
        this.labelID = i2;
        this.order = i3;
    }
}
