package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public class RoomTopRightBannerEvent {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long animationTime;
    public int status;

    static {
        Covode.recordClassIndex(22279);
    }

    public long getAnimationTime() {
        return this.animationTime;
    }

    public int getStatus() {
        return this.status;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "RoomTopRightBannerEvent{animationTime=" + this.animationTime + ", status=" + this.status + '}';
    }

    public void setAnimationTime(long j) {
        this.animationTime = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
