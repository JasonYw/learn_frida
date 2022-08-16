package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC421102lU;
import p003X.C106862S5w;
import p003X.C421072lR;

/* loaded from: classes12.dex */
public final class AnchorInviteOpenCameraDialog$onViewCreated$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C421072lR this$0;

    static {
        Covode.recordClassIndex(30016);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorInviteOpenCameraDialog$onViewCreated$1(C421072lR c421072lR) {
        super(1);
        this.this$0 = c421072lR;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC421102lU abstractC421102lU = this.this$0.LIZLLL;
            if (abstractC421102lU != null) {
                abstractC421102lU.LIZ();
            }
            this.this$0.dismiss();
        }
        return Unit.INSTANCE;
    }
}
