package com.bytedance.android.annie.service.latch;

import android.os.SystemClock;
import com.bytedance.android.annie.service.p216g.AbstractC2629b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C99782PRo;
import p003X.C99783PRp;
import p003X.PRG;

/* loaded from: classes7.dex */
public final class LatchUtils {
    public static ChangeQuickRedirect LIZ;
    public static final LatchUtils LIZIZ = new LatchUtils();
    public static final Map<String, LinkedList<Long>> LIZJ = new LinkedHashMap();

    /* loaded from: classes7.dex */
    public enum PrefetchStrategy {
        Prefetch,
        Latch,
        Nothing;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11093);
        }

        public static PrefetchStrategy valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (PrefetchStrategy) (proxy.isSupported ? proxy.result : Enum.valueOf(PrefetchStrategy.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PrefetchStrategy[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (PrefetchStrategy[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(11092);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LinkedList<Long> linkedList = LIZJ.get(str);
        if (linkedList != null && (true ^ linkedList.isEmpty())) {
            AbstractC2629b LIZJ2 = ((PRG) C99782PRo.LIZIZ.LIZ(PRG.class)).LIZJ();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("optimize_type", 2);
            JSONObject jSONObject2 = new JSONObject();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Long removeFirst = linkedList.removeFirst();
            Intrinsics.checkNotNullExpressionValue(removeFirst, "");
            jSONObject2.put("duration", elapsedRealtime - removeFirst.longValue());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("virtual_aid", C99783PRp.LJFF().LIZ);
            LIZJ2.LIZ(null, "latch_ng_callback", str, jSONObject, jSONObject2, null, jSONObject3, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
        if (r8 == null) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.annie.service.latch.LatchUtils.PrefetchStrategy LIZ(android.net.Uri r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.service.latch.LatchUtils.LIZ(android.net.Uri, java.lang.String):com.bytedance.android.annie.service.latch.LatchUtils$PrefetchStrategy");
    }
}
