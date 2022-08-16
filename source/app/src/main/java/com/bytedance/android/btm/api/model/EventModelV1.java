package com.bytedance.android.btm.api.model;

import android.content.Context;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class EventModelV1 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String category;
    public Context context;
    public JSONObject ext_json;
    public long ext_value;
    public boolean from_lancet;
    public boolean instant_only;
    public String label;
    public String tag;
    public long value;

    static {
        Covode.recordClassIndex(11325);
    }

    public static /* synthetic */ EventModelV1 copy$default(EventModelV1 eventModelV1, Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject, boolean z2, int i, Object obj) {
        String str4 = str;
        Context context2 = context;
        String str5 = str3;
        String str6 = str2;
        long j3 = j;
        long j4 = j2;
        JSONObject jSONObject2 = jSONObject;
        boolean z3 = z;
        boolean z4 = z2;
        byte b = z3 ? (byte) 1 : (byte) 0;
        byte b2 = z3 ? (byte) 1 : (byte) 0;
        byte b3 = z4 ? (byte) 1 : (byte) 0;
        byte b4 = z4 ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV1, context2, str4, str6, str5, new Long(j3), new Long(j4), Byte.valueOf(b), jSONObject2, Byte.valueOf(b3), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (EventModelV1) proxy.result;
        }
        if ((i & 1) != 0) {
            context2 = eventModelV1.context;
        }
        if ((i & 2) != 0) {
            str4 = eventModelV1.category;
        }
        if ((i & 4) != 0) {
            str6 = eventModelV1.tag;
        }
        if ((i & 8) != 0) {
            str5 = eventModelV1.label;
        }
        if ((i & 16) != 0) {
            j3 = eventModelV1.value;
        }
        if ((i & 32) != 0) {
            j4 = eventModelV1.ext_value;
        }
        if ((i & 64) != 0) {
            z3 = eventModelV1.instant_only;
        }
        if ((i & 128) != 0) {
            jSONObject2 = eventModelV1.ext_json;
        }
        if ((i & 256) != 0) {
            z4 = eventModelV1.from_lancet;
        }
        boolean z5 = z4 ? 1 : 0;
        Object[] objArr = z4 ? 1 : 0;
        boolean z6 = z3 ? 1 : 0;
        Object[] objArr2 = z3 ? 1 : 0;
        return eventModelV1.copy(context2, str4, str6, str5, j3, j4, z6, jSONObject2, z5);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.context, this.category, this.tag, this.label, Long.valueOf(this.value), Long.valueOf(this.ext_value), Boolean.valueOf(this.instant_only), this.ext_json, Boolean.valueOf(this.from_lancet)};
    }

    public final Context component1() {
        return this.context;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.tag;
    }

    public final String component4() {
        return this.label;
    }

    public final long component5() {
        return this.value;
    }

    public final long component6() {
        return this.ext_value;
    }

    public final boolean component7() {
        return this.instant_only;
    }

    public final JSONObject component8() {
        return this.ext_json;
    }

    public final boolean component9() {
        return this.from_lancet;
    }

    public final EventModelV1 copy(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject, boolean z2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, str2, str3, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (EventModelV1) proxy.result : new EventModelV1(context, str, str2, str3, j, j2, z, jSONObject, z2);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventModelV1) {
            return C106862S5w.LIZ(((EventModelV1) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EventModelV1:%s,%s,%s,%s,%s,%s,%s,%s,%s", getObjects());
    }

    public final String getCategory() {
        return this.category;
    }

    public final Context getContext() {
        return this.context;
    }

    public final JSONObject getExt_json() {
        return this.ext_json;
    }

    public final long getExt_value() {
        return this.ext_value;
    }

    public final boolean getFrom_lancet() {
        return this.from_lancet;
    }

    public final boolean getInstant_only() {
        return this.instant_only;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getTag() {
        return this.tag;
    }

    public final long getValue() {
        return this.value;
    }

    public final void send() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        BtmSDK.INSTANCE.getService().getAppLog().onEventV1(this);
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setContext(Context context) {
        this.context = context;
    }

    public final void setExt_json(JSONObject jSONObject) {
        this.ext_json = jSONObject;
    }

    public final void setExt_value(long j) {
        this.ext_value = j;
    }

    public final void setFrom_lancet(boolean z) {
        this.from_lancet = z;
    }

    public final void setInstant_only(boolean z) {
        this.instant_only = z;
    }

    public final void setLabel(String str) {
        this.label = str;
    }

    public final void setTag(String str) {
        this.tag = str;
    }

    public final void setValue(long j) {
        this.value = j;
    }

    public EventModelV1(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject, boolean z2) {
        this.context = context;
        this.category = str;
        this.tag = str2;
        this.label = str3;
        this.value = j;
        this.ext_value = j2;
        this.instant_only = z;
        this.ext_json = jSONObject;
        this.from_lancet = z2;
    }

    public /* synthetic */ EventModelV1(Context context, String str, String str2, String str3, long j, long j2, boolean z, JSONObject jSONObject, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : context, str, str2, str3, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? 0L : j2, (i & 64) != 0 ? false : z, (i & 128) == 0 ? jSONObject : null, (i & 256) != 0 ? false : z2);
    }
}
