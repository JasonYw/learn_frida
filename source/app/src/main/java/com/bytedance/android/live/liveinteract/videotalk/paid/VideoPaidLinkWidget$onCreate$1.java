package com.bytedance.android.live.liveinteract.videotalk.paid;

import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C106862S5w;
import p003X.C78536Gxe;

/* loaded from: classes3.dex */
public final /* synthetic */ class VideoPaidLinkWidget$onCreate$1 extends FunctionReferenceImpl implements Function1<C6307m, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(30318);
    }

    public VideoPaidLinkWidget$onCreate$1(VideoPaidLinkWidget videoPaidLinkWidget) {
        super(1, videoPaidLinkWidget, VideoPaidLinkWidget.class, "logUiLayoutChanged", "logUiLayoutChanged(Lcom/bytedance/android/livesdk/chatroom/viewmodel/SwitchSceneWithPlayModeEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6307m c6307m) {
        C6307m c6307m2 = c6307m;
        if (!PatchProxy.proxy(new Object[]{c6307m2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6307m2);
            VideoPaidLinkWidget videoPaidLinkWidget = (VideoPaidLinkWidget) this.receiver;
            if (!PatchProxy.proxy(new Object[]{c6307m2}, videoPaidLinkWidget, VideoPaidLinkWidget.LIZ, false, 4).isSupported) {
                List<Integer> list = c6307m2.LIZJ;
                if (list != null && list.contains(11)) {
                    Integer num = videoPaidLinkWidget.LJFF;
                    int i = c6307m2.LIZLLL;
                    if (num == null || num.intValue() != i) {
                        if (videoPaidLinkWidget.LIZIZ) {
                            C78536Gxe.LIZJ.LIZ(videoPaidLinkWidget.LJI, videoPaidLinkWidget.LJFF);
                            C78536Gxe.LIZ(C78536Gxe.LIZJ, "function_switch", (String) null, 2, (Object) null);
                        } else {
                            C78536Gxe.LIZJ.LIZIZ(videoPaidLinkWidget.LJI, videoPaidLinkWidget.LJFF);
                            C78536Gxe.LIZ(C78536Gxe.LIZJ, null, 1, null);
                        }
                    }
                }
                videoPaidLinkWidget.LJFF = Integer.valueOf(c6307m2.LIZLLL);
                videoPaidLinkWidget.LJI = c6307m2.LIZIZ;
            }
        }
        return Unit.INSTANCE;
    }
}
