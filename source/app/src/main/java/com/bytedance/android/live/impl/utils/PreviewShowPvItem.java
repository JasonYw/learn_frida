package com.bytedance.android.live.impl.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class PreviewShowPvItem implements AbstractC4253b {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("date")
    public String date;
    @SerializedName("preview_show_count")
    public int previewShowCount;

    static {
        Covode.recordClassIndex(25039);
    }

    public PreviewShowPvItem() {
        this(null, 0, 3, null);
    }

    public static /* synthetic */ PreviewShowPvItem copy$default(PreviewShowPvItem previewShowPvItem, String str, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{previewShowPvItem, str, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PreviewShowPvItem) proxy.result;
        }
        if ((i2 & 1) != 0) {
            str = previewShowPvItem.date;
        }
        if ((i2 & 2) != 0) {
            i = previewShowPvItem.previewShowCount;
        }
        return previewShowPvItem.copy(str, i);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.date, Integer.valueOf(this.previewShowCount)};
    }

    public final String component1() {
        return this.date;
    }

    public final int component2() {
        return this.previewShowCount;
    }

    public final PreviewShowPvItem copy(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (PreviewShowPvItem) proxy.result : new PreviewShowPvItem(str, i);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof PreviewShowPvItem) {
            return C106862S5w.LIZ(((PreviewShowPvItem) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("PreviewShowPvItem:%s,%s", getObjects());
    }

    public final String getDate() {
        return this.date;
    }

    public final int getPreviewShowCount() {
        return this.previewShowCount;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setPreviewShowCount(int i) {
        this.previewShowCount = i;
    }

    public PreviewShowPvItem(String str, int i) {
        this.date = str;
        this.previewShowCount = i;
    }

    public /* synthetic */ PreviewShowPvItem(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i);
    }
}
