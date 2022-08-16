package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.gift.AbstractC4071b;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.p726a.C8718a;
import com.bytedance.android.livesdk.model.C9069m;
import com.bytedance.android.livesdkapi.depend.model.live.C9488ab;
import com.bytedance.android.livesdkapi.depend.model.live.TeamTask;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.facebook.drawee.view.SimpleDraweeView;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC81136HyU;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C18J;
import p003X.C47A;
import p003X.C80354Hls;
import p003X.C81814IMm;
import p003X.C81978ISu;
import p003X.HTD;
import p003X.HXO;
import p003X.HXV;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;
import p003X.QVQ;

/* loaded from: classes3.dex */
public final class PkProgressBarV2 extends FrameLayout implements AbstractC4071b, AbstractC81136HyU {
    public static ChangeQuickRedirect LIZ;
    public static final float LJIJI = 20.0f;
    public static final float LJIJJ = 18.0f;
    public static final float LJIJJLI = 36.0f;
    public static final float LJIL = 18.0f;
    public static final float LJJ = 36.0f;
    public static final float LJJI = 18.0f;
    public Typeface LIZIZ;
    public float LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public PkDataContext f26510LJ;
    public float LJFF;
    public int LJI;
    public boolean LJII;
    public AnimationState LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public Disposable LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public float LJIJ;
    public boolean LJJIFFI;
    public LinkCrossRoomDataHolder LJJII;
    public C80354Hls LJJIII;
    public float LJJIIJ;
    public AbstractC5146a LJJIIJZLJL;
    public float LJJIIZ;
    public float LJJIIZI;
    public float LJJIJ;
    public float LJJIJIIJI;
    public float LJJIJIIJIL;
    public float LJJIJIL;
    public float LJJIJL;
    public float LJJIJLIJ;
    public HashMap LJJIL;

    /* loaded from: classes3.dex */
    public enum AnimationState {
        MIDDLE,
        ATMOSPHERE,
        EMOJI;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(31946);
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

    /* renamed from: com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2$a */
    /* loaded from: classes3.dex */
    public interface AbstractC5146a {
        static {
            Covode.recordClassIndex(31947);
        }

        void LIZ(boolean z);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 42);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJIL == null) {
            this.LJJIL = new HashMap();
        }
        View view = (View) this.LJJIL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJJIL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final LinkCrossRoomDataHolder getDataHolder() {
        return this.LJJII;
    }

    public final float getMAtmosphereAnimHeight() {
        return this.LJJIJIIJI;
    }

    public final float getMAtmosphereAnimInAddHeight() {
        return this.LJJIJL;
    }

    public final float getMAtmosphereAnimInAddMarginBottom() {
        return this.LJJIJLIJ;
    }

    public final float getMAtmosphereAnimInAddWidth() {
        return this.LJJIJIL;
    }

    public final float getMAtmosphereAnimMarginBottom() {
        return this.LJJIJIIJIL;
    }

    public final float getMAtmosphereAnimWidth() {
        return this.LJIJ;
    }

    public final boolean getMDoubleAnimShown() {
        return this.LJIILIIL;
    }

    public final Disposable getMDoubleAnimTimer() {
        return this.LJIILL;
    }

    public final float getMEmojiAnimHeight() {
        return this.LJJIIZI;
    }

    public final float getMEmojiAnimMarginBottom() {
        return this.LJJIJ;
    }

    public final float getMEmojiAnimWidth() {
        return this.LJJIIZ;
    }

    public final boolean getMInAddition() {
        return this.LJIIL;
    }

    public final boolean getMIsAnchor() {
        return this.LIZLLL;
    }

    public final boolean getMIsPortrait() {
        return this.LJIILJJIL;
    }

    public final PkDataContext getMPkDataContext() {
        return this.f26510LJ;
    }

    public final C80354Hls getMPkLynxInfoViewModel() {
        return this.LJJIII;
    }

    public final boolean getMShowAdditionAnim() {
        return this.LJIIJJI;
    }

    public final AbstractC5146a getMShowPkStarAnimationListener() {
        return this.LJJIIJZLJL;
    }

    public final boolean getMShowSecKillLine() {
        return this.LJIIJ;
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZ(float f) {
        AppCompatTextView appCompatTextView;
        CharSequence text;
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        float width = (f * (getWidth() - LK5.LIZ(60.0f))) + LK5.LIZ(30.0f);
        HSImageView hSImageView = (HSImageView) LIZ(2131185195);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (hSImageView != null) {
            layoutParams2 = hSImageView.getLayoutParams();
        }
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
        layoutParams3.gravity = 8388691;
        layoutParams3.leftMargin = LIZ(width, this.LJFF, this.LJIIIIZZ == AnimationState.EMOJI);
        HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
        if (hSImageView2 != null) {
            hSImageView2.setLayoutParams(layoutParams3);
        }
        LIZ(width, this.LJIIIIZZ == AnimationState.EMOJI);
        if (this.LJIILLIIL && (appCompatTextView = (AppCompatTextView) LIZ(2131195232)) != null && (text = appCompatTextView.getText()) != null && text.length() > 0) {
            NoPaddingTextView noPaddingTextView = (NoPaddingTextView) LIZ(2131180729);
            if (noPaddingTextView != null) {
                noPaddingTextView.setVisibility(8);
            }
            NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) LIZ(2131165275);
            if (noPaddingTextView2 != null) {
                noPaddingTextView2.setVisibility(8);
            }
            NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) LIZ(2131195232);
            if (noPaddingTextView3 != null) {
                noPaddingTextView3.setVisibility(0);
            }
            NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) LIZ(2131195232);
            if (noPaddingTextView4 == null || (layoutParams = noPaddingTextView4.getLayoutParams()) == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams4.gravity = 16;
            NoPaddingTextView noPaddingTextView5 = (NoPaddingTextView) LIZ(2131195232);
            Intrinsics.checkNotNullExpressionValue(noPaddingTextView5, "");
            int i = (int) width;
            int width2 = i - noPaddingTextView5.getWidth();
            if (width2 - LK5.LIZ(15.0f) > 0) {
                layoutParams4.leftMargin = width2 - LK5.LIZ(15.0f);
                NoPaddingTextView noPaddingTextView6 = (NoPaddingTextView) LIZ(2131195232);
                if (noPaddingTextView6 != null) {
                    noPaddingTextView6.setTextColor(LK5.LIZIZ(2131629108));
                }
            } else {
                layoutParams4.leftMargin = i + LK5.LIZ(15.0f);
                NoPaddingTextView noPaddingTextView7 = (NoPaddingTextView) LIZ(2131195232);
                if (noPaddingTextView7 != null) {
                    noPaddingTextView7.setTextColor(LK5.LIZIZ(2131629109));
                }
            }
            NoPaddingTextView noPaddingTextView8 = (NoPaddingTextView) LIZ(2131195232);
            if (noPaddingTextView8 == null) {
                return;
            }
            noPaddingTextView8.setLayoutParams(layoutParams4);
            return;
        }
        NoPaddingTextView noPaddingTextView9 = (NoPaddingTextView) LIZ(2131180729);
        if (noPaddingTextView9 != null) {
            noPaddingTextView9.setVisibility(0);
        }
        NoPaddingTextView noPaddingTextView10 = (NoPaddingTextView) LIZ(2131165275);
        if (noPaddingTextView10 != null) {
            noPaddingTextView10.setVisibility(0);
        }
        NoPaddingTextView noPaddingTextView11 = (NoPaddingTextView) LIZ(2131195232);
        if (noPaddingTextView11 == null) {
            return;
        }
        noPaddingTextView11.setVisibility(8);
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
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2.LIZ
            r0 = 21
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2.LIZ(float, boolean):void");
    }

    public final void LIZ(boolean z) {
        int LIZ2;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        this.LJIIZILJ = z;
        float f = this.LIZJ;
        PkDataContext LIZ3 = HTD.LIZIZ.LIZ();
        if (f <= (LIZ3 != null ? LIZ3.LJJJJIZL : 0.0f)) {
            z2 = false;
        }
        PKTeamTaskProgressIndicator pKTeamTaskProgressIndicator = (PKTeamTaskProgressIndicator) LIZ(2131191594);
        if (pKTeamTaskProgressIndicator != null) {
            pKTeamTaskProgressIndicator.setupParams(z2);
        }
        PKTeamTaskProgressIndicator pKTeamTaskProgressIndicator2 = (PKTeamTaskProgressIndicator) LIZ(2131191594);
        ViewGroup.LayoutParams layoutParams = pKTeamTaskProgressIndicator2 != null ? pKTeamTaskProgressIndicator2.getLayoutParams() : null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        PkDataContext LIZ4 = HTD.LIZIZ.LIZ();
        float f2 = LIZ4 != null ? LIZ4.LJJJJIZL : 0.0f;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = ((int) ((getWidth() - LK5.LIZ(60.0f)) * f2)) + LK5.LIZ(30.0f) + LK5.LIZ(7.0f);
            if (z2) {
                LIZ2 = LK5.LIZ(0.0f);
            } else {
                LIZ2 = LK5.LIZ(5.0f);
            }
            marginLayoutParams.topMargin = LIZ2;
        }
        PKTeamTaskProgressIndicator pKTeamTaskProgressIndicator3 = (PKTeamTaskProgressIndicator) LIZ(2131191594);
        if (pKTeamTaskProgressIndicator3 != null) {
            pKTeamTaskProgressIndicator3.setLayoutParams(marginLayoutParams);
        }
        if (z && this.LJIIJ && f2 > 0.0f) {
            PKTeamTaskProgressIndicator pKTeamTaskProgressIndicator4 = (PKTeamTaskProgressIndicator) LIZ(2131191594);
            if (pKTeamTaskProgressIndicator4 == null) {
                return;
            }
            LK1.LIZJ(pKTeamTaskProgressIndicator4);
            return;
        }
        PKTeamTaskProgressIndicator pKTeamTaskProgressIndicator5 = (PKTeamTaskProgressIndicator) LIZ(2131191594);
        if (pKTeamTaskProgressIndicator5 == null) {
            return;
        }
        LK1.LIZ(pKTeamTaskProgressIndicator5);
    }

    public final void LIZ() {
        String str;
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported) {
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
        if (!Intrinsics.areEqual(str, this.LJIIIZ)) {
            C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), str);
            LIZ(this.LJJIIZ, this.LJJIIZI, this.LJJIJ, 0.0f);
            HSImageView hSImageView = (HSImageView) LIZ(2131185195);
            if (hSImageView == null || (layoutParams = hSImageView.getLayoutParams()) == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = LIZ((this.LIZJ * (getWidth() - LK5.LIZ(60.0f))) + LK5.LIZ(30.0f), this.LJJIIZ, true);
            HSImageView hSImageView2 = (HSImageView) LIZ(2131185195);
            if (hSImageView2 != null) {
                hSImageView2.setLayoutParams(layoutParams2);
            }
            this.LJIIIZ = str;
            HSImageView hSImageView3 = (HSImageView) LIZ(2131185195);
            Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
            hSImageView3.setScaleX(1.0f);
            HSImageView hSImageView4 = (HSImageView) LIZ(2131183085);
            Intrinsics.checkNotNullExpressionValue(hSImageView4, "");
            hSImageView4.setVisibility(8);
            HSImageView hSImageView5 = (HSImageView) LIZ(2131185195);
            Intrinsics.checkNotNullExpressionValue(hSImageView5, "");
            hSImageView5.setVisibility(0);
        }
        this.LJFF = this.LJJIIZ;
        this.LJIIIIZZ = AnimationState.EMOJI;
    }

    public final void LIZ(int i, boolean z) {
        String str;
        LiveData<C8718a> liveData;
        C8718a value;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C13491f LIZ2 = IQV.LIZ("PkDataContext");
        if (!(LIZ2 instanceof PkDataContext)) {
            LIZ2 = null;
        }
        PkDataContext pkDataContext = (PkDataContext) LIZ2;
        if (pkDataContext == null || (liveData = pkDataContext.LJIILIIL) == null || (value = liveData.getValue()) == null || (str = value.f27850LJ) == null) {
            str = "";
        }
        LIZ(i, str, z);
    }

    static {
        Covode.recordClassIndex(31945);
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 38).isSupported) {
            return;
        }
        ((AppCompatTextView) LIZ(2131165275)).setTextSize(2, 14.0f);
    }

    /* renamed from: LJ */
    private final void m15634LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 39).isSupported) {
            return;
        }
        ((AppCompatTextView) LIZ(2131180729)).setTextSize(2, 14.0f);
    }

    public final int getLeftValue() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
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
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar == null) {
            return 0;
        }
        return pKProgressBar.getRightValue();
    }

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Integer value = settingKey.getValue();
        if (value != null && value.intValue() == 2) {
            m15634LJ();
            LIZLLL();
        }
        if (this.LJIIL) {
            SettingKey<C9069m> settingKey2 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), settingKey2.getValue().LIZJ);
            LIZ(this.LJJIJIL, this.LJJIJL, this.LJJIJLIJ, 0.0f);
            this.LJFF = this.LJJIJIL;
        } else {
            SettingKey<C9069m> settingKey3 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey3, "");
            C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), settingKey3.getValue().LIZIZ);
            LIZ(this.LJIJ, this.LJJIJIIJI, this.LJJIJIIJIL, 0.0f);
            this.LJFF = this.LJIJ;
        }
        this.LJIIIIZZ = AnimationState.ATMOSPHERE;
    }

    private final boolean LIZJ() {
        String str;
        TeamTask teamTask;
        C9488ab c9488ab;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJIILL.isDisposed()) {
            return true;
        }
        SettingKey<HashMap<String, String>> settingKey = LiveConfigSettingKeys.LIVE_PK_TASK_SCORE_WEBP;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        HashMap<String, String> value = settingKey.getValue();
        PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
        if (LIZ2 != null && (teamTask = LIZ2.LJJJJI) != null && (c9488ab = teamTask.LIZ) != null) {
            str = String.valueOf(c9488ab.LIZJ);
        } else {
            str = null;
        }
        if (!this.LJIIL || this.LJIILIIL || !Intrinsics.areEqual("2", value.get(str))) {
            return false;
        }
        LIZ(this.LJJIJIL, this.LJJIJL, this.LJJIJLIJ, 0.0f);
        this.LJFF = this.LJJIJIL;
        SettingKey<C9069m> settingKey2 = LiveSettingKeys.LIVE_PK_SIMPLE_ATMOSPHERE_ANIMATION_URLS;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        C81978ISu.LIZ((SimpleDraweeView) LIZ(2131185195), settingKey2.getValue().LIZJ);
        Disposable subscribe = Observable.just(0).delay(JsBridgeDelegate.GET_URL_OUT_TIME, TimeUnit.MILLISECONDS).compose(C100839PnV.LIZJ()).subscribe(new HXV(this), C18J.LIZIZ);
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        this.LJIILL = subscribe;
        return true;
    }

    public final void setDataHolder(LinkCrossRoomDataHolder linkCrossRoomDataHolder) {
        this.LJJII = linkCrossRoomDataHolder;
    }

    public final void setMAtmosphereAnimHeight(float f) {
        this.LJJIJIIJI = f;
    }

    public final void setMAtmosphereAnimInAddHeight(float f) {
        this.LJJIJL = f;
    }

    public final void setMAtmosphereAnimInAddMarginBottom(float f) {
        this.LJJIJLIJ = f;
    }

    public final void setMAtmosphereAnimInAddWidth(float f) {
        this.LJJIJIL = f;
    }

    public final void setMAtmosphereAnimMarginBottom(float f) {
        this.LJJIJIIJIL = f;
    }

    public final void setMAtmosphereAnimWidth(float f) {
        this.LJIJ = f;
    }

    public final void setMDoubleAnimShown(boolean z) {
        this.LJIILIIL = z;
    }

    public final void setMEmojiAnimHeight(float f) {
        this.LJJIIZI = f;
    }

    public final void setMEmojiAnimMarginBottom(float f) {
        this.LJJIJ = f;
    }

    public final void setMEmojiAnimWidth(float f) {
        this.LJJIIZ = f;
    }

    public final void setMInAddition(boolean z) {
        this.LJIIL = z;
    }

    public final void setMIsAnchor(boolean z) {
        this.LIZLLL = z;
    }

    public final void setMIsPortrait(boolean z) {
        this.LJIILJJIL = z;
    }

    public final void setMPkDataContext(PkDataContext pkDataContext) {
        this.f26510LJ = pkDataContext;
    }

    public final void setMPkLynxInfoViewModel(C80354Hls c80354Hls) {
        this.LJJIII = c80354Hls;
    }

    public final void setMShowAdditionAnim(boolean z) {
        this.LJIIJJI = z;
    }

    public final void setMShowPkStarAnimationListener(AbstractC5146a abstractC5146a) {
        this.LJJIIJZLJL = abstractC5146a;
    }

    public final void setMShowSecKillLine(boolean z) {
        this.LJIIJ = z;
    }

    @Override // com.bytedance.android.live.core.gift.AbstractC4071b
    public final void onSendGiftResult(C81814IMm c81814IMm) {
        if (PatchProxy.proxy(new Object[]{c81814IMm}, this, LIZ, false, 41).isSupported) {
            return;
        }
        C106862S5w.LIZ(c81814IMm);
        if (c81814IMm.LIZ) {
            this.LJJIFFI = true;
        }
    }

    public final void setMDoubleAnimTimer(Disposable disposable) {
        if (PatchProxy.proxy(new Object[]{disposable}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(disposable);
        this.LJIILL = disposable;
    }

    public final void setPkDataContext(PkDataContext pkDataContext) {
        if (PatchProxy.proxy(new Object[]{pkDataContext}, this, LIZ, false, 19).isSupported) {
            return;
        }
        C106862S5w.LIZ(pkDataContext);
        this.f26510LJ = pkDataContext;
    }

    public final void setPkLynxInfoViewModel(C80354Hls c80354Hls) {
        if (PatchProxy.proxy(new Object[]{c80354Hls}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(c80354Hls);
        this.LJJIII = c80354Hls;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        ViewTreeObserver viewTreeObserver;
        if (PatchProxy.proxy(new Object[]{configuration}, this, LIZ, false, 35).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (C47A.LIZ() && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new HXO(this));
        }
    }

    public final void setPadOrientation(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIILJJIL = z;
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar != null) {
            pKProgressBar.setIsPortrait(z);
        }
    }

    public final void setDataholder(LinkCrossRoomDataHolder linkCrossRoomDataHolder) {
        AbstractC4256d abstractC4256d;
        LiveData<Long> liveData;
        Long value;
        LiveData<AbstractC4256d> liveData2;
        if (PatchProxy.proxy(new Object[]{linkCrossRoomDataHolder}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJJII = linkCrossRoomDataHolder;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            PkDataContext pkDataContext = this.f26510LJ;
            if (pkDataContext != null && (liveData2 = pkDataContext.LJIIIZ) != null) {
                abstractC4256d = liveData2.getValue();
            } else {
                abstractC4256d = null;
            }
            if (Intrinsics.areEqual(abstractC4256d, AbstractC4256d.C4259c.LIZIZ)) {
                LIZ();
                return;
            }
            PkDataContext pkDataContext2 = this.f26510LJ;
            if (pkDataContext2 != null && (liveData = pkDataContext2.LJIIJJI) != null && (value = liveData.getValue()) != null && value.longValue() != 0) {
                long longValue = value.longValue();
                SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_SCORE_ANIMATION_TIME_THRESHOLD;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Integer value2 = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                if (longValue < value2.longValue()) {
                    LIZ();
                }
            }
        }
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZIZ(float f) {
        AbstractC5146a abstractC5146a;
        NextLiveData<Boolean> nextLiveData;
        boolean z;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 25).isSupported) {
            return;
        }
        this.LIZJ = f;
        if (this.LJIIIIZZ == AnimationState.EMOJI) {
            LIZ();
        }
        if (this.LJJIIJ <= 0.5f && f > 0.5f) {
            AbstractC5146a abstractC5146a2 = this.LJJIIJZLJL;
            if (abstractC5146a2 != null) {
                abstractC5146a2.LIZ(true);
            }
        } else if (this.LJJIIJ <= 0.75f && f > 0.75f) {
            AbstractC5146a abstractC5146a3 = this.LJJIIJZLJL;
            if (abstractC5146a3 != null) {
                abstractC5146a3.LIZ(true);
            }
        } else if (this.LJJIIJ >= 0.5f && f < 0.5f) {
            AbstractC5146a abstractC5146a4 = this.LJJIIJZLJL;
            if (abstractC5146a4 != null) {
                abstractC5146a4.LIZ(false);
            }
        } else if (this.LJJIIJ >= 0.25f && f < 0.25f && (abstractC5146a = this.LJJIIJZLJL) != null) {
            abstractC5146a.LIZ(false);
        }
        this.LJJIIJ = f;
        PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
        if (LIZ2 != null) {
            float f2 = LIZ2.LJJJJIZL;
            if (f2 > 0.0f) {
                C80354Hls c80354Hls = this.LJJIII;
                if (c80354Hls != null && (nextLiveData = c80354Hls.LJIJ) != null) {
                    if (f > f2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    nextLiveData.postValue(Boolean.valueOf(z));
                }
            } else {
                z2 = false;
            }
            LIZ(z2);
        }
    }

    @Override // p003X.AbstractC81136HyU
    public final void LIZIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 24).isSupported || this.LJIIL) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkProgressBarV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2112);
        this.LIZJ = 0.5f;
        this.LJII = true;
        this.LJIIIIZZ = AnimationState.MIDDLE;
        this.LJIIIZ = "";
        this.LJJIIJ = 0.5f;
        this.LJIILJJIL = true;
        Disposable LIZIZ = QVQ.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        this.LJIILL = LIZIZ;
        this.LJJIIZ = LJIJI;
        this.LJJIIZI = LJIJJ;
        this.LJJIJ = (30.0f - this.LJJIIZI) / 2.0f;
        this.LJIJ = LJIJJLI;
        this.LJJIJIIJI = LJIL;
        this.LJJIJIIJIL = (30.0f - this.LJJIJIIJI) / 2.0f;
        this.LJJIJIL = LJJ;
        this.LJJIJL = LJJI;
        this.LJJIJLIJ = (30.0f - this.LJJIJL) / 2.0f;
        LayoutInflater.from(context).inflate(2131699882, this);
        MethodCollector.m14707o(2112);
    }

    private final void LIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 37).isSupported) {
            return;
        }
        if (z) {
            NoPaddingTextView noPaddingTextView = (NoPaddingTextView) LIZ(2131180729);
            Intrinsics.checkNotNullExpressionValue(noPaddingTextView, "");
            noPaddingTextView.setText(str);
            NoPaddingTextView noPaddingTextView2 = (NoPaddingTextView) LIZ(2131180729);
            Intrinsics.checkNotNullExpressionValue(noPaddingTextView2, "");
            noPaddingTextView2.setVisibility(0);
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            if (value == null || value.intValue() != 2 || this.LJJIFFI) {
                m15634LJ();
                this.LJJIFFI = false;
                return;
            }
            return;
        }
        NoPaddingTextView noPaddingTextView3 = (NoPaddingTextView) LIZ(2131165275);
        Intrinsics.checkNotNullExpressionValue(noPaddingTextView3, "");
        noPaddingTextView3.setText(str);
        NoPaddingTextView noPaddingTextView4 = (NoPaddingTextView) LIZ(2131165275);
        Intrinsics.checkNotNullExpressionValue(noPaddingTextView4, "");
        noPaddingTextView4.setVisibility(0);
        SettingKey<Integer> settingKey2 = LiveSettingKeys.LIVE_PK_BRAND_OPT_AUDIENCE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Integer value2 = settingKey2.getValue();
        if (value2 == null || value2.intValue() != 2 || this.LJJIFFI) {
            LIZLLL();
            this.LJJIFFI = false;
        }
    }

    public final void LIZIZ(int i, boolean z) {
        String str;
        LiveData<C8718a> liveData;
        C8718a value;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), (byte) 0}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C13491f LIZ2 = IQV.LIZ("PkDataContext");
        if (!(LIZ2 instanceof PkDataContext)) {
            LIZ2 = null;
        }
        PkDataContext pkDataContext = (PkDataContext) LIZ2;
        if (pkDataContext == null || (liveData = pkDataContext.LJIILL) == null || (value = liveData.getValue()) == null || (str = value.f27850LJ) == null) {
            str = "";
        }
        LIZIZ(i, str, false);
    }

    private final void LIZ(int i, int i2, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
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
        if (this.LJIIIIZZ == AnimationState.EMOJI) {
            return;
        }
        if (!LIZJ() && (this.LJIIIIZZ != AnimationState.ATMOSPHERE || z)) {
            LIZIZ();
        }
        this.LJI = i;
        this.LJII = true;
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar != null) {
            pKProgressBar.LIZLLL = this.LJII;
        }
    }

    private void LIZIZ(int i, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        Intrinsics.checkNotNullExpressionValue(pKProgressBar, "");
        LIZ(pKProgressBar.getLeftValue(), i, z);
        PkDataContext pkDataContext = this.f26510LJ;
        if (pkDataContext != null && pkDataContext.LJJJIL && str.length() > 0) {
            LIZ(false, str);
        } else {
            LIZ(false, String.valueOf(i));
        }
        PKProgressBar pKProgressBar2 = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar2 != null) {
            pKProgressBar2.setRightValue(i);
        }
    }

    private void LIZ(int i, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        PKProgressBar pKProgressBar = (PKProgressBar) LIZ(2131185194);
        Intrinsics.checkNotNullExpressionValue(pKProgressBar, "");
        LIZ(i, pKProgressBar.getRightValue(), z);
        PkDataContext pkDataContext = this.f26510LJ;
        if (pkDataContext != null && pkDataContext.LJJJIL && str.length() > 0) {
            LIZ(true, str);
        } else {
            LIZ(true, String.valueOf(i));
        }
        PKProgressBar pKProgressBar2 = (PKProgressBar) LIZ(2131185194);
        if (pKProgressBar2 != null) {
            pKProgressBar2.setLeftValue(i);
        }
    }

    public final int LIZ(float f, float f2, boolean z) {
        float f3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f), Float.valueOf(f2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (z) {
            f3 = 11.0f;
        } else {
            f3 = 8.5f;
        }
        if (this.LJII) {
            return (int) ((f - LK5.LIZ(f2)) + LK5.LIZ(f3));
        }
        return (int) (f - LK5.LIZ(f3));
    }

    public /* synthetic */ PkProgressBarV2(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
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
