package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80805Ht9;

/* loaded from: classes3.dex */
public final class VideoCameraRoomWindowAdapter$EmptyStubViewHolder$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80805Ht9 this$0;

    static {
        Covode.recordClassIndex(29648);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCameraRoomWindowAdapter$EmptyStubViewHolder$1(C80805Ht9 c80805Ht9) {
        super(1);
        this.this$0 = c80805Ht9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZLLL.LIZIZ.LIZ(this.this$0.getLayoutPosition(), this.this$0.LIZJ.LIZ());
        }
        return Unit.INSTANCE;
    }
}
