package cn.ever.cloud.android.services.task;

import cn.ever.cloud.android.services.task.entity.TaskGroup;
import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskRepository {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final TreeMap<Long, TaskItem> store = new TreeMap<>();
    public final TreeMap<KindGroupKeyPair, List<Long>> groupKeyToId = new TreeMap<>();
    public final TreeMap<Long, TaskGroup> groups = new TreeMap<>();

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(3047);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Running.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Failed.ordinal()] = 2;
            $EnumSwitchMapping$0[TaskState.Pause.ordinal()] = 3;
        }
    }

    static {
        Covode.recordClassIndex(3044);
    }

    /* loaded from: classes23.dex */
    public static final class GroupItemsPair {
        public final TaskGroup group;
        public final List<TaskItem> items;

        static {
            Covode.recordClassIndex(3045);
        }

        public final TaskGroup getGroup() {
            return this.group;
        }

        public final List<TaskItem> getItems() {
            return this.items;
        }

        public GroupItemsPair(TaskGroup taskGroup, List<TaskItem> list) {
            C106862S5w.LIZ(taskGroup, list);
            this.group = taskGroup;
            this.items = list;
        }
    }

    /* loaded from: classes23.dex */
    public static final class KindGroupKeyPair implements Comparable<KindGroupKeyPair> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final String groupKey;
        public final int kind;

        static {
            Covode.recordClassIndex(3046);
        }

        public final String getGroupKey() {
            return this.groupKey;
        }

        public final int getKind() {
            return this.kind;
        }

        @Override // java.lang.Comparable
        public final int compareTo(KindGroupKeyPair kindGroupKeyPair) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{kindGroupKeyPair}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            C106862S5w.LIZ(kindGroupKeyPair);
            int compare = Intrinsics.compare(this.kind, kindGroupKeyPair.kind);
            if (compare == 0) {
                return this.groupKey.compareTo(kindGroupKeyPair.groupKey);
            }
            return compare;
        }

        public KindGroupKeyPair(int i, String str) {
            C106862S5w.LIZ(str);
            this.kind = i;
            this.groupKey = str;
        }
    }

    public final synchronized List<TaskItem> getAll() {
        MethodCollector.m14708i(208);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            List<TaskItem> list = (List) proxy.result;
            MethodCollector.m14707o(208);
            return list;
        }
        ArrayList arrayList = new ArrayList(this.store.values());
        MethodCollector.m14707o(208);
        return arrayList;
    }

    public final synchronized TaskItem get(long j) {
        MethodCollector.m14708i(209);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            TaskItem taskItem = (TaskItem) proxy.result;
            MethodCollector.m14707o(209);
            return taskItem;
        }
        TaskItem taskItem2 = this.store.get(Long.valueOf(j));
        MethodCollector.m14707o(209);
        return taskItem2;
    }

    public final synchronized GroupItemsPair getItemsForGroup(long j) {
        MethodCollector.m14708i(215);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            GroupItemsPair groupItemsPair = (GroupItemsPair) proxy.result;
            MethodCollector.m14707o(215);
            return groupItemsPair;
        }
        TaskGroup taskGroup = this.groups.get(Long.valueOf(j));
        if (taskGroup != null) {
            ArrayList<Long> taskItems = taskGroup.getTaskItems();
            ArrayList arrayList = new ArrayList();
            for (Number number : taskItems) {
                TaskItem taskItem = this.store.get(Long.valueOf(number.longValue()));
                if (taskItem != null) {
                    arrayList.add(taskItem);
                }
            }
            GroupItemsPair groupItemsPair2 = new GroupItemsPair(taskGroup, arrayList);
            MethodCollector.m14707o(215);
            return groupItemsPair2;
        }
        MethodCollector.m14707o(215);
        return null;
    }

    public final synchronized boolean insertIfAbsent(TaskItem taskItem) {
        MethodCollector.m14708i(213);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(213);
            return booleanValue;
        }
        C106862S5w.LIZ(taskItem);
        if (get(taskItem.getId()) == null) {
            insert(taskItem);
            MethodCollector.m14707o(213);
            return true;
        }
        MethodCollector.m14707o(213);
        return false;
    }

    public final synchronized TaskItem insert(TaskItem taskItem) {
        MethodCollector.m14708i(212);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            TaskItem taskItem2 = (TaskItem) proxy.result;
            MethodCollector.m14707o(212);
            return taskItem2;
        }
        C106862S5w.LIZ(taskItem);
        Long groupId = taskItem.getGroupId();
        String groupKey = taskItem.getGroupKey();
        if (groupId != null && groupKey != null && groupKey.length() != 0) {
            TreeMap<KindGroupKeyPair, List<Long>> treeMap = this.groupKeyToId;
            KindGroupKeyPair kindGroupKeyPair = new KindGroupKeyPair(taskItem.getKind(), groupKey);
            List<Long> list = treeMap.get(kindGroupKeyPair);
            if (list == null) {
                list = new ArrayList<>();
                treeMap.put(kindGroupKeyPair, list);
            }
            List<Long> list2 = list;
            if (!list2.contains(groupId)) {
                list2.add(groupId);
            }
            TaskGroup taskGroup = this.groups.get(groupId);
            if (taskGroup != null || (taskGroup = this.groups.put(groupId, new TaskGroup(groupId.longValue(), groupKey, taskItem.getKind(), CollectionsKt__CollectionsKt.mutableListOf(Long.valueOf(taskItem.getId())), null, 16, null))) != null) {
                taskGroup.attachTask(taskItem.getId());
            }
        }
        TaskItem put = this.store.put(Long.valueOf(taskItem.getId()), taskItem);
        MethodCollector.m14707o(212);
        return put;
    }

    public final synchronized List<TaskGroup> getLatestGroups(int i, String str) {
        MethodCollector.m14708i(210);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            List<TaskGroup> list = (List) proxy.result;
            MethodCollector.m14707o(210);
            return list;
        }
        C106862S5w.LIZ(str);
        List<Long> list2 = this.groupKeyToId.get(new KindGroupKeyPair(i, str));
        if (list2 != null) {
            ArrayList arrayList = new ArrayList();
            for (Number number : list2) {
                TaskGroup taskGroup = this.groups.get(Long.valueOf(number.longValue()));
                if (taskGroup != null) {
                    arrayList.add(taskGroup);
                }
            }
            ArrayList arrayList2 = arrayList;
            MethodCollector.m14707o(210);
            return arrayList2;
        }
        MethodCollector.m14707o(210);
        return null;
    }

    public final synchronized boolean update(long j, Function1<? super TaskItem, TaskItem> function1) {
        MethodCollector.m14708i(214);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), function1}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(214);
            return booleanValue;
        }
        C106862S5w.LIZ(function1);
        TaskItem taskItem = this.store.get(Long.valueOf(j));
        if (taskItem != null) {
            TaskItem invoke = function1.invoke(taskItem);
            if (invoke == taskItem) {
                MethodCollector.m14707o(214);
                return true;
            } else if (invoke != null) {
                this.store.put(Long.valueOf(j), invoke);
                MethodCollector.m14707o(214);
                return true;
            } else {
                MethodCollector.m14707o(214);
                return false;
            }
        }
        MethodCollector.m14707o(214);
        return false;
    }

    public final synchronized TaskGroup getLatestAliveGroup(int i, String str) {
        MethodCollector.m14708i(211);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            TaskGroup taskGroup = (TaskGroup) proxy.result;
            MethodCollector.m14707o(211);
            return taskGroup;
        }
        C106862S5w.LIZ(str);
        List<Long> list = this.groupKeyToId.get(new KindGroupKeyPair(i, str));
        if (list == null) {
            MethodCollector.m14707o(211);
            return null;
        }
        ListIterator<Long> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            GroupItemsPair itemsForGroup = getItemsForGroup(listIterator.previous().longValue());
            if (itemsForGroup != null) {
                List<TaskItem> items = itemsForGroup.getItems();
                if (!(items instanceof Collection) || !items.isEmpty()) {
                    for (TaskItem taskItem : items) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[taskItem.getState().ordinal()];
                        if (i2 == 1 || i2 == 2 || i2 == 3) {
                            TaskGroup group = itemsForGroup.getGroup();
                            MethodCollector.m14707o(211);
                            return group;
                        }
                    }
                    continue;
                }
            }
        }
        MethodCollector.m14707o(211);
        return null;
    }
}
