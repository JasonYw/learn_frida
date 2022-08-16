package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class PreUploadCheckBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("etags")
    public final List<String> eTags;

    static {
        Covode.recordClassIndex(20257);
    }

    public static /* synthetic */ PreUploadCheckBean copy$default(PreUploadCheckBean preUploadCheckBean, List list, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{preUploadCheckBean, list, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PreUploadCheckBean) proxy.result;
        }
        if ((i & 1) != 0) {
            list = preUploadCheckBean.eTags;
        }
        return preUploadCheckBean.copy(list);
    }

    private Object[] getObjects() {
        return new Object[]{this.eTags};
    }

    public final List<String> component1() {
        return this.eTags;
    }

    public final PreUploadCheckBean copy(List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PreUploadCheckBean) proxy.result;
        }
        C106862S5w.LIZ(list);
        return new PreUploadCheckBean(list);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreUploadCheckBean) {
            return C106862S5w.LIZ(((PreUploadCheckBean) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PreUploadCheckBean:%s", getObjects());
    }

    public final List<String> getETags() {
        return this.eTags;
    }

    public PreUploadCheckBean(List<String> list) {
        C106862S5w.LIZ(list);
        this.eTags = list;
    }
}
