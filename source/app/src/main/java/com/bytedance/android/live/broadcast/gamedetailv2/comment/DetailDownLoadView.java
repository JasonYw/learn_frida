package com.bytedance.android.live.broadcast.gamedetailv2.comment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C88999L4v;
import p003X.C89121L9n;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class DetailDownLoadView extends DownloadView {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25885LJ;

    static {
        Covode.recordClassIndex(16603);
    }

    public DetailDownLoadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DetailDownLoadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView
    public final int getLayoutId() {
        return 2131699250;
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25885LJ, false, 3).isSupported) {
            return;
        }
        super.LIZIZ();
        if (!C88999L4v.LIZIZ.LIZIZ()) {
            TextView downloadTv = getDownloadTv();
            if (downloadTv != null) {
                downloadTv.setTextColor(LK5.LIZIZ(2131626090));
                return;
            }
            return;
        }
        TextView downloadTv2 = getDownloadTv();
        if (downloadTv2 != null) {
            downloadTv2.setTextColor(LK5.LIZIZ(2131628611));
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25885LJ, false, 1).isSupported) {
            return;
        }
        super.LIZ(i);
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setTextColor(LK5.LIZIZ(2131628611));
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(C89121L9n c89121L9n) {
        if (PatchProxy.proxy(new Object[]{c89121L9n}, this, f25885LJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c89121L9n);
        super.LIZ(c89121L9n);
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setTextColor(LK5.LIZIZ(2131628611));
        }
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZJ == 1) {
            setText("下载中 " + c89121L9n.LIZLLL + '%');
            return;
        }
        setText("下载中 " + c89121L9n.LIZIZ + '%');
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25885LJ, false, 4).isSupported) {
            return;
        }
        super.LIZIZ(i);
        if (!C88999L4v.LIZIZ.LIZIZ()) {
            TextView downloadTv = getDownloadTv();
            if (downloadTv != null) {
                downloadTv.setTextColor(LK5.LIZIZ(2131626090));
                return;
            }
            return;
        }
        TextView downloadTv2 = getDownloadTv();
        if (downloadTv2 != null) {
            downloadTv2.setTextColor(LK5.LIZIZ(2131628611));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DetailDownLoadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Drawable LIZJ;
        C106862S5w.LIZ(context);
        setInstalledText(2131582107);
        setDownloadedText(2131582105);
        setReadyText(2131582103);
        int i3 = 2130857929;
        if (!C88999L4v.LIZIZ.LIZIZ()) {
            i2 = 2130857927;
        } else {
            i2 = 2130857929;
        }
        setReadyBg(i2);
        setDownloadingBg(!C88999L4v.LIZIZ.LIZIZ() ? 2130857928 : i3);
        ProgressBar downloadPb = getDownloadPb();
        if (downloadPb != null) {
            if (!C88999L4v.LIZIZ.LIZIZ()) {
                LIZJ = LK5.LIZJ(2130855884);
            } else {
                LIZJ = LK5.LIZJ(2130855885);
            }
            downloadPb.setProgressDrawable(LIZJ);
        }
        if (!C88999L4v.LIZIZ.LIZIZ()) {
            TextView downloadTv = getDownloadTv();
            if (downloadTv != null) {
                downloadTv.setTextColor(LK5.LIZIZ(2131626090));
                return;
            }
            return;
        }
        TextView downloadTv2 = getDownloadTv();
        if (downloadTv2 != null) {
            downloadTv2.setTextColor(LK5.LIZIZ(2131628611));
        }
    }

    public /* synthetic */ DetailDownLoadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
