package com.bytedance.android.live.broadcast.preview.p277ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.LK1;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.common.StartLiveVisibilityItemView */
/* loaded from: classes22.dex */
public final class StartLiveVisibilityItemView extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public final Boolean LIZIZ;
    public Function1<? super Integer, Unit> LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public HashMap f25920LJ;

    static {
        Covode.recordClassIndex(17431);
    }

    public StartLiveVisibilityItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StartLiveVisibilityItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.f25920LJ == null) {
            this.f25920LJ = new HashMap();
        }
        View view = (View) this.f25920LJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f25920LJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getMStartLiveVisibility() {
        return this.LIZLLL;
    }

    public final Function1<Integer, Unit> getOnEditIconClickListener() {
        return this.LIZJ;
    }

    public final void setMStartLiveVisibility(int i) {
        this.LIZLLL = i;
    }

    public final void setOnEditIconClickListener(Function1<? super Integer, Unit> function1) {
        this.LIZJ = function1;
    }

    public final void setTitleSuffix(int i) {
        int i2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (i != 2) {
            if (i != 5) {
                i2 = 2131587888;
            } else {
                i2 = 2131587897;
            }
        } else {
            i2 = 2131587894;
        }
        TextView textView = (TextView) LIZ(2131180141);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(C0002O.m25086C(": ", LK5.LIZ(i2)));
    }

    public final void setSelect(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (z) {
            HSImageView hSImageView = (HSImageView) LIZ(2131179533);
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            LK1.LIZJ(hSImageView);
            HSImageView hSImageView2 = (HSImageView) LIZ(2131179532);
            Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
            LK1.LIZ(hSImageView2);
            int i = this.LIZLLL;
            if (i == 3 || i == 4) {
                TextView textView = (TextView) LIZ(2131180141);
                Intrinsics.checkNotNullExpressionValue(textView, "");
                LK1.LIZJ(textView);
                FrameLayout frameLayout = (FrameLayout) LIZ(2131179534);
                Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                LK1.LIZJ(frameLayout);
            }
            if (this.LIZLLL == -2) {
                HSImageView hSImageView3 = (HSImageView) LIZ(2131179533);
                Intrinsics.checkNotNullExpressionValue(hSImageView3, "");
                LK1.LIZ(hSImageView3);
                HSImageView hSImageView4 = (HSImageView) LIZ(2131179532);
                Intrinsics.checkNotNullExpressionValue(hSImageView4, "");
                LK1.LIZJ(hSImageView4);
                TextView textView2 = (TextView) LIZ(2131180141);
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                LK1.LIZJ(textView2);
                FrameLayout frameLayout2 = (FrameLayout) LIZ(2131179534);
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                LK1.LIZ((View) frameLayout2);
                return;
            }
            return;
        }
        HSImageView hSImageView5 = (HSImageView) LIZ(2131179533);
        Intrinsics.checkNotNullExpressionValue(hSImageView5, "");
        LK1.LIZ(hSImageView5);
        int i2 = this.LIZLLL;
        if (i2 == -2 || i2 == 3 || i2 == 4) {
            TextView textView3 = (TextView) LIZ(2131180141);
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            LK1.LIZ(textView3);
            FrameLayout frameLayout3 = (FrameLayout) LIZ(2131179534);
            Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
            LK1.LIZ((View) frameLayout3);
            HSImageView hSImageView6 = (HSImageView) LIZ(2131179532);
            Intrinsics.checkNotNullExpressionValue(hSImageView6, "");
            LK1.LIZJ(hSImageView6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZLLL = -1;
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.ANCHOR_COMMENT_LIST_NEW_STYLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        this.LIZIZ = settingKey.getValue();
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699911, (ViewGroup) this, true);
        FrameLayout frameLayout = (FrameLayout) LIZ(2131179534);
        if (frameLayout != null) {
            frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.preview.ui.common.StartLiveVisibilityItemView.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(17432);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Function1<Integer, Unit> onEditIconClickListener;
                    if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (onEditIconClickListener = StartLiveVisibilityItemView.this.getOnEditIconClickListener()) != null) {
                        onEditIconClickListener.invoke(Integer.valueOf(StartLiveVisibilityItemView.this.getMStartLiveVisibility()));
                    }
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cb, code lost:
        if (r11 != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r10, boolean r11, java.lang.String r12, java.lang.String r13) {
        /*
            r9 = this;
            r7 = 4
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1 = 0
            r2[r1] = r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r11)
            r8 = 1
            r2[r8] = r0
            r6 = 2
            r2[r6] = r12
            r5 = 3
            r2[r5] = r13
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.broadcast.preview.p277ui.common.StartLiveVisibilityItemView.LIZ
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r9, r0, r1, r8)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L22
            return
        L22:
            r9.LIZLLL = r10
            r1 = -2
            r4 = 2130857967(0x7f024fef, float:1.7321468E38)
            r0 = 2130857970(0x7f024ff2, float:1.7321474E38)
            r0 = 2130857969(0x7f024ff1, float:1.7321472E38)
            r3 = 2131180141(0x7f073a6d, float:1.7974914E38)
            java.lang.String r2 = ""
            if (r10 == r1) goto Ld2
            if (r10 == 0) goto Lcd
            if (r10 == r8) goto Lcb
            r0 = 2130857968(0x7f024ff0, float:1.732147E38)
            if (r10 == r6) goto Lae
            if (r10 == r5) goto L90
            if (r10 == r7) goto L80
            r0 = 5
            if (r10 != r0) goto Lcd
            r4 = 2130857972(0x7f024ff4, float:1.7321478E38)
        L48:
            kotlin.Pair r5 = p003X.C475704rM.LIZ(r10, r11, r12, r13)
            r0 = 2131180140(0x7f073a6c, float:1.7974912E38)
            android.view.View r1 = r9.LIZ(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r0 = r5.getFirst()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.view.View r1 = r9.LIZ(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Object r0 = r5.getSecond()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            r0 = 2131179535(0x7f07380f, float:1.7973685E38)
            android.view.View r0 = r9.LIZ(r0)
            com.facebook.drawee.view.SimpleDraweeView r0 = (com.facebook.drawee.view.SimpleDraweeView) r0
            r0.setActualImageResource(r4)
            return
        L80:
            r4 = 2130857971(0x7f024ff3, float:1.7321476E38)
            android.view.View r0 = r9.LIZ(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            p003X.LK1.LIZ(r0)
            goto L48
        L90:
            java.lang.Boolean r1 = r9.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto Laa
            r4 = 2130857968(0x7f024ff0, float:1.732147E38)
        L9d:
            android.view.View r0 = r9.LIZ(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            p003X.LK1.LIZ(r0)
            goto L48
        Laa:
            r4 = 2130857970(0x7f024ff2, float:1.7321474E38)
            goto L9d
        Lae:
            java.lang.Boolean r1 = r9.LIZIZ
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto Lbb
            r4 = 2130857968(0x7f024ff0, float:1.732147E38)
        Lbb:
            android.view.View r1 = r9.LIZ(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            r0 = 999(0x3e7, float:1.4E-42)
            r1.setMaxWidth(r0)
            goto L48
        Lcb:
            if (r11 == 0) goto L48
        Lcd:
            r4 = 2130857969(0x7f024ff1, float:1.7321472E38)
            goto L48
        Ld2:
            android.view.View r0 = r9.LIZ(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            p003X.LK1.LIZ(r0)
            r4 = 2130857970(0x7f024ff2, float:1.7321474E38)
            goto L48
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.preview.p277ui.common.StartLiveVisibilityItemView.LIZ(int, boolean, java.lang.String, java.lang.String):void");
    }

    public /* synthetic */ StartLiveVisibilityItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
