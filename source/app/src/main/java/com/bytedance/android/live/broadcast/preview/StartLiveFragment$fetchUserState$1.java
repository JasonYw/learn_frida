package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class StartLiveFragment$fetchUserState$1 extends Lambda implements Function0<Boolean> {
    public static final StartLiveFragment$fetchUserState$1 INSTANCE = new StartLiveFragment$fetchUserState$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17114);
    }

    public StartLiveFragment$fetchUserState$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        boolean LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZLLL = ((Boolean) proxy.result).booleanValue();
        } else {
            IService service = ServiceManager.getService(IUserService.class);
            Intrinsics.checkNotNull(service);
            LIZLLL = ((IUserService) service).user().LIZLLL();
        }
        return Boolean.valueOf(LIZLLL);
    }
}
