package com.android.ttcjpaysdk.bindcard.base.constants;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public enum DialogBtnEnum {
    DEFAULT("默认传值"),
    FIRST("第一个按钮"),
    SECOND("第二个按钮"),
    THIRD("第三个按钮"),
    FOURTH("第四个按钮");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String mDesc;

    public static DialogBtnEnum valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DialogBtnEnum) (proxy.isSupported ? proxy.result : Enum.valueOf(DialogBtnEnum.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DialogBtnEnum[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DialogBtnEnum[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(7045);
    }

    DialogBtnEnum(String str) {
        this.mDesc = str;
    }
}
