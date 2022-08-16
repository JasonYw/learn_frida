package com.bytedance.android.btm.api;

import com.bytedance.android.btm.api.cache.ISavable;
import com.bytedance.android.btm.api.inner.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class PageProp implements ISavable<PageProp>, Serializable {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static final long serialVersionUID = 20220104;
    public boolean auto;
    public String btm;
    public boolean manualShow;
    public boolean singleton;

    static {
        Covode.recordClassIndex(11288);
    }

    public PageProp() {
        this(null, false, false, 7, null);
    }

    public static /* synthetic */ PageProp copy$default(PageProp pageProp, String str, boolean z, boolean z2, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        byte b3 = z2 ? (byte) 1 : (byte) 0;
        byte b4 = z2 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageProp, str, Byte.valueOf(b), Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (PageProp) proxy.result;
        }
        if ((i & 1) != 0) {
            str = pageProp.btm;
        }
        if ((i & 2) != 0) {
            z = pageProp.auto;
        }
        if ((i & 4) != 0) {
            z2 = pageProp.singleton;
        }
        return pageProp.copy(str, z, z2);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.btm, Boolean.valueOf(this.auto), Boolean.valueOf(this.singleton)};
    }

    public final String component1() {
        return this.btm;
    }

    public final boolean component2() {
        return this.auto;
    }

    public final boolean component3() {
        return this.singleton;
    }

    public final PageProp copy(String str, boolean z, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (PageProp) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new PageProp(str, z, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PageProp) {
            return C106862S5w.LIZ(((PageProp) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PageProp:%s,%s,%s", getObjects());
    }

    /* loaded from: classes18.dex */
    public static final class Companion {
        static {
            Covode.recordClassIndex(11289);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final boolean getAuto() {
        return this.auto;
    }

    public final String getBtm() {
        return this.btm;
    }

    public final boolean getManualShow() {
        return this.manualShow;
    }

    public final boolean getSingleton() {
        return this.singleton;
    }

    public final boolean needInvokeResume() {
        if (!this.auto && !this.manualShow) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.btm.api.cache.ISavable
    public final String save() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("btm", this.btm);
            jSONObject.putOpt("auto", Boolean.valueOf(this.auto));
            jSONObject.putOpt("singleton", Boolean.valueOf(this.singleton));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "");
        return jSONObject2;
    }

    public final void setAuto(boolean z) {
        this.auto = z;
    }

    public final void setManualShow(boolean z) {
        this.manualShow = z;
    }

    public final void setSingleton(boolean z) {
        this.singleton = z;
    }

    public final void setBtm(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.btm = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.android.btm.api.cache.ISavable
    /* renamed from: parse */
    public final PageProp mo25318parse(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (PageProp) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("btm");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            this.btm = optString;
            this.auto = jSONObject.optBoolean("auto");
            this.singleton = jSONObject.optBoolean("singleton");
            return this;
        } catch (Exception e) {
            Logger.INSTANCE.m15958e("btm_error", new PageProp$parse$1(e));
            return this;
        }
    }

    public PageProp(String str, boolean z, boolean z2) {
        C106862S5w.LIZ(str);
        this.btm = str;
        this.auto = z;
        this.singleton = z2;
    }

    public /* synthetic */ PageProp(String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
    }
}
