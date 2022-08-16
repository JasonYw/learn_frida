package com.bytedance.android.live.playtogether.myplaypanel;

import com.bytedance.android.live.playtogether.api.AbstractC5188a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameRecordDialogFragment$playTogetherService$2 extends Lambda implements Function0<AbstractC5188a> {
    public static final GameRecordDialogFragment$playTogetherService$2 INSTANCE = new GameRecordDialogFragment$playTogetherService$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(33006);
    }

    public GameRecordDialogFragment$playTogetherService$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.playtogether.api.a, com.bytedance.android.live.base.IService] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.playtogether.api.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AbstractC5188a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return ServiceManager.getService(AbstractC5188a.class);
    }
}
