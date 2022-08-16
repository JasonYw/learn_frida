package com.bytedance.android.live.broadcast.gamedetail.audience;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C89121L9n;

/* loaded from: classes5.dex */
public final class AudienceDownLoadView extends DownloadView {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25846LJ;

    static {
        Covode.recordClassIndex(16108);
    }

    public AudienceDownLoadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AudienceDownLoadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView
    public final int getLayoutId() {
        return 2131698337;
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(C89121L9n c89121L9n) {
        if (PatchProxy.proxy(new Object[]{c89121L9n}, this, f25846LJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c89121L9n);
        super.LIZ(c89121L9n);
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZJ == 1) {
            setText(C0002O.m25086C("下载中 ", c89121L9n.f8777LJ));
        } else {
            setText(C0002O.m25086C("下载中 ", c89121L9n.LIZJ));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceDownLoadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ AudienceDownLoadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
