package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public enum PreInitState {
    COMPLETE,
    WAITING,
    LOADING,
    DISABLE,
    ERROR;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16982);
    }

    public static PreInitState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        return (PreInitState) (proxy.isSupported ? proxy.result : Enum.valueOf(PreInitState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static PreInitState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        return (PreInitState[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    public final PreInitState LIZ(PreInitState preInitState) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{preInitState}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PreInitState) proxy.result;
        }
        C106862S5w.LIZ(preInitState);
        int max = Math.max(ordinal(), preInitState.ordinal());
        if (max != 0) {
            if (max != 1) {
                if (max != 2) {
                    if (max != 3) {
                        if (max != 4) {
                            return DISABLE;
                        }
                        return ERROR;
                    }
                    return DISABLE;
                }
                return LOADING;
            }
            return WAITING;
        }
        return COMPLETE;
    }
}
