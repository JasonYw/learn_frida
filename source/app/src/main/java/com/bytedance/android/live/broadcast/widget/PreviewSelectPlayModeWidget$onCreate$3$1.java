package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.android.live.broadcast.model.VideoInteractMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KLA;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class PreviewSelectPlayModeWidget$onCreate$3$1 extends Lambda implements Function1<VideoInteractMode, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KLA this$0;

    static {
        Covode.recordClassIndex(18652);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSelectPlayModeWidget$onCreate$3$1(KLA kla) {
        super(1);
        this.this$0 = kla;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(VideoInteractMode videoInteractMode) {
        VideoInteractMode videoInteractMode2 = videoInteractMode;
        if (!PatchProxy.proxy(new Object[]{videoInteractMode2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(videoInteractMode2);
            if (videoInteractMode2.order < this.this$0.LIZIZ.LIZIZ().LJJL().LIZ().order) {
                TextView textView = this.this$0.LIZIZ.LIZLLL;
                if (textView != null) {
                    this.this$0.LIZIZ.LIZ(textView, false, true);
                }
                TextView textView2 = this.this$0.LIZIZ.f25996LJ;
                if (textView2 != null) {
                    textView2.setText(LK5.LIZ(videoInteractMode2.labelID));
                }
                TextView textView3 = this.this$0.LIZIZ.f25996LJ;
                if (textView3 != null) {
                    this.this$0.LIZIZ.LIZ(textView3, false, false);
                }
                this.this$0.LIZIZ.LIZJ();
            } else if (this.this$0.LIZIZ.LIZIZ().LJJL().LIZ().order < videoInteractMode2.order) {
                TextView textView4 = this.this$0.LIZIZ.LIZLLL;
                if (textView4 != null) {
                    this.this$0.LIZIZ.LIZ(textView4, true, true);
                }
                TextView textView5 = this.this$0.LIZIZ.f25996LJ;
                if (textView5 != null) {
                    textView5.setText(LK5.LIZ(videoInteractMode2.labelID));
                }
                TextView textView6 = this.this$0.LIZIZ.f25996LJ;
                if (textView6 != null) {
                    this.this$0.LIZIZ.LIZ(textView6, true, false);
                }
                this.this$0.LIZIZ.LIZJ();
            }
            this.this$0.LIZIZ.LIZIZ().LJJL().LIZ(videoInteractMode2);
        }
        return Unit.INSTANCE;
    }
}
