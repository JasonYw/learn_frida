package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.services.SyncService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p003X.AbstractC521106iO;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class SyncApiImpl implements AbstractC521106iO {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final SyncService syncService;

    static {
        Covode.recordClassIndex(2800);
    }

    public SyncApiImpl(SyncService syncService) {
        C106862S5w.LIZ(syncService);
        this.syncService = syncService;
    }

    @Override // p003X.AbstractC521106iO
    public final Object triggerSync(Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new SyncApiImpl$triggerSync$2(this, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }
}
