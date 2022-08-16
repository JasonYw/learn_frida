package cn.ever.cloud.android.p039a;

import cn.ever.cloud.android.services.task.entity.PauseReason;
import cn.ever.cloud.android.services.upload.UploadTaskItem;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: cn.ever.cloud.android.a.e */
/* loaded from: classes23.dex */
public interface AbstractC0683e {
    static {
        Covode.recordClassIndex(2747);
    }

    List<Long> batchInsert(List<UploadTaskItem> list);

    List<UploadTaskItem> getItemsToSchedule();

    UploadTaskItem getTaskItem(long j);

    void markTaskItemCancelled(long j);

    void markTaskItemComplete(long j, long j2);

    void markTaskItemFailed(long j, EpError epError);

    void markTaskItemPaused(long j, PauseReason pauseReason);

    void markTaskItemUploading(long j);
}
