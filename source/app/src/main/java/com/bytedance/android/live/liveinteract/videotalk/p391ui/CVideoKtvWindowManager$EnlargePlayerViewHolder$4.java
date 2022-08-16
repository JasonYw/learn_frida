package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80654Hqi;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.CVideoKtvWindowManager$EnlargePlayerViewHolder$4 */
/* loaded from: classes3.dex */
public final class CVideoKtvWindowManager$EnlargePlayerViewHolder$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80654Hqi this$0;

    static {
        Covode.recordClassIndex(30443);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CVideoKtvWindowManager$EnlargePlayerViewHolder$4(C80654Hqi c80654Hqi) {
        super(1);
        this.this$0 = c80654Hqi;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJIILLIIL.LIZIZ(this.this$0.LJIILJJIL);
        }
        return Unit.INSTANCE;
    }
}
