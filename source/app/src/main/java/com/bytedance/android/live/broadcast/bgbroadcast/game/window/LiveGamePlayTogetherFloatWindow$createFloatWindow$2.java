package com.bytedance.android.live.broadcast.bgbroadcast.game.window;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.bgbroadcast.game.C2942o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88788Kyc;

/* loaded from: classes5.dex */
public final class LiveGamePlayTogetherFloatWindow$createFloatWindow$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88788Kyc this$0;

    static {
        Covode.recordClassIndex(14862);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGamePlayTogetherFloatWindow$createFloatWindow$2(C88788Kyc c88788Kyc) {
        super(0);
        this.this$0 = c88788Kyc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C2942o c2942o;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C88788Kyc c88788Kyc = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c88788Kyc, C88788Kyc.LIZ, false, 11).isSupported && TextUtils.equals(c88788Kyc.LIZIZ, "floatingState") && c88788Kyc.LJIIIIZZ() && c88788Kyc.LJI() && (c2942o = c88788Kyc.f8694LJ) != null) {
                c2942o.LIZ(c88788Kyc.LIZLLL, true);
            }
        }
        return Unit.INSTANCE;
    }
}
