package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6833ap;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C88950L2y;

/* loaded from: classes5.dex */
public final class PreviewGamePromoteWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewGamePromoteWidget this$0;

    static {
        Covode.recordClassIndex(18517);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewGamePromoteWidget$onCreate$1(PreviewGamePromoteWidget previewGamePromoteWidget) {
        super(1);
        this.this$0 = previewGamePromoteWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        Long l;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            PreviewGamePromoteWidget previewGamePromoteWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewGamePromoteWidget, PreviewGamePromoteWidget.LIZ, false, 9).isSupported) {
                if (Intrinsics.areEqual(previewGamePromoteWidget.LIZIZ().LIZIZ().LIZ(), Boolean.TRUE) && Intrinsics.areEqual(previewGamePromoteWidget.LIZIZ().LIZJ().LIZ(), Boolean.FALSE) && previewGamePromoteWidget.LIZIZ().LIZJ) {
                    if (!PatchProxy.proxy(new Object[0], previewGamePromoteWidget, PreviewGamePromoteWidget.LIZ, false, 15).isSupported) {
                        IUser LIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        String valueOf = String.valueOf(LIZ.getId());
                        String str = null;
                        if (previewGamePromoteWidget.LJIIJJI().LIZ().LIZ() == LiveMode.SCREEN_RECORD && (l = previewGamePromoteWidget.LIZJ().LJIILL().LIZ().categoryId) != null) {
                            str = String.valueOf(l.longValue());
                        }
                        C88950L2y c88950L2y = new C88950L2y(false, previewGamePromoteWidget.m15870LJ(), valueOf, "live_start", valueOf, null, null, null, str, null, 704);
                        SettingKey<C6833ap> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_RES_CONFIG;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(previewGamePromoteWidget.context, settingKey.getValue().m15458LJ(c88950L2y));
                    }
                } else {
                    previewGamePromoteWidget.LIZLLL();
                }
            }
            this.this$0.LIZ("livesdk_game_promote_anchor_promote_icon_click");
        }
        return Unit.INSTANCE;
    }
}
