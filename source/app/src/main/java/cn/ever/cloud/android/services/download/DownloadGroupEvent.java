package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskState;
import cn.ever.cloud.android.services.upload.FailedItem;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadGroupEvent extends TaskGroupEvent {
    public final List<String> completePaths;

    static {
        Covode.recordClassIndex(3006);
    }

    public final List<String> getCompletePaths() {
        return this.completePaths;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadGroupEvent(long j, String str, ItemProgress itemProgress, int i, TaskState taskState, int i2, int i3, List<String> list, List<FailedItem> list2, List<String> list3, List<String> list4) {
        super(j, str, itemProgress, i, taskState, i2, i3, list, list2, list3);
        C106862S5w.LIZ(str, itemProgress, taskState, list, list2, list3, list4);
        this.completePaths = list4;
    }
}
