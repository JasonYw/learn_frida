package com.bytedance.android.btm.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class BtmItemBuilder$withBtmPage$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Object $value;

    static {
        Covode.recordClassIndex(11320);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtmItemBuilder$withBtmPage$1(Object obj) {
        super(0);
        this.$value = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        String str;
        Class<?> cls;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object obj = this.$value;
        if (obj != null && (cls = obj.getClass()) != null) {
            str = cls.getName();
        } else {
            str = null;
        }
        return Intrinsics.stringPlus(str, " is not BtmPage");
    }
}
