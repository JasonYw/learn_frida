package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C4574547f;
import p003X.KSS;

/* loaded from: classes5.dex */
public final class PreviewBroadcastMirrorWidget$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewBroadcastMirrorWidget this$0;

    static {
        Covode.recordClassIndex(18449);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewBroadcastMirrorWidget$onCreate$1(PreviewBroadcastMirrorWidget previewBroadcastMirrorWidget) {
        super(1);
        this.this$0 = previewBroadcastMirrorWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            PreviewBroadcastMirrorWidget previewBroadcastMirrorWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[0], previewBroadcastMirrorWidget, PreviewBroadcastMirrorWidget.LIZ, false, 3).isSupported) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.WIRELESS_MIRROR_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    Context context = previewBroadcastMirrorWidget.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    C116971W2r.LIZJ(new KSS(context, previewBroadcastMirrorWidget));
                } else {
                    previewBroadcastMirrorWidget.LIZJ();
                }
                C4574547f.LIZ().LIZ("livesdk_cast_screen_icon_click");
            }
        }
        return Unit.INSTANCE;
    }
}
