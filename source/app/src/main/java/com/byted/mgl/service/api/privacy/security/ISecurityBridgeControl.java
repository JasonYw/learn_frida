package com.byted.mgl.service.api.privacy.security;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;

/* loaded from: classes20.dex */
public interface ISecurityBridgeControl {
    static {
        Covode.recordClassIndex(9813);
    }

    boolean controlBridgeInvoke(String str, String str2, String str3);

    List<String> getFreeBridgeList();

    List<String> getValidateBridgeList();

    void preMatchByAppId(String str, String str2);

    /* loaded from: classes20.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9814);
        }

        public static /* synthetic */ void preMatchByAppId$default(ISecurityBridgeControl iSecurityBridgeControl, String str, String str2, int i, Object obj) {
            if (PatchProxy.proxy(new Object[]{iSecurityBridgeControl, str, str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1).isSupported) {
                return;
            }
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                iSecurityBridgeControl.preMatchByAppId(str, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preMatchByAppId");
        }

        public static /* synthetic */ boolean controlBridgeInvoke$default(ISecurityBridgeControl iSecurityBridgeControl, String str, String str2, String str3, int i, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iSecurityBridgeControl, str, str2, str3, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (obj == null) {
                if ((i & 4) != 0) {
                    str3 = null;
                }
                return iSecurityBridgeControl.controlBridgeInvoke(str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: controlBridgeInvoke");
        }
    }
}
