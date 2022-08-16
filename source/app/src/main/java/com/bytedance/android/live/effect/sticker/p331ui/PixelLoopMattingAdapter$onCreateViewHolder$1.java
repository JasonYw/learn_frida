package com.bytedance.android.live.effect.sticker.p331ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86772KHe;
import p003X.C86773KHf;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.PixelLoopMattingAdapter$onCreateViewHolder$1 */
/* loaded from: classes5.dex */
public final class PixelLoopMattingAdapter$onCreateViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C86773KHf $holder;
    public final /* synthetic */ C86772KHe this$0;

    static {
        Covode.recordClassIndex(24637);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PixelLoopMattingAdapter$onCreateViewHolder$1(C86772KHe c86772KHe, C86773KHf c86773KHf) {
        super(1);
        this.this$0 = c86772KHe;
        this.$holder = c86773KHf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        int adapterPosition;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C86772KHe c86772KHe = this.this$0;
            C86773KHf c86773KHf = this.$holder;
            if (!PatchProxy.proxy(new Object[]{c86773KHf}, c86772KHe, C86772KHe.LIZ, false, 6).isSupported && (adapterPosition = c86773KHf.getAdapterPosition()) >= 0 && adapterPosition < c86772KHe.LIZIZ.size()) {
                if (adapterPosition == c86772KHe.LIZJ && !c86772KHe.LIZIZ.get(adapterPosition).LIZIZ) {
                    c86772KHe.LIZLLL = null;
                    c86772KHe.notifyItemChanged(c86772KHe.LIZJ);
                    c86772KHe.LJFF.LIZ(c86772KHe.f8411LJ);
                    c86772KHe.LIZJ = -1;
                } else {
                    c86772KHe.LIZ(adapterPosition, true ^ c86772KHe.LIZIZ.get(adapterPosition).LIZIZ);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
