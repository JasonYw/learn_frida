package com.bytedance.android.live.liveinteract.voicechat.toolbar;

import com.bytedance.android.live.liveinteract.voicechat.dialog.C5013o;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C448653op;
import p003X.C448703ou;
import p003X.IQV;

/* loaded from: classes12.dex */
public final class ToolbarRadioInteractBehavior$mPreApplyDialog$2 extends Lambda implements Function0<C5013o> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C448653op this$0;

    static {
        Covode.recordClassIndex(31701);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarRadioInteractBehavior$mPreApplyDialog$2(C448653op c448653op) {
        super(0);
        this.this$0 = c448653op;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.liveinteract.voicechat.dialog.o] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.liveinteract.voicechat.dialog.o] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5013o mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C448703ou c448703ou = C5013o.LJIILIIL;
        Room room = this.this$0.LJIIIIZZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{room}, c448703ou, C448703ou.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C5013o c5013o = new C5013o();
        c5013o.LIZIZ = room;
        C13491f LIZ = IQV.LIZ(C5923dp.class);
        if (!(LIZ instanceof C5923dp)) {
            LIZ = null;
        }
        c5013o.LIZJ = (C5923dp) LIZ;
        return c5013o;
    }
}
