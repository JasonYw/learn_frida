package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.coroutine.SdkScope;
import cn.ever.cloud.android.services.task.TaskRepository;
import cn.ever.cloud.android.services.task.entity.Command;
import cn.ever.cloud.android.services.task.entity.Context;
import cn.ever.cloud.android.services.task.entity.DefaultTaskItemProcessListener;
import cn.ever.cloud.android.services.task.entity.EventBagWrapper;
import cn.ever.cloud.android.services.task.entity.EventBagWrapperKt;
import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.task.entity.ProviderKey;
import cn.ever.cloud.android.services.task.entity.Resource;
import cn.ever.cloud.android.services.task.entity.ScheduleTaskItemAction;
import cn.ever.cloud.android.services.task.entity.TaskBag;
import cn.ever.cloud.android.services.task.entity.TaskEventProcessor;
import cn.ever.cloud.android.services.task.entity.TaskGroup;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.utils.LogHelper;
import cn.ever.cloud.utils.error.ClientError;
import cn.ever.cloud.utils.error.ErrorCode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import p003X.C106862S5w;
import p003X.C521326ik;

/* loaded from: classes23.dex */
public final class TaskService {
    public static final C521326ik Companion = new C521326ik((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final SdkScope scope;
    public final Channel<Command> commandChannel = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
    public final TaskRepository repo = new TaskRepository();
    public final IdGen idGen = new IdGen(0);
    public final List<TaskProvider> providers = new ArrayList();

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            Covode.recordClassIndex(3050);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Succeeded.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Deleted.ordinal()] = 2;
            int[] iArr2 = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[TaskState.Succeeded.ordinal()] = 1;
            $EnumSwitchMapping$1[TaskState.Deleted.ordinal()] = 2;
            int[] iArr3 = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$2 = iArr3;
            iArr3[TaskState.Waiting.ordinal()] = 1;
            $EnumSwitchMapping$2[TaskState.Running.ordinal()] = 2;
            int[] iArr4 = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$3 = iArr4;
            iArr4[TaskState.Running.ordinal()] = 1;
            $EnumSwitchMapping$3[TaskState.Waiting.ordinal()] = 2;
            $EnumSwitchMapping$3[TaskState.Pause.ordinal()] = 3;
        }
    }

    static {
        Covode.recordClassIndex(3048);
    }

    public final void setup() {
    }

    public final void tearDown() {
    }

    /* loaded from: classes23.dex */
    public static final class IdGen {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final AtomicLong counter;

        static {
            Covode.recordClassIndex(3049);
        }

        public final long gen() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Long) proxy.result).longValue();
            }
            return this.counter.getAndAdd(1L);
        }

        public IdGen(long j) {
            this.counter = new AtomicLong(j);
        }
    }

    public TaskService(SdkScope sdkScope) {
        C106862S5w.LIZ(sdkScope);
        this.scope = sdkScope;
    }

    public final void startCommandLoop(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = context;
        SdkScope.launch$default(this.scope, null, new TaskService$startCommandLoop$1(this, objectRef, null), 1, null);
    }

    private final TaskBag getAllForKind(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 23);
        if (proxy.isSupported) {
            return (TaskBag) proxy.result;
        }
        List<TaskItem> all = this.repo.getAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : all) {
            if (((TaskItem) obj).getKind() == i) {
                arrayList.add(obj);
            }
        }
        return new TaskBag(arrayList);
    }

    private final TaskGroup getLatestTaskGroup(int i, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 24);
        if (proxy.isSupported) {
            return (TaskGroup) proxy.result;
        }
        List<TaskGroup> latestGroups = this.repo.getLatestGroups(i, str);
        if (latestGroups != null) {
            return (TaskGroup) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) latestGroups);
        }
        return null;
    }

    public final TaskProvider get(List<? extends TaskProvider> list, ProviderKey providerKey) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, providerKey}, this, changeQuickRedirect, false, 22);
        if (proxy.isSupported) {
            return (TaskProvider) proxy.result;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((TaskProvider) obj).uniqueKey(), providerKey)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (TaskProvider) obj;
    }

    public final TaskGroup getLatestAliveTaskGroupId(int i, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (TaskGroup) proxy.result;
        }
        C106862S5w.LIZ(str);
        return this.repo.getLatestAliveGroup(i, str);
    }

    public final Object register(TaskProvider taskProvider, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskProvider, continuation}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Object send = this.commandChannel.send(new Command.RegisterProviderCommand(taskProvider), continuation);
        if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return send;
        }
        return Unit.INSTANCE;
    }

    private final List<TaskItem> getTaskGroupItems(int i, String str) {
        ArrayList<Long> taskItems;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 25);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if ((latestAliveTaskGroupId != null || (latestAliveTaskGroupId = getLatestTaskGroup(i, str)) != null) && (taskItems = latestAliveTaskGroupId.getTaskItems()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Number number : taskItems) {
                TaskItem taskItem = this.repo.get(number.longValue());
                if (taskItem != null) {
                    arrayList.add(taskItem);
                }
            }
            return arrayList;
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final boolean triggerTaskGroupEvent(int i, String str) {
        TaskProvider taskProvider;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if (latestAliveTaskGroupId != null || (latestAliveTaskGroupId = getLatestTaskGroup(i, str)) != null) {
            Iterator<Long> it = latestAliveTaskGroupId.getTaskItems().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Long next = it.next();
                TaskRepository taskRepository = this.repo;
                Intrinsics.checkNotNullExpressionValue(next, "");
                TaskItem taskItem = taskRepository.get(next.longValue());
                if (taskItem != null) {
                    ProviderKey providerKey = taskItem.getProviderKey();
                    if (providerKey != null && (taskProvider = get(this.providers, providerKey)) != null) {
                        updateProgressAndSendGroupProgress(latestAliveTaskGroupId.getId(), taskProvider, false);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void triggerTaskItemEvent(int i, String str, String str2) {
        ProviderKey providerKey;
        TaskProvider taskProvider;
        TaskEventProcessor<TaskGroupEvent, TaskItemEvent> taskEventProcessor;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        TaskItem taskItem = getTaskItem(i, str, str2);
        if (taskItem != null && (providerKey = taskItem.getProviderKey()) != null && (taskProvider = get(this.providers, providerKey)) != null && (taskEventProcessor = taskProvider.getTaskEventProcessor()) != null) {
            taskEventProcessor.sendTaskItemEvent(taskItem);
        }
    }

    private final TaskItem getTaskItem(int i, String str, String str2) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (TaskItem) proxy.result;
        }
        Iterator<T> it = getTaskGroupItems(i, str).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((TaskItem) obj).getItemKey(), str2)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (TaskItem) obj;
    }

    public final Object cancelByGroupKey(int i, String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, continuation}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if (latestAliveTaskGroupId != null) {
            Object send = this.commandChannel.send(new Command.TaskItemRemoveCommand(latestAliveTaskGroupId.getTaskItems()), continuation);
            if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
            return Unit.INSTANCE;
        }
        throw new ClientError(ErrorCode.CLIENT_UPLOAD_GROUP_NOT_EXISTS);
    }

    public final Object pauseByGroupKey(int i, String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, continuation}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if (latestAliveTaskGroupId != null) {
            Object send = this.commandChannel.send(new Command.TaskItemPauseCommand(latestAliveTaskGroupId.getTaskItems(), PauseReason.Manual), continuation);
            if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
            return Unit.INSTANCE;
        }
        throw new ClientError(ErrorCode.CLIENT_UPLOAD_GROUP_NOT_EXISTS);
    }

    public final Object pauseKind(int i, Integer num, Continuation<? super Unit> continuation) {
        PauseReason pauseReason;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, continuation}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskBag<TaskItem> allForKind = getAllForKind(i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allForKind, 10));
        for (TaskItem taskItem : allForKind) {
            arrayList.add(Boxing.boxLong(taskItem.getId()));
        }
        ArrayList arrayList2 = arrayList;
        if (num == null || (pauseReason = PauseReason.Companion.from(num.intValue())) == null) {
            pauseReason = PauseReason.Unknown;
        }
        Object send = this.commandChannel.send(new Command.TaskItemPauseCommand(arrayList2, pauseReason), continuation);
        if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return send;
        }
        return Unit.INSTANCE;
    }

    public final Object resumeByGroupKey(int i, String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, continuation}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if (latestAliveTaskGroupId != null) {
            Object send = this.commandChannel.send(new Command.TaskItemPauseCommand(latestAliveTaskGroupId.getTaskItems(), PauseReason.Manual), continuation);
            if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
            return Unit.INSTANCE;
        }
        throw new ClientError(ErrorCode.CLIENT_UPLOAD_GROUP_NOT_EXISTS);
    }

    public final Object resumeKind(int i, Integer num, Continuation<? super Unit> continuation) {
        PauseReason pauseReason;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), num, continuation}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskBag<TaskItem> allForKind = getAllForKind(i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allForKind, 10));
        for (TaskItem taskItem : allForKind) {
            arrayList.add(Boxing.boxLong(taskItem.getId()));
        }
        ArrayList arrayList2 = arrayList;
        if (num == null || (pauseReason = PauseReason.Companion.from(num.intValue())) == null) {
            pauseReason = PauseReason.Unknown;
        }
        Object send = this.commandChannel.send(new Command.TaskItemResumeCommand(arrayList2, pauseReason), continuation);
        if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return send;
        }
        return Unit.INSTANCE;
    }

    public final Object retryByGroupKey(int i, String str, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, continuation}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return proxy.result;
        }
        TaskGroup latestAliveTaskGroupId = getLatestAliveTaskGroupId(i, str);
        if (latestAliveTaskGroupId != null) {
            Object send = this.commandChannel.send(new Command.TaskItemRetryCommand(latestAliveTaskGroupId.getTaskItems()), continuation);
            if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
            return Unit.INSTANCE;
        }
        throw new ClientError(ErrorCode.CLIENT_UPLOAD_GROUP_NOT_EXISTS);
    }

    public final void updateProgressAndSendGroupProgress(long j, TaskProvider taskProvider, boolean z) {
        TaskRepository.GroupItemsPair itemsForGroup;
        if (PatchProxy.proxy(new Object[]{new Long(j), taskProvider, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 16).isSupported || (itemsForGroup = this.repo.getItemsForGroup(j)) == null) {
            return;
        }
        TaskGroup group = itemsForGroup.getGroup();
        List<TaskItem> items = itemsForGroup.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (((TaskItem) obj).getState() != TaskState.Deleted) {
                arrayList.add(obj);
            }
        }
        TaskEventProcessor<TaskGroupEvent, TaskItemEvent> taskEventProcessor = taskProvider.getTaskEventProcessor();
        taskEventProcessor.sendTaskGroupEvent(taskEventProcessor.groupEventAggregator().mo25254aggregateGroupEvent(group, arrayList), z);
    }

    public final List<Pair<Long, ProviderKey>> schedule(List<? extends TaskProvider> list, Context context, ScheduleTaskItemAction scheduleTaskItemAction) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list, context, scheduleTaskItemAction}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        Resource resource = context.getResource();
        TaskBag taskBag = new TaskBag(this.repo.getAll());
        for (TaskProvider taskProvider : list) {
            List<TaskItem> createTaskItems = taskProvider.createTaskItems(taskBag.taskBagForKind(taskProvider.taskKind()), new TaskService$schedule$provideNewItems$1(this));
            ArrayList arrayList = new ArrayList();
            for (Object obj : createTaskItems) {
                TaskItem taskItem = (TaskItem) obj;
                if (taskItem.getState() == TaskState.Running) {
                    LogHelper logHelper = LogHelper.INSTANCE;
                    logHelper.m20554e("TaskService", "A new task item " + taskItem + " from provider must have a non-running state. Check provider.");
                }
                if (this.repo.insertIfAbsent(taskItem)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList;
            LogHelper logHelper2 = LogHelper.INSTANCE;
            logHelper2.m20553i("TaskService", "create taskItems: " + arrayList2.size());
            taskBag.merge(new TaskBag(arrayList2));
        }
        List<TaskItem> running = taskBag.getRunning();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(running, 10));
        for (TaskItem taskItem2 : running) {
            arrayList3.add(Long.valueOf(taskItem2.getId()));
        }
        List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3);
        List<TaskItem> running2 = taskBag.getRunning();
        Resource zero = Resource.Companion.zero();
        for (TaskItem taskItem3 : running2) {
            zero.add(taskItem3.getCost());
        }
        Resource subtract = resource.subtract(zero);
        LogHelper logHelper3 = LogHelper.INSTANCE;
        logHelper3.m20553i("TaskService", "fr resource t" + resource + " l" + subtract + " task_item r" + taskBag.getRunning().size() + " w" + taskBag.getWaiting().size() + " f" + taskBag.getFailed().size() + " p" + taskBag.getPaused().size() + " c" + taskBag.getCompleted().size());
        ArrayList<TaskItem> arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList<Pair> arrayList6 = new ArrayList();
        ArrayList<TaskItem> arrayList7 = new ArrayList();
        for (TaskItem taskItem4 : taskBag) {
            if (scheduleTaskItemAction.getItemIdsToRemove().contains(Long.valueOf(taskItem4.getId()))) {
                arrayList7.add(taskItem4);
            } else if (taskItem4.getState().ableToSchedule()) {
                if (get(list, taskItem4.getProviderKey()) == null) {
                    arrayList7.add(taskItem4);
                } else {
                    PauseReason pauseReason = scheduleTaskItemAction.getItemIdsToPause().get(Long.valueOf(taskItem4.getId()));
                    if (pauseReason != null) {
                        arrayList6.add(new Pair(taskItem4, pauseReason));
                    } else {
                        int i = WhenMappings.$EnumSwitchMapping$2[taskItem4.getState().ordinal()];
                        if (i != 1) {
                            if (i != 2) {
                                LogHelper.INSTANCE.m20554e("TaskService", "else state branch, should not reach here.");
                            }
                        } else {
                            if (!taskItem4.getDependencies().isEmpty()) {
                                List<Long> dependencies = taskItem4.getDependencies();
                                if (!(dependencies instanceof Collection) || !dependencies.isEmpty()) {
                                    for (Number number : dependencies) {
                                        if (mutableList.contains(Long.valueOf(number.longValue()))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            if (subtract.gte(taskItem4.getCost())) {
                                mutableList.add(Long.valueOf(taskItem4.getId()));
                                arrayList4.add(taskItem4);
                                subtract = subtract.subtract(taskItem4.getCost());
                            }
                        }
                    }
                }
            }
        }
        LogHelper logHelper4 = LogHelper.INSTANCE;
        logHelper4.m20553i("TaskService", "to resource t" + resource + " l" + subtract + " task_item +r" + arrayList4.size() + " +w" + arrayList5.size() + " +p" + arrayList6.size() + " +d" + arrayList7.size());
        List<Long> updatedItemIds = scheduleTaskItemAction.getUpdatedItemIds();
        ArrayList arrayList8 = new ArrayList();
        for (Number number2 : updatedItemIds) {
            TaskItem taskItem5 = this.repo.get(number2.longValue());
            if (taskItem5 != null) {
                arrayList8.add(taskItem5);
            }
        }
        Map map = MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.mapNotNull(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(CollectionsKt___CollectionsKt.asSequence(arrayList4), CollectionsKt___CollectionsKt.asSequence(arrayList5)), SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(arrayList6), TaskService$schedule$groupsToRefresh$1.INSTANCE)), CollectionsKt___CollectionsKt.asSequence(arrayList7)), CollectionsKt___CollectionsKt.asSequence(arrayList8)), TaskService$schedule$groupsToRefresh$2.INSTANCE));
        for (TaskItem taskItem6 : arrayList7) {
            TaskProvider taskProvider2 = get(list, taskItem6.getProviderKey());
            if (taskProvider2 != null && updateAndNotifyProvider(this.repo, taskItem6.getId(), taskProvider2, EventBagWrapperKt.EventBagWrapper$default(2, null, 2, null), TaskService$schedule$2$updated$1.INSTANCE)) {
                taskProvider2.cancelItem(taskItem6, true);
            }
        }
        for (Pair pair : arrayList6) {
            long id = ((TaskItem) pair.getFirst()).getId();
            PauseReason pauseReason2 = (PauseReason) pair.getSecond();
            TaskProvider taskProvider3 = get(list, ((TaskItem) pair.getFirst()).getProviderKey());
            if (taskProvider3 != null && updateAndNotifyProvider(this.repo, id, taskProvider3, EventBagWrapperKt.EventBagWrapper$default(2, null, 2, null), new TaskService$schedule$$inlined$let$lambda$1(this, id, pauseReason2, pair))) {
                taskProvider3.cancelItem((TaskItem) pair.getFirst(), false);
            }
        }
        for (TaskItem taskItem7 : arrayList4) {
            TaskProvider taskProvider4 = get(list, taskItem7.getProviderKey());
            if (taskProvider4 == null) {
                LogHelper.INSTANCE.m20554e("TaskService", "there is no provider for kind, skip this task");
            } else if (taskProvider4.process(taskItem7, new DefaultTaskItemProcessListener(this.scope, this.commandChannel, this.repo, new TaskService$schedule$processListener$1(this, taskProvider4)))) {
                updateAndNotifyProvider(this.repo, taskItem7.getId(), taskProvider4, EventBagWrapperKt.EventBagWrapper$default(2, null, 2, null), TaskService$schedule$4.INSTANCE);
            } else {
                LogHelper logHelper5 = LogHelper.INSTANCE;
                logHelper5.m20553i("TaskService", taskItem7 + " skip process.");
            }
        }
        return CollectionsKt___CollectionsKt.toList(map.values());
    }

    private final boolean updateAndNotifyProviderInner(TaskRepository taskRepository, long j, Function1<? super TaskItem, TaskItem> function1, Function2<? super TaskState, ? super TaskItem, Unit> function2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskRepository, new Long(j), function1, function2}, this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = null;
        boolean update = taskRepository.update(j, new TaskService$updateAndNotifyProviderInner$updated$1(objectRef, function1, objectRef2));
        if (update && objectRef.element != 0 && objectRef2.element != 0) {
            Object obj = objectRef.element;
            Intrinsics.checkNotNull(obj);
            Object obj2 = objectRef2.element;
            Intrinsics.checkNotNull(obj2);
            function2.invoke(obj, obj2);
        }
        return update;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object cancelItems(int r9, java.lang.String r10, java.util.List<java.lang.String> r11, kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            r8 = this;
            r0 = 4
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1 = 0
            r2[r1] = r0
            r4 = 1
            r2[r4] = r10
            r0 = 2
            r2[r0] = r11
            r0 = 3
            r2[r0] = r12
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = cn.ever.cloud.android.services.task.TaskService.changeQuickRedirect
            r5 = 10
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r0, r1, r5)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.result
            return r0
        L22:
            boolean r0 = r12 instanceof cn.ever.cloud.android.services.task.TaskService$cancelItems$1
            if (r0 == 0) goto Lba
            r3 = r12
            cn.ever.cloud.android.services.task.TaskService$cancelItems$1 r3 = (cn.ever.cloud.android.services.task.TaskService$cancelItems$1) r3
            int r0 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto Lba
            int r0 = r3.label
            int r0 = r0 - r1
            r3.label = r0
        L35:
            java.lang.Object r1 = r3.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 == 0) goto L47
            if (r0 != r4) goto Lc1
            kotlin.ResultKt.throwOnFailure(r1)
        L44:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L47:
            kotlin.ResultKt.throwOnFailure(r1)
            java.util.List r0 = r8.getTaskGroupItems(r9, r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r0.iterator()
        L57:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r1 = r6.next()
            r0 = r1
            cn.ever.cloud.android.services.task.entity.TaskItem r0 = (cn.ever.cloud.android.services.task.entity.TaskItem) r0
            java.lang.String r0 = r0.getItemKey()
            boolean r0 = r11.contains(r0)
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L57
            r7.add(r1)
            goto L57
        L7a:
            java.util.List r7 = (java.util.List) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            int r0 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r7, r5)
            r6.<init>(r0)
            java.util.Iterator r5 = r7.iterator()
        L89:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r5.next()
            cn.ever.cloud.android.services.task.entity.TaskItem r0 = (cn.ever.cloud.android.services.task.entity.TaskItem) r0
            long r0 = r0.getId()
            java.lang.Long r0 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r0)
            r6.add(r0)
            goto L89
        La1:
            java.util.List r6 = (java.util.List) r6
            boolean r0 = r6.isEmpty()
            r0 = r0 ^ r4
            if (r0 == 0) goto L44
            kotlinx.coroutines.channels.Channel<cn.ever.cloud.android.services.task.entity.Command> r1 = r8.commandChannel
            cn.ever.cloud.android.services.task.entity.Command$TaskItemRemoveCommand r0 = new cn.ever.cloud.android.services.task.entity.Command$TaskItemRemoveCommand
            r0.<init>(r6)
            r3.label = r4
            java.lang.Object r0 = r1.send(r0, r3)
            if (r0 != r2) goto L44
            return r2
        Lba:
            cn.ever.cloud.android.services.task.TaskService$cancelItems$1 r3 = new cn.ever.cloud.android.services.task.TaskService$cancelItems$1
            r3.<init>(r8, r12)
            goto L35
        Lc1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.ever.cloud.android.services.task.TaskService.cancelItems(int, java.lang.String, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object retryItems(int i, String str, List<String> list, Continuation<? super Unit> continuation) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, list, continuation}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return proxy.result;
        }
        List<TaskItem> taskGroupItems = getTaskGroupItems(i, str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : taskGroupItems) {
            if (Boxing.boxBoolean(list.contains(((TaskItem) obj).getItemKey())).booleanValue()) {
                arrayList.add(obj);
            }
        }
        ArrayList<TaskItem> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        for (TaskItem taskItem : arrayList2) {
            arrayList3.add(Boxing.boxLong(taskItem.getId()));
        }
        ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            Object send = this.commandChannel.send(new Command.TaskItemRetryCommand(arrayList4), continuation);
            if (send == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return send;
            }
            return Unit.INSTANCE;
        }
        throw new ClientError(ErrorCode.CLIENT_UPLOAD_TASKS_EMPTY);
    }

    private final boolean updateAndNotifyProvider(TaskRepository taskRepository, long j, TaskProvider taskProvider, EventBagWrapper eventBagWrapper, Function1<? super TaskItem, TaskItem> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskRepository, new Long(j), taskProvider, eventBagWrapper, function1}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return updateAndNotifyProviderInner(taskRepository, j, function1, new TaskService$updateAndNotifyProvider$2(taskProvider, eventBagWrapper));
    }

    public final boolean updateAndNotifyProvider(TaskRepository taskRepository, long j, List<? extends TaskProvider> list, EventBagWrapper eventBagWrapper, Function1<? super TaskItem, TaskItem> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskRepository, new Long(j), list, eventBagWrapper, function1}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return updateAndNotifyProviderInner(taskRepository, j, function1, new TaskService$updateAndNotifyProvider$1(this, list, eventBagWrapper));
    }

    public static /* synthetic */ boolean updateAndNotifyProvider$default(TaskService taskService, TaskRepository taskRepository, long j, TaskProvider taskProvider, EventBagWrapper eventBagWrapper, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskService, taskRepository, new Long(j), taskProvider, eventBagWrapper, function1, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((i & 4) != 0) {
            eventBagWrapper = EventBagWrapperKt.EventBagWrapper$default(0, null, 2, null);
        }
        return taskService.updateAndNotifyProvider(taskRepository, j, taskProvider, eventBagWrapper, function1);
    }

    public static /* synthetic */ boolean updateAndNotifyProvider$default(TaskService taskService, TaskRepository taskRepository, long j, List list, EventBagWrapper eventBagWrapper, Function1 function1, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskService, taskRepository, new Long(j), list, eventBagWrapper, function1, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if ((i & 4) != 0) {
            eventBagWrapper = EventBagWrapperKt.EventBagWrapper$default(0, null, 2, null);
        }
        return taskService.updateAndNotifyProvider(taskRepository, j, list, eventBagWrapper, function1);
    }
}
