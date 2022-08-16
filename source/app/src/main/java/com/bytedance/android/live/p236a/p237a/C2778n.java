package com.bytedance.android.live.p236a.p237a;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.p518ui.LiveSwitchButton;
import com.bytedance.covode.number.Covode;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C421472m5;

/* renamed from: com.bytedance.android.live.a.a.n */
/* loaded from: classes12.dex */
public final class C2778n extends C421472m5 {

    /* renamed from: LJ */
    public final LiveSwitchButton f25722LJ;
    public final TextView LJFF;

    static {
        Covode.recordClassIndex(13802);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2778n(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131189486);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f25722LJ = (LiveSwitchButton) findViewById;
        this.LJFF = (TextView) view.findViewById(2131193907);
    }
}
