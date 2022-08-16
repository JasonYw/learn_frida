package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KM9;

/* loaded from: classes5.dex */
public final class PreviewSourcePayLoad$putPayLoad$1 extends Lambda implements Function1<C2920w, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $key;
    public final /* synthetic */ Object $value;

    static {
        Covode.recordClassIndex(14505);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewSourcePayLoad$putPayLoad$1(Object obj, String str) {
        super(1);
        this.$value = obj;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2920w c2920w) {
        LIZ(c2920w);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C2920w c2920w) {
        if (PatchProxy.proxy(new Object[]{c2920w}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2920w);
        if (this.$value instanceof String) {
            c2920w.LIZJ.put(this.$key, this.$value);
            return;
        }
        Map<String, String> map = c2920w.LIZJ;
        String str = this.$key;
        String json = GsonProtectorUtils.toJson(KM9.LIZ(), this.$value);
        Intrinsics.checkNotNullExpressionValue(json, "");
        map.put(str, json);
    }
}
