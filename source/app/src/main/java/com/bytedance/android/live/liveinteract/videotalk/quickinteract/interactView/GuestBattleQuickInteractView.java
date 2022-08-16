package com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView;

import android.content.Context;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.config.C6840aw;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C414192aL;
import p003X.C80302Hl2;
import p003X.C80312HlC;
import p003X.C80699HrR;
import p003X.C80884HuQ;
import p003X.C80957Hvb;
import p003X.H5S;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class GuestBattleQuickInteractView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public int LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public final View f26450LJ;
    public final HSImageView LJFF;
    public final HSImageView LJI;
    public final HSImageView LJII;
    public final TextView LJIIIIZZ;
    public final C80699HrR LJIIIZ;
    public C80312HlC LJIIJ;

    static {
        Covode.recordClassIndex(30347);
    }

    public GuestBattleQuickInteractView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GuestBattleQuickInteractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View getAnimationBg() {
        return this.f26450LJ;
    }

    public final C80699HrR getAnimationHelper() {
        return this.LJIIIZ;
    }

    public final HSImageView getAnimationIcon() {
        return this.LJI;
    }

    public final HSImageView getIcon() {
        return this.LJFF;
    }

    public final View getStaticBg() {
        return this.LIZLLL;
    }

    public final boolean LJII() {
        if (this.LIZJ == 1) {
            return true;
        }
        return false;
    }

    public final boolean getDisableBgAnim() {
        return this.LJIIIZ.LJIIL;
    }

    public final int getState() {
        return this.LJIIIZ.LJIIIZ;
    }

    public final boolean LJIIIIZZ() {
        if (this.LIZJ == 2) {
            return true;
        }
        return false;
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJIIIZ.LIZLLL();
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        String LIZLLL = C6840aw.LIZLLL();
        Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
        LIZLLL(LIZLLL);
    }

    /* renamed from: LJ */
    public final void m15682LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJFF.setVisibility(8);
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        setVisibility(0);
        setAlpha(1.0f);
        this.LJFF.setVisibility(0);
    }

    private final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.LJFF.getLayoutParams();
        if ((C80302Hl2.LIZIZ() || C80302Hl2.LIZLLL()) && this.LIZJ != 0) {
            LJIIJ();
        } else {
            LJIIJJI();
        }
        this.LJFF.setLayoutParams(layoutParams);
    }

    private final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        this.LJFF.setScaleX(1.83f);
        this.LJFF.setScaleY(1.83f);
        C3Q0.LIZLLL(this.LJFF, -LK5.LIZ(5.0f));
        C3Q0.LJFF(this.LJFF, LK5.LIZ(5.0f));
        C3Q0.LIZLLL(this, LK5.LIZ(5.0f));
    }

    private final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        this.LJFF.setScaleX(1.0f);
        this.LJFF.setScaleY(1.0f);
        C3Q0.LIZLLL(this.LJFF, LK5.LIZ(0.0f));
        C3Q0.LJFF(this.LJFF, LK5.LIZ(0.0f));
        C3Q0.LIZLLL(this, LK5.LIZ(0.0f));
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIIZ.LIZ();
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        this.LJFF.setImageResource(2130856007);
        this.LIZLLL.setBackgroundResource(2130855996);
        this.LJI.setVisibility(8);
        this.LJI.setController(null);
        this.LIZJ = 0;
        LJIIJJI();
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        this.LIZIZ = "0";
        this.LJIIIZ.LIZIZ();
        setVisibility(8);
        this.LJFF.setVisibility(0);
        this.LJFF.setImageResource(2130856007);
        this.LIZLLL.setBackgroundResource(2130855996);
        this.LIZJ = 0;
        LJIIJJI();
    }

    public final void setDisableBgAnim(boolean z) {
        this.LJIIIZ.LJIIL = z;
    }

    public final void setState(int i) {
        this.LJIIIZ.LJIIIZ = i;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.GuestBattleQuickInteractView$1 */
    /* loaded from: classes3.dex */
    public static final class C49401 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30348);
        }

        public C49401() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                GuestBattleQuickInteractView.this.LIZIZ();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.GuestBattleQuickInteractView$2 */
    /* loaded from: classes3.dex */
    public static final class C49412 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30349);
        }

        public C49412() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                GuestBattleQuickInteractView.this.LIZIZ();
            }
            return Unit.INSTANCE;
        }
    }

    private void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LJIIIZ.LIZ(str);
    }

    public final void setBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZLLL.setBackgroundResource(i);
    }

    private void LIZIZ(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported && str != null && str.length() != 0 && !TextUtils.equals(this.LIZIZ, str)) {
            LIZ(str);
        }
    }

    private final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        this.LJI.setVisibility(0);
        this.LJI.setController(Fresco.newDraweeControllerBuilder().mo27963setUri(str).setAutoPlayAnimations(true).setControllerListener(new C80884HuQ(this)).mo27965build());
    }

    private final int LIZ(C80699HrR c80699HrR) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c80699HrR}, this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        View currentView = c80699HrR.LJFF.LIZIZ.getCurrentView();
        if (!(currentView instanceof TextView)) {
            currentView = null;
        }
        TextView textView = (TextView) currentView;
        if (textView == null) {
            View currentView2 = c80699HrR.LJFF.LIZIZ.getCurrentView();
            Intrinsics.checkNotNullExpressionValue(currentView2, "");
            return currentView2.getWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        CharSequence text = textView.getText();
        textView.setText(this.LIZIZ);
        textView.measure(makeMeasureSpec, makeMeasureSpec2);
        int measuredWidth = textView.getMeasuredWidth();
        textView.setText(text);
        return measuredWidth;
    }

    public final void LIZIZ(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 11).isSupported) {
            return;
        }
        LIZIZ(H5S.LIZIZ.LIZ(c6167a));
    }

    public final void LIZLLL(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6167a);
        if (c6167a.LJIIJJI) {
            String LIZJ = C6840aw.LIZJ();
            Intrinsics.checkNotNullExpressionValue(LIZJ, "");
            LIZLLL(LIZJ);
        } else if (c6167a.LJIILJJIL) {
            String LIZLLL = C6840aw.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            LIZLLL(LIZLLL);
        }
    }

    public final PointF LIZ(int i) {
        int LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (PointF) proxy.result;
        }
        int[] iArr = new int[2];
        this.LJFF.getLocationOnScreen(iArr);
        if ((i == 5 || i == 12) && (LIZ2 = LIZ(this.LJIIIZ)) > this.LJIIIZ.LJFF.LIZIZ.getWidth()) {
            if (i != 5) {
                if (i == 12) {
                    iArr[0] = iArr[0] - (LIZ2 - this.LJIIIZ.LJFF.LIZIZ.getWidth());
                }
            } else {
                iArr[0] = iArr[0] - ((LIZ2 - this.LJIIIZ.LJFF.LIZIZ.getWidth()) / 2);
            }
        }
        return new PointF(iArr[0], iArr[1]);
    }

    public final void LIZJ(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(c6167a);
        if (c6167a.LJIIJJI) {
            if (!C80302Hl2.LIZIZ() && !C80302Hl2.LIZLLL()) {
                LIZ(this.LJFF, C80312HlC.LIZ(this.LJIIJ, 0, 1, null));
            } else {
                LIZ(this.LJFF, this.LJIIJ.LIZ(c6167a.LJIIL));
            }
            if (c6167a.LJIIL == 0 && (C80302Hl2.LIZIZ() || C80302Hl2.LIZLLL())) {
                this.LIZLLL.setBackgroundResource(2130855995);
            } else {
                this.LIZLLL.setBackgroundResource(2130855994);
            }
            this.LIZJ = 1;
        }
        if (c6167a.LJIILJJIL) {
            LIZ(this.LJFF, this.LJIIJ.LIZIZ());
            this.LIZLLL.setBackgroundResource(2130855995);
            this.LIZJ = 2;
        }
        if (!c6167a.LJIIJJI && !c6167a.LJIILJJIL) {
            this.LJFF.setImageResource(2130856007);
            this.LIZLLL.setBackgroundResource(2130855996);
            this.LIZJ = 0;
        }
        LJIIIZ();
    }

    public final void LIZ(C4939e c4939e) {
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        if (c4939e.LJIIIIZZ) {
            this.LJIIIZ.LIZ(c4939e);
            return;
        }
        String str = c4939e.LIZJ;
        if (str != null && str.length() != 0 && !TextUtils.equals(this.LIZIZ, c4939e.LIZJ)) {
            this.LIZIZ = c4939e.LIZJ;
            this.LJIIIZ.LIZ(c4939e, new GuestBattleQuickInteractView$consumeInteractTask$1(this), new GuestBattleQuickInteractView$consumeInteractTask$2(this));
            return;
        }
        AbstractC4936a LIZ2 = AbstractC4936a.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(c4939e);
        }
    }

    public final void LIZ(C6166j.C6167a c6167a) {
        if (PatchProxy.proxy(new Object[]{c6167a}, this, LIZ, false, 7).isSupported) {
            return;
        }
        LIZJ(H5S.LIZIZ.LIZ(c6167a));
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ = str;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ENABLE_LOOP_GIFT_SCORE_ANIMATION;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            if (this.LJIIIZ.LJIIIZ == 0) {
                this.LJIIIZ.LIZ(str, new GuestBattleQuickInteractView$doUpdateNormalScore$1(this));
                return;
            }
            return;
        }
        C80699HrR.LIZ(this.LJIIIZ, str, (Function1) null, 2, (Object) null);
    }

    private final void LIZ(HSImageView hSImageView, Uri uri) {
        if (PatchProxy.proxy(new Object[]{hSImageView, uri}, this, LIZ, false, 22).isSupported) {
            return;
        }
        LK1.LIZJ(hSImageView);
        hSImageView.setImageURI(uri);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleQuickInteractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2021);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699971, (ViewGroup) this, true);
        setClipChildren(false);
        View findViewById = findViewById(2131178020);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZLLL = findViewById;
        View findViewById2 = findViewById(2131178002);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.f26450LJ = findViewById2;
        View findViewById3 = findViewById(2131178012);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJFF = (HSImageView) findViewById3;
        View findViewById4 = findViewById(2131178003);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJI = (HSImageView) findViewById4;
        View findViewById5 = findViewById(2131178005);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJII = (HSImageView) findViewById5;
        View findViewById6 = findViewById(2131178007);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJIIIIZZ = (TextView) findViewById6;
        this.LJIIIZ = new C80699HrR(this, new C80957Hvb(this));
        this.LJIIJ = C80312HlC.LIZIZ;
        this.LIZIZ = "0";
        this.LIZLLL.setBackgroundResource(2130855996);
        this.LJII.setOnClickListener(C414192aL.LIZ(0L, new C49401(), 1, null));
        this.LJIIIIZZ.setOnClickListener(C414192aL.LIZ(0L, new C49412(), 1, null));
        MethodCollector.m14707o(2021);
    }

    public /* synthetic */ GuestBattleQuickInteractView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
