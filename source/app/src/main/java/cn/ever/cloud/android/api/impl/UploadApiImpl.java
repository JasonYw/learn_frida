package cn.ever.cloud.android.api.impl;

import cn.ever.cloud.android.api.UploadApi;
import cn.ever.cloud.android.entity.Task;
import cn.ever.cloud.android.entity.TaskItem;
import cn.ever.cloud.android.exception.BizExceptionKt;
import cn.ever.cloud.android.services.task.TaskService;
import cn.ever.cloud.android.services.upload.C0728b;
import cn.ever.cloud.android.services.upload.UploadItemEvent;
import cn.ever.cloud.android.services.upload.UploadService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadApiImpl implements UploadApi {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int kind = 1;
    public final TaskService taskService;
    public final UploadService uploadService;

    static {
        Covode.recordClassIndex(2803);
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Flow<TaskItem> getItemState() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        final SharedFlow<UploadItemEvent> itemEvent = this.uploadService.itemEvent();
        return new Flow<TaskItem>() { // from class: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2808);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06992 implements FlowCollector<UploadItemEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UploadApiImpl$getItemState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07001 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2810);
                    }

                    public C07001(Continuation continuation) {
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
                        return C06992.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2809);
                }

                public C06992(FlowCollector flowCollector, UploadApiImpl$getItemState$$inlined$map$1 uploadApiImpl$getItemState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = uploadApiImpl$getItemState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.upload.UploadItemEvent r15, kotlin.coroutines.Continuation r16) {
                    /*
                        r14 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r15
                        r4 = 1
                        r5 = r16
                        r2[r4] = r5
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1.C06992.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r14, r0, r1, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L18
                        java.lang.Object r0 = r1.result
                        return r0
                    L18:
                        boolean r0 = r5 instanceof cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1.C06992.C07001
                        if (r0 == 0) goto L8d
                        r3 = r5
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2$1 r3 = (cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1.C06992.C07001) r3
                        int r0 = r3.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L8d
                        int r0 = r3.label
                        int r0 = r0 - r1
                        r3.label = r0
                    L2b:
                        java.lang.Object r1 = r3.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        if (r0 == 0) goto L3d
                        if (r0 != r4) goto L93
                        kotlin.ResultKt.throwOnFailure(r1)
                    L3a:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3d:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r14.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.services.upload.UploadItemEvent r15 = (cn.ever.cloud.android.services.upload.UploadItemEvent) r15
                        cn.ever.cloud.android.entity.TaskItem r5 = new cn.ever.cloud.android.entity.TaskItem
                        java.lang.String r0 = r15.getGroupKey()
                        java.lang.String r6 = cn.ever.cloud.utils.KotlinExtKt.getOrDefault(r0)
                        java.lang.String r7 = r15.getItemKey()
                        cn.ever.cloud.android.services.task.entity.TaskState r0 = r15.getState()
                        int r8 = cn.ever.cloud.android.entity.TaskItemKt.toState(r0)
                        cn.ever.cloud.android.services.upload.UploadEventBag r0 = r15.getEventBag()
                        cn.ever.cloud.utils.error.EpError r0 = r0.getError()
                        r10 = 0
                        if (r0 == 0) goto L8b
                        int r0 = r0.getCode()
                        java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                    L6d:
                        cn.ever.cloud.android.services.upload.UploadEventBag r0 = r15.getEventBag()
                        cn.ever.cloud.utils.error.EpError r0 = r0.getError()
                        if (r0 == 0) goto L7b
                        java.lang.String r10 = r0.getHumanMessage()
                    L7b:
                        r11 = 0
                        r12 = 32
                        r13 = 0
                        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                        r3.label = r4
                        java.lang.Object r0 = r1.emit(r5, r3)
                        if (r0 != r2) goto L3a
                        return r2
                    L8b:
                        r9 = r10
                        goto L6d
                    L8d:
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2$1 r3 = new cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1$2$1
                        r3.<init>(r5)
                        goto L2b
                    L93:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$1.C06992.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super TaskItem> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06992(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Flow<Task> getTaskState(final String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str);
        final Flow merge = FlowKt.merge(FlowKt.onSubscription(this.uploadService.groupEvent(), new UploadApiImpl$getTaskState$1(this, str, null)), this.uploadService.droppableGroupEvent());
        final Flow<C0728b> flow = new Flow<C0728b>() { // from class: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2815);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2 */
            /* loaded from: classes23.dex */
            public static final class C07032 implements FlowCollector<C0728b> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UploadApiImpl$getTaskState$$inlined$filter$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07041 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2817);
                    }

                    public C07041(Continuation continuation) {
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
                        return C07032.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2816);
                }

                public C07032(FlowCollector flowCollector, UploadApiImpl$getTaskState$$inlined$filter$1 uploadApiImpl$getTaskState$$inlined$filter$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = uploadApiImpl$getTaskState$$inlined$filter$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.upload.C0728b r7, kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r7
                        r5 = 1
                        r2[r5] = r8
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1.C07032.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r0, r1, r5)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r8 instanceof cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1.C07032.C07041
                        if (r0 == 0) goto L62
                        r4 = r8
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2$1 r4 = (cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1.C07032.C07041) r4
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
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1 r0 = r6.this$0
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
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2$1 r4 = new cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$filter$1.C07032.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super C0728b> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07032(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        return new Flow<Task>() { // from class: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2818);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2 */
            /* loaded from: classes23.dex */
            public static final class C07052 implements FlowCollector<C0728b> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UploadApiImpl$getTaskState$$inlined$map$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07061 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2820);
                    }

                    public C07061(Continuation continuation) {
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
                        return C07052.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2819);
                }

                public C07052(FlowCollector flowCollector, UploadApiImpl$getTaskState$$inlined$map$1 uploadApiImpl$getTaskState$$inlined$map$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = uploadApiImpl$getTaskState$$inlined$map$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.upload.C0728b r28, kotlin.coroutines.Continuation r29) {
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
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1.C07052.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r4, r6, r0, r1, r2)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L1c
                        java.lang.Object r0 = r1.result
                        return r0
                    L1c:
                        boolean r0 = r5 instanceof cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1.C07052.C07061
                        if (r0 == 0) goto Ldf
                        r0 = r5
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2$1 r0 = (cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1.C07052.C07061) r0
                        int r1 = r0.label
                        r4 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r4
                        if (r1 == 0) goto Ldf
                        int r1 = r0.label
                        int r1 = r1 - r4
                        r0.label = r1
                    L2f:
                        java.lang.Object r5 = r0.result
                        java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r0.label
                        if (r1 == 0) goto L41
                        if (r1 != r2) goto Le6
                        kotlin.ResultKt.throwOnFailure(r5)
                    L3e:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L41:
                        kotlin.ResultKt.throwOnFailure(r5)
                        kotlinx.coroutines.flow.FlowCollector r5 = r6.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.services.task.entity.TaskGroupEvent r3 = (cn.ever.cloud.android.services.task.entity.TaskGroupEvent) r3
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
                        cn.ever.cloud.android.entity.Task r3 = new cn.ever.cloud.android.entity.Task
                        r22 = 0
                        r23 = 0
                        r21 = r1
                        r16 = r3
                        r16.<init>(r17, r18, r19, r20, r21, r22, r23)
                        r0.label = r2
                        java.lang.Object r0 = r5.emit(r3, r0)
                        if (r0 != r4) goto L3e
                        return r4
                    Ldf:
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2$1 r0 = new cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1$2$1
                        r0.<init>(r5)
                        goto L2f
                    Le6:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.UploadApiImpl$getTaskState$$inlined$map$1.C07052.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super Task> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07052(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public UploadApiImpl(UploadService uploadService, TaskService taskService) {
        C106862S5w.LIZ(uploadService, taskService);
        this.uploadService = uploadService;
        this.taskService = taskService;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object cancel(String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$cancel$2(this, str, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Flow<TaskItem> getItemState(final String str, final String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        final SharedFlow onSubscription = FlowKt.onSubscription(this.uploadService.itemEvent(), new UploadApiImpl$getItemState$2(this, str, str2, null));
        final Flow<TaskItem> flow = new Flow<TaskItem>() { // from class: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2811);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2 */
            /* loaded from: classes23.dex */
            public static final class C07012 implements FlowCollector<UploadItemEvent> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UploadApiImpl$getItemState$$inlined$map$2 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2$1 */
                /* loaded from: classes23.dex */
                public static final class C07021 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2813);
                    }

                    public C07021(Continuation continuation) {
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
                        return C07012.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2812);
                }

                public C07012(FlowCollector flowCollector, UploadApiImpl$getItemState$$inlined$map$2 uploadApiImpl$getItemState$$inlined$map$2) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = uploadApiImpl$getItemState$$inlined$map$2;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.services.upload.UploadItemEvent r15, kotlin.coroutines.Continuation r16) {
                    /*
                        r14 = this;
                        r0 = 2
                        java.lang.Object[] r2 = new java.lang.Object[r0]
                        r1 = 0
                        r2[r1] = r15
                        r4 = 1
                        r5 = r16
                        r2[r4] = r5
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2.C07012.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r14, r0, r1, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L18
                        java.lang.Object r0 = r1.result
                        return r0
                    L18:
                        boolean r0 = r5 instanceof cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2.C07012.C07021
                        if (r0 == 0) goto L8d
                        r3 = r5
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2$1 r3 = (cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2.C07012.C07021) r3
                        int r0 = r3.label
                        r1 = -2147483648(0xffffffff80000000, float:-0.0)
                        r0 = r0 & r1
                        if (r0 == 0) goto L8d
                        int r0 = r3.label
                        int r0 = r0 - r1
                        r3.label = r0
                    L2b:
                        java.lang.Object r1 = r3.result
                        java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        if (r0 == 0) goto L3d
                        if (r0 != r4) goto L93
                        kotlin.ResultKt.throwOnFailure(r1)
                    L3a:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    L3d:
                        kotlin.ResultKt.throwOnFailure(r1)
                        kotlinx.coroutines.flow.FlowCollector r1 = r14.$this_unsafeFlow$inlined
                        cn.ever.cloud.android.services.upload.UploadItemEvent r15 = (cn.ever.cloud.android.services.upload.UploadItemEvent) r15
                        cn.ever.cloud.android.entity.TaskItem r5 = new cn.ever.cloud.android.entity.TaskItem
                        java.lang.String r0 = r15.getGroupKey()
                        java.lang.String r6 = cn.ever.cloud.utils.KotlinExtKt.getOrDefault(r0)
                        java.lang.String r7 = r15.getItemKey()
                        cn.ever.cloud.android.services.task.entity.TaskState r0 = r15.getState()
                        int r8 = cn.ever.cloud.android.entity.TaskItemKt.toState(r0)
                        cn.ever.cloud.android.services.upload.UploadEventBag r0 = r15.getEventBag()
                        cn.ever.cloud.utils.error.EpError r0 = r0.getError()
                        r10 = 0
                        if (r0 == 0) goto L8b
                        int r0 = r0.getCode()
                        java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r0)
                    L6d:
                        cn.ever.cloud.android.services.upload.UploadEventBag r0 = r15.getEventBag()
                        cn.ever.cloud.utils.error.EpError r0 = r0.getError()
                        if (r0 == 0) goto L7b
                        java.lang.String r10 = r0.getHumanMessage()
                    L7b:
                        r11 = 0
                        r12 = 32
                        r13 = 0
                        r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
                        r3.label = r4
                        java.lang.Object r0 = r1.emit(r5, r3)
                        if (r0 != r2) goto L3a
                        return r2
                    L8b:
                        r9 = r10
                        goto L6d
                    L8d:
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2$1 r3 = new cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2$2$1
                        r3.<init>(r5)
                        goto L2b
                    L93:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r0)
                        throw r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$map$2.C07012.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super TaskItem> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C07012(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
        return new Flow<TaskItem>() { // from class: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(2805);
            }

            /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2 */
            /* loaded from: classes23.dex */
            public static final class C06972 implements FlowCollector<TaskItem> {
                public static ChangeQuickRedirect changeQuickRedirect;
                public final /* synthetic */ FlowCollector $this_unsafeFlow$inlined;
                public final /* synthetic */ UploadApiImpl$getItemState$$inlined$filter$1 this$0;

                @DebugMetadata(m136c = "cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2", m135f = "UploadApiImpl.kt", m134i = {}, m133l = {135}, m132m = "emit", m131n = {}, m130s = {})
                /* renamed from: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2$1 */
                /* loaded from: classes23.dex */
                public static final class C06981 extends ContinuationImpl {
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
                        Covode.recordClassIndex(2807);
                    }

                    public C06981(Continuation continuation) {
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
                        return C06972.this.emit(null, this);
                    }
                }

                static {
                    Covode.recordClassIndex(2806);
                }

                public C06972(FlowCollector flowCollector, UploadApiImpl$getItemState$$inlined$filter$1 uploadApiImpl$getItemState$$inlined$filter$1) {
                    this.$this_unsafeFlow$inlined = flowCollector;
                    this.this$0 = uploadApiImpl$getItemState$$inlined$filter$1;
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x003b  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(cn.ever.cloud.android.entity.TaskItem r9, kotlin.coroutines.Continuation r10) {
                    /*
                        r8 = this;
                        r0 = 2
                        java.lang.Object[] r1 = new java.lang.Object[r0]
                        r6 = 0
                        r1[r6] = r9
                        r4 = 1
                        r1[r4] = r10
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1.C06972.changeQuickRedirect
                        com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r8, r0, r6, r4)
                        boolean r0 = r1.isSupported
                        if (r0 == 0) goto L16
                        java.lang.Object r0 = r1.result
                        return r0
                    L16:
                        boolean r0 = r10 instanceof cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1.C06972.C06981
                        if (r0 == 0) goto L73
                        r3 = r10
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2$1 r3 = (cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1.C06972.C06981) r3
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
                        cn.ever.cloud.android.entity.TaskItem r7 = (cn.ever.cloud.android.entity.TaskItem) r7
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1 r0 = r8.this$0
                        java.lang.String r1 = r2
                        java.lang.String r0 = r7.getTaskKey()
                        boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
                        if (r0 == 0) goto L60
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1 r0 = r8.this$0
                        java.lang.String r1 = r3
                        java.lang.String r0 = r7.getAssetId()
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
                        cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2$1 r3 = new cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1$2$1
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
                    throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.api.impl.UploadApiImpl$getItemState$$inlined$filter$1.C06972.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector<? super TaskItem> flowCollector, Continuation continuation) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{flowCollector, continuation}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    return proxy2.result;
                }
                Object collect = Flow.this.collect(new C06972(flowCollector, this), continuation);
                if (collect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    return collect;
                }
                return Unit.INSTANCE;
            }
        };
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object pause(String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$pause$2(this, str, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object pauseAll(Integer num, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num, continuation}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$pauseAll$2(this, num, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object resume(String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$resume$2(this, str, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object resumeAll(Integer num, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num, continuation}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$resumeAll$2(this, num, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }

    @Override // cn.ever.cloud.android.api.UploadApi
    public final Object retry(String str, List<String> list, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list, continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object checkException = BizExceptionKt.checkException(new UploadApiImpl$retry$2(this, list, str, null), continuation);
        if (checkException == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return checkException;
        }
        return Unit.INSTANCE;
    }
}
