package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.entity.Storage;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.monitor.MonitorKit;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;

@DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UserApiImpl$storage$2", m135f = "UserApiImpl.kt", m134i = {}, m133l = {}, m132m = "invokeSuspend", m131n = {}, m130s = {})
/* loaded from: classes23.dex */
public final class UserApiImpl$storage$2 extends SuspendLambda implements Function1<Continuation<? super Storage>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int label;
    public final /* synthetic */ UserApiImpl this$0;

    static {
        Covode.recordClassIndex(2829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserApiImpl$storage$2(UserApiImpl userApiImpl, Continuation continuation) {
        super(1, continuation);
        this.this$0 = userApiImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Continuation) proxy.result;
        }
        C106862S5w.LIZ(continuation);
        return new UserApiImpl$storage$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Storage> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{continuation}, this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? proxy.result : ((BaseContinuationImpl) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Storage userStorage = this.this$0.repo.getUserStorage();
            if (userStorage != null) {
                float f2 = -1.0f;
                try {
                    f = ((((float) userStorage.getUsage()) / 1024.0f) / 1024.0f) / 1024.0f;
                } catch (Exception unused) {
                    f = -1.0f;
                }
                try {
                    f2 = ((((float) userStorage.getQuota()) / 1024.0f) / 1024.0f) / 1024.0f;
                } catch (Exception unused2) {
                }
                MonitorKit.INSTANCE.user("userStorage", Boxing.boxFloat(f), Boxing.boxFloat(f2));
                return userStorage;
            }
            throw ClientError.Companion.internal("user storage is null");
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
