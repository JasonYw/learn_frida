package com.bytedance.android.live.liveinteract.voicechat.match;

import android.app.Dialog;
import com.bytedance.android.live.liveinteract.api.chatroom.model.LinkMatchType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C78837H5z;
import p003X.H7M;

/* loaded from: classes3.dex */
public final class ChatMatchDialog$onViewCreated$6$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H7M this$0;

    static {
        Covode.recordClassIndex(31460);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMatchDialog$onViewCreated$6$1(H7M h7m) {
        super(0);
        this.this$0 = h7m;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            Dialog dialog = this.this$0.LIZIZ.getDialog();
            if (dialog != null) {
                dialog.setCanceledOnTouchOutside(true);
            }
            C5074d c5074d = this.this$0.LIZIZ.f6601LJ;
            if (c5074d != null) {
                c5074d.m15644LJ();
                C78837H5z c78837H5z = this.this$0.LIZIZ.LJIIJJI;
                if (c78837H5z != null) {
                    c78837H5z.LIZ(C78837H5z.LIZJ.LIZ(c5074d.LJI.getValue(), c5074d.LJFF.getValue()).value, "cancel_play", C78837H5z.LIZJ.LIZIZ());
                }
                C78837H5z c78837H5z2 = this.this$0.LIZIZ.LJIIJJI;
                if (c78837H5z2 != null) {
                    c78837H5z2.LIZ(LinkMatchType.MATCH.value);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
