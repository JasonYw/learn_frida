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
import p003X.C80903Huj;
import p003X.LK1;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class BasePaidViewHolder$bind$2$onFinalImageSet$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80903Huj this$0;

    static {
        Covode.recordClassIndex(29640);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasePaidViewHolder$bind$2$onFinalImageSet$1(C80903Huj c80903Huj) {
        super(0);
        this.this$0 = c80903Huj;
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
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.bytedance.android.live.liveinteract.videotalk.adapter.BasePaidViewHolder$bind$2$onFinalImageSet$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(29641);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    if (!(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80704HrW) && !(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80689HrH) && !(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZJ() instanceof C80672Hr0)) {
                        M0Q.LIZ(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZIZ, 2130855796);
                    } else {
                        M0Q.LIZ(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZIZ, 2130858058);
                    }
                    BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZLLL().LIZ(BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZLLL, BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ);
                    BasePaidViewHolder$bind$2$onFinalImageSet$1.this.this$0.LIZIZ.LIZ();
                }
            }, JsBridgeDelegate.GET_URL_OUT_TIME);
        }
        return Unit.INSTANCE;
    }
}
