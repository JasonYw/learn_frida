package com.bytedance.android.live.broadcast.toolbar;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C409882Kg;

/* loaded from: classes12.dex */
public final class ToolbarRoomIntroBehavior$room$2 extends Lambda implements Function0<Room> {
    public static final ToolbarRoomIntroBehavior$room$2 INSTANCE = new ToolbarRoomIntroBehavior$room$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17936);
    }

    public ToolbarRoomIntroBehavior$room$2() {
        super(0);
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
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
            return LIZ.LIZ();
        }
        return null;
    }
}
