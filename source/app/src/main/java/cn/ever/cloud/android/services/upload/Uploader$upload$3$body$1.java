package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.ItemProgress;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes23.dex */
public final class Uploader$upload$3$body$1 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.LongRef $uploadedSize;
    public final /* synthetic */ Uploader$upload$3 this$0;

    static {
        Covode.recordClassIndex(3161);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$upload$3$body$1(Uploader$upload$3 uploader$upload$3, Ref.LongRef longRef) {
        super(1);
        this.this$0 = uploader$upload$3;
        this.$uploadedSize = longRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        invoke(l.longValue());
        return Unit.INSTANCE;
    }

    public final void invoke(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.this$0.$progressFn.invoke(new ItemProgress(this.this$0.$env.getSize(), this.$uploadedSize.element + j));
    }
}
