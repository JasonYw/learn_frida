package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.TaskItem;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC521266ie;

/* loaded from: classes23.dex */
public final class UploadService$process$1 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $itemId;
    public final /* synthetic */ AbstractC521266ie $listener;
    public final /* synthetic */ TaskItem $taskItem;
    public final /* synthetic */ UploadService this$0;

    static {
        Covode.recordClassIndex(3148);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadService$process$1(UploadService uploadService, TaskItem taskItem, AbstractC521266ie abstractC521266ie, long j) {
        super(1);
        this.this$0 = uploadService;
        this.$taskItem = taskItem;
        this.$listener = abstractC521266ie;
        this.$itemId = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (th instanceof CancellationException) {
            LogHelper logHelper = LogHelper.INSTANCE;
            logHelper.m20555d("UploadService", "item has been cancelled, item=" + this.$taskItem);
            this.$listener.onCancelled(UploadEventBag.Companion.cancel(this.$taskItem));
        } else if (th != null) {
            this.this$0.onError(this.$listener, th, this.$taskItem);
        }
        this.this$0.uploadingItems.remove(Long.valueOf(this.$itemId));
    }
}
