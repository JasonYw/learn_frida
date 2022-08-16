package cn.ever.cloud.sdk.api;

import cn.ever.cloud.network.auth.UserInconsistentEvent;
import cn.ever.cloud.sdk.entity.EcStorage;
import cn.ever.cloud.sdk.entity.EpUser;
import cn.ever.cloud.sdk.entity.Result;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p003X.AbstractC521356in;
import p003X.AbstractC521426iu;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UserApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC521356in component;
    public final AbstractC521426iu delegate;

    static {
        Covode.recordClassIndex(3380);
    }

    public final Flow<Pair<EpUser, EpUser>> userInconsistent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        final Flow<UserInconsistentEvent> userInconsistent = this.delegate.userInconsistent();
        return new Flow<Pair<? extends EpUser, ? extends EpUser>>() { // from class: cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3382);
            }

            /* renamed from: cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C07562 implements FlowCollector<UserInconsistentEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UserApi$userInconsistent$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2", m135f = "UserApi.kt", m134i = {}, m133l = {136}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07571 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public Object L$5;
                    public Object L$6;
                    public Object L$7;
                    public int label;
                    public /* synthetic */ Object result;

                    static {
                        Covode.recordClassIndex(3384);
                    }

                    public C07571(Continuation continuation) {
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
                        return C07562.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(3383);
                }

                public C07562(FlowCollector flowCollector, UserApi$userInconsistent$$inlined$map$1 userApi$userInconsistent$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = userApi$userInconsistent$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.network.auth.UserInconsistentEvent r8, kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r8
                        r5 = 1
                        r2[r5] = r9
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1.C07562.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r0, r1, r5)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r9 instanceof cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1.C07562.C07571
                        if (r0 == 0) goto L75
                        r4 = r9
                        cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2$1 r4 = (cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1.C07562.C07571) r4
                        int r0 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L75
                        int r0 = r4.label
                        int r0 = r0 - r1
                        r4.label = r0
                    L29:
                        java.lang.Object r1 = r4.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r4.label
                        if (r0 == 0) goto L3b
                        if (r0 != r5) goto L7b
                        kotlin.ResultKt.throwOnFailure(r1)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r6 = r7.$this_unsafeFlow$inlined
                        cn.ever.cloud.network.auth.UserInconsistentEvent r8 = (cn.ever.cloud.network.auth.UserInconsistentEvent) r8
                        cn.ever.cloud.utils.LogHelper r2 = cn.ever.cloud.utils.LogHelper.INSTANCE
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        java.lang.String r0 = "got userInconsistentEvent: "
                        r1.<init>(r0)
                        r1.append(r8)
                        java.lang.String r1 = r1.toString()
                        java.lang.String r0 = "UserApi"
                        r2.m20553i(r0, r1)
                        kotlin.Pair r2 = new kotlin.Pair
                        cn.ever.cloud.network.auth.UserId r0 = r8.getNewUser()
                        cn.ever.cloud.sdk.entity.EpUser r1 = cn.ever.cloud.sdk.mapper.MapperKt.toEpUser(r0)
                        cn.ever.cloud.network.auth.UserId r0 = r8.getOldUser()
                        cn.ever.cloud.sdk.entity.EpUser r0 = cn.ever.cloud.sdk.mapper.MapperKt.toEpUser(r0)
                        r2.<init>(r1, r0)
                        r4.label = r5
                        java.lang.Object r0 = r6.emit(r2, r4)
                        if (r0 != r3) goto L38
                        return r3
                    L75:
                        cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2$1 r4 = new cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1$2$1
                        r4.<init>(r9)
                        goto L29
                    L7b:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.sdk.api.UserApi$userInconsistent$$inlined$map$1.C07562.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Pair<? extends EpUser, ? extends EpUser>> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07562(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public final void setComponent$sdk_douyin_release(AbstractC521356in abstractC521356in) {
        if (PatchProxy.proxy(new Object[]{abstractC521356in}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC521356in);
        this.component = abstractC521356in;
    }

    public UserApi(AbstractC521356in abstractC521356in, AbstractC521426iu abstractC521426iu) {
        C106862S5w.LIZ(abstractC521356in, abstractC521426iu);
        this.component = abstractC521356in;
        this.delegate = abstractC521426iu;
    }

    public final Object storage(boolean z, Continuation<? super Result<EcStorage>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new UserApi$storage$2(this, z, null), continuation);
    }

    public static /* synthetic */ Object storage$default(UserApi userApi, boolean z, Continuation continuation, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{userApi, Byte.valueOf(b), continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return userApi.storage(z, continuation);
    }
}
