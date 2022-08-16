package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ScheduleTaskItemAction {
    public final TreeMap<Long, PauseReason> itemIdsToPause;
    public final List<Long> itemIdsToRemove;
    public final List<Long> updatedItemIds;

    static {
        Covode.recordClassIndex(3103);
    }

    public ScheduleTaskItemAction() {
        this(null, null, null, 7, null);
    }

    public final TreeMap<Long, PauseReason> getItemIdsToPause() {
        return this.itemIdsToPause;
    }

    public final List<Long> getItemIdsToRemove() {
        return this.itemIdsToRemove;
    }

    public final List<Long> getUpdatedItemIds() {
        return this.updatedItemIds;
    }

    public ScheduleTaskItemAction(List<Long> list, List<Long> list2, TreeMap<Long, PauseReason> treeMap) {
        C106862S5w.LIZ(list, list2, treeMap);
        this.updatedItemIds = list;
        this.itemIdsToRemove = list2;
        this.itemIdsToPause = treeMap;
    }

    public /* synthetic */ ScheduleTaskItemAction(List list, List list2, TreeMap treeMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new TreeMap() : treeMap);
    }
}
