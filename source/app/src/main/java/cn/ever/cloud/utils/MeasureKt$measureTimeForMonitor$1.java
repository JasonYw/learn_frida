package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.utils.MeasureKt", m135f = "Measure.kt", m134i = {0, 0, 0}, m133l = {18}, m132m = "measureTimeForMonitor", m131n = {"serviceName", "signature", "monitorReport"}, m130s = {"L$0", "L$1", "L$2"})
/* loaded from: classes23.dex */
public final class MeasureKt$measureTimeForMonitor$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    static {
        Covode.recordClassIndex(3434);
    }

    public MeasureKt$measureTimeForMonitor$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MeasureKt.measureTimeForMonitor(null, null, null, null, this);
    }
}
