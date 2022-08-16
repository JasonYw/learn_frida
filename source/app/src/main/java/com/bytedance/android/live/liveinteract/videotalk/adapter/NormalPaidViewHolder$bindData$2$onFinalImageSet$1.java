package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80672Hr0;
import p003X.C80689HrH;
import p003X.C80704HrW;
import p003X.C80902Hui;
import p003X.LK1;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class NormalPaidViewHolder$bindData$2$onFinalImageSet$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80902Hui this$0;

    static {
        Covode.recordClassIndex(29642);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalPaidViewHolder$bindData$2$onFinalImageSet$1(C80902Hui c80902Hui) {
        super(0);
        this.this$0 = c80902Hui;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            HSImageView hSImageView = this.this$0.LIZIZ.LIZJ;
            if (hSImageView != null) {
                LK1.LIZ(hSImageView);
            }
            this.this$0.LIZIZ.LIZ(this.this$0.LIZJ.LJJIJLIJ);
            this.this$0.LIZIZ.LIZIZ();
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.android.live.liveinteract.videotalk.adapter.NormalPaidViewHolder$bindData$2$onFinalImageSet$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(29643);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    if (!(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80704HrW) && !(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80689HrH) && !(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80672Hr0)) {
                        M0Q.LIZ(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZIZ, 2130855796);
                    } else {
                        M0Q.LIZ(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZIZ, 2130858058);
                    }
                    NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZLLL().LIZ(NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZLLL, NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ);
                    NormalPaidViewHolder$bindData$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZ();
                }
            }, JsBridgeDelegate.GET_URL_OUT_TIME);
        }
        return Unit.INSTANCE;
    }
}
