package com.bytedance.android.live.liveinteract.interact.audience.dialog;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6858bo;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C414642b4;
import p003X.C78536Gxe;
import p003X.DialogC77756Gl4;

/* loaded from: classes3.dex */
public final class InteractAudienceAnchorKickOutDialog$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77756Gl4 this$0;

    static {
        Covode.recordClassIndex(27111);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceAnchorKickOutDialog$onCreate$2(DialogC77756Gl4 dialogC77756Gl4) {
        super(1);
        this.this$0 = dialogC77756Gl4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C116971W2r.LIZ(this.this$0);
            SettingKey<C6858bo> settingKey = LiveSettingKeys.LINK_PAYMENT_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String str = settingKey.getValue().LIZLLL;
            if (!TextUtils.isEmpty(str)) {
                ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(this.this$0.getContext(), C414642b4.LIZIZ(str, MapsKt__MapsKt.mapOf(TuplesKt.m137to("to_user_id", String.valueOf(this.this$0.LIZJ.getId())), TuplesKt.m137to("live_type", "video_live"))));
            }
            C78536Gxe.LIZJ.LIZIZ(this.this$0.LIZJ.getId());
        }
        return Unit.INSTANCE;
    }
}
