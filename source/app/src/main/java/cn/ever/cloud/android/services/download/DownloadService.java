package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.TaskProvider;
import cn.ever.cloud.android.services.task.entity.PauseCancellationException;
import cn.ever.cloud.android.services.task.entity.ProviderKey;
import cn.ever.cloud.android.services.task.entity.Resource;
import cn.ever.cloud.android.services.task.entity.ScheduleSignal;
import cn.ever.cloud.android.services.task.entity.TaskBag;
import cn.ever.cloud.android.services.task.entity.TaskEventProcessor;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import cn.ever.cloud.android.services.task.entity.TaskParam;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.KotlinExtKt;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import p003X.AbstractC521266ie;
import p003X.AbstractC521276if;
import p003X.C106862S5w;
import p003X.C521296ih;

/* loaded from: classes23.dex */
public final class DownloadService implements TaskProvider {
    public static final C521296ih Companion = new C521296ih((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final Downloader downloader;
    public final DownloadEventProcessor eventProcessor;
    public ScheduleSignal scheduleSignal;
    public final SdkScope scope;
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> taskEventProcessor;
    public final AbstractC521276if repo = new DownloadTaskRepoImpl();
    public final Map<Long, List<Long>> cloudIdToTaskItemIds = Collections.synchronizedMap(new HashMap());
    public final Map<Long, Job> downloadingItems = Collections.synchronizedMap(new TreeMap());

    static {
        Covode.recordClassIndex(3009);
    }

    public final void setup() {
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final int taskKind() {
        return 2;
    }

    public final void tearDown() {
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> getTaskEventProcessor() {
        return this.taskEventProcessor;
    }

    public final Flow<DownloadGroupEvent> droppableGroupEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.eventProcessor.getDroppableGroupEvent();
    }

    public final Flow<DownloadGroupEvent> groupEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.eventProcessor.getGroupEvent();
    }

    public final Flow<DownloadItemEvent> itemEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Flow) proxy.result;
        }
        return this.eventProcessor.getItemEvent();
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final ProviderKey uniqueKey() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (ProviderKey) proxy.result;
        }
        return new ProviderKey(new Long[]{Long.valueOf(taskKind())});
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final void onRegistered(ScheduleSignal scheduleSignal) {
        if (PatchProxy.proxy(new Object[]{scheduleSignal}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(scheduleSignal);
        TaskProvider.DefaultImpls.onRegistered(this, scheduleSignal);
        this.scheduleSignal = scheduleSignal;
    }

    private final List<Long> getTaskItemsForCloudId(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return new ArrayList(KotlinExtKt.getOrDefault(this.cloudIdToTaskItemIds.get(Long.valueOf(j))));
    }

    public DownloadService(SdkScope sdkScope, Downloader downloader) {
        C106862S5w.LIZ(sdkScope, downloader);
        this.scope = sdkScope;
        this.downloader = downloader;
        this.eventProcessor = new DownloadEventProcessor(this.scope);
        this.taskEventProcessor = this.eventProcessor;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final void onItemStateChanged(TaskState taskState, TaskItem taskItem) {
        if (PatchProxy.proxy(new Object[]{taskState, taskItem}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskState, taskItem);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("DownloadService", "onItemStateChanged, oldState=" + taskState + ", taskItem=" + taskItem);
    }

    private final void insertTaskItemsForCloudId(long j, long j2) {
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        List<Long> list = this.cloudIdToTaskItemIds.get(Long.valueOf(j));
        if (list == null) {
            list = new ArrayList<>();
            Map<Long, List<Long>> map = this.cloudIdToTaskItemIds;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(Long.valueOf(j), list);
        }
        list.add(Long.valueOf(j2));
    }

    public final void deleteTaskItemForCloudId(long j, long j2) {
        List<Long> list;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, this, changeQuickRedirect, false, 13).isSupported && (list = this.cloudIdToTaskItemIds.get(Long.valueOf(j))) != null) {
            CollectionsKt__MutableCollectionsKt.removeAll((List) list, (Function1) new DownloadService$deleteTaskItemForCloudId$$inlined$let$lambda$1(this, j2, j));
            if (list.isEmpty()) {
                this.cloudIdToTaskItemIds.remove(Long.valueOf(j));
            }
        }
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean cancelItem(TaskItem taskItem, boolean z) {
        PauseCancellationException pauseCancellationException;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem);
        Job remove = this.downloadingItems.remove(Long.valueOf(taskItem.getId()));
        DownloadMedia downloadMedia = null;
        if (remove != null) {
            if (!z) {
                pauseCancellationException = new PauseCancellationException();
            } else {
                pauseCancellationException = null;
            }
            remove.cancel((CancellationException) pauseCancellationException);
            z2 = true;
        }
        Object obj = taskItem.getParams().getInner().get(DownloadMedia.class);
        if (obj != null) {
            downloadMedia = (DownloadMedia) obj;
        }
        if (downloadMedia != null) {
            deleteTaskItemForCloudId(downloadMedia.getCloudId(), taskItem.getId());
        } else {
            LogHelper.INSTANCE.m20554e("DownloadService", "Found item has no param DownloadMedia, make sure DownloadMedia has been put into params, and task kind is correct! " + taskItem);
        }
        LogHelper.INSTANCE.m20553i("DownloadService", "cancel item=" + taskItem + ", isRemove=" + z + ", cancel result=" + z2);
        return z2;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final List<TaskItem> createTaskItems(TaskBag taskBag, Function0<Long> function0) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskBag, function0}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(taskBag, function0);
        List<DownloadTaskItem> andRemoveItemsToSchedule = this.repo.getAndRemoveItemsToSchedule();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(andRemoveItemsToSchedule, 10));
        for (DownloadTaskItem downloadTaskItem : andRemoveItemsToSchedule) {
            long longValue = function0.mo30099invoke().longValue();
            DownloadMedia media = downloadTaskItem.getMedia();
            TaskParam taskParam = new TaskParam();
            HashMap<Class<?>, Object> inner = taskParam.getInner();
            if (media != null) {
                inner.put(DownloadMedia.class, media);
                taskParam.getInner().put(DownloadCompleteExtra.class, new DownloadCompleteExtra(media.getTargetPath()));
                List<Long> taskItemsForCloudId = getTaskItemsForCloudId(media.getCloudId());
                insertTaskItemsForCloudId(media.getCloudId(), longValue);
                arrayList.add(new TaskItem(longValue, taskKind(), media.getItemKey(), uniqueKey(), Long.valueOf(downloadTaskItem.getGroupId()), downloadTaskItem.getGroupKey(), taskParam, Resource.Companion.ioDown(1), TaskState.Waiting, null, null, taskItemsForCloudId));
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
            }
        }
        return arrayList;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean process(TaskItem taskItem, AbstractC521266ie abstractC521266ie) {
        DownloadMedia downloadMedia;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, abstractC521266ie}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem, abstractC521266ie);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("DownloadService", "process item=" + taskItem);
        Object obj = taskItem.getParams().getInner().get(DownloadMedia.class);
        if (obj != null && (downloadMedia = (DownloadMedia) obj) != null) {
            long id = taskItem.getId();
            Job launch$default = SdkScope.launch$default(this.scope, null, new DownloadService$process$job$1(this, downloadMedia, abstractC521266ie, taskItem, null), 1, null);
            launch$default.invokeOnCompletion(new DownloadService$process$1(this, taskItem, abstractC521266ie, id, downloadMedia));
            Map<Long, Job> map = this.downloadingItems;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(Long.valueOf(id), launch$default);
            return true;
        }
        LogHelper logHelper2 = LogHelper.INSTANCE;
        logHelper2.m20554e("DownloadService", "Found item has no param DownloadMedia, make sure DownloadMedia has been put into params, and task kind is correct! " + taskItem);
        return false;
    }

    public final void onError(AbstractC521266ie abstractC521266ie, Throwable th, TaskItem taskItem) {
        EpError epError;
        String str;
        if (PatchProxy.proxy(new Object[]{abstractC521266ie, th, taskItem}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        if (!(th instanceof EpError)) {
            ClientError.Companion companion = ClientError.Companion;
            if (th != null) {
                str = th.getMessage();
            } else {
                str = null;
            }
            epError = companion.internal(str);
        } else {
            epError = (EpError) th;
        }
        abstractC521266ie.onError(DownloadEventBag.Companion.error(taskItem, epError), epError);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object download(java.lang.String r17, java.util.List<cn.ever.cloud.android.services.download.DownloadMedia> r18, kotlin.coroutines.Continuation<? super kotlin.Unit> r19) {
        /*
            r16 = this;
            r4 = r16
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r8 = 0
            r15 = r17
            r2[r8] = r15
            r3 = 1
            r7 = r18
            r2[r3] = r7
            r0 = 2
            r5 = r19
            r2[r0] = r5
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = cn.ever.cloud.android.services.download.DownloadService.changeQuickRedirect
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r4, r1, r8, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.result
            return r0
        L22:
            boolean r0 = r5 instanceof cn.ever.cloud.android.services.download.DownloadService$download$1
            if (r0 == 0) goto Ldd
            r2 = r5
            cn.ever.cloud.android.services.download.DownloadService$download$1 r2 = (cn.ever.cloud.android.services.download.DownloadService$download$1) r2
            int r0 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto Ldd
            int r0 = r2.label
            int r0 = r0 - r1
            r2.label = r0
        L35:
            java.lang.Object r5 = r2.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r2.label
            if (r0 == 0) goto L47
            if (r0 != r3) goto Le4
            kotlin.ResultKt.throwOnFailure(r5)
        L44:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L47:
            kotlin.ResultKt.throwOnFailure(r5)
            cn.ever.cloud.utils.IdGenerator r0 = cn.ever.cloud.utils.IdGenerator.INSTANCE
            long r13 = r0.gen(r8)
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r7.iterator()
        L5f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7c
            java.lang.Object r12 = r6.next()
            cn.ever.cloud.android.services.download.DownloadMedia r12 = (cn.ever.cloud.android.services.download.DownloadMedia) r12
            cn.ever.cloud.android.services.download.DownloadTaskItem r9 = new cn.ever.cloud.android.services.download.DownloadTaskItem
            cn.ever.cloud.utils.IdGenerator r0 = cn.ever.cloud.utils.IdGenerator.INSTANCE
            long r10 = r0.gen(r8)
            r0 = r9
            r9.<init>(r10, r12, r13, r15)
            r5.add(r0)
            r8 = 0
            goto L5f
        L7c:
            java.util.List r5 = (java.util.List) r5
            X.6if r0 = r4.repo
            java.util.List r9 = r0.batchInsert(r5)
            cn.ever.cloud.utils.LogHelper r6 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r0 = r9.size()
            r5.append(r0)
            java.lang.String r0 = " task items have been inserted into repo."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r8 = "DownloadService"
            r6.m20553i(r8, r0)
            int r5 = r9.size()
            int r0 = r7.size()
            if (r5 == r0) goto Ld0
            cn.ever.cloud.utils.LogHelper r6 = cn.ever.cloud.utils.LogHelper.INSTANCE
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            int r0 = r7.size()
            r5.append(r0)
            java.lang.String r0 = " medias wanted but inserted "
            r5.append(r0)
            int r0 = r9.size()
            r5.append(r0)
            java.lang.String r0 = " tasks."
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            r6.m20554e(r8, r0)
        Ld0:
            cn.ever.cloud.android.services.task.entity.ScheduleSignal r0 = r4.scheduleSignal
            if (r0 == 0) goto L44
            r2.label = r3
            java.lang.Object r0 = r0.notify(r2)
            if (r0 != r1) goto L44
            return r1
        Ldd:
            cn.ever.cloud.android.services.download.DownloadService$download$1 r2 = new cn.ever.cloud.android.services.download.DownloadService$download$1
            r2.<init>(r4, r5)
            goto L35
        Le4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.download.DownloadService.download(java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
