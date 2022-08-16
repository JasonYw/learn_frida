package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;
import p003X.KJV;

/* loaded from: classes3.dex */
public final class StartLiveFragment$previewWidgetContext$2 extends Lambda implements Function0<C3180k> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17178);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$previewWidgetContext$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: LIZ */
    public C3180k mo30099invoke() {
        C3180k c3180k;
        Context context;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (C3180k) proxy.result;
        }
        try {
            context = this.this$0.getContext();
        } catch (Exception e) {
            ALogger.m15799e("StartLiveFragment", "lazy get previewWidgetContext:", e);
            Pair LIZ = IQV.LIZ((Function0) StartLiveFragment$previewWidgetContext$2$context$pair$1.INSTANCE);
            this.this$0.LIZ((Disposable) LIZ.getSecond());
            c3180k = (C3180k) LIZ.getFirst();
        }
        if (context != null) {
            c3180k = (C3180k) PatchProxy.proxy(new Object[]{(FragmentActivity) context, null, 2, null}, null, IQV.LIZ, true, 6).LIZ(C3180k.class);
            c3180k.LJJLIIIJILLIZJL();
            return c3180k;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
