package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PreLiveSettingDialog$startLiveViewModel$2 extends Lambda implements Function0<C3199v> {
    public static final PreLiveSettingDialog$startLiveViewModel$2 INSTANCE = new PreLiveSettingDialog$startLiveViewModel$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18391);
    }

    public PreLiveSettingDialog$startLiveViewModel$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.preview.base.c, com.bytedance.android.live.broadcast.preview.v] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcast.preview.v] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3199v mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return AbstractC3177c.LJIIJ.LIZIZ(C3199v.class);
    }
}
