package com.bytedance.android.live.broadcastgame.channel.sender;

import com.bytedance.android.live.broadcastgame.channel.AAMManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class OpenSenderAdapter$watcher$2 extends Lambda implements Function0<List<AAMManager.AbstractC3405a>> {
    public static final OpenSenderAdapter$watcher$2 INSTANCE = new OpenSenderAdapter$watcher$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19566);
    }

    public OpenSenderAdapter$watcher$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<com.bytedance.android.live.broadcastgame.channel.AAMManager$a>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<AAMManager.AbstractC3405a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
