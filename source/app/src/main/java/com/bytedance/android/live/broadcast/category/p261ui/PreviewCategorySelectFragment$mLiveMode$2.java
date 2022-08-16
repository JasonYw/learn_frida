package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.category.viewmodel.C2970a;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySelectFragment$mLiveMode$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySelectFragment$mLiveMode$2 extends Lambda implements Function0<LiveMode> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2968h this$0;

    static {
        Covode.recordClassIndex(15092);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySelectFragment$mLiveMode$2(C2968h c2968h) {
        super(0);
        this.this$0 = c2968h;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.LiveMode] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LiveMode mo30099invoke() {
        Object mo27335getValue;
        NextLiveData<LiveMode> LJIIL;
        C2WC<LiveMode> LIZ;
        LiveMode LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2968h c2968h = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c2968h, C2968h.LIZ, false, 4);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = c2968h.LIZIZ.mo27335getValue();
        }
        C3180k c3180k = (C3180k) mo27335getValue;
        if (c3180k == null || (LIZ = c3180k.LIZ()) == null || (LIZ2 = LIZ.LIZ()) == null) {
            C2970a m15908LJ = this.this$0.m15908LJ();
            if (m15908LJ != null && (LJIIL = m15908LJ.LJIIL()) != null) {
                return LJIIL.getValue();
            }
            return null;
        }
        return LIZ2;
    }
}
