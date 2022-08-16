package cn.ever.cloud.sdk.api;

import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import cn.ever.cloud.sdk.entity.EcTask;
import cn.ever.cloud.sdk.entity.EcTaskItem;
import cn.ever.cloud.sdk.entity.EcTaskReq;
import cn.ever.cloud.sdk.entity.Result;
import cn.ever.cloud.sdk.mapper.MapperKt;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p003X.AbstractC521356in;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC521356in component;

    static {
        Covode.recordClassIndex(3350);
    }

    public DownloadApi(AbstractC521356in abstractC521356in) {
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

    public final Flow<EcTask> getTaskState(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str);
        final Flow<Task> taskState = this.component.downloadApi().getTaskState(str);
        return new Flow<EcTask>() { // from class: cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3356);
            }

            /* renamed from: cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C07482 implements FlowCollector<Task> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApi$getTaskState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2", m135f = "DownloadApi.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07491 extends ContinuationImpl {
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
                        Covode.recordClassIndex(3358);
                    }

                    public C07491(Continuation continuation) {
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
                        return C07482.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(3357);
                }

                public C07482(FlowCollector flowCollector, DownloadApi$getTaskState$$inlined$map$1 downloadApi$getTaskState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApi$getTaskState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.entity.Task r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r6
                        r4 = 1
                        r2[r4] = r7
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1.C07482.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r0, r1, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r7 instanceof cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1.C07482.C07491
                        if (r0 == 0) goto L4f
                        r3 = r7
                        cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2$1 r3 = (cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1.C07482.C07491) r3
                        int r0 = r3.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L4f
                        int r0 = r3.label
                        int r0 = r0 - r1
                        r3.label = r0
                    L29:
                        java.lang.Object r1 = r3.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        if (r0 == 0) goto L3b
                        if (r0 != r4) goto L55
                        kotlin.ResultKt.throwOnFailure(r1)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.entity.Task r6 = (cn.ever.cloud.android.entity.Task) r6
                        cn.ever.cloud.sdk.entity.EcTask r0 = cn.ever.cloud.sdk.mapper.MapperKt.toEcTask(r6)
                        r3.label = r4
                        java.lang.Object r0 = r1.emit(r0, r3)
                        if (r0 != r2) goto L38
                        return r2
                    L4f:
                        cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2$1 r3 = new cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1$2$1
                        r3.<init>(r7)
                        goto L29
                    L55:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.sdk.api.DownloadApi$getTaskState$$inlined$map$1.C07482.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super EcTask> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07482(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public final Object cancel(String str, Continuation<? super Result<Unit>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new DownloadApi$cancel$2(this, str, null), continuation);
    }

    public final Object download(EcTaskReq ecTaskReq, Continuation<? super Result<Pair<String, List<String>>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ecTaskReq, continuation}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new DownloadApi$download$2(this, ecTaskReq, null), continuation);
    }

    public final Flow<EcTaskItem> getItemState(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        final Flow<TaskItem> itemState = this.component.downloadApi().getItemState(str, str2);
        return new Flow<EcTaskItem>() { // from class: cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(3353);
            }

            /* renamed from: cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C07462 implements FlowCollector<TaskItem> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApi$getItemState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2", m135f = "DownloadApi.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07471 extends ContinuationImpl {
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
                        Covode.recordClassIndex(3355);
                    }

                    public C07471(Continuation continuation) {
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
                        return C07462.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(3354);
                }

                public C07462(FlowCollector flowCollector, DownloadApi$getItemState$$inlined$map$1 downloadApi$getItemState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApi$getItemState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.entity.TaskItem r6, kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r6
                        r4 = 1
                        r2[r4] = r7
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1.C07462.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r5, r0, r1, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r7 instanceof cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1.C07462.C07471
                        if (r0 == 0) goto L4f
                        r3 = r7
                        cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2$1 r3 = (cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1.C07462.C07471) r3
                        int r0 = r3.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L4f
                        int r0 = r3.label
                        int r0 = r0 - r1
                        r3.label = r0
                    L29:
                        java.lang.Object r1 = r3.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        if (r0 == 0) goto L3b
                        if (r0 != r4) goto L55
                        kotlin.ResultKt.throwOnFailure(r1)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r5.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.entity.TaskItem r6 = (cn.ever.cloud.android.entity.TaskItem) r6
                        cn.ever.cloud.sdk.entity.EcTaskItem r0 = cn.ever.cloud.sdk.mapper.MapperKt.toEcTaskItem(r6)
                        r3.label = r4
                        java.lang.Object r0 = r1.emit(r0, r3)
                        if (r0 != r2) goto L38
                        return r2
                    L4f:
                        cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2$1 r3 = new cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1$2$1
                        r3.<init>(r7)
                        goto L29
                    L55:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.sdk.api.DownloadApi$getItemState$$inlined$map$1.C07462.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super EcTaskItem> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07462(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public final Object pauseAll(int i, Continuation<? super Result<Unit>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new DownloadApi$pauseAll$2(this, i, null), continuation);
    }

    public final Object resumeAll(int i, Continuation<? super Result<Unit>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), continuation}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapperKt.checkException(new DownloadApi$resumeAll$2(this, i, null), continuation);
    }
}
