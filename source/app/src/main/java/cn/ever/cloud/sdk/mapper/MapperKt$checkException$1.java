package cn.ever.cloud.sdk.mapper;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.mapper.MapperKt", m135f = "Mapper.kt", m134i = {}, m133l = {197}, m132m = "checkException", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class MapperKt$checkException$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    static {
        Covode.recordClassIndex(3416);
    }

    public MapperKt$checkException$1(Continuation continuation) {
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
        return MapperKt.checkException(null, this);
    }
}
