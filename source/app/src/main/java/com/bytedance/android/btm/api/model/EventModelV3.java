package com.bytedance.android.btm.api.model;

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
public final class EventModelV3 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String event;
    public JSONObject params;

    static {
        Covode.recordClassIndex(11326);
    }

    public static /* synthetic */ EventModelV3 copy$default(EventModelV3 eventModelV3, String str, JSONObject jSONObject, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{eventModelV3, str, jSONObject, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (EventModelV3) proxy.result;
        }
        if ((i & 1) != 0) {
            str = eventModelV3.event;
        }
        if ((i & 2) != 0) {
            jSONObject = eventModelV3.params;
        }
        return eventModelV3.copy(str, jSONObject);
    }

    private Object[] getObjects() {
        return new Object[]{this.event, this.params};
    }

    public final String component1() {
        return this.event;
    }

    public final JSONObject component2() {
        return this.params;
    }

    public final EventModelV3 copy(String str, JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, jSONObject}, this, changeQuickRedirect, false, 2);
        return proxy.isSupported ? (EventModelV3) proxy.result : new EventModelV3(str, jSONObject);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof EventModelV3) {
            return C106862S5w.LIZ(((EventModelV3) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("EventModelV3:%s,%s", getObjects());
    }

    public final String getEvent() {
        return this.event;
    }

    public final JSONObject getParams() {
        return this.params;
    }

    public final void send() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        BtmSDK.INSTANCE.getService().getAppLog().onEventV3(this);
    }

    public final void setEvent(String str) {
        this.event = str;
    }

    public final void setParams(JSONObject jSONObject) {
        this.params = jSONObject;
    }

    public EventModelV3(String str, JSONObject jSONObject) {
        this.event = str;
        this.params = jSONObject;
    }

    public /* synthetic */ EventModelV3(String str, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : jSONObject);
    }
}
