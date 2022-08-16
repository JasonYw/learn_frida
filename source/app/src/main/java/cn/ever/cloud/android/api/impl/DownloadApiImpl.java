package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.api.DownloadApi;
import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import cn.ever.cloud.android.entity.TaskReq;
import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.p039a.AbstractC0680b;
import cn.ever.cloud.android.services.download.DownloadGroupEvent;
import cn.ever.cloud.android.services.download.DownloadItemEvent;
import cn.ever.cloud.android.services.download.DownloadService;
import cn.ever.cloud.android.services.task.TaskService;
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
import kotlinx.coroutines.flow.FlowKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadApiImpl implements DownloadApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final AbstractC0680b assetRepository;
    public final DownloadService downloadService;
    public final int kind = 2;
    public final TaskService taskService;

    static {
        Covode.recordClassIndex(2782);
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Flow<Task> getTaskState(final String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str);
        final Flow merge = FlowKt.merge(this.downloadService.groupEvent(), this.downloadService.droppableGroupEvent());
        final Flow<DownloadGroupEvent> flow = new Flow<DownloadGroupEvent>() { // from class: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2791);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06932 implements FlowCollector<DownloadGroupEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApiImpl$getTaskState$$inlined$filter$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2", m135f = "DownloadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C06941 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public Object L$5;
                    public Object L$6;
                    public int label;
                    public /* synthetic */ Object result;

                    static {
                        Covode.recordClassIndex(2793);
                    }

                    public C06941(Continuation continuation) {
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
                        return C06932.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2792);
                }

                public C06932(FlowCollector flowCollector, DownloadApiImpl$getTaskState$$inlined$filter$1 downloadApiImpl$getTaskState$$inlined$filter$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApiImpl$getTaskState$$inlined$filter$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.download.DownloadGroupEvent r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r7
                        r5 = 1
                        r2[r5] = r8
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1.C06932.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r0, r1, r5)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r8 instanceof cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1.C06932.C06941
                        if (r0 == 0) goto L62
                        r4 = r8
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2$1 r4 = (cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1.C06932.C06941) r4
                        int r0 = r4.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L62
                        int r0 = r4.label
                        int r0 = r0 - r1
                        r4.label = r0
                    L29:
                        java.lang.Object r1 = r4.result
                        java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r4.label
                        if (r0 == 0) goto L3b
                        if (r0 != r5) goto L68
                        kotlin.ResultKt.throwOnFailure(r1)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow$inlined
                        r0 = r7
                        cn.ever.cloud.android.services.task.entity.TaskGroupEvent r0 = (cn.ever.cloud.android.services.task.entity.TaskGroupEvent) r0
                        java.lang.String r1 = r0.getGroupKey()
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1 r0 = r6.this$0
                        java.lang.String r0 = r2
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L70
                        r4.label = r5
                        java.lang.Object r0 = r2.emit(r7, r4)
                        if (r0 != r3) goto L38
                        return r3
                    L62:
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2$1 r4 = new cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1$2$1
                        r4.<init>(r8)
                        goto L29
                    L68:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    L70:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$filter$1.C06932.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super DownloadGroupEvent> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06932(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        return new Flow<Task>() { // from class: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2794);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06952 implements FlowCollector<DownloadGroupEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApiImpl$getTaskState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2", m135f = "DownloadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C06961 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2796);
                    }

                    public C06961(Continuation continuation) {
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
                        return C06952.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2795);
                }

                public C06952(FlowCollector flowCollector, DownloadApiImpl$getTaskState$$inlined$map$1 downloadApiImpl$getTaskState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApiImpl$getTaskState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.download.DownloadGroupEvent r28, kotlin.coroutines.Continuation r29) {
                    /*
                        r27 = this;
                        r3 = r28
                        r6 = r27
                        r0 = 2
                        java.lang.Object[] r4 = new java.lang.Object[r0]
                        r1 = 0
                        r4[r1] = r3
                        r2 = 1
                        r5 = r29
                        r4[r2] = r5
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1.C06952.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r6, r0, r1, r2)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L1c
                        java.lang.Object r0 = r1.result
                        return r0
                    L1c:
                        boolean r0 = r5 instanceof cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1.C06952.C06961
                        if (r0 == 0) goto Le1
                        r0 = r5
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2$1 r0 = (cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1.C06952.C06961) r0
                        int r1 = r0.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r4
                        if (r1 == 0) goto Le1
                        int r1 = r0.label
                        int r1 = r1 - r4
                        r0.label = r1
                    L2f:
                        java.lang.Object r5 = r0.result
                        java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r0.label
                        if (r1 == 0) goto L41
                        if (r1 != r2) goto Le8
                        kotlin.ResultKt.throwOnFailure(r5)
                    L3e:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L41:
                        kotlin.ResultKt.throwOnFailure(r5)
                        kotlinx.coroutines.flow.FlowCollector r5 = r6.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.services.download.DownloadGroupEvent r3 = (cn.ever.cloud.android.services.download.DownloadGroupEvent) r3
                        java.lang.String r17 = r3.getGroupKey()
                        int r18 = r3.getTaskKind()
                        cn.ever.cloud.android.services.task.entity.TaskState r1 = r3.getState()
                        int r19 = cn.ever.cloud.android.entity.TaskItemKt.toState(r1)
                        cn.ever.cloud.android.entity.TaskProgress r20 = new cn.ever.cloud.android.entity.TaskProgress
                        java.util.List r21 = r3.getRunningItems()
                        java.util.List r1 = r3.getFailedItems()
                        int r22 = r1.size()
                        int r23 = r3.getItemDone()
                        int r24 = r3.getItemTotal()
                        cn.ever.cloud.android.services.task.entity.ItemProgress r1 = r3.getItemProgress()
                        long r6 = r1.getDoneBytes()
                        java.lang.Long r25 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                        cn.ever.cloud.android.services.task.entity.ItemProgress r1 = r3.getItemProgress()
                        long r6 = r1.getTotalBytes()
                        java.lang.Long r26 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
                        r20.<init>(r21, r22, r23, r24, r25, r26)
                        java.util.List r7 = r3.getFailedItems()
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r6 = 10
                        int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, r6)
                        r1.<init>(r6)
                        java.util.Iterator r7 = r7.iterator()
                    L9c:
                        boolean r6 = r7.hasNext()
                        if (r6 == 0) goto Lc7
                        java.lang.Object r6 = r7.next()
                        cn.ever.cloud.android.services.upload.FailedItem r6 = (cn.ever.cloud.android.services.upload.FailedItem) r6
                        cn.ever.cloud.android.entity.TaskItem r8 = new cn.ever.cloud.android.entity.TaskItem
                        java.lang.String r9 = r3.getGroupKey()
                        java.lang.String r10 = r6.getItemKey()
                        r11 = 4
                        java.lang.Integer r12 = r6.getErrCode()
                        java.lang.String r13 = r6.getErrMsg()
                        r14 = 0
                        r15 = 32
                        r16 = 0
                        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
                        r1.add(r8)
                        goto L9c
                    Lc7:
                        java.util.List r1 = (java.util.List) r1
                        java.util.List r22 = r3.getCompletePaths()
                        cn.ever.cloud.android.entity.Task r3 = new cn.ever.cloud.android.entity.Task
                        r23 = 0
                        r21 = r1
                        r16 = r3
                        r16.<init>(r17, r18, r19, r20, r21, r22, r23)
                        r0.label = r2
                        java.lang.Object r0 = r5.emit(r3, r0)
                        if (r0 != r4) goto L3e
                        return r4
                    Le1:
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2$1 r0 = new cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1$2$1
                        r0.<init>(r5)
                        goto L2f
                    Le8:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.DownloadApiImpl$getTaskState$$inlined$map$1.C06952.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Task> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06952(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Object cancel(String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new DownloadApiImpl$cancel$2(this, str, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Object download(TaskReq taskReq, Continuation<? super Pair<String, ? extends List<String>>> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskReq, continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return BizExceptionKt.checkException(new DownloadApiImpl$download$2(this, taskReq, null), continuation);
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Flow<TaskItem> getItemState(final String str, final String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        final Flow<DownloadItemEvent> itemEvent = this.downloadService.itemEvent();
        final Flow<DownloadItemEvent> flow = new Flow<DownloadItemEvent>() { // from class: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2785);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06892 implements FlowCollector<DownloadItemEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApiImpl$getItemState$$inlined$filter$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2", m135f = "DownloadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C06901 extends ContinuationImpl {
                    public static ChangeQuickRedirect changeQuickRedirect;
                    public Object L$0;
                    public Object L$1;
                    public Object L$2;
                    public Object L$3;
                    public Object L$4;
                    public Object L$5;
                    public Object L$6;
                    public int label;
                    public /* synthetic */ Object result;

                    static {
                        Covode.recordClassIndex(2787);
                    }

                    public C06901(Continuation continuation) {
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
                        return C06892.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2786);
                }

                public C06892(FlowCollector flowCollector, DownloadApiImpl$getItemState$$inlined$filter$1 downloadApiImpl$getItemState$$inlined$filter$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApiImpl$getItemState$$inlined$filter$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.download.DownloadItemEvent r9, kotlin.coroutines.Continuation r10) {
                    /*
                        r8 = this;
                        r0 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r6 = 0
                        r1[r6] = r9
                        r4 = 1
                        r1[r4] = r10
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1.C06892.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r6, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r10 instanceof cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1.C06892.C06901
                        if (r0 == 0) goto L73
                        r3 = r10
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2$1 r3 = (cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1.C06892.C06901) r3
                        int r0 = r3.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L73
                        int r0 = r3.label
                        int r0 = r0 - r1
                        r3.label = r0
                    L29:
                        java.lang.Object r1 = r3.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        if (r0 == 0) goto L3b
                        if (r0 != r4) goto L79
                        kotlin.ResultKt.throwOnFailure(r1)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r5 = r8.$this_unsafeFlow$inlined
                        r7 = r9
                        cn.ever.cloud.android.services.task.entity.TaskItemEvent r7 = (cn.ever.cloud.android.services.task.entity.TaskItemEvent) r7
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1 r0 = r8.this$0
                        java.lang.String r1 = r2
                        java.lang.String r0 = r7.getGroupKey()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                        if (r0 == 0) goto L60
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1 r0 = r8.this$0
                        java.lang.String r1 = r3
                        java.lang.String r0 = r7.getItemKey()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                        if (r0 == 0) goto L60
                        r6 = 1
                    L60:
                        java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
                        boolean r0 = r0.booleanValue()
                        if (r0 == 0) goto L81
                        r3.label = r4
                        java.lang.Object r0 = r5.emit(r9, r3)
                        if (r0 != r2) goto L38
                        return r2
                    L73:
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2$1 r3 = new cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1$2$1
                        r3.<init>(r10)
                        goto L29
                    L79:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    L81:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$filter$1.C06892.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super DownloadItemEvent> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06892(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        return new Flow<TaskItem>() { // from class: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2788);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06912 implements FlowCollector<DownloadItemEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ DownloadApiImpl$getItemState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2", m135f = "DownloadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C06921 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2790);
                    }

                    public C06921(Continuation continuation) {
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
                        return C06912.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2789);
                }

                public C06912(FlowCollector flowCollector, DownloadApiImpl$getItemState$$inlined$map$1 downloadApiImpl$getItemState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = downloadApiImpl$getItemState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.download.DownloadItemEvent r13, kotlin.coroutines.Continuation r14) {
                    /*
                        r12 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r13
                        r3 = 1
                        r2[r3] = r14
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1.C06912.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r12, r0, r1, r3)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r14 instanceof cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1.C06912.C06921
                        if (r0 == 0) goto L83
                        r2 = r14
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2$1 r2 = (cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1.C06912.C06921) r2
                        int r0 = r2.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L83
                        int r0 = r2.label
                        int r0 = r0 - r1
                        r2.label = r0
                    L29:
                        java.lang.Object r4 = r2.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r2.label
                        if (r0 == 0) goto L3b
                        if (r0 != r3) goto L89
                        kotlin.ResultKt.throwOnFailure(r4)
                    L38:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3b:
                        kotlin.ResultKt.throwOnFailure(r4)
                        kotlinx.coroutines.flow.FlowCollector r4 = r12.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.services.download.DownloadItemEvent r13 = (cn.ever.cloud.android.services.download.DownloadItemEvent) r13
                        cn.ever.cloud.android.entity.TaskItem r5 = new cn.ever.cloud.android.entity.TaskItem
                        java.lang.String r0 = r13.getGroupKey()
                        java.lang.String r6 = cn.ever.cloud.utils.KotlinExtKt.getOrDefault(r0)
                        java.lang.String r7 = r13.getItemKey()
                        cn.ever.cloud.android.services.task.entity.TaskState r0 = r13.getState()
                        int r8 = cn.ever.cloud.android.entity.TaskItemKt.toState(r0)
                        cn.ever.cloud.utils.error.EpError r0 = r13.getError()
                        r10 = 0
                        if (r0 == 0) goto L81
                        int r0 = r0.getCode()
                        java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                    L67:
                        cn.ever.cloud.utils.error.EpError r0 = r13.getError()
                        if (r0 == 0) goto L71
                        java.lang.String r10 = r0.getHumanMessage()
                    L71:
                        java.lang.String r11 = r13.getCompletePath()
                        r5.<init>(r6, r7, r8, r9, r10, r11)
                        r2.label = r3
                        java.lang.Object r0 = r4.emit(r5, r2)
                        if (r0 != r1) goto L38
                        return r1
                    L81:
                        r9 = r10
                        goto L67
                    L83:
                        cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2$1 r2 = new cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1$2$1
                        r2.<init>(r14)
                        goto L29
                    L89:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.DownloadApiImpl$getItemState$$inlined$map$1.C06912.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super TaskItem> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06912(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Object pauseAll(Integer num, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num, continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new DownloadApiImpl$pauseAll$2(this, num, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.DownloadApi
    public final Object resumeAll(Integer num, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new DownloadApiImpl$resumeAll$2(this, num, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    public DownloadApiImpl(DownloadService downloadService, AbstractC0680b abstractC0680b, TaskService taskService) {
        C106862S5w.LIZ(downloadService, abstractC0680b, taskService);
        this.downloadService = downloadService;
        this.assetRepository = abstractC0680b;
        this.taskService = taskService;
    }
}
