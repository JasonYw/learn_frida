package com.bytedance.android.live.broadcast.bgbroadcast.game.mirror.view;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KDZ;

/* loaded from: classes5.dex */
public final class StateMirroring$mirrorImage$2 extends Lambda implements Function0<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KDZ this$0;

    static {
        Covode.recordClassIndex(14805);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateMirroring$mirrorImage$2(KDZ kdz) {
        super(0);
        this.this$0 = kdz;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.ImageView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.ImageView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ImageView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZJ.findViewById(2131183202);
    }
}
