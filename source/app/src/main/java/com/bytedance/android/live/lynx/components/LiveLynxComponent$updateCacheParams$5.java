package com.bytedance.android.live.lynx.components;

import com.bytedance.android.live.lynx.monitor.LynxMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class LiveLynxComponent$updateCacheParams$5 extends Lambda implements Function2<String, JSONObject, Unit> {
    public static final LiveLynxComponent$updateCacheParams$5 INSTANCE = new LiveLynxComponent$updateCacheParams$5();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32180);
    }

    public LiveLynxComponent$updateCacheParams$5() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(String str, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{str2, jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(jSONObject2);
            LynxMonitor.LIZJ.LIZ(str2, jSONObject2);
        }
        return Unit.INSTANCE;
    }
}
