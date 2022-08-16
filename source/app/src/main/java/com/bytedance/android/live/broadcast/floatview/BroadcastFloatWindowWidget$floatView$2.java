package com.bytedance.android.live.broadcast.floatview;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowWidget$floatView$2 extends Lambda implements Function0<ConstraintLayout> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BroadcastFloatWindowWidget this$0;

    static {
        Covode.recordClassIndex(15866);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFloatWindowWidget$floatView$2(BroadcastFloatWindowWidget broadcastFloatWindowWidget) {
        super(0);
        this.this$0 = broadcastFloatWindowWidget;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.constraintlayout.widget.ConstraintLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.constraintlayout.widget.ConstraintLayout, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ConstraintLayout mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ?? LIZ = C116971W2r.LIZ(this.this$0.m15902LJ(), 2131699747, (ViewGroup) null, false);
        if (!(LIZ instanceof ConstraintLayout)) {
            return null;
        }
        return LIZ;
    }
}
