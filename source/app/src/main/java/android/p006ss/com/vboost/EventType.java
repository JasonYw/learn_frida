package android.p006ss.com.vboost;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.EventType */
/* loaded from: classes25.dex */
public enum EventType {
    EVENT_TEMP("event_temp", 0),
    EVENT_NET("event_net", 1);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public int index;
    public String name;

    public final int getIndex() {
        return this.index;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static EventType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (EventType[]) proxy.result;
        }
        return (EventType[]) values().clone();
    }

    static {
        Covode.recordClassIndex(32);
    }

    public static EventType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (EventType) proxy.result;
        }
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType valueOf(int i) {
        EventType[] valuesCustom;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (EventType) proxy.result;
        }
        for (EventType eventType : valuesCustom()) {
            if (i == eventType.index) {
                return eventType;
            }
        }
        throw new RuntimeException("Can't find enum type for index: " + i);
    }

    EventType(EventType eventType) {
        this.name = eventType.name;
        this.index = eventType.index;
    }

    EventType(String str, int i) {
        this.name = str;
        this.index = i;
    }
}
