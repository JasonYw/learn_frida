package com.bytedance.android.live.browser;

import com.bytedance.android.annie.param.C2613i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnnieParamUtil$getCacheParam$2 extends Lambda implements Function1<Map<String, ? extends Object>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2613i $param;

    static {
        Covode.recordClassIndex(21870);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$getCacheParam$2(C2613i c2613i) {
        super(1);
        this.$param = c2613i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, ? extends Object> map) {
        Map<String, ? extends Object> map2 = map;
        if (!PatchProxy.proxy(new Object[]{map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map2);
            this.$param.LJJLJ = map2;
        }
        return Unit.INSTANCE;
    }
}
