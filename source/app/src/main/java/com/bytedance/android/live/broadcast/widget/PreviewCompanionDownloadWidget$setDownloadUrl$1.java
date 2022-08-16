package com.bytedance.android.live.broadcast.widget;

import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.model.C2918r;
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

/* loaded from: classes5.dex */
public final class PreviewCompanionDownloadWidget$setDownloadUrl$1 extends Lambda implements Function1<C2918r, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCompanionDownloadWidget this$0;

    static {
        Covode.recordClassIndex(18461);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCompanionDownloadWidget$setDownloadUrl$1(PreviewCompanionDownloadWidget previewCompanionDownloadWidget) {
        super(1);
        this.this$0 = previewCompanionDownloadWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2918r c2918r) {
        String value;
        C2918r c2918r2 = c2918r;
        if (!PatchProxy.proxy(new Object[]{c2918r2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2918r2);
            TextView textView = this.this$0.LIZJ;
            if (textView != null) {
                String str = c2918r2.LIZLLL;
                if (str != null && str.length() != 0) {
                    value = c2918r2.LIZLLL;
                } else {
                    SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_PARTNER_DOWNLOAD_URI;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    value = settingKey.getValue();
                }
                textView.setText(value);
            }
        }
        return Unit.INSTANCE;
    }
}
