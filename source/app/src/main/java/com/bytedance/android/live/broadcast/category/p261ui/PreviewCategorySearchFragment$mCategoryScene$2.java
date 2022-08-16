package com.bytedance.android.live.broadcast.category.p261ui;

import com.bytedance.android.live.broadcast.api.model.CategoryScene;
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

/* renamed from: com.bytedance.android.live.broadcast.category.ui.PreviewCategorySearchFragment$mCategoryScene$2 */
/* loaded from: classes5.dex */
public final class PreviewCategorySearchFragment$mCategoryScene$2 extends Lambda implements Function0<CategoryScene> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2967g this$0;

    static {
        Covode.recordClassIndex(15086);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCategorySearchFragment$mCategoryScene$2(C2967g c2967g) {
        super(0);
        this.this$0 = c2967g;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.bytedance.android.live.broadcast.api.model.CategoryScene, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ CategoryScene mo30099invoke() {
        Object mo27335getValue;
        LiveMode liveMode;
        NextLiveData<LiveMode> LJIIL;
        C2WC<LiveMode> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C2967g c2967g = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c2967g, C2967g.LIZ, false, 1);
        if (proxy2.isSupported) {
            mo27335getValue = proxy2.result;
        } else {
            mo27335getValue = c2967g.LIZIZ.mo27335getValue();
        }
        C3180k c3180k = (C3180k) mo27335getValue;
        if (c3180k == null || (LIZ = c3180k.LIZ()) == null || (liveMode = LIZ.LIZ()) == null) {
            C2970a LIZIZ = this.this$0.LIZIZ();
            if (LIZIZ != null && (LJIIL = LIZIZ.LJIIL()) != null) {
                liveMode = LJIIL.getValue();
            } else {
                liveMode = null;
            }
        }
        if (liveMode == LiveMode.SCREEN_RECORD) {
            return CategoryScene.GAME;
        }
        return CategoryScene.VIDEO;
    }
}
