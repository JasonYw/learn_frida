package cn.ever.cloud.android.services.upload;

import androidx.core.view.MotionEventCompat;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.services.upload.UploadGuard", m135f = "UploadGuard.kt", m134i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, m133l = {20, MotionEventCompat.AXIS_GENERIC_4, MotionEventCompat.AXIS_GENERIC_6, 40, 40}, m132m = "runInGuard", m131n = {"this", C33968a.f42937f, C2521l.LJI, "this", C33968a.f42937f, C2521l.LJI, "guardLock", "this", C33968a.f42937f, "guardLock", "this", C33968a.f42937f, "guardLock", "this", C33968a.f42937f, "guardLock"}, m130s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
/* loaded from: classes23.dex */
public final class UploadGuard$runInGuard$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UploadGuard this$0;

    static {
        Covode.recordClassIndex(3138);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadGuard$runInGuard$1(UploadGuard uploadGuard, Continuation continuation) {
        super(continuation);
        this.this$0 = uploadGuard;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runInGuard(null, null, this);
    }
}
