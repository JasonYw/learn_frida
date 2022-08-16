package com.bytedance.android.btm.bridge.method;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xbridge.XCollectionsKt;
import com.bytedance.ies.xbridge.XReadableMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;

/* loaded from: classes18.dex */
public final class CreateBtmIdHelper$handle$1 extends Lambda implements Function0<Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ XReadableMap $params;

    static {
        Covode.recordClassIndex(11352);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateBtmIdHelper$handle$1(XReadableMap xReadableMap) {
        super(0);
        this.$params = xReadableMap;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C0002O.m25083C("createBtmId", "\nbtm=", XCollectionsKt.optString$default(this.$params, "btm", null, 2, null), "\nenter_new_page=", Boolean.valueOf(XCollectionsKt.optBoolean$default(this.$params, "enter_new_page", false, 2, null)));
    }
}
