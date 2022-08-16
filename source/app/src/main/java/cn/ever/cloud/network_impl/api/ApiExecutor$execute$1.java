package cn.ever.cloud.network_impl.api;

import androidx.core.view.MotionEventCompat;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.network_impl.api.ApiExecutor", m135f = "ApiExecutor.kt", m134i = {0, 0, 0, 1, 1, 1}, m133l = {MotionEventCompat.AXIS_GENERIC_4, BaseNotice.CREATOR}, m132m = "execute", m131n = {"this", C2521l.LJIILJJIL, "retryCounter", "this", C2521l.LJIILJJIL, "retryCounter"}, m130s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes23.dex */
public final class ApiExecutor$execute$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ ApiExecutor this$0;

    static {
        Covode.recordClassIndex(3271);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiExecutor$execute$1(ApiExecutor apiExecutor, Continuation continuation) {
        super(continuation);
        this.this$0 = apiExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, this);
    }
}
