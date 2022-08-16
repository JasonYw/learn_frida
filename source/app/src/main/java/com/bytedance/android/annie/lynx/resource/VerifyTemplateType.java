package com.bytedance.android.annie.lynx.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes7.dex */
public enum VerifyTemplateType {
    EMPTY_FILE("Empty file"),
    BROKEN_FILE("Broken file"),
    VERIFY_SUCCEED("Verify succeed");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String TYPE;

    public static VerifyTemplateType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (VerifyTemplateType) (proxy.isSupported ? proxy.result : Enum.valueOf(VerifyTemplateType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static VerifyTemplateType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (VerifyTemplateType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(10833);
    }

    VerifyTemplateType(String str) {
        this.TYPE = str;
    }
}
