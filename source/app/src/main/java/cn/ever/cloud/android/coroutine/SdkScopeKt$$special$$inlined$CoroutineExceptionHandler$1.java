package cn.ever.cloud.android.coroutine;

import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes23.dex */
public final class SdkScopeKt$$special$$inlined$CoroutineExceptionHandler$1 extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(2844);
    }

    public SdkScopeKt$$special$$inlined$CoroutineExceptionHandler$1(CoroutineContext.Key key) {
        super(key);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(CoroutineContext coroutineContext, Throwable th) {
        if (PatchProxy.proxy(new Object[]{coroutineContext, th}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20554e("SdkScope", "Global handler catch error: " + th);
    }
}
