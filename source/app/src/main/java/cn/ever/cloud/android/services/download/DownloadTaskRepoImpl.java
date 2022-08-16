package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt__IterablesKt;
import p003X.AbstractC521276if;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadTaskRepoImpl implements AbstractC521276if {
    public static ChangeQuickRedirect changeQuickRedirect;
    public CopyOnWriteArrayList<DownloadTaskItem> memoryTable = new CopyOnWriteArrayList<>();

    static {
        Covode.recordClassIndex(3018);
    }

    @Override // p003X.AbstractC521276if
    public final List<DownloadTaskItem> getAndRemoveItemsToSchedule() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        CopyOnWriteArrayList<DownloadTaskItem> copyOnWriteArrayList = this.memoryTable;
        this.memoryTable = new CopyOnWriteArrayList<>();
        return copyOnWriteArrayList;
    }

    @Override // p003X.AbstractC521276if
    public final List<Long> batchInsert(List<DownloadTaskItem> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(list);
        this.memoryTable.addAll(list);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (DownloadTaskItem downloadTaskItem : list) {
            arrayList.add(Long.valueOf(downloadTaskItem.getId()));
        }
        return arrayList;
    }
}
