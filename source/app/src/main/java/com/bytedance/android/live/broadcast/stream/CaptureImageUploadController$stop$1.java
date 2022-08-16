package com.bytedance.android.live.broadcast.stream;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.KB4;

/* loaded from: classes5.dex */
public final class CaptureImageUploadController$stop$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KB4 this$0;

    static {
        Covode.recordClassIndex(17897);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureImageUploadController$stop$1(KB4 kb4) {
        super(1);
        this.this$0 = kb4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        Disposable disposable;
        if (!PatchProxy.proxy(new Object[]{l}, this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15801d("CaptureImageUploadController", "stop");
            KB4 kb4 = this.this$0;
            kb4.LIZLLL = false;
            kb4.LJI = true;
            Disposable disposable2 = kb4.LIZIZ;
            if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.this$0.LIZIZ) != null) {
                disposable.dispose();
            }
            this.this$0.LIZJ.clear();
            this.this$0.LJFF = null;
        }
        return Unit.INSTANCE;
    }
}
