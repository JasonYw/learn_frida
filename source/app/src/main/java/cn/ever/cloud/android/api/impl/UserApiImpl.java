package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.api.UserApi;
import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.p039a.AbstractC0684f;
import cn.ever.cloud.network.auth.AbstractC0730a;
import cn.ever.cloud.network.auth.UserInconsistentEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserApiImpl implements UserApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0684f repo;
    public final AbstractC0730a tokenProvider;

    static {
        Covode.recordClassIndex(2828);
    }

    @Override // cn.ever.cloud.android.api.UserApi
    public final Flow<UserInconsistentEvent> userInconsistent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.tokenProvider.onUserInconsistentEvent();
    }

    public UserApiImpl(AbstractC0684f abstractC0684f, AbstractC0730a abstractC0730a) {
        C106862S5w.LIZ(abstractC0684f, abstractC0730a);
        this.repo = abstractC0684f;
        this.tokenProvider = abstractC0730a;
    }

    @Override // cn.ever.cloud.android.api.UserApi
    public final Object storage(boolean z, Continuation<? super Storage> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new UserApiImpl$storage$2(this, null), continuation);
    }
}
