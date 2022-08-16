package com.bytedance.android.live.effect.sticker.p331ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC86774KHg;
import p003X.C106862S5w;
import p003X.C147529fKV;
import p003X.View$OnClickListenerC147530fKW;

/* renamed from: com.bytedance.android.live.effect.sticker.ui.StickerFavoriteView */
/* loaded from: classes20.dex */
public final class StickerFavoriteView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public Sticker LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26233LJ;
    public final Lazy LJFF;
    public final Lazy LJI;
    public final Lazy LJII;
    public AbstractC86774KHg LJIIIIZZ;
    public boolean LJIIIZ;

    static {
        Covode.recordClassIndex(24643);
    }

    public StickerFavoriteView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StickerFavoriteView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final StickerFavoriteImageView getMIconIV() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (StickerFavoriteImageView) (proxy.isSupported ? proxy.result : this.f26233LJ.mo27335getValue());
    }

    public final TextView getMTipTV() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final String getMTipTextNormal() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (String) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final String getMTipTextSelected() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (String) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final AbstractC86774KHg getFavoriteStatusListener() {
        return this.LJIIIIZZ;
    }

    public final boolean getShowEnable() {
        return this.LJIIIZ;
    }

    public final void setFavoriteStatusListener(AbstractC86774KHg abstractC86774KHg) {
        this.LJIIIIZZ = abstractC86774KHg;
    }

    public final void setShowEnable(boolean z) {
        this.LJIIIZ = z;
    }

    public final void LIZ(Sticker sticker, boolean z) {
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(sticker, z, new StickerFavoriteView$refresh$1(this));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickerFavoriteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1683);
        this.f26233LJ = LazyKt__LazyJVMKt.lazy(new StickerFavoriteView$mIconIV$2(this));
        this.LJFF = LazyKt__LazyJVMKt.lazy(new StickerFavoriteView$mTipTV$2(this));
        this.LJI = LazyKt__LazyJVMKt.lazy(new StickerFavoriteView$mTipTextNormal$2(context));
        this.LJII = LazyKt__LazyJVMKt.lazy(new StickerFavoriteView$mTipTextSelected$2(context));
        this.LIZLLL = true;
        this.LJIIIZ = true;
        LinearLayout.inflate(context, 2131699053, this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            View$OnClickListenerC147530fKW view$OnClickListenerC147530fKW = new View$OnClickListenerC147530fKW(this);
            setOnClickListener(view$OnClickListenerC147530fKW);
            getMTipTV().setOnClickListener(view$OnClickListenerC147530fKW);
            getMIconIV().setOnClickListener(view$OnClickListenerC147530fKW);
            getMIconIV().setOnStateChangeListener(new C147529fKV(this));
        }
        MethodCollector.m14707o(1683);
    }

    public final void LIZ(Sticker sticker, boolean z, Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{sticker, Byte.valueOf(z ? (byte) 1 : (byte) 0), function0}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (!this.LJIIIZ) {
            setVisibility(8);
        } else if (sticker == null) {
            setVisibility(4);
        } else {
            setVisibility(0);
            this.LIZJ = sticker;
            this.LIZIZ = z;
            function0.mo30099invoke();
        }
    }

    public /* synthetic */ StickerFavoriteView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
