package com.bytedance.android.live.core.utils;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class NitaInflateUtil$hostBusiness$2 extends Lambda implements Function0<IHostBusiness> {
    public static final NitaInflateUtil$hostBusiness$2 INSTANCE = new NitaInflateUtil$hostBusiness$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23820);
    }

    public NitaInflateUtil$hostBusiness$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.livehostapi.business.IHostBusiness, com.bytedance.android.live.base.IService] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.livehostapi.business.IHostBusiness, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IHostBusiness mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ServiceManager.getService(IHostBusiness.class);
    }
}
