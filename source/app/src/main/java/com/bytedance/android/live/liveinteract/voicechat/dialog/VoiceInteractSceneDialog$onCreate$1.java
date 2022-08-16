package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6303g;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413392Xt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC77846GmW;
import p003X.HHY;
import p003X.HHZ;

/* loaded from: classes3.dex */
public final class VoiceInteractSceneDialog$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77846GmW this$0;

    static {
        Covode.recordClassIndex(30989);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceInteractSceneDialog$onCreate$1(DialogC77846GmW dialogC77846GmW) {
        super(1);
        this.this$0 = dialogC77846GmW;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        AbstractC413392Xt<AbstractC6303g> LJJLL;
        AbstractC6303g LIZIZ;
        C6306l LIZ;
        int i;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZ("radio");
            C5923dp c5923dp = this.this$0.LIZJ;
            if (c5923dp != null && (LJJLL = c5923dp.LJJLL()) != null && (LIZIZ = LJJLL.LIZIZ()) != null && (LIZ = LIZIZ.LIZ()) != null && (i = LIZ.f26940LJ) != 0) {
                this.this$0.LIZ(i, 5);
            } else {
                if (this.this$0.LIZLLL != null) {
                    HHZ hhz = this.this$0.LIZLLL;
                    if (hhz != null) {
                        hhz.m23762Q_();
                    }
                } else {
                    HHY hhy = this.this$0.f6454LJ;
                    if (hhy != null) {
                        hhy.m23765S_();
                    }
                }
                C116971W2r.LIZ(this.this$0);
            }
        }
        return Unit.INSTANCE;
    }
}
