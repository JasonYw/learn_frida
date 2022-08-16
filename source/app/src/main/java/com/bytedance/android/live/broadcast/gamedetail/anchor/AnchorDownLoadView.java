package com.bytedance.android.live.broadcast.gamedetail.anchor;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.broadcast.download.DownloadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnchorDownLoadView extends DownloadView {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25840LJ;

    static {
        Covode.recordClassIndex(16018);
    }

    public AnchorDownLoadView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AnchorDownLoadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.broadcast.download.DownloadView
    public final int getLayoutId() {
        return 2131698310;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorDownLoadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ AnchorDownLoadView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
