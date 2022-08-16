package com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.AbstractC4936a;
import com.bytedance.android.live.liveinteract.videotalk.quickinteract.C4939e;
import com.bytedance.android.livesdk.chatroom.model.interact.C6156ao;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C3Q0;
import p003X.C414192aL;
import p003X.C80699HrR;
import p003X.C80959Hvd;
import p003X.H5S;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class TeamFightQuickInteractView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public final View f26452LJ;
    public final ImageView LJFF;
    public final HSImageView LJI;
    public final HSImageView LJII;
    public final TextView LJIIIIZZ;
    public final ViewSwitcher LJIIIZ;
    public final C80699HrR LJIIJ;

    static {
        Covode.recordClassIndex(30363);
    }

    public TeamFightQuickInteractView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TeamFightQuickInteractView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final View getAnimationBg() {
        return this.f26452LJ;
    }

    public final C80699HrR getAnimationHelper() {
        return this.LJIIJ;
    }

    public final HSImageView getAnimationIcon() {
        return this.LJI;
    }

    public final ImageView getIcon() {
        return this.LJFF;
    }

    public final View getStaticBg() {
        return this.LIZLLL;
    }

    public final boolean getDisableBgAnim() {
        return this.LJIIJ.LJIIL;
    }

    public final int getState() {
        return this.LJIIJ.LJIIIZ;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIJ.LIZ();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LIZIZ = "0";
        this.LJIIJ.LIZIZ();
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIIJ.LIZLLL();
    }

    public final void setDisableBgAnim(boolean z) {
        this.LJIIJ.LJIIL = z;
    }

    public final void setState(int i) {
        this.LJIIJ.LJIIIZ = i;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.TeamFightQuickInteractView$1 */
    /* loaded from: classes3.dex */
    public static final class C49471 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30364);
        }

        public C49471() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                TeamFightQuickInteractView.this.LIZJ();
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.quickinteract.interactView.TeamFightQuickInteractView$2 */
    /* loaded from: classes3.dex */
    public static final class C49482 extends Lambda implements Function1<View, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30365);
        }

        public C49482() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(view);
                TeamFightQuickInteractView.this.LIZJ();
            }
            return Unit.INSTANCE;
        }
    }

    private void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
        this.LJIIJ.LIZ(str);
    }

    public final void setAnimationBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.f26452LJ.setBackgroundResource(i);
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

    private final void setTeamAnimationBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        if (i == 2) {
            setAnimationBackground(2130854075);
        } else {
            setAnimationBackground(2130854076);
        }
    }

    private final void setTeamGiftFlashBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        if (i == 2) {
            this.LIZJ.setBackgroundResource(2130854075);
        } else {
            this.LIZJ.setBackgroundResource(2130854076);
        }
    }

    public final void LIZ(C6156ao c6156ao) {
        if (PatchProxy.proxy(new Object[]{c6156ao}, this, LIZ, false, 8).isSupported) {
            return;
        }
        LIZJ(H5S.LIZIZ.LIZ(c6156ao));
    }

    public final void setTeam(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        setTeamBackground(i);
        setTeamAnimationBackground(i);
        setTeamGiftFlashBackground(i);
    }

    public final void setTeamBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        if (i == 2) {
            setBackground(2130855303);
        } else {
            setBackground(2130855309);
        }
    }

    public final void LIZ(C4939e c4939e) {
        if (PatchProxy.proxy(new Object[]{c4939e}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4939e);
        if (c4939e.LJIIIIZZ) {
            this.LJIIJ.LIZ(c4939e);
            return;
        }
        String str = c4939e.LIZJ;
        if (str != null && str.length() != 0 && !TextUtils.equals(this.LIZIZ, c4939e.LIZJ)) {
            this.LIZIZ = c4939e.LIZJ;
            C80699HrR.LIZ(this.LJIIJ, c4939e, null, null, 6, null);
            return;
        }
        AbstractC4936a LIZ2 = AbstractC4936a.LIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(c4939e);
        }
    }

    public final void LIZIZ(C6156ao c6156ao) {
        if (PatchProxy.proxy(new Object[]{c6156ao}, this, LIZ, false, 13).isSupported) {
            return;
        }
        LIZIZ(H5S.LIZIZ.LIZ(c6156ao));
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
            if (this.LJIIJ.LJIIIZ == 0) {
                this.LJIIJ.LIZ(str, new TeamFightQuickInteractView$doUpdateNormalScore$1(this));
                return;
            }
            return;
        }
        C80699HrR.LIZ(this.LJIIJ, str, (Function1) null, 2, (Object) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightQuickInteractView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2023);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699971, (ViewGroup) this, true);
        View findViewById = findViewById(2131175409);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZJ = findViewById;
        View findViewById2 = findViewById(2131178020);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZLLL = findViewById2;
        View findViewById3 = findViewById(2131178002);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.f26452LJ = findViewById3;
        View findViewById4 = findViewById(2131178012);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJFF = (ImageView) findViewById4;
        View findViewById5 = findViewById(2131178003);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        this.LJI = (HSImageView) findViewById5;
        View findViewById6 = findViewById(2131178005);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        this.LJII = (HSImageView) findViewById6;
        View findViewById7 = findViewById(2131178007);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        this.LJIIIIZZ = (TextView) findViewById7;
        View findViewById8 = findViewById(2131178025);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        this.LJIIIZ = (ViewSwitcher) findViewById8;
        this.LJIIJ = new C80699HrR(this, new C80959Hvd(this));
        this.LIZIZ = "0";
        this.LJII.setOnClickListener(C414192aL.LIZ(0L, new C49471(), 1, null));
        this.LJIIIIZZ.setOnClickListener(C414192aL.LIZ(0L, new C49482(), 1, null));
        setDisableBgAnim(false);
        this.LJFF.setVisibility(8);
        this.LIZLLL.setAlpha(1.0f);
        this.LJIIJ.LJIILIIL = 1.0f;
        C3Q0.LIZLLL(this.LJIIIZ, LK5.LIZ(4.0f));
        C3Q0.LJFF(this.LJIIIZ, LK5.LIZ(4.0f));
        MethodCollector.m14707o(2023);
    }

    public /* synthetic */ TeamFightQuickInteractView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
