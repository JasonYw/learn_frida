package com.bytedance.android.live.broadcast.floatview;

import com.bytedance.android.livesdk.message.model.AbstractC9021r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L05;

/* loaded from: classes5.dex */
public final class BroadcastFloatMessageView$messageMap$2 extends Lambda implements Function0<LinkedHashMap<MessagePriority, LinkedList<L05<AbstractC9021r>>>> {
    public static final BroadcastFloatMessageView$messageMap$2 INSTANCE = new BroadcastFloatMessageView$messageMap$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15844);
    }

    public BroadcastFloatMessageView$messageMap$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.LinkedHashMap<com.bytedance.android.live.broadcast.floatview.MessagePriority, java.util.LinkedList<X.L05<com.bytedance.android.livesdk.message.model.r>>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LinkedHashMap<MessagePriority, LinkedList<L05<AbstractC9021r>>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        LinkedHashMap<MessagePriority, LinkedList<L05<AbstractC9021r>>> linkedHashMap = new LinkedHashMap<>();
        for (MessagePriority messagePriority : MessagePriority.valuesCustom()) {
            linkedHashMap.put(messagePriority, new LinkedList<>());
        }
        return linkedHashMap;
    }
}
