package com.bytedance.android.live.broadcastgame.opengame;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.IQV;

/* loaded from: classes12.dex */
public final class LiveBasePluginManager$room$2 extends Lambda implements Function0<Room> {
    public static final LiveBasePluginManager$room$2 INSTANCE = new LiveBasePluginManager$room$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(19903);
    }

    public LiveBasePluginManager$room$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.livesdkapi.depend.model.live.Room] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Room mo30099invoke() {
        C2WC<Room> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C13491f LIZ2 = IQV.LIZ(C5923dp.class);
        if (!(LIZ2 instanceof C5923dp)) {
            LIZ2 = null;
        }
        C5923dp c5923dp = (C5923dp) LIZ2;
        if (c5923dp == null || (LIZ = c5923dp.LIZ()) == null) {
            return null;
        }
        return LIZ.LIZ();
    }
}
