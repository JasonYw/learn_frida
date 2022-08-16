package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C3VF;

/* loaded from: classes12.dex */
public final class PreviewGamePromoteViewModel$anchorId$2 extends Lambda implements Function0<String> {
    public static final PreviewGamePromoteViewModel$anchorId$2 INSTANCE = new PreviewGamePromoteViewModel$anchorId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18122);
    }

    public PreviewGamePromoteViewModel$anchorId$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        Long l;
        C3VF user;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            l = Long.valueOf(user.LIZIZ());
        } else {
            l = null;
        }
        return String.valueOf(l);
    }
}
