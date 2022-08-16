package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.p039a.AbstractC0683e;
import cn.ever.cloud.android.services.task.TaskProvider;
import cn.ever.cloud.android.services.task.entity.PauseCancellationException;
import cn.ever.cloud.android.services.task.entity.PauseReason;
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
import cn.ever.cloud.utils.CollectKt;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.SharedFlow;
import p003X.AbstractC521266ie;
import p003X.C106862S5w;
import p003X.C521316ij;

/* loaded from: classes23.dex */
public final class UploadService implements TaskProvider {
    public static final C521316ij Companion = new C521316ij((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final UploadEventProcessor eventProcessor;
    public final AbstractC0683e repo;
    public ScheduleSignal scheduleSignal;
    public final SdkScope scope;
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> taskEventProcessor;
    public final Uploader uploader;
    public final Map<Long, Job> uploadingItems = Collections.synchronizedMap(new TreeMap());

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            Covode.recordClassIndex(3145);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Running.ordinal()] = 2;
            int[] iArr2 = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$1[TaskState.Pause.ordinal()] = 2;
            $EnumSwitchMapping$1[TaskState.Failed.ordinal()] = 3;
            $EnumSwitchMapping$1[TaskState.Running.ordinal()] = 4;
            int[] iArr3 = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$2[TaskState.Running.ordinal()] = 2;
            $EnumSwitchMapping$2[TaskState.Deleted.ordinal()] = 3;
            $EnumSwitchMapping$2[TaskState.Failed.ordinal()] = 4;
            $EnumSwitchMapping$2[TaskState.Succeeded.ordinal()] = 5;
            $EnumSwitchMapping$2[TaskState.Pause.ordinal()] = 6;
        }
    }

    static {
        Covode.recordClassIndex(3144);
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final int taskKind() {
        return 1;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final TaskEventProcessor<TaskGroupEvent, TaskItemEvent> getTaskEventProcessor() {
        return this.taskEventProcessor;
    }

    public final SharedFlow<C0728b> droppableGroupEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (SharedFlow) proxy.result;
        }
        return this.eventProcessor.getDroppableGroupEvent();
    }

    public final SharedFlow<C0728b> groupEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (SharedFlow) proxy.result;
        }
        return this.eventProcessor.getGroupEvent();
    }

    public final SharedFlow<UploadItemEvent> itemEvent() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (SharedFlow) proxy.result;
        }
        return this.eventProcessor.getItemEvent();
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final ProviderKey uniqueKey() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
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

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean cancelItem(TaskItem taskItem, boolean z) {
        CancellationException cancellationException;
        boolean z2 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem);
        Job remove = this.uploadingItems.remove(Long.valueOf(taskItem.getId()));
        if (remove != null) {
            if (!z) {
                cancellationException = new PauseCancellationException();
            } else {
                cancellationException = null;
            }
            remove.cancel(cancellationException);
            z2 = true;
        }
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("UploadService", "cancel item=" + taskItem + ", isRemove=" + z + ", cancel result=" + z2);
        return z2;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final List<TaskItem> createTaskItems(TaskBag taskBag, Function0<Long> function0) {
        TaskState taskState;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskBag, function0}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(taskBag, function0);
        TreeSet collect = CollectKt.collect(SequencesKt___SequencesKt.mapNotNull(CollectionsKt___CollectionsKt.asSequence(taskBag), UploadService$createTaskItems$idsScheduled$1.INSTANCE).iterator());
        List<UploadTaskItem> itemsToSchedule = this.repo.getItemsToSchedule();
        ArrayList arrayList = new ArrayList();
        for (UploadTaskItem uploadTaskItem : itemsToSchedule) {
            if (!collect.contains(Long.valueOf(uploadTaskItem.getId()))) {
                long longValue = function0.mo30099invoke().longValue();
                int i = WhenMappings.$EnumSwitchMapping$0[uploadTaskItem.getStatus().ordinal()];
                if (i != 1 && i != 2) {
                    taskState = uploadTaskItem.getStatus();
                } else {
                    taskState = TaskState.Waiting;
                }
                TaskParam taskParam = new TaskParam();
                taskParam.getInner().put(UploadTaskItemId.class, new UploadTaskItemId(uploadTaskItem.getId()));
                arrayList.add(new TaskItem(longValue, taskKind(), uploadTaskItem.getMedia().getItemKey(), uniqueKey(), Long.valueOf(uploadTaskItem.getGroupId()), uploadTaskItem.getGroupKey(), taskParam, Resource.Companion.ioUp(1), taskState, uploadTaskItem.getPauseReason(), uploadTaskItem.getError(), CollectionsKt__CollectionsKt.emptyList()));
            }
        }
        return arrayList;
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final void onItemStateChanged(TaskState taskState, TaskItem taskItem) {
        UploadTaskItemId uploadTaskItemId;
        if (PatchProxy.proxy(new Object[]{taskState, taskItem}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskState, taskItem);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20555d("UploadService", "state changed from " + taskState + " to " + taskItem.getState() + ", item=" + taskItem);
        Object obj = taskItem.getParams().getInner().get(UploadTaskItemId.class);
        if (obj != null && (uploadTaskItemId = (UploadTaskItemId) obj) != null) {
            long inner = uploadTaskItemId.getInner();
            switch (taskItem.getState()) {
                case Running:
                    this.repo.markTaskItemUploading(inner);
                    return;
                case Deleted:
                    this.repo.markTaskItemCancelled(inner);
                    return;
                case Failed:
                    this.repo.markTaskItemFailed(inner, taskItem.getError());
                    return;
                case Succeeded:
                    return;
                case Pause:
                    PauseReason reason = taskItem.getReason();
                    if (reason != null) {
                        this.repo.markTaskItemPaused(inner, reason);
                        return;
                    }
                    LogHelper logHelper2 = LogHelper.INSTANCE;
                    logHelper2.m20554e("UploadService", "item: " + taskItem + " paused with no reason.");
                    return;
                default:
                    return;
            }
        }
        LogHelper logHelper3 = LogHelper.INSTANCE;
        logHelper3.m20554e("UploadService", "cannot get UploadTaskItemId from item=" + taskItem);
    }

    @Override // cn.ever.cloud.android.services.task.TaskProvider
    public final boolean process(TaskItem taskItem, AbstractC521266ie abstractC521266ie) {
        UploadTaskItemId uploadTaskItemId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem, abstractC521266ie}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(taskItem, abstractC521266ie);
        LogHelper logHelper = LogHelper.INSTANCE;
        logHelper.m20553i("UploadService", "process item=" + taskItem);
        Object obj = taskItem.getParams().getInner().get(UploadTaskItemId.class);
        if (obj != null && (uploadTaskItemId = (UploadTaskItemId) obj) != null) {
            UploadTaskItem taskItem2 = this.repo.getTaskItem(uploadTaskItemId.getInner());
            if (taskItem2 == null) {
                LogHelper logHelper2 = LogHelper.INSTANCE;
                logHelper2.m20554e("UploadService", "Cannot find item from upload repo via id:" + uploadTaskItemId.getInner() + ", check your code.");
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[taskItem2.getStatus().ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        LogHelper logHelper3 = LogHelper.INSTANCE;
                        logHelper3.m20554e("UploadService", "UploadTaskItem " + taskItem2 + " cannot be processed because its state:" + taskItem2.getStatus());
                        return false;
                    } else if (this.uploadingItems.containsKey(Long.valueOf(taskItem.getId()))) {
                        return false;
                    }
                } else {
                    LogHelper logHelper4 = LogHelper.INSTANCE;
                    logHelper4.m20553i("UploadService", "failed item is retrying now: " + uploadTaskItemId);
                }
            }
            long id = taskItem.getId();
            Job launch$default = SdkScope.launch$default(this.scope, null, new UploadService$process$job$1(this, taskItem2, abstractC521266ie, taskItem, null), 1, null);
            launch$default.invokeOnCompletion(new UploadService$process$1(this, taskItem, abstractC521266ie, id));
            Map<Long, Job> map = this.uploadingItems;
            Intrinsics.checkNotNullExpressionValue(map, "");
            map.put(Long.valueOf(id), launch$default);
            return true;
        }
        LogHelper logHelper5 = LogHelper.INSTANCE;
        logHelper5.m20554e("UploadService", "Found item has no param UploadItemId, make sure UploadItemId has been put into params, and task kind is correct! " + taskItem);
        return false;
    }

    public UploadService(Uploader uploader, AbstractC0683e abstractC0683e, SdkScope sdkScope) {
        C106862S5w.LIZ(uploader, abstractC0683e, sdkScope);
        this.uploader = uploader;
        this.repo = abstractC0683e;
        this.scope = sdkScope;
        this.eventProcessor = new UploadEventProcessor(this.scope);
        this.taskEventProcessor = this.eventProcessor;
    }

    public final void onError(AbstractC521266ie abstractC521266ie, Throwable th, TaskItem taskItem) {
        EpError epError;
        String str;
        if (PatchProxy.proxy(new Object[]{abstractC521266ie, th, taskItem}, this, changeQuickRedirect, false, 12).isSupported) {
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
        abstractC521266ie.onError(UploadEventBag.Companion.error(taskItem, epError), epError);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object upload(java.lang.Long r20, java.lang.String r21, java.util.List<cn.ever.cloud.android.services.upload.UploadMedia> r22, kotlin.coroutines.Continuation<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.upload.UploadService.upload(java.lang.Long, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object upload$default(UploadService uploadService, Long l, String str, List list, Continuation continuation, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadService, l, str, list, continuation, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if ((i & 1) != 0) {
            l = null;
        }
        return uploadService.upload(l, str, list, continuation);
    }
}
