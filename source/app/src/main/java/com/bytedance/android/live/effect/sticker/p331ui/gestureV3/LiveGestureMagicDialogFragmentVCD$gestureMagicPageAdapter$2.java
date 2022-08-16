package com.bytedance.android.live.effect.sticker.p331ui.gestureV3;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C86722KFg;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.gestureV3.LiveGestureMagicDialogFragmentVCD$gestureMagicPageAdapter$2 */
/* loaded from: classes5.dex */
public final class LiveGestureMagicDialogFragmentVCD$gestureMagicPageAdapter$2 extends Lambda implements Function0<C4221e> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86722KFg this$0;

    static {
        Covode.recordClassIndex(24700);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGestureMagicDialogFragmentVCD$gestureMagicPageAdapter$2(C86722KFg c86722KFg) {
        super(0);
        this.this$0 = c86722KFg;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.effect.sticker.ui.gestureV3.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4221e mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4221e(this.this$0.LIZJ);
    }
}
