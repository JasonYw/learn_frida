package com.bytedance.android.live.broadcast.bgbroadcast.game.mirror.view;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88619Kvt;

/* loaded from: classes5.dex */
public final class StateScan$background$2 extends Lambda implements Function0<View> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88619Kvt this$0;

    static {
        Covode.recordClassIndex(14810);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateScan$background$2(C88619Kvt c88619Kvt) {
        super(0);
        this.this$0 = c88619Kvt;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZLLL.findViewById(2131183198);
    }
}
