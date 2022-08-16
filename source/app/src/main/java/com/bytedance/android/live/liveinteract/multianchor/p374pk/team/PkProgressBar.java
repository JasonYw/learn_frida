package com.bytedance.android.live.liveinteract.multianchor.p374pk.team;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.live.core.gift.AbstractC4071b;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.widget.widget.NoPaddingTextView;
import com.bytedance.android.live.liveinteract.widget.widget.PKProgressBar;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9069m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81136HyU;
import p003X.C106862S5w;
import p003X.C47A;
import p003X.C79506HVs;
import p003X.C81814IMm;
import p003X.C81978ISu;
import p003X.HRA;
import p003X.HX2;
import p003X.HX3;
import p003X.LK5;
import p003X.QVQ;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.team.PkProgressBar */
/* loaded from: classes3.dex */
public class PkProgressBar extends FrameLayout implements AbstractC4071b, HRA, AbstractC81136HyU {
    public static ChangeQuickRedirect LIZ;
    public static final float LJIIL = 20.0f;
    public static final float LJIILIIL = 18.0f;
    public static final float LJIILJJIL = 36.0f;
    public static final float LJIILL = 18.0f;
    public static final float LJIILLIIL = 36.0f;
    public static final float LJIIZILJ = 18.0f;
    public Typeface LIZIZ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public float f26360LJ;
    public boolean LJIIIIZZ;
    public Disposable LJIIJ;
    public boolean LJIJ;
    public HX3 LJIJJ;
    public HashMap LJJIIJZLJL;
    public float LIZJ = 0.5f;
    public boolean LJFF = true;
    public AnimationState LJI = AnimationState.MIDDLE;
    public String LJII = "";
    public float LJIJI = 0.5f;
    public boolean LJIIIZ = true;
    public float LJIJJLI = LJIIL;
    public float LJIL = LJIILIIL;
    public float LJJ = (30.0f - this.LJIL) / 2.0f;
    public float LJIIJJI = LJIILJJIL;
    public float LJJI = LJIILL;
    public float LJJIFFI = (30.0f - this.LJJI) / 2.0f;
    public float LJJII = LJIILLIIL;
    public float LJJIII = LJIIZILJ;
    public float LJJIIJ = (30.0f - this.LJJIII) / 2.0f;

    /* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.team.PkProgressBar$AnimationState */
    /* loaded from: classes3.dex */
    public enum AnimationState {
        MIDDLE,
        ATMOSPHERE,
        EMOJI;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28284);
        }

        public static AnimationState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (AnimationState) (proxy.isSupported ? proxy.result : Enum.valueOf(AnimationState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AnimationState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (AnimationState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    public View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 29);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = new HashMap();
        }
        View view = (View) this.LJJIIJZLJL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJIIJZLJL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final float getMAtmosphereAnimHeight() {
        return this.LJJI;
    }

    public final float getMAtmosphereAnimInAddHeight() {
        return this.LJJIII;
    }

    public final float getMAtmosphereAnimInAddMarginBottom() {
        return this.LJJIIJ;
    }

    public final float getMAtmosphereAnimInAddWidth() {
        return this.LJJII;
    }

    public final float getMAtmosphereAnimMarginBottom() {
        return this.LJJIFFI;
    }

    public final float getMAtmosphereAnimWidth() {
        return this.LJIIJJI;
    }

    public final boolean getMDoubleAnimShown() {
        return this.LJIIIIZZ;
    }

    public final Disposable getMDoubleAnimTimer() {
        return this.LJIIJ;
    }

    public final float getMEmojiAnimHeight() {
        return this.LJIL;
    }

    public final float getMEmojiAnimMarginBottom() {
        return this.LJJ;
    }

    public final float getMEmojiAnimWidth() {
        return this.LJIJJLI;
    }

    public final boolean getMIsAnchor() {
        return this.LIZLLL;
    }

    public final boolean getMIsPortrait() {
        return this.LJIIIZ;
    }

    public final HX3 getMShowPkStarAnimationListener() {
        return this.LJIJJ;
    }

    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        HSImageView hSImageView = (HSImageView) LIZ(2131183085);
        Intrinsics.checkNotNullExpressionValue(hSImageView, "");
        hSImageView.setVisibility(8);
        HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        hSImageView2.setVisibility(0);
        if (this.LJI == AnimationState.EMOJI) {
            return;
        }
        if (this.LJI != AnimationState.ATMOSPHERE) {
            LIZ();
        }
        this.LJFF = true;
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar == null) {
            return;
        }
        pKProgressBar.LIZLLL = this.LJFF;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r1.getVisibility() == 0) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(float r5, boolean r6) {
        /*
            r4 = this;
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            r2 = 0
            r3[r2] = r0
            java.lang.Byte r1 = java.lang.Byte.valueOf(r6)
            r0 = 1
            r3[r0] = r1
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p374pk.team.PkProgressBar.LIZ
            r0 = 15
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r2, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L1e
            return
        L1e:
            r1 = 2131183085(0x7f0745ed, float:1.7980885E38)
            android.view.View r0 = r4.LIZ(r1)
            if (r0 == 0) goto L5f
            android.view.View r1 = r4.LIZ(r1)
            com.bytedance.android.live.core.widget.HSImageView r1 = (com.bytedance.android.live.core.widget.HSImageView) r1
            java.lang.String r0 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L5f
        L38:
            r0 = 1134231552(0x439b0000, float:310.0)
            int r3 = p003X.LK5.LIZ(r0)
            float r1 = (float) r3
            r2 = 2131181987(0x7f0741a3, float:1.7978658E38)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L6a
            android.view.View r1 = r4.LIZ(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L52
            int r0 = (int) r5
            p003X.C3Q0.LIZ(r1, r0)
        L52:
            android.view.View r1 = r4.LIZ(r2)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            if (r1 == 0) goto L5e
            r0 = 0
            r1.setTranslationX(r0)
        L5e:
            return
        L5f:
            if (r6 != 0) goto L38
            r0 = 1091043328(0x41080000, float:8.5)
            int r0 = p003X.LK5.LIZ(r0)
            float r0 = (float) r0
            float r5 = r5 + r0
            goto L38
        L6a:
            android.view.View r0 = r4.LIZ(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L75
            p003X.C3Q0.LIZ(r0, r3)
        L75:
            android.view.View r0 = r4.LIZ(r2)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            if (r0 == 0) goto L81
            float r5 = r5 - r1
            r0.setTranslationX(r5)
        L81:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p374pk.team.PkProgressBar.LIZ(float, boolean):void");
    }

    public final void LIZ(Integer num, Long l) {
        if (PatchProxy.proxy(new Object[]{num, l}, this, LIZ, false, 19).isSupported) {
            return;
        }
        int LIZJ = C79506HVs.LIZJ();
        if (num == null || num.intValue() != LIZJ) {
            int LIZIZ = C79506HVs.LIZIZ();
            if (num == null || num.intValue() != LIZIZ || l == null || l.longValue() < 0) {
                return;
            }
            long longValue = l.longValue();
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_SCORE_ANIMATION_TIME_THRESHOLD;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (longValue > value.longValue()) {
                return;
            }
        }
        if (this.LJI == AnimationState.EMOJI) {
            return;
        }
        LIZIZ();
        this.LJI = AnimationState.EMOJI;
    }

    public final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 24).isSupported) {
            return;
        }
        if (z) {
            NoPaddingTextView noPaddingTextView = (NoPaddingTextView) LIZ(2131180729);
            Intrinsics.checkNotNullExpressionValue(noPaddingTextView, "");
            noPaddingTextView.setText(str);
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            if (value == null || value.intValue() != 2 || this.LJIJ) {
                LIZLLL();
                this.LJIJ = false;
            }
        } else {
            NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) LIZ(2131165275);
            Intrinsics.checkNotNullExpressionValue(noPaddingTextView2, "");
            noPaddingTextView2.setText(str);
            SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Integer value2 = settingKey2.getValue();
            if (value2 == null || value2.intValue() != 2 || this.LJIJ) {
                LIZJ();
                this.LJIJ = false;
            }
        }
        NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) LIZ(2131180729);
        if (noPaddingTextView3 != null) {
            noPaddingTextView3.setVisibility(0);
        }
        NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) LIZ(2131165275);
        if (noPaddingTextView4 != null) {
            noPaddingTextView4.setVisibility(0);
        }
        NoPaddingTextView noPaddingTextView5 = (NoPaddingTextView) LIZ(2131195232);
        if (noPaddingTextView5 == null) {
            return;
        }
        noPaddingTextView5.setVisibility(8);
    }

    static {
        Covode.recordClassIndex(28283);
    }

    private final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        ((AppCompatTextView) LIZ(2131165275)).setTextSize(2, 14.0f);
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        ((AppCompatTextView) LIZ(2131180729)).setTextSize(2, 14.0f);
    }

    public final int getLeftValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar == null) {
            return 0;
        }
        return pKProgressBar.getLeftValue();
    }

    public final int getRightValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar == null) {
            return 0;
        }
        return pKProgressBar.getRightValue();
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value != null && value.intValue() == 2) {
            LIZLLL();
            LIZJ();
        }
        SettingKey<C9069m> settingKey2 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), settingKey2.getValue().LIZIZ);
        LIZ(this.LJIIJJI, this.LJJI, this.LJJIFFI, 0.0f);
        this.f26360LJ = this.LJIIJJI;
        this.LJI = AnimationState.ATMOSPHERE;
    }

    private final void LIZIZ() {
        String str;
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        float f = this.LIZJ;
        if (f > 0.5f) {
            SettingKey<C9069m> settingKey = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            str = settingKey.getValue().f27975LJ;
        } else if (f == 0.5f) {
            SettingKey<C9069m> settingKey2 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            str = settingKey2.getValue().LJI;
        } else {
            SettingKey<C9069m> settingKey3 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            str = settingKey3.getValue().LJFF;
        }
        if (!Intrinsics.areEqual(str, this.LJII)) {
            C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), str);
            LIZ(this.LJIJJLI, this.LJIL, this.LJJ, 0.0f);
            HSImageView hSImageView = (HSImageView) LIZ(2131185195);
            if (hSImageView != null && (layoutParams = hSImageView.getLayoutParams()) != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = LIZ((this.LIZJ * (getWidth() - LK5.LIZ(60.0f))) + LK5.LIZ(30.0f), this.LJIJJLI, true);
                HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
                if (hSImageView2 != null) {
                    hSImageView2.setLayoutParams(layoutParams2);
                }
                this.LJII = str;
                HSImageView hSImageView3 = (HSImageView) LIZ(2131185195);
                Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
                hSImageView3.setScaleX(1.0f);
                HSImageView hSImageView4 = (HSImageView) LIZ(2131183085);
                Intrinsics.checkNotNullExpressionValue(hSImageView4, "");
                hSImageView4.setVisibility(8);
                HSImageView hSImageView5 = (HSImageView) LIZ(2131185195);
                Intrinsics.checkNotNullExpressionValue(hSImageView5, "");
                hSImageView5.setVisibility(0);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        this.f26360LJ = this.LJIJJLI;
        this.LJI = AnimationState.EMOJI;
    }

    public final void setMAtmosphereAnimHeight(float f) {
        this.LJJI = f;
    }

    public final void setMAtmosphereAnimInAddHeight(float f) {
        this.LJJIII = f;
    }

    public final void setMAtmosphereAnimInAddMarginBottom(float f) {
        this.LJJIIJ = f;
    }

    public final void setMAtmosphereAnimInAddWidth(float f) {
        this.LJJII = f;
    }

    public final void setMAtmosphereAnimMarginBottom(float f) {
        this.LJJIFFI = f;
    }

    public final void setMAtmosphereAnimWidth(float f) {
        this.LJIIJJI = f;
    }

    public final void setMDoubleAnimShown(boolean z) {
        this.LJIIIIZZ = z;
    }

    public final void setMEmojiAnimHeight(float f) {
        this.LJIL = f;
    }

    public final void setMEmojiAnimMarginBottom(float f) {
        this.LJJ = f;
    }

    public final void setMEmojiAnimWidth(float f) {
        this.LJIJJLI = f;
    }

    public final void setMIsAnchor(boolean z) {
        this.LIZLLL = z;
    }

    public final void setMIsPortrait(boolean z) {
        this.LJIIIZ = z;
    }

    public final void setMShowPkStarAnimationListener(HX3 hx3) {
        this.LJIJJ = hx3;
    }

    @Override // com.bytedance.android.live.core.gift.AbstractC4071b
    public void onSendGiftResult(C81814IMm c81814IMm) {
        if (PatchProxy.proxy(new Object[]{c81814IMm}, this, LIZ, false, 28).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81814IMm);
        if (c81814IMm.LIZ) {
            this.LJIJ = true;
        }
    }

    public final void setMDoubleAnimTimer(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIIJ = disposable;
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZIZ(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 18).isSupported) {
            return;
        }
        this.LIZJ = f;
        if (this.LJI == AnimationState.EMOJI) {
            LIZIZ();
        }
        this.LJIJI = f;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 22).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (C47A.LIZ() && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new HX2(this));
        }
    }

    @Override // p003X.HRA
    public void setPadOrientation(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIIZ = z;
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar != null) {
            pKProgressBar.setIsPortrait(z);
        }
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZ(float f) {
        boolean z;
        ViewGroup.LayoutParams layoutParams;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        float width = (f * (getWidth() - LK5.LIZ(60.0f))) + LK5.LIZ(30.0f);
        HSImageView hSImageView = (HSImageView) LIZ(2131185195);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (hSImageView != null) {
            layoutParams2 = hSImageView.getLayoutParams();
        }
        if (layoutParams2 != null) {
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
            layoutParams3.gravity = 8388691;
            float f2 = this.f26360LJ;
            if (this.LJI == AnimationState.EMOJI) {
                z = true;
            } else {
                z = false;
            }
            layoutParams3.leftMargin = LIZ(width, f2, z);
            HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
            if (hSImageView2 != null) {
                hSImageView2.setLayoutParams(layoutParams3);
            }
            if (this.LJI != AnimationState.EMOJI) {
                z2 = false;
            }
            LIZ(width, z2);
            NoPaddingTextView noPaddingTextView = (NoPaddingTextView) LIZ(2131195232);
            if (noPaddingTextView != null && noPaddingTextView.getVisibility() == 0) {
                NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) LIZ(2131195232);
                if (noPaddingTextView2 != null && (layoutParams = noPaddingTextView2.getLayoutParams()) != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams4.gravity = 16;
                    NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) LIZ(2131195232);
                    Intrinsics.checkNotNullExpressionValue(noPaddingTextView3, "");
                    int i = (int) width;
                    int width2 = i - noPaddingTextView3.getWidth();
                    if (width2 - LK5.LIZ(15.0f) > 0) {
                        layoutParams4.leftMargin = width2 - LK5.LIZ(15.0f);
                        NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) LIZ(2131195232);
                        if (noPaddingTextView4 != null) {
                            noPaddingTextView4.setTextColor(LK5.LIZIZ(2131629108));
                        }
                    } else {
                        layoutParams4.leftMargin = i + LK5.LIZ(15.0f);
                        NoPaddingTextView noPaddingTextView5 = (NoPaddingTextView) LIZ(2131195232);
                        if (noPaddingTextView5 != null) {
                            noPaddingTextView5.setTextColor(LK5.LIZIZ(2131629109));
                        }
                    }
                    NoPaddingTextView noPaddingTextView6 = (NoPaddingTextView) LIZ(2131195232);
                    if (noPaddingTextView6 != null) {
                        noPaddingTextView6.setLayoutParams(layoutParams4);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1931);
        Disposable LIZIZ = QVQ.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LJIIJ = LIZIZ;
        MethodCollector.m14707o(1931);
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        NoPaddingTextView noPaddingTextView = (NoPaddingTextView) LIZ(2131180729);
        if (noPaddingTextView != null) {
            noPaddingTextView.setTextColor(i);
        }
        NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) LIZ(2131165275);
        if (noPaddingTextView2 != null) {
            noPaddingTextView2.setTextColor(i2);
        }
    }

    public final int LIZ(float f, float f2, boolean z) {
        float f3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (z) {
            f3 = 11.0f;
        } else {
            f3 = 8.5f;
        }
        if (this.LJFF) {
            return (int) ((f - LK5.LIZ(f2)) + LK5.LIZ(f3));
        }
        return (int) (f - LK5.LIZ(f3));
    }

    private final void LIZ(float f, float f2, float f3, float f4) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(0.0f)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        HSImageView hSImageView = (HSImageView) LIZ(2131185195);
        if (hSImageView != null && (layoutParams = hSImageView.getLayoutParams()) != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = 80;
            layoutParams2.bottomMargin = LK5.LIZ(f3);
            layoutParams2.topMargin = LK5.LIZ(0.0f);
            layoutParams2.width = LK5.LIZ(f);
            layoutParams2.height = LK5.LIZ(f2);
            HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
            if (hSImageView2 != null) {
                hSImageView2.setLayoutParams(layoutParams2);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
