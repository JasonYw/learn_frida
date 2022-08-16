package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class PreviewTaskWidget$anchorId$2 extends Lambda implements Function0<String> {
    public static final PreviewTaskWidget$anchorId$2 INSTANCE = new PreviewTaskWidget$anchorId$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(18720);
    }

    public PreviewTaskWidget$anchorId$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
    }
}
