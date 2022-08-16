package com.bytedance.android.live.broadcast.anchorshow;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C2XR;
import p003X.C409882Kg;

/* loaded from: classes12.dex */
public final class ToolbarAnchorShowBehavior$currentRoom$2 extends Lambda implements Function0<Room> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2XR this$0;

    static {
        Covode.recordClassIndex(14361);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarAnchorShowBehavior$currentRoom$2(C2XR c2xr) {
        super(0);
        this.this$0 = c2xr;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Room mo30099invoke() {
        C2WC<Room> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.this$0.LIZIZ, 0L, 2, null);
        if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
            return LIZ.LIZ();
        }
        return null;
    }
}
