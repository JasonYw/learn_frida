package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC90948LsM;
import p003X.C106862S5w;
import p003X.C90949LsN;

/* loaded from: classes5.dex */
public final class PCDNLogger implements AbstractC90948LsM {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final PCDNLogger INSTANCE = new PCDNLogger();
    public static AbstractC90948LsM sLogger = new C90949LsN();

    static {
        Covode.recordClassIndex(32752);
    }

    public final void setOuterLogger(AbstractC90948LsM abstractC90948LsM) {
        if (PatchProxy.proxy(new Object[]{abstractC90948LsM}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC90948LsM);
        sLogger = abstractC90948LsM;
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: d */
    public final void mo15628d(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        sLogger.mo15628d(str, str2);
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: i */
    public final void mo15626i(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        sLogger.mo15626i(str, str2);
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: v */
    public final void mo15625v(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        sLogger.mo15625v(str, str2);
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: w */
    public final void mo15624w(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        sLogger.mo15624w(str, str2);
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: w */
    public final void mo15623w(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, th);
        sLogger.mo15623w(str, th);
    }

    @Override // p003X.AbstractC90948LsM
    /* renamed from: e */
    public final void mo15627e(String str, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, str2, th}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, th);
        sLogger.mo15627e(str, str2, th);
    }

    @Override // p003X.AbstractC90948LsM
    public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject, jSONObject2, jSONObject3);
        sLogger.monitorEvent(str, jSONObject, jSONObject2, jSONObject3);
    }
}
