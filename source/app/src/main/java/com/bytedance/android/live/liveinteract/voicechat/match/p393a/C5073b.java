package com.bytedance.android.live.liveinteract.voicechat.match.p393a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.match.a.b */
/* loaded from: classes12.dex */
public final class C5073b extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public HSImageView LIZIZ;

    static {
        Covode.recordClassIndex(31497);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5073b(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131169598);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (HSImageView) findViewById;
    }
}
