package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class TaskBag implements Iterable<TaskItem>, KMappedMarker {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<TaskItem> completed;
    public List<TaskItem> failed;
    public List<TaskItem> paused;
    public List<TaskItem> running;
    public List<TaskItem> waiting;

    /* loaded from: classes23.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            Covode.recordClassIndex(3105);
            int[] iArr = new int[TaskState.valuesCustom().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[TaskState.Running.ordinal()] = 1;
            $EnumSwitchMapping$0[TaskState.Waiting.ordinal()] = 2;
            $EnumSwitchMapping$0[TaskState.Succeeded.ordinal()] = 3;
            $EnumSwitchMapping$0[TaskState.Failed.ordinal()] = 4;
            $EnumSwitchMapping$0[TaskState.Pause.ordinal()] = 5;
        }
    }

    static {
        Covode.recordClassIndex(3104);
    }

    public final List<TaskItem> getCompleted() {
        return this.completed;
    }

    public final List<TaskItem> getFailed() {
        return this.failed;
    }

    public final List<TaskItem> getPaused() {
        return this.paused;
    }

    public final List<TaskItem> getRunning() {
        return this.running;
    }

    public final List<TaskItem> getWaiting() {
        return this.waiting;
    }

    @Override // java.lang.Iterable
    public final Iterator<TaskItem> iterator() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Iterator) proxy.result;
        }
        return SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(SequencesKt___SequencesKt.plus(CollectionsKt___CollectionsKt.asSequence(this.running), (Iterable) this.waiting), (Iterable) this.completed), (Iterable) this.failed), (Iterable) this.paused).iterator();
    }

    public TaskBag(Collection<TaskItem> collection) {
        C106862S5w.LIZ(collection);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        for (TaskItem taskItem : collection) {
            int i = WhenMappings.$EnumSwitchMapping$0[taskItem.getState().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                arrayList5.add(taskItem);
                            }
                        } else {
                            arrayList4.add(taskItem);
                        }
                    } else {
                        arrayList3.add(taskItem);
                    }
                } else {
                    arrayList2.add(taskItem);
                }
            } else {
                arrayList.add(taskItem);
            }
        }
        this.running = arrayList;
        this.waiting = arrayList2;
        this.completed = arrayList3;
        this.failed = arrayList4;
        this.paused = arrayList5;
    }

    public final void merge(TaskBag taskBag) {
        if (PatchProxy.proxy(new Object[]{taskBag}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(taskBag);
        List<TaskItem> list = this.running;
        List<TaskItem> list2 = this.waiting;
        List<TaskItem> list3 = this.completed;
        List<TaskItem> list4 = this.failed;
        List<TaskItem> list5 = this.paused;
        if (TypeIntrinsics.isMutableList(list) && TypeIntrinsics.isMutableList(list2) && TypeIntrinsics.isMutableList(list3) && TypeIntrinsics.isMutableList(list4) && TypeIntrinsics.isMutableList(list5)) {
            list.addAll(taskBag.running);
            list2.addAll(taskBag.waiting);
            list3.addAll(taskBag.completed);
            list4.addAll(taskBag.failed);
            list5.addAll(taskBag.paused);
            return;
        }
        throw new IllegalStateException("function merge cannot apply TaskBag with ImMutableList.");
    }

    public final TaskBag taskBagForKind(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (TaskBag) proxy.result;
        }
        List<TaskItem> list = this.running;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((TaskItem) obj).getKind() == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        List<TaskItem> list2 = this.waiting;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            if (((TaskItem) obj2).getKind() == i) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = arrayList3;
        List<TaskItem> list3 = this.completed;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list3) {
            if (((TaskItem) obj3).getKind() == i) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = arrayList5;
        List<TaskItem> list4 = this.failed;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list4) {
            if (((TaskItem) obj4).getKind() == i) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = arrayList7;
        List<TaskItem> list5 = this.paused;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj5 : list5) {
            if (((TaskItem) obj5).getKind() == i) {
                arrayList9.add(obj5);
            }
        }
        return new TaskBag(arrayList2, arrayList4, arrayList6, arrayList8, arrayList9);
    }

    public TaskBag(List<TaskItem> list, List<TaskItem> list2, List<TaskItem> list3, List<TaskItem> list4, List<TaskItem> list5) {
        C106862S5w.LIZ(list, list2, list3, list4, list5);
        this.running = list;
        this.waiting = list2;
        this.completed = list3;
        this.failed = list4;
        this.paused = list5;
    }
}
