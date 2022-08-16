package com.bytedance.android.live.liveinteract.view;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.plantform.model.MicPosTagInfo;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C77918Gng;
import p003X.C79242HLo;
import p003X.C80364Hm2;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class PositionNameTv extends AppCompatTextView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final boolean LIZJ;

    /* renamed from: LJ */
    public final Context f26468LJ;
    public final Observer<VoiceLiveTheme> LJFF;

    static {
        Covode.recordClassIndex(30773);
    }

    public PositionNameTv(Context context) {
        this(context, null, 0, 6, null);
    }

    public PositionNameTv(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (C79242HLo.LJJI()) {
            LIZ();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        if (C79242HLo.LJJI()) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_POSITION_NAME_LEAK_FIX;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                LIZIZ();
            }
        }
    }

    public final void LIZ() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        boolean z = false;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && (this.f26468LJ instanceof AppCompatActivity)) {
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
                z = LIZIZ.booleanValue();
            }
            if (z) {
                ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ((LifecycleOwner) this.f26468LJ, this.LJFF, 2);
                return;
            }
            IService service = ServiceManager.getService(ILiveSDKService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            ((ILiveSDKService) service).getAudienceThemeManager().LIZ((LifecycleOwner) this.f26468LJ, this.LJFF, 2);
        }
    }

    public final void LIZIZ() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (this.f26468LJ instanceof AppCompatActivity)) {
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null && LIZIZ.booleanValue()) {
                ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).voiceLiveThemeManager().LIZ(this.LJFF, 2);
                return;
            }
            IService service = ServiceManager.getService(ILiveSDKService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            ((ILiveSDKService) service).getAudienceThemeManager().LIZ(this.LJFF, 2);
        }
    }

    public final void setTeamFightMode(boolean z) {
        this.LIZIZ = z;
    }

    private final boolean LIZ(LinkPlayerInfo linkPlayerInfo) {
        MicPosTagInfo micPosTagInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{linkPlayerInfo}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (linkPlayerInfo != null && (micPosTagInfo = linkPlayerInfo.LJJIJIIJIL) != null && micPosTagInfo.getTagType() > 0) {
            return true;
        }
        return false;
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

    public final void LIZ(LinkmicPositionItem linkmicPositionItem, boolean z) {
        if (PatchProxy.proxy(new Object[]{linkmicPositionItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if (C77918Gng.LIZ() && linkmicPositionItem != null && !this.LIZIZ) {
            if (z && linkmicPositionItem.f26349LJ == 1) {
                setText(LK5.LIZ(2131584630));
                LK1.LIZJ(this);
                return;
            } else if (!TextUtils.isEmpty(linkmicPositionItem.LIZLLL)) {
                setText(linkmicPositionItem.LIZLLL);
                LK1.LIZJ(this);
                return;
            } else {
                LK1.LIZ(this);
                return;
            }
        }
        LK1.LIZ(this);
    }

    public final void LIZ(LinkPlayerInfo linkPlayerInfo, boolean z) {
        if (PatchProxy.proxy(new Object[]{linkPlayerInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZJ && linkPlayerInfo != null && !this.LIZIZ && !LIZ(linkPlayerInfo)) {
            if (z && linkPlayerInfo.LJJJJJL == 1) {
                setText(LK5.LIZ(2131584630));
                LK1.LIZJ(this);
                return;
            } else if (!TextUtils.isEmpty(linkPlayerInfo.LJJJJJ)) {
                setText(linkPlayerInfo.LJJJJJ);
                LK1.LIZJ(this);
                return;
            } else {
                LK1.LIZ(this);
                return;
            }
        }
        LK1.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PositionNameTv(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = C77918Gng.LIZ();
        this.f26468LJ = context;
        this.LJFF = new C80364Hm2(this);
        LIZ("#9F82D9");
    }

    public /* synthetic */ PositionNameTv(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
