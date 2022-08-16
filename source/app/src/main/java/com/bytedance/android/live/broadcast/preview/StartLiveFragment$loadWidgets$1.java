package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.model.StartLiveStyle;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KJV;
import p003X.KK6;

/* loaded from: classes5.dex */
public final class StartLiveFragment$loadWidgets$1 extends Lambda implements Function1<StartLiveStyle, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17117);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$loadWidgets$1(KJV kjv) {
        super(1);
        this.this$0 = kjv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(StartLiveStyle startLiveStyle) {
        LIZ(startLiveStyle);
        return Unit.INSTANCE;
    }

    public final void LIZ(StartLiveStyle startLiveStyle) {
        if (PatchProxy.proxy(new Object[]{startLiveStyle}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(startLiveStyle);
        KJV.LIZ(this.this$0).load(2131187871, this.this$0.LJI());
        KJV.LIZ(this.this$0).load(2131167875, this.this$0.m23491LJ());
        KJV.LIZ(this.this$0).load(2131190581, this.this$0.LJFF());
        if (this.this$0.LJJIL()) {
            KJV.LIZ(this.this$0).load(2131166111, this.this$0.LJIIIIZZ());
        } else {
            KJV.LIZ(this.this$0).load(2131166111, this.this$0.LJII());
        }
        KJV.LIZ(this.this$0).load(2131186075, this.this$0.LJIIJ());
        this.this$0.LJIJJ().LIZ(this.this$0);
        KJV.LIZ(this.this$0).load(2131186037, this.this$0.LJIJJ());
        KJV.LIZ(this.this$0).load(2131186039, this.this$0.LJIJJLI());
        KJV.LIZ(this.this$0).load(2131168413, this.this$0.LJIJ());
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_PREVIEW_STAR_TASK_ENTER_POINT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            KJV.LIZ(this.this$0).load(2131168425, this.this$0.LJIJI());
        }
        KJV.LIZ(this.this$0).load(2131175933, this.this$0.LJIIIZ());
        if (!this.this$0.LJIILJJIL) {
            KJV kjv = this.this$0;
            kjv.LJIILJJIL = true;
            KJV.LIZ(kjv).load(2131183134, this.this$0.LJIL());
        }
        KJV.LIZ(this.this$0).load(2131175937, this.this$0.LJJI());
        KJV.LIZ(this.this$0).load(2131168412, this.this$0.LIZLLL());
        if (KK6.LIZ()) {
            KJV.LIZ(this.this$0).load(2131192430, this.this$0.LJIILJJIL());
        }
        KJV.LIZ(this.this$0).load(2131186038, this.this$0.LJIIJJI());
        if (startLiveStyle == StartLiveStyle.CLASSICAL) {
            KJV.LIZ(this.this$0).load(2131165883, this.this$0.LJIIZILJ());
            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.ENABLE_LOCAL_LIFE_INDEPENDENT_MODULE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (Intrinsics.areEqual(settingKey2.getValue(), Boolean.TRUE)) {
                KJV.LIZ(this.this$0).load(2131176325, this.this$0.LJIIL());
            }
        }
        KJV.LIZ(this.this$0).load(2131184815, this.this$0.LJJIFFI());
        KJV.LIZ(this.this$0).load(2131181158, this.this$0.LJJII());
    }
}
