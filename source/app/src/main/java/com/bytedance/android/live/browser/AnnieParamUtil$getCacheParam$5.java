package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnnieParamUtil$getCacheParam$5 extends Lambda implements Function2<String, JSONObject, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC4052l $lynxService;

    static {
        Covode.recordClassIndex(21873);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$getCacheParam$5(AbstractC4052l abstractC4052l) {
        super(2);
        this.$lynxService = abstractC4052l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{str2, jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            AbstractC4052l abstractC4052l = this.$lynxService;
            if (abstractC4052l != null) {
                abstractC4052l.LIZ(str2, jSONObject2);
            }
        }
        return Unit.INSTANCE;
    }
}
