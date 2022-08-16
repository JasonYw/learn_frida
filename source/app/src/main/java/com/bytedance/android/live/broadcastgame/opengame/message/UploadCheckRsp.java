package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class UploadCheckRsp {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("exist_etags")

    /* renamed from: rs */
    public final Map<String, String> f26060rs;

    static {
        Covode.recordClassIndex(20259);
    }

    public static /* synthetic */ UploadCheckRsp copy$default(UploadCheckRsp uploadCheckRsp, Map map, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadCheckRsp, map, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadCheckRsp) proxy.result;
        }
        if ((i & 1) != 0) {
            map = uploadCheckRsp.f26060rs;
        }
        return uploadCheckRsp.copy(map);
    }

    private Object[] getObjects() {
        return new Object[]{this.f26060rs};
    }

    public final Map<String, String> component1() {
        return this.f26060rs;
    }

    public final UploadCheckRsp copy(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadCheckRsp) proxy.result;
        }
        C106862S5w.LIZ(map);
        return new UploadCheckRsp(map);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadCheckRsp) {
            return C106862S5w.LIZ(((UploadCheckRsp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadCheckRsp:%s", getObjects());
    }

    public final Map<String, String> getRs() {
        return this.f26060rs;
    }

    public UploadCheckRsp(Map<String, String> map) {
        C106862S5w.LIZ(map);
        this.f26060rs = map;
    }
}
