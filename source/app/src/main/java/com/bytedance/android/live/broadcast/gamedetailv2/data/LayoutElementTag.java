package com.bytedance.android.live.broadcast.gamedetailv2.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.L8S;

/* loaded from: classes5.dex */
public enum LayoutElementTag {
    ANY(0),
    NATIVE(1),
    LYNX(2),
    NATIVE_TAB(3),
    TAB_SINGLE_VIEW(4),
    TAB_MULTI_VIEW(5);
    
    public static final L8S Companion = new L8S((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int tag;

    public static LayoutElementTag valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (LayoutElementTag) (proxy.isSupported ? proxy.result : Enum.valueOf(LayoutElementTag.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LayoutElementTag[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (LayoutElementTag[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(16635);
    }

    LayoutElementTag(int i) {
        this.tag = i;
    }
}
