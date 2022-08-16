package com.aweme.storage.experiments;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.abmock.ABManager;
import com.bytedance.ies.abmock.ClientExpManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class UninstallOpt$UNINSTALL_CLIENT_STRATEGY$2 extends Lambda implements Function0<Integer> {
    public static final UninstallOpt$UNINSTALL_CLIENT_STRATEGY$2 INSTANCE = new UninstallOpt$UNINSTALL_CLIENT_STRATEGY$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9419);
    }

    public UninstallOpt$UNINSTALL_CLIENT_STRATEGY$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int intValue;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            intValue = ((Integer) proxy.result).intValue();
        } else {
            intValue = ABManager.getInstance().getIntValue(true, "uninstall_ui_client_opt", ClientExpManager.uninstall_ui_client_opt());
        }
        return Integer.valueOf(intValue);
    }
}
