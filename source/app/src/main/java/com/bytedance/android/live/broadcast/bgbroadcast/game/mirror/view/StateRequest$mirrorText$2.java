package com.bytedance.android.live.broadcast.bgbroadcast.game.mirror.view;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KC7;

/* loaded from: classes5.dex */
public final class StateRequest$mirrorText$2 extends Lambda implements Function0<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KC7 this$0;

    static {
        Covode.recordClassIndex(14809);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateRequest$mirrorText$2(KC7 kc7) {
        super(0);
        this.this$0 = kc7;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.TextView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ TextView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LJI.findViewById(2131183207);
    }
}