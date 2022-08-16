package com.bytedance.android.live.broadcast.stream;

import android.os.Bundle;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.avframework.livestreamv2.ILiveStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.KB4;
import p003X.KB7;

/* loaded from: classes5.dex */
public final class CaptureImageUploadController$resume$2 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KB4 this$0;

    static {
        Covode.recordClassIndex(17896);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureImageUploadController$resume$2(KB4 kb4) {
        super(1);
        this.this$0 = kb4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[]{l}, this, changeQuickRedirect, false, 1).isSupported && (abstractC5436a = this.this$0.LJFF) != null) {
            KB4 kb4 = this.this$0;
            if (!PatchProxy.proxy(new Object[]{abstractC5436a}, kb4, KB4.LIZ, false, 6).isSupported) {
                ALogger.m15801d("CaptureImageUploadController", "capture start");
                Bundle bundle = new Bundle();
                long currentTimeMillis = System.currentTimeMillis();
                bundle.putInt("mode", 1);
                bundle.putBoolean("outputPixelBufferOrigin", true);
                bundle.putBoolean("outputPixelBufferWithEffect", false);
                bundle.putInt("frameCount", 1);
                bundle.putBoolean("keepVideoCatcherAlive", true);
                abstractC5436a.LIZ(bundle, (ILiveStream.CatchPicCallback) new KB7(kb4, currentTimeMillis));
            }
        }
        return Unit.INSTANCE;
    }
}
