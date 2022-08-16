package cn.ever.cloud.utils.monitor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public class SimpleMonitor implements AbstractC0764a {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3507);
    }

    @Override // cn.ever.cloud.utils.monitor.AbstractC0764a
    public void ensureNotNull(Object obj) {
    }

    @Override // cn.ever.cloud.utils.monitor.AbstractC0764a
    public void ensureNotReachHere(String str) {
    }

    @Override // cn.ever.cloud.utils.monitor.AbstractC0764a
    public void onEvent(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
    }

    @Override // cn.ever.cloud.utils.monitor.AbstractC0764a
    public void onSendMonitor(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
    }
}
