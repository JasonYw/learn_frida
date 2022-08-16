package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C101347Pvh;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class LiveLynxComponent$updateCacheParams$2 extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C101347Pvh $param;

    static {
        Covode.recordClassIndex(32177);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxComponent$updateCacheParams$2(C101347Pvh c101347Pvh) {
        super(1);
        this.$param = c101347Pvh;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        if (!PatchProxy.proxy(new Object[]{map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map2);
            this.$param.LJJLIIJ = map2;
        }
        return Unit.INSTANCE;
    }
}
