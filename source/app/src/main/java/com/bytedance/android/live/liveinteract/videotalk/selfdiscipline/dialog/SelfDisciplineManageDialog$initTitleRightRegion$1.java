package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6987fp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C448113nx;
import p003X.DialogC448093nv;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$initTitleRightRegion$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30407);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$initTitleRightRegion$1(DialogC448093nv dialogC448093nv) {
        super(1);
        this.this$0 = dialogC448093nv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C448113nx c448113nx = C448113nx.LIZIZ;
            Context context = this.this$0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            if (!PatchProxy.proxy(new Object[]{context}, c448113nx, C448113nx.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(context);
                SettingKey<C6987fp> settingKey = LiveConfigSettingKeys.LIVE_SELF_DISCIPLINE_LYNX;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                String str = settingKey.getValue().LIZ;
                if (str == null) {
                    str = "";
                }
                ((ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)).handle(context, new C9303cy(str).LIZ());
            }
        }
        return Unit.INSTANCE;
    }
}
