package cn.ever.cloud.android.runtime;

import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.android.runtime.RuntimeExtManager", m135f = "RuntimeExtManager.kt", m134i = {0}, m133l = {MotionEventCompat.AXIS_DISTANCE}, m132m = "getPreviewBase64", m131n = {"path"}, m130s = {"L$0"})
/* loaded from: classes23.dex */
public final class RuntimeExtManager$getPreviewBase64$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ RuntimeExtManager this$0;

    static {
        Covode.recordClassIndex(2958);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RuntimeExtManager$getPreviewBase64$1(RuntimeExtManager runtimeExtManager, Continuation continuation) {
        super(continuation);
        this.this$0 = runtimeExtManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getPreviewBase64(null, 0, this);
    }
}
