package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80675Hr3;

/* loaded from: classes3.dex */
public final class VideoCameraRoomWindowAdapter$BaseAudioGuestViewHolder$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80675Hr3 this$0;

    static {
        Covode.recordClassIndex(29646);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoCameraRoomWindowAdapter$BaseAudioGuestViewHolder$4(C80675Hr3 c80675Hr3) {
        super(1);
        this.this$0 = c80675Hr3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJIIZILJ.LIZIZ.LIZIZ(this.this$0.LJIILLIIL);
        }
        return Unit.INSTANCE;
    }
}
