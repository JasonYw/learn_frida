package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.voicechat.p392b.AbstractC5000c;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C79242HLo;
import p003X.C80363Hm1;
import p003X.C81294I2m;
import p003X.LK1;
import p003X.RunnableC63251Axh;

/* loaded from: classes3.dex */
public final class PaidLinkCountDownView extends AppCompatTextView implements AbstractC5000c {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;
    public final Observer<VoiceLiveTheme> LIZJ;

    /* renamed from: LJ */
    public int f26467LJ;

    static {
        Covode.recordClassIndex(30755);
    }

    public PaidLinkCountDownView(Context context) {
        this(context, null, 0, 6, null);
    }

    public PaidLinkCountDownView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.f26467LJ = 0;
        RunnableC63251Axh.LIZIZ.LIZIZ(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (C79242HLo.LJJI() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (this.LIZIZ instanceof AppCompatActivity)) {
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
                z = LIZIZ.booleanValue();
            }
            if (z) {
                ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ((LifecycleOwner) this.LIZIZ, this.LIZJ, 2);
                return;
            }
            IService service = ServiceManager.getService(ILiveSDKService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            ((ILiveSDKService) service).getAudienceThemeManager().LIZ((LifecycleOwner) this.LIZIZ, this.LIZJ, 2);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (C79242HLo.LJJI()) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_POSITION_NAME_LEAK_FIX;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (this.LIZIZ instanceof AppCompatActivity)) {
                C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null && LIZIZ.booleanValue()) {
                    ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ(this.LIZJ, 2);
                    return;
                }
                IService service = ServiceManager.getService(ILiveSDKService.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                ((ILiveSDKService) service).getAudienceThemeManager().LIZ(this.LIZJ, 2);
            }
        }
    }

    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.f26467LJ = i;
        RunnableC63251Axh.LIZIZ.LIZ(this);
    }

    public final void setOriginTime(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        setText(C81294I2m.LIZLLL(i));
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.p392b.AbstractC5000c
    public final void LIZ(int i) {
        String str;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.f26467LJ -= i;
        int i2 = this.f26467LJ;
        if (i2 > 0) {
            str = C81294I2m.LIZLLL(i2);
        } else {
            str = "--:--";
        }
        setText(str);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(CastProtectorUtils.parseColor(str));
        gradientDrawable.setCornerRadius(LK1.LIZLLL(2));
        setBackground(gradientDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaidLinkCountDownView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZIZ = context;
        this.LIZJ = new C80363Hm1(this);
        LIZ("#9F82D9");
    }

    public /* synthetic */ PaidLinkCountDownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
