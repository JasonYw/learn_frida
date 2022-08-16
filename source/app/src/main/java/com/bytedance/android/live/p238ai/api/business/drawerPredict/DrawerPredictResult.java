package com.bytedance.android.live.p238ai.api.business.drawerPredict;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.api.business.drawerPredict.DrawerPredictResult */
/* loaded from: classes8.dex */
public final class DrawerPredictResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int code;
    public final String message;
    public final DrawerPredictResultStrategy strategy;

    static {
        Covode.recordClassIndex(13827);
    }

    public DrawerPredictResult() {
        this(0, null, null, 7, null);
    }

    public static /* synthetic */ DrawerPredictResult copy$default(DrawerPredictResult drawerPredictResult, int i, String str, DrawerPredictResultStrategy drawerPredictResultStrategy, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{drawerPredictResult, Integer.valueOf(i), str, drawerPredictResultStrategy, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DrawerPredictResult) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = drawerPredictResult.code;
        }
        if ((i2 & 2) != 0) {
            str = drawerPredictResult.message;
        }
        if ((i2 & 4) != 0) {
            drawerPredictResultStrategy = drawerPredictResult.strategy;
        }
        return drawerPredictResult.copy(i, str, drawerPredictResultStrategy);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.code), this.message, this.strategy};
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final DrawerPredictResultStrategy component3() {
        return this.strategy;
    }

    public final DrawerPredictResult copy(int i, String str, DrawerPredictResultStrategy drawerPredictResultStrategy) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, drawerPredictResultStrategy}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (DrawerPredictResult) proxy.result;
        }
        C106862S5w.LIZ(str);
        return new DrawerPredictResult(i, str, drawerPredictResultStrategy);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawerPredictResult) {
            return C106862S5w.LIZ(((DrawerPredictResult) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DrawerPredictResult:%s,%s,%s", getObjects());
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final DrawerPredictResultStrategy getStrategy() {
        return this.strategy;
    }

    public DrawerPredictResult(int i, String str, DrawerPredictResultStrategy drawerPredictResultStrategy) {
        C106862S5w.LIZ(str);
        this.code = i;
        this.message = str;
        this.strategy = drawerPredictResultStrategy;
    }

    public /* synthetic */ DrawerPredictResult(int i, String str, DrawerPredictResultStrategy drawerPredictResultStrategy, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : drawerPredictResultStrategy);
    }
}
