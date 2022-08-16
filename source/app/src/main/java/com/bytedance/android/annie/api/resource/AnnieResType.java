package com.bytedance.android.annie.api.resource;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;

/* loaded from: classes7.dex */
public enum AnnieResType {
    LYNX_TEMPLATE("lynx_template"),
    WEB_MAIN_RESOURCE("web_main_resource"),
    COMPONENT("component"),
    EXTERNAL_JS("external_js"),
    STATIC("static"),
    LYNX_CHILD_RESOURCE("lynx_child_resource"),
    WEB_CHILD_RESOURCE("web_child_resource"),
    UNKNOWN(LoggerUtil.UNKNOWN);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String tag;

    public static AnnieResType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (AnnieResType) (proxy.isSupported ? proxy.result : Enum.valueOf(AnnieResType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AnnieResType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (AnnieResType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(10484);
    }

    AnnieResType(String str) {
        this.tag = str;
    }
}
