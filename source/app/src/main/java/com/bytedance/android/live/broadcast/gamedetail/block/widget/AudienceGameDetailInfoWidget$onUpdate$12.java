package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.view.GamePromoteCommonRatingBar;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C479894y7;
import p003X.LHU;
import p003X.LK1;
import p003X.LK5;
import p003X.View$OnClickListenerC88986L4i;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget$onUpdate$12 extends Lambda implements Function1<C2988e, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3084e $props;
    public final /* synthetic */ AudienceGameDetailInfoWidget this$0;

    static {
        Covode.recordClassIndex(16330);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget$onUpdate$12(AudienceGameDetailInfoWidget audienceGameDetailInfoWidget, C3084e c3084e) {
        super(1);
        this.this$0 = audienceGameDetailInfoWidget;
        this.$props = c3084e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2988e c2988e) {
        String valueOf;
        String LIZ;
        C2988e c2988e2 = c2988e;
        if (!PatchProxy.proxy(new Object[]{c2988e2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2988e2);
            if (this.$props.LJII) {
                AudienceGameDetailInfoWidget audienceGameDetailInfoWidget = this.this$0;
                if (!PatchProxy.proxy(new Object[]{c2988e2}, audienceGameDetailInfoWidget, AudienceGameDetailInfoWidget.LIZ, false, 5).isSupported) {
                    SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_COMMENT_ENABLED;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    if (!settingKey.getValue().booleanValue()) {
                        View findViewById = audienceGameDetailInfoWidget.contentView.findViewById(2131170264);
                        Intrinsics.checkNotNullExpressionValue(findViewById, "");
                        LK1.LIZ(findViewById);
                    } else if (c2988e2 != null && c2988e2.LIZLLL != 1) {
                        audienceGameDetailInfoWidget.contentView.findViewById(2131170264).setOnClickListener(View$OnClickListenerC88986L4i.LIZIZ);
                        TextView textView = (TextView) audienceGameDetailInfoWidget.contentView.findViewById(2131195230);
                        textView.setTypeface(C479894y7.LIZ(textView.getContext()));
                        if (c2988e2.f25810LJ == 1) {
                            valueOf = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
                        } else {
                            valueOf = String.valueOf(LHU.LIZIZ.LIZ(c2988e2.LIZ, 1));
                        }
                        textView.setText(valueOf);
                        GamePromoteCommonRatingBar gamePromoteCommonRatingBar = (GamePromoteCommonRatingBar) audienceGameDetailInfoWidget.contentView.findViewById(2131187139);
                        if (c2988e2.f25810LJ == 1) {
                            gamePromoteCommonRatingBar.setProgress(0);
                        } else {
                            gamePromoteCommonRatingBar.setProgress((int) (c2988e2.LIZ * 10.0d));
                        }
                        TextView textView2 = (TextView) audienceGameDetailInfoWidget.contentView.findViewById(2131193760);
                        if (c2988e2.f25810LJ == 1) {
                            LIZ = LK5.LIZ(2131583632);
                        } else {
                            LIZ = LK5.LIZ(2131583530, LHU.LIZIZ.LIZ(Long.valueOf(c2988e2.LIZIZ)));
                        }
                        textView2.setText(LIZ);
                    } else {
                        View findViewById2 = audienceGameDetailInfoWidget.contentView.findViewById(2131170264);
                        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                        LK1.LIZ(findViewById2);
                    }
                }
            } else {
                View findViewById3 = this.this$0.contentView.findViewById(2131170264);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "");
                LK1.LIZ(findViewById3);
            }
        }
        return Unit.INSTANCE;
    }
}
