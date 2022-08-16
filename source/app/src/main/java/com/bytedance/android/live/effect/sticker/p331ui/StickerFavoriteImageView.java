package com.bytedance.android.live.effect.sticker.p331ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC147527fKT;
import p003X.C106862S5w;
import p003X.C499305oK;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteImageView */
/* loaded from: classes20.dex */
public final class StickerFavoriteImageView extends AppCompatImageView {
    public static ChangeQuickRedirect LIZ;
    public final float LIZIZ;
    public final int LIZJ;
    public AbstractC147527fKT LIZLLL;

    static {
        Covode.recordClassIndex(24639);
    }

    public StickerFavoriteImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickerFavoriteImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && !PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 6).isSupported) {
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
                super.onDetachedFromWindow();
            }
            C499305oK.LIZ(this);
        }
    }

    public final void setOnStateChangeListener(AbstractC147527fKT abstractC147527fKT) {
        if (PatchProxy.proxy(new Object[]{abstractC147527fKT}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC147527fKT);
        this.LIZLLL = abstractC147527fKT;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZIZ = 1.08f;
        this.LIZJ = 100;
    }

    public /* synthetic */ StickerFavoriteImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
