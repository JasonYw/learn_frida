package com.bytedance.android.live.liveinteract.plantform.dialog;

import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C77839GmP;
import p003X.C78336GuQ;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.View$OnClickListenerC77840GmQ;

/* loaded from: classes3.dex */
public final class VideoTalkSwitchSceneFragment$onViewCreated$1$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC77840GmQ this$0;

    static {
        Covode.recordClassIndex(29373);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSwitchSceneFragment$onViewCreated$1$1(View$OnClickListenerC77840GmQ view$OnClickListenerC77840GmQ) {
        super(0);
        this.this$0 = view$OnClickListenerC77840GmQ;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        DataCenter dataCenter;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C77839GmP c77839GmP = this.this$0.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], c77839GmP, C77839GmP.LIZ, false, 8).isSupported) {
                c77839GmP.LJII.dismiss();
                if (c77839GmP.LIZJ.LIZ()) {
                    C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f6984aL;
                    Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                    Integer LIZ = c87308Kak.LIZ();
                    if (LIZ != null && LIZ.intValue() == 12) {
                        AbstractC4766ag LIZ2 = AbstractC4766ag.LIZ.LIZ();
                        if (LIZ2 != null) {
                            C78336GuQ.LIZ(LIZ2, 12, null, null, 6, null);
                        }
                    } else {
                        AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
                        if (LIZ3 != null) {
                            C78336GuQ.LIZ(LIZ3, 8, null, null, 6, null);
                        }
                    }
                    if (((IKtvService) ServiceManager.getService(IKtvService.class)).isMultipleKtvEnable(c77839GmP.LIZIZ) && ((IKtvService) ServiceManager.getService(IKtvService.class)).currentIsMultipleKtvMode() && (dataCenter = c77839GmP.LIZIZ) != null) {
                        dataCenter.put("cmd_close_multiple_kt", Boolean.TRUE);
                    }
                } else {
                    C88440Kt0.LIZ(2131584153);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
