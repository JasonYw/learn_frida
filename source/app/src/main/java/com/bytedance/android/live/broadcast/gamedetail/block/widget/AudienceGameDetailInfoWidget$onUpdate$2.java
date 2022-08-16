package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LHU;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget$onUpdate$2 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AudienceGameDetailInfoWidget this$0;

    static {
        Covode.recordClassIndex(16331);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget$onUpdate$2(AudienceGameDetailInfoWidget audienceGameDetailInfoWidget) {
        super(1);
        this.this$0 = audienceGameDetailInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            SettingKey<Integer> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_DETAIL_STYLE_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Integer value = settingKey.getValue();
            if (value != null && (value.intValue() == 1 || value.intValue() == 2)) {
                TextView textView = this.this$0.LJII;
                if (textView != null) {
                    textView.setVisibility(8);
                }
            } else if (longValue > 10000) {
                TextView textView2 = this.this$0.LJII;
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                TextView textView3 = this.this$0.LJII;
                if (textView3 != null) {
                    String LIZ = LK5.LIZ(2131583395);
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    String format = String.format(LIZ, Arrays.copyOf(new Object[]{LHU.LIZIZ.LIZ(Long.valueOf(longValue))}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    textView3.setText(format);
                }
            } else {
                TextView textView4 = this.this$0.LJII;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
