package com.byted.mgl.base.api.internal;

import com.byted.mgl.base.api.internal.delegate.IDelegateIpc;
import com.byted.mgl.service.api.internal.AMglInvCallerService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.bdpbase.manager.BdpManager;

/* loaded from: classes26.dex */
public final class BaseInvCallerUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9779);
    }

    public static IDelegateIpc getIpcDelegate() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (IDelegateIpc) proxy.result;
        }
        return getService().getIpcDelegate();
    }

    public static IBaseInvCallerService getService() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (IBaseInvCallerService) proxy.result;
        }
        return (IBaseInvCallerService) BdpManager.getInst().getService(AMglInvCallerService.class);
    }
}
