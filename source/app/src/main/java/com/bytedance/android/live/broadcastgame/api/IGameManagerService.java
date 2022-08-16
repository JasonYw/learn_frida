package com.bytedance.android.live.broadcastgame.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public interface IGameManagerService {

    /* loaded from: classes12.dex */
    public enum OpenPlatformAppState {
        OpenPlatformAppStateUnusable,
        OpenPlatformAppStateReady,
        OpenPlatformAppStateInitializing,
        OpenPlatformAppStateRunning;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19011);
        }

        public static OpenPlatformAppState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (OpenPlatformAppState) (proxy.isSupported ? proxy.result : Enum.valueOf(OpenPlatformAppState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static OpenPlatformAppState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (OpenPlatformAppState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19010);
    }
}
