package cn.ever.cloud.android.api;

import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.network.auth.UserInconsistentEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes23.dex */
public interface UserApi {
    static {
        Covode.recordClassIndex(2755);
    }

    Object storage(boolean z, Continuation<? super Storage> continuation);

    Flow<UserInconsistentEvent> userInconsistent();

    /* loaded from: classes23.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(2756);
        }

        public static /* synthetic */ Object storage$default(UserApi userApi, boolean z, Continuation continuation, int i, Object obj) {
            byte b = z ? (byte) 1 : (byte) 0;
            byte b2 = z ? (byte) 1 : (byte) 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userApi, Byte.valueOf(b), continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return userApi.storage(z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: storage");
        }
    }
}
