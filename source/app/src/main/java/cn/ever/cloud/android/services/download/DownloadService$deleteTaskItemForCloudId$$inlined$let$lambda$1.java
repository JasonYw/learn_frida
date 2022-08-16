package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes23.dex */
public final class DownloadService$deleteTaskItemForCloudId$$inlined$let$lambda$1 extends Lambda implements Function1<Long, Boolean> {
    public final /* synthetic */ long $cloudId$inlined;
    public final /* synthetic */ long $taskItemId$inlined;
    public final /* synthetic */ DownloadService this$0;

    static {
        Covode.recordClassIndex(3011);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadService$deleteTaskItemForCloudId$$inlined$let$lambda$1(DownloadService downloadService, long j, long j2) {
        super(1);
        this.this$0 = downloadService;
        this.$taskItemId$inlined = j;
        this.$cloudId$inlined = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Long l) {
        return Boolean.valueOf(invoke(l.longValue()));
    }

    public final boolean invoke(long j) {
        if (j == this.$taskItemId$inlined) {
            return true;
        }
        return false;
    }
}
