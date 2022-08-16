package com.bytedance.android.live.p238ai.api.business.drawerPredict;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ai.api.business.drawerPredict.DrawerPredictResultStrategy */
/* loaded from: classes8.dex */
public final class DrawerPredictResultStrategy {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("predict_action")
    public final Integer predictAction;
    @SerializedName("range_sec")
    public final ArrayList<Float> rangeSec;
    @SerializedName("type")
    public final int type;
    @SerializedName("value")
    public final Boolean value;

    static {
        Covode.recordClassIndex(13828);
    }

    public DrawerPredictResultStrategy() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ DrawerPredictResultStrategy copy$default(DrawerPredictResultStrategy drawerPredictResultStrategy, int i, Boolean bool, ArrayList arrayList, Integer num, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{drawerPredictResultStrategy, Integer.valueOf(i), bool, arrayList, num, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DrawerPredictResultStrategy) proxy.result;
        }
        if ((i2 & 1) != 0) {
            i = drawerPredictResultStrategy.type;
        }
        if ((i2 & 2) != 0) {
            bool = drawerPredictResultStrategy.value;
        }
        if ((i2 & 4) != 0) {
            arrayList = drawerPredictResultStrategy.rangeSec;
        }
        if ((i2 & 8) != 0) {
            num = drawerPredictResultStrategy.predictAction;
        }
        return drawerPredictResultStrategy.copy(i, bool, arrayList, num);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.type), this.value, this.rangeSec, this.predictAction};
    }

    public final int component1() {
        return this.type;
    }

    public final Boolean component2() {
        return this.value;
    }

    public final ArrayList<Float> component3() {
        return this.rangeSec;
    }

    public final Integer component4() {
        return this.predictAction;
    }

    public final DrawerPredictResultStrategy copy(int i, Boolean bool, ArrayList<Float> arrayList, Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), bool, arrayList, num}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (DrawerPredictResultStrategy) proxy.result : new DrawerPredictResultStrategy(i, bool, arrayList, num);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawerPredictResultStrategy) {
            return C106862S5w.LIZ(((DrawerPredictResultStrategy) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DrawerPredictResultStrategy:%s,%s,%s,%s", getObjects());
    }

    public final Integer getPredictAction() {
        return this.predictAction;
    }

    public final ArrayList<Float> getRangeSec() {
        return this.rangeSec;
    }

    public final int getType() {
        return this.type;
    }

    public final Boolean getValue() {
        return this.value;
    }

    public DrawerPredictResultStrategy(int i, Boolean bool, ArrayList<Float> arrayList, Integer num) {
        this.type = i;
        this.value = bool;
        this.rangeSec = arrayList;
        this.predictAction = num;
    }

    public /* synthetic */ DrawerPredictResultStrategy(int i, Boolean bool, ArrayList arrayList, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? Boolean.FALSE : bool, (i2 & 4) != 0 ? null : arrayList, (i2 & 8) != 0 ? null : num);
    }
}
