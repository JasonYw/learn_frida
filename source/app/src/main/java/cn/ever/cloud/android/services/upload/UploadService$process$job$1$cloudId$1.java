package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadService$process$job$1$cloudId$1 extends Lambda implements Function1<ItemProgress, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UploadService$process$job$1 this$0;

    static {
        Covode.recordClassIndex(3150);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadService$process$job$1$cloudId$1(UploadService$process$job$1 uploadService$process$job$1) {
        super(1);
        this.this$0 = uploadService$process$job$1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Unit invoke(ItemProgress itemProgress) {
        invoke2(itemProgress);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ItemProgress itemProgress) {
        if (PatchProxy.proxy(new Object[]{itemProgress}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(itemProgress);
        this.this$0.$listener.onProgress(UploadEventBag.Companion.progress(this.this$0.$taskItem, itemProgress), itemProgress);
    }
}