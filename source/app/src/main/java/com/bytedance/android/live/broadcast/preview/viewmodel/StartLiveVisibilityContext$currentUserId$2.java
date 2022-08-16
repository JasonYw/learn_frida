package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StartLiveVisibilityContext$currentUserId$2 extends Lambda implements Function0<Long> {
    public static final StartLiveVisibilityContext$currentUserId$2 INSTANCE = new StartLiveVisibilityContext$currentUserId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17454);
    }

    public StartLiveVisibilityContext$currentUserId$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Long mo30099invoke() {
        long LIZIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZIZ = ((Long) proxy.result).longValue();
        } else {
            LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
        }
        return Long.valueOf(LIZIZ);
    }
}
