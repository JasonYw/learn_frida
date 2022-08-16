package com.android.ttcjpaysdk.base.network.p133a;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import org.json.JSONObject;
import p003X.QWJ;

/* renamed from: com.android.ttcjpaysdk.base.network.a.d$a */
/* loaded from: classes17.dex */
public class d$a {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public AbstractC2160e LIZJ;
    public Map<String, String> LIZLLL;

    /* renamed from: LJ */
    public JSONObject f25450LJ;
    public Map<String, String> LJFF;
    public Map<String, String> LJI;
    public boolean LJII;

    static {
        Covode.recordClassIndex(6334);
    }

    public final AbstractC2161f LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (AbstractC2161f) proxy.result;
        }
        JSONObject jSONObject = this.f25450LJ;
        if (jSONObject != null) {
            return LIZ(this.LIZIZ, jSONObject, this.LIZJ, this.LJI);
        }
        return LIZ(this.LIZIZ, this.LIZLLL, this.LIZJ, this.LJI);
    }

    public final AbstractC2161f LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC2161f) proxy.result;
        }
        return new QWJ();
    }

    public final d$a LIZ(AbstractC2160e abstractC2160e) {
        this.LIZJ = abstractC2160e;
        return this;
    }

    public final d$a LIZ(String str) {
        this.LIZIZ = str;
        return this;
    }

    public final d$a LIZ(Map<String, String> map) {
        this.LJI = map;
        return this;
    }

    public final d$a LIZ(boolean z) {
        this.LJII = false;
        return this;
    }

    private AbstractC2161f LIZ(String str, Map<String, String> map, AbstractC2160e abstractC2160e, Map<String, String> map2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, map, abstractC2160e, map2}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC2161f) proxy.result;
        }
        AbstractC2161f LIZ2 = LIZ();
        LIZ2.LIZ(str);
        LIZ2.LIZJ(map);
        LIZ2.LIZ(abstractC2160e);
        LIZ2.LIZIZ(map2);
        return LIZ2;
    }

    private AbstractC2161f LIZ(String str, JSONObject jSONObject, AbstractC2160e abstractC2160e, Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, jSONObject, abstractC2160e, map}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (AbstractC2161f) proxy.result;
        }
        AbstractC2161f LIZ2 = LIZ();
        LIZ2.LIZ(str);
        LIZ2.LIZ(jSONObject);
        LIZ2.LIZ(abstractC2160e);
        LIZ2.LIZIZ(map);
        return LIZ2;
    }
}
