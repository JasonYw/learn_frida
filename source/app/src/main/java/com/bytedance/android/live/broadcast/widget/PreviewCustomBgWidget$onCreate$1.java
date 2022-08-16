package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.AbstractC414762bG;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.C106862S5w;
import p003X.C87308Kak;
import p003X.IS5;
import p003X.IS8;

/* loaded from: classes3.dex */
public final class PreviewCustomBgWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCustomBgWidget this$0;

    static {
        Covode.recordClassIndex(18491);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCustomBgWidget$onCreate$1(PreviewCustomBgWidget previewCustomBgWidget) {
        super(1);
        this.this$0 = previewCustomBgWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        AudioInteractMode audioInteractMode;
        boolean z;
        AbstractC81939IRh abstractC81939IRh;
        AbstractC413392Xt<C3258d> LJJI;
        C3258d LIZIZ;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        AbstractC81935IRd abstractC81935IRd;
        boolean z2 = false;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7263n;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ, "");
            if (LIZ.booleanValue()) {
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7263n;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Boolean.FALSE);
                HSImageView hSImageView = this.this$0.LJIIL;
                if (hSImageView != null) {
                    hSImageView.setActualImageResource(2130857729);
                }
                View view2 = this.this$0.LIZJ;
                Intrinsics.checkNotNull(view2);
                view2.setVisibility(8);
            }
            PreviewCustomBgWidget previewCustomBgWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewCustomBgWidget, PreviewCustomBgWidget.LIZ, false, 6).isSupported && (abstractC81935IRd = previewCustomBgWidget.LJFF) != null) {
                abstractC81935IRd.LIZIZ(previewCustomBgWidget, previewCustomBgWidget.LJIILIIL, previewCustomBgWidget.LIZLLL());
            }
            PreviewCustomBgWidget previewCustomBgWidget2 = this.this$0;
            int LIZLLL = previewCustomBgWidget2.LIZLLL();
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(LIZLLL)}, previewCustomBgWidget2, PreviewCustomBgWidget.LIZ, false, 7).isSupported) {
                C3199v LIZJ = previewCustomBgWidget2.LIZJ();
                if (LIZJ == null || (LJJI = LIZJ.LJJI()) == null || (LIZIZ = LJJI.LIZIZ()) == null || (abstractC414762bG = LIZIZ.LIZIZ) == null || (audioInteractMode = abstractC414762bG.LIZ()) == null) {
                    audioInteractMode = AudioInteractMode.Radio;
                }
                IS5.LIZIZ.LIZIZ(audioInteractMode);
                if (previewCustomBgWidget2.LIZLLL == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (previewCustomBgWidget2.LJIILJJIL != null) {
                    z2 = true;
                }
                if (z2 & z) {
                    AbstractC2863ai abstractC2863ai = previewCustomBgWidget2.LJIILJJIL;
                    if (abstractC2863ai != null) {
                        Context context = previewCustomBgWidget2.context;
                        Intrinsics.checkNotNullExpressionValue(context, "");
                        abstractC81939IRh = abstractC2863ai.LIZ(context, true, previewCustomBgWidget2.f25984LJ, LIZLLL);
                    } else {
                        abstractC81939IRh = null;
                    }
                    previewCustomBgWidget2.LIZLLL = abstractC81939IRh;
                    AbstractC81939IRh abstractC81939IRh2 = previewCustomBgWidget2.LIZLLL;
                    if (abstractC81939IRh2 != null) {
                        abstractC81939IRh2.setOnDismissListener(new IS8(previewCustomBgWidget2));
                    }
                }
                AbstractC81939IRh abstractC81939IRh3 = previewCustomBgWidget2.LIZLLL;
                if (abstractC81939IRh3 != null) {
                    previewCustomBgWidget2.LIZIZ().LJII().postValue(Boolean.TRUE);
                    abstractC81939IRh3.LIZ(LIZLLL);
                    abstractC81939IRh3.show();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
