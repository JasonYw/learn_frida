package com.bytedance.android.live.effect.sticker.p331ui;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteView$refresh$1 */
/* loaded from: classes20.dex */
public final class StickerFavoriteView$refresh$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StickerFavoriteView this$0;

    static {
        Covode.recordClassIndex(24652);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteView$refresh$1(StickerFavoriteView stickerFavoriteView) {
        super(0);
        this.this$0 = stickerFavoriteView;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String mTipTextNormal;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.getMIconIV().setSelected(this.this$0.LIZIZ);
            TextView mTipTV = this.this$0.getMTipTV();
            Intrinsics.checkNotNullExpressionValue(mTipTV, "");
            if (this.this$0.LIZIZ) {
                mTipTextNormal = this.this$0.getMTipTextSelected();
            } else {
                mTipTextNormal = this.this$0.getMTipTextNormal();
            }
            mTipTV.setText(mTipTextNormal);
        }
        return Unit.INSTANCE;
    }
}
