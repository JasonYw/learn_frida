package cn.ever.cloud.android.services.upload;

import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadItemEvent extends TaskItemEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final UploadEventBag eventBag;

    static {
        Covode.recordClassIndex(3141);
    }

    public final UploadEventBag getEventBag() {
        return this.eventBag;
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskItemEvent
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "UploadItemEvent(" + super.toString() + LoggerUtil.S_RIGHT_TAG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadItemEvent(UploadEventBag uploadEventBag) {
        super(uploadEventBag);
        C106862S5w.LIZ(uploadEventBag);
        this.eventBag = uploadEventBag;
    }
}
