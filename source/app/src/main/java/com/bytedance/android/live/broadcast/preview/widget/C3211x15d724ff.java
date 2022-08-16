package com.bytedance.android.live.broadcast.preview.widget;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.K9M;
import p003X.K9P;

/* renamed from: com.bytedance.android.live.broadcast.preview.widget.LiveCameraExtraFrameWidget$initLiveStream$$inlined$apply$lambda$1$2 */
/* loaded from: classes5.dex */
public final class C3211x15d724ff extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ K9M this$0;

    static {
        Covode.recordClassIndex(17509);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3211x15d724ff(K9M k9m) {
        super(1);
        this.this$0 = k9m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        if (!PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15801d("BroadcastView", "MSG_EGL_SURFACE_DESTROYED isStop:" + this.this$0.LIZIZ.LJIILJJIL);
            if (this.this$0.LIZIZ.LJIILJJIL) {
                K9P k9p = this.this$0.LIZIZ.LJIIIIZZ;
                if (k9p != null) {
                    k9p.LIZ();
                }
                LiveCameraExtraFrameWidget liveCameraExtraFrameWidget = this.this$0.LIZIZ;
                if (!PatchProxy.proxy(new Object[0], liveCameraExtraFrameWidget, LiveCameraExtraFrameWidget.LIZ, false, 28).isSupported) {
                    ALogger.m15801d("BroadcastView", "releaseStream");
                    AbstractC5436a abstractC5436a = liveCameraExtraFrameWidget.LJII;
                    if (abstractC5436a != null) {
                        abstractC5436a.LJII();
                    }
                    AbstractC5436a abstractC5436a2 = liveCameraExtraFrameWidget.LJII;
                    if (abstractC5436a2 != null) {
                        abstractC5436a2.mo15611LJ();
                    }
                    liveCameraExtraFrameWidget.LJII = null;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
