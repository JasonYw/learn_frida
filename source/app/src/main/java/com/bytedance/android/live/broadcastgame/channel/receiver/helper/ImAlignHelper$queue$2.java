package com.bytedance.android.live.broadcastgame.channel.receiver.helper;

import com.bytedance.android.live.broadcastgame.channel.receiver.helper.C3438a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.PriorityQueue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C87241KZf;

/* loaded from: classes5.dex */
public final class ImAlignHelper$queue$2 extends Lambda implements Function0<PriorityQueue<C3438a.RunnableC3439a>> {
    public static final ImAlignHelper$queue$2 INSTANCE = new ImAlignHelper$queue$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19551);
    }

    public ImAlignHelper$queue$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.PriorityQueue<com.bytedance.android.live.broadcastgame.channel.receiver.helper.a$a>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PriorityQueue<C3438a.RunnableC3439a> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new PriorityQueue<>(8, new C87241KZf());
    }
}
