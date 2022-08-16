package com.bytedance.android.live.broadcast.gamedetailv2.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C89121L9n;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class TitleDownloadView extends DownloadView {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25898LJ;

    static {
        Covode.recordClassIndex(16731);
    }

    public TitleDownloadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TitleDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView
    public final int getLayoutId() {
        return 2131699263;
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25898LJ, false, 3).isSupported) {
            return;
        }
        super.LIZIZ();
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setTextColor(LK5.LIZIZ(2131626090));
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25898LJ, false, 1).isSupported) {
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
        if (PatchProxy.proxy(new Object[]{c89121L9n}, this, f25898LJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c89121L9n);
        super.LIZ(c89121L9n);
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setTextColor(LK5.LIZIZ(2131628611));
        }
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView, com.bytedance.android.live.broadcast.api.gamepromote.p256a.AbstractC2889a
    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, f25898LJ, false, 4).isSupported) {
            return;
        }
        super.LIZIZ(i);
        TextView downloadTv = getDownloadTv();
        if (downloadTv != null) {
            downloadTv.setTextColor(LK5.LIZIZ(2131626090));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        setReadyBg(2130857927);
        setPauseText(2131583397);
        setInstalledText(2131583396);
        setDownloadingBg(2130857928);
        ProgressBar downloadPb = getDownloadPb();
        if (downloadPb != null) {
            downloadPb.setProgressDrawable(LK5.LIZJ(2130855884));
        }
    }

    public /* synthetic */ TitleDownloadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
