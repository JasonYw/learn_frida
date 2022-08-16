package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadService$createTaskItems$idsScheduled$1 extends Lambda implements Function1<TaskItem, Long> {
    public static final UploadService$createTaskItems$idsScheduled$1 INSTANCE = new UploadService$createTaskItems$idsScheduled$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3147);
    }

    public UploadService$createTaskItems$idsScheduled$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(TaskItem taskItem) {
        UploadTaskItemId uploadTaskItemId;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{taskItem}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Long) proxy.result;
        }
        C106862S5w.LIZ(taskItem);
        Object obj = taskItem.getParams().getInner().get(UploadTaskItemId.class);
        Long l = null;
        if (obj == null || (uploadTaskItemId = (UploadTaskItemId) obj) == null || (l = Long.valueOf(uploadTaskItemId.getInner())) == null) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20554e("UploadService", "Found item has no param UploadTaskItemId, make sure UploadTaskItemId has been put into params, and task kind is correct! " + taskItem);
        }
        return l;
    }
}
