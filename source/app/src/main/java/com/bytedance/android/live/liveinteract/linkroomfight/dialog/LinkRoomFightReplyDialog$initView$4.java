package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.live.linker.ReplyReason;
import com.bytedance.android.livesdkapi.depend.model.live.linker.ReplyType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78790H4e;

/* loaded from: classes3.dex */
public final class LinkRoomFightReplyDialog$initView$4 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78790H4e this$0;

    static {
        Covode.recordClassIndex(27683);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightReplyDialog$initView$4(C78790H4e c78790H4e) {
        super(1);
        this.this$0 = c78790H4e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZ(ReplyType.REJECT, ReplyReason.MANUAL);
            this.this$0.dismiss();
        }
        return Unit.INSTANCE;
    }
}
