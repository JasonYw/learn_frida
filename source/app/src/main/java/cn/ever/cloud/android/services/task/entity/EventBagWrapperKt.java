package cn.ever.cloud.android.services.task.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public final class EventBagWrapperKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3090);
    }

    public static final EventBagWrapper EventBagWrapper(int i, EventBag eventBag) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), eventBag}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (EventBagWrapper) proxy.result;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return new EventBagWrapper(null, false, 2, null);
                }
                return new EventBagWrapper(null, true);
            }
            return new EventBagWrapper(eventBag, false, 2, null);
        }
        return new EventBagWrapper(null, false, 2, null);
    }

    public static /* synthetic */ EventBagWrapper EventBagWrapper$default(int i, EventBag eventBag, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), eventBag, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EventBagWrapper) proxy.result;
        }
        if ((i2 & 2) != 0) {
            eventBag = null;
        }
        return EventBagWrapper(i, eventBag);
    }
}
