package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C78538Gxg;
import p003X.C81520IBe;
import p003X.C81521IBf;
import p003X.C81527IBl;
import p003X.C87308Kak;
import p003X.DialogC77790Glc;

/* loaded from: classes3.dex */
public final class VideoTalkSettingDialog$initPaidLinkSettingNew$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77790Glc this$0;

    static {
        Covode.recordClassIndex(30036);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSettingDialog$initPaidLinkSettingNew$1(DialogC77790Glc dialogC77790Glc) {
        super(1);
        this.this$0 = dialogC77790Glc;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.dialog.VideoTalkSettingDialog$initPaidLinkSettingNew$1$1 */
    /* loaded from: classes3.dex */
    public static final class C49191 extends Lambda implements Function1<String, Unit> {
        public static final C49191 INSTANCE = new C49191();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30037);
        }

        public C49191() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(String str) {
            if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(str);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        C81521IBf LIZ;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LIZIZ() && ((LIZ = C81527IBl.LIZJ.LIZ((C81520IBe) "on_pay_link_try_open_check", (Function1<? super C81520IBe, Unit>) C49191.INSTANCE)) == null || !LIZ.LIZ())) {
                DialogC77790Glc dialogC77790Glc = this.this$0;
                Context context = dialogC77790Glc.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                if (!PatchProxy.proxy(new Object[]{context}, dialogC77790Glc, DialogC77790Glc.LIZ, false, 5).isSupported && C78538Gxg.LJIIIIZZ()) {
                    IService service = ServiceManager.getService(IInteractService.class);
                    Intrinsics.checkNotNullExpressionValue(service, "");
                    ((IInteractService) service).getVideoTalkService().LIZ(context, "link_setting_panel");
                }
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7021aw;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Boolean.TRUE);
                View findViewById = this.this$0.findViewById(2131184969);
                Intrinsics.checkNotNullExpressionValue(findViewById, "");
                findViewById.setVisibility(8);
                C116971W2r.LIZ(this.this$0);
            }
        }
        return Unit.INSTANCE;
    }
}
