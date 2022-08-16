package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import cn.ever.cloud.android.services.task.entity.TaskGroupEvent;
import cn.ever.cloud.android.services.task.entity.TaskState;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.C106862S5w;

/* renamed from: cn.ever.cloud.android.services.upload.b */
/* loaded from: classes23.dex */
public final class C0728b extends TaskGroupEvent {
    static {
        Covode.recordClassIndex(3165);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0728b(long j, String str, ItemProgress itemProgress, int i, TaskState taskState, int i2, int i3, List<String> list, List<FailedItem> list2, List<String> list3) {
        super(j, str, itemProgress, i, taskState, i2, i3, list, list2, list3);
        C106862S5w.LIZ(str, itemProgress, taskState, list, list2, list3);
    }
}
