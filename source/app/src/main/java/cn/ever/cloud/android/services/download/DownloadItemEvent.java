package cn.ever.cloud.android.services.download;

import cn.ever.cloud.android.services.task.entity.TaskItemEvent;
import cn.ever.cloud.utils.error.EpError;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadItemEvent extends TaskItemEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String completePath;
    public final EpError error;

    static {
        Covode.recordClassIndex(3007);
    }

    public final String getCompletePath() {
        return this.completePath;
    }

    public final EpError getError() {
        return this.error;
    }

    @Override // cn.ever.cloud.android.services.task.entity.TaskItemEvent
    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "DownloadItemEvent(" + super.toString() + ", error=" + this.error + ", completePath=" + this.completePath + LoggerUtil.S_RIGHT_TAG;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DownloadItemEvent(DownloadEventBag downloadEventBag) {
        super(downloadEventBag);
        C106862S5w.LIZ(downloadEventBag);
        this.error = downloadEventBag.getError();
        this.completePath = downloadEventBag.getCompletePath();
    }
}
