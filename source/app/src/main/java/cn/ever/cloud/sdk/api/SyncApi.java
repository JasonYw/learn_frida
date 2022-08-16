package cn.ever.cloud.sdk.api;

import cn.ever.cloud.sdk.entity.Result;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import p003X.AbstractC521356in;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class SyncApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC521356in component;

    static {
        Covode.recordClassIndex(3361);
    }

    public SyncApi(AbstractC521356in abstractC521356in) {
        C106862S5w.LIZ(abstractC521356in);
        this.component = abstractC521356in;
    }

    public final void setComponent$sdk_douyin_release(AbstractC521356in abstractC521356in) {
        if (PatchProxy.proxy(new Object[]{abstractC521356in}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC521356in);
        this.component = abstractC521356in;
    }

    public final Object triggerSync(Continuation<? super Result<Unit>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new SyncApi$triggerSync$2(this, null), continuation);
    }
}
