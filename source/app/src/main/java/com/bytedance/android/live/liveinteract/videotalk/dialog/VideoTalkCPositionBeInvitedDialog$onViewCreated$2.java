package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class VideoTalkCPositionBeInvitedDialog$onViewCreated$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ VideoTalkCPositionBeInvitedDialog this$0;

    static {
        Covode.recordClassIndex(30028);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkCPositionBeInvitedDialog$onViewCreated$2(VideoTalkCPositionBeInvitedDialog videoTalkCPositionBeInvitedDialog) {
        super(1);
        this.this$0 = videoTalkCPositionBeInvitedDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            VideoTalkCPositionBeInvitedDialog.LIZ(this.this$0, false, false, 2, (Object) null);
            this.this$0.dismiss();
        }
        return Unit.INSTANCE;
    }
}
