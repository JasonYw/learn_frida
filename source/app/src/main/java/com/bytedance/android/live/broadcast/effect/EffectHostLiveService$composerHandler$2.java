package com.bytedance.android.live.broadcast.effect;

import com.bytedance.android.live.broadcast.stream.capture.p279a.C3240b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86640KCc;

/* loaded from: classes5.dex */
public final class EffectHostLiveService$composerHandler$2 extends Lambda implements Function0<C3007c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86640KCc this$0;

    static {
        Covode.recordClassIndex(15732);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EffectHostLiveService$composerHandler$2(C86640KCc c86640KCc) {
        super(0);
        this.this$0 = c86640KCc;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.live.broadcast.effect.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3007c mo30099invoke() {
        Object mo27335getValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C86640KCc c86640KCc = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c86640KCc, C86640KCc.LIZ, false, 5);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = c86640KCc.LIZJ.mo27335getValue();
        }
        return new C3007c((C3240b) mo27335getValue);
    }
}