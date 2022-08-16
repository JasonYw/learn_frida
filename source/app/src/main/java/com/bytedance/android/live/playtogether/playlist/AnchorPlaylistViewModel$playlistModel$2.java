package com.bytedance.android.live.playtogether.playlist;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LVO;

/* loaded from: classes5.dex */
public final class AnchorPlaylistViewModel$playlistModel$2 extends Lambda implements Function0<C5236c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LVO this$0;

    static {
        Covode.recordClassIndex(33034);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPlaylistViewModel$playlistModel$2(LVO lvo) {
        super(0);
        this.this$0 = lvo;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.playtogether.playlist.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5236c mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C5236c c5236c = new C5236c();
        LVO lvo = this.this$0;
        if (!PatchProxy.proxy(new Object[]{lvo}, c5236c, C5236c.LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(lvo);
            c5236c.LIZIZ = lvo;
        }
        return c5236c;
    }
}
