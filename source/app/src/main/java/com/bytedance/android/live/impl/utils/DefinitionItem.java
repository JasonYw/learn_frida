package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class DefinitionItem implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    @SerializedName("definition_duration")
    public List<Long> definitionDurationList;
    @SerializedName("definition_count")
    public List<Integer> definitionPvList;

    static {
        Covode.recordClassIndex(25034);
    }

    public DefinitionItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ DefinitionItem copy$default(DefinitionItem definitionItem, String str, List list, List list2, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{definitionItem, str, list, list2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DefinitionItem) proxy.result;
        }
        if ((i & 1) != 0) {
            str = definitionItem.date;
        }
        if ((i & 2) != 0) {
            list = definitionItem.definitionPvList;
        }
        if ((i & 4) != 0) {
            list2 = definitionItem.definitionDurationList;
        }
        return definitionItem.copy(str, list, list2);
    }

    private Object[] getObjects() {
        return new Object[]{this.date, this.definitionPvList, this.definitionDurationList};
    }

    public final String component1() {
        return this.date;
    }

    public final List<Integer> component2() {
        return this.definitionPvList;
    }

    public final List<Long> component3() {
        return this.definitionDurationList;
    }

    public final DefinitionItem copy(String str, List<Integer> list, List<Long> list2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, list, list2}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (DefinitionItem) proxy.result : new DefinitionItem(str, list, list2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DefinitionItem) {
            return C106862S5w.LIZ(((DefinitionItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DefinitionItem:%s,%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final List<Long> getDefinitionDurationList() {
        return this.definitionDurationList;
    }

    public final List<Integer> getDefinitionPvList() {
        return this.definitionPvList;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDefinitionDurationList(List<Long> list) {
        this.definitionDurationList = list;
    }

    public final void setDefinitionPvList(List<Integer> list) {
        this.definitionPvList = list;
    }

    public DefinitionItem(String str, List<Integer> list, List<Long> list2) {
        this.date = str;
        this.definitionPvList = list;
        this.definitionDurationList = list2;
    }

    public /* synthetic */ DefinitionItem(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.mutableListOf(0, 0, 0, 0, 0) : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.mutableListOf(0L, 0L, 0L, 0L, 0L) : list2);
    }
}
