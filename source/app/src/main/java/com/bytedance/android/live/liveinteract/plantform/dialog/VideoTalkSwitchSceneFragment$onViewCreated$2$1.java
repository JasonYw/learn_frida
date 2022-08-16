package com.bytedance.android.live.liveinteract.plantform.dialog;

import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77839GmP;
import p003X.C78336GuQ;
import p003X.C88440Kt0;
import p003X.View$OnClickListenerC77841GmR;

/* loaded from: classes3.dex */
public final class VideoTalkSwitchSceneFragment$onViewCreated$2$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC77841GmR this$0;

    static {
        Covode.recordClassIndex(29374);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSwitchSceneFragment$onViewCreated$2$1(View$OnClickListenerC77841GmR view$OnClickListenerC77841GmR) {
        super(0);
        this.this$0 = view$OnClickListenerC77841GmR;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C77839GmP c77839GmP = this.this$0.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c77839GmP, C77839GmP.LIZ, false, 9).isSupported) {
                c77839GmP.LJII.dismiss();
                if (c77839GmP.LIZJ.LIZ()) {
                    AbstractC4766ag LIZ = AbstractC4766ag.LIZ.LIZ();
                    if (LIZ != null) {
                        C78336GuQ.LIZ(LIZ, 13, null, null, 6, null);
                    }
                } else {
                    C88440Kt0.LIZ(2131584153);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
