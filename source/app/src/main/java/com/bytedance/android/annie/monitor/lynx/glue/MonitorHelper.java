package com.bytedance.android.annie.monitor.lynx.glue;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.LynxView;
import kotlin.jvm.JvmStatic;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C147878fQ8;
import p003X.C99783PRp;

/* loaded from: classes7.dex */
public final class MonitorHelper {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(10871);
    }

    /* loaded from: classes7.dex */
    public enum SampleLevel {
        NO_SAMPLE(0),
        SAMPLE_LEVEL_2(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int level;

        public static SampleLevel valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (SampleLevel) (proxy.isSupported ? proxy.result : Enum.valueOf(SampleLevel.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SampleLevel[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (SampleLevel[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(10872);
        }

        SampleLevel(int i) {
            this.level = i;
        }
    }

    @JvmStatic
    public static final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = C99783PRp.LJFF().LIZ;
        if (TextUtils.isEmpty(str)) {
            return "88888";
        }
        return str;
    }

    @JvmStatic
    public static final void LIZ(LynxView lynxView, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{lynxView, str, str2}, null, LIZ, true, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(lynxView, str, str2);
        C147878fQ8.LIZ().LIZ(lynxView, str, str2);
    }

    @JvmStatic
    public static void LIZ(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, int i) {
        if (PatchProxy.proxy(new Object[]{lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, Integer.valueOf(i)}, null, LIZ, true, 6).isSupported) {
            return;
        }
        C147878fQ8.LIZ().LIZ(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, i);
    }

    @JvmStatic
    public static final void LIZ(LynxView lynxView, String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, boolean z) {
        if (PatchProxy.proxy(new Object[]{lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, (byte) 0}, null, LIZ, true, 5).isSupported) {
            return;
        }
        LIZ(lynxView, str, str2, jSONObject, jSONObject2, jSONObject3, jSONObject4, SampleLevel.NO_SAMPLE.level);
    }
}
