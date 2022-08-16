package com.bytedance.android.annie.scheme.p215vo;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.annie.scheme.vo.PageType */
/* loaded from: classes7.dex */
public enum PageType {
    CARD("card"),
    FULLSCREEN("fullscreen"),
    POPUP("popup");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String pageType;

    public static PageType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (PageType) (proxy.isSupported ? proxy.result : Enum.valueOf(PageType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PageType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (PageType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(11001);
    }

    PageType(String str) {
        this.pageType = str;
    }
}
