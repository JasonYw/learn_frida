package cn.ever.cloud.sdk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(m136c = "cn.ever.cloud.sdk.UserSdkProxy$buildSdkComponent$extDepend$1", m135f = "UserSdkProxy.kt", m134i = {}, m133l = {154}, m132m = "getThumbnailInfo", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UserSdkProxy$buildSdkComponent$extDepend$1 this$0;

    static {
        Covode.recordClassIndex(3313);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSdkProxy$buildSdkComponent$extDepend$1$getThumbnailInfo$1(UserSdkProxy$buildSdkComponent$extDepend$1 userSdkProxy$buildSdkComponent$extDepend$1, Continuation continuation) {
        super(continuation);
        this.this$0 = userSdkProxy$buildSdkComponent$extDepend$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getThumbnailInfo(null, 0, this);
    }
}
