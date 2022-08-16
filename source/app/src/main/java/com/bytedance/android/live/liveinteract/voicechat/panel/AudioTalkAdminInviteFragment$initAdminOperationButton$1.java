package com.bytedance.android.live.liveinteract.voicechat.panel;

import android.view.View;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C78034GpY;
import p003X.HLJ;

/* loaded from: classes3.dex */
public final class AudioTalkAdminInviteFragment$initAdminOperationButton$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78034GpY this$0;

    static {
        Covode.recordClassIndex(31614);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioTalkAdminInviteFragment$initAdminOperationButton$1(C78034GpY c78034GpY) {
        super(1);
        this.this$0 = c78034GpY;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C2WC<Boolean> LJJLIIIJLLLLLLLZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C5923dp c5923dp = this.this$0.LJIJ;
            if (c5923dp != null && (LJJLIIIJLLLLLLLZ = c5923dp.LJJLIIIJLLLLLLLZ()) != null && LJJLIIIJLLLLLLLZ.LIZ().booleanValue()) {
                ((IKtvService) ServiceManager.getService(IKtvService.class)).openKtvRoomDialog(this.this$0.getContext(), this.this$0.LJIIZILJ);
                HLJ hlj = this.this$0.LJII;
                if (hlj != null) {
                    hlj.dismiss();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
