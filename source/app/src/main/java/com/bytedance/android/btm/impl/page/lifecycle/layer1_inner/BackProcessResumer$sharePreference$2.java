package com.bytedance.android.btm.impl.page.lifecycle.layer1_inner;

import android.app.Application;
import com.bytedance.android.btm.api.BtmHostDependManager;
import com.bytedance.android.btm.impl.p221b.C2650d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes18.dex */
public final class BackProcessResumer$sharePreference$2 extends Lambda implements Function0<C2650d> {
    public static final BackProcessResumer$sharePreference$2 INSTANCE = new BackProcessResumer$sharePreference$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11464);
    }

    public BackProcessResumer$sharePreference$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.btm.impl.b.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C2650d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Application app = BtmHostDependManager.INSTANCE.getApp();
        if (app != null) {
            return new C2650d(app, "btm_process_resume_cache");
        }
        return null;
    }
}
