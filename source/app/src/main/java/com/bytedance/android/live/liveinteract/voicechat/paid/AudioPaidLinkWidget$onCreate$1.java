package com.bytedance.android.live.liveinteract.voicechat.paid;

import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.livesdk.chatroom.p517u.C6306l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C78536Gxe;
import p003X.C79108HGk;

/* loaded from: classes3.dex */
public final /* synthetic */ class AudioPaidLinkWidget$onCreate$1 extends FunctionReferenceImpl implements Function1<C6306l, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31607);
    }

    public AudioPaidLinkWidget$onCreate$1(AudioPaidLinkWidget audioPaidLinkWidget) {
        super(1, audioPaidLinkWidget, AudioPaidLinkWidget.class, "logUiLayoutChanged", "logUiLayoutChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6306l c6306l) {
        C6306l c6306l2 = c6306l;
        if (!PatchProxy.proxy(new Object[]{c6306l2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6306l2);
            AudioPaidLinkWidget audioPaidLinkWidget = (AudioPaidLinkWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6306l2}, audioPaidLinkWidget, AudioPaidLinkWidget.LIZ, false, 2).isSupported) {
                if (C4284f.LJIIIIZZ.LIZLLL().LIZLLL) {
                    Integer num = audioPaidLinkWidget.LJFF;
                    int i = c6306l2.LJFF;
                    if (num == null || num.intValue() != i) {
                        if (audioPaidLinkWidget.LIZIZ) {
                            C78536Gxe.LIZ(C78536Gxe.LIZJ, 0, audioPaidLinkWidget.LJFF, 1, (Object) null);
                            C78536Gxe.LIZJ.LIZIZ("function_switch", C79108HGk.LIZ(c6306l2.f26940LJ, c6306l2.LJFF));
                        } else {
                            C78536Gxe.LIZIZ(C78536Gxe.LIZJ, 0, audioPaidLinkWidget.LJFF, 1, null);
                            C78536Gxe.LIZJ.LIZ(C79108HGk.LIZ(c6306l2.f26940LJ, c6306l2.LJFF));
                        }
                    }
                }
                audioPaidLinkWidget.LJFF = Integer.valueOf(c6306l2.LJFF);
            }
        }
        return Unit.INSTANCE;
    }
}
