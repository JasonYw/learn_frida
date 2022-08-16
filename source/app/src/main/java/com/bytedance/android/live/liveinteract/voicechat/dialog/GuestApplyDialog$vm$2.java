package com.bytedance.android.live.liveinteract.voicechat.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;

/* loaded from: classes3.dex */
public final class GuestApplyDialog$vm$2 extends Lambda implements Function0<C5012e> {
    public static final GuestApplyDialog$vm$2 INSTANCE = new GuestApplyDialog$vm$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30979);
    }

    public GuestApplyDialog$vm$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.voicechat.dialog.e, com.bytedance.live.datacontext.f] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.liveinteract.voicechat.dialog.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5012e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return IQV.LIZ("GuestApplyViewModel");
    }
}
