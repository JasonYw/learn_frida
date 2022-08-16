package com.android.ttcjpaysdk.base.eventbus;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.RunnableC135467cBS;

/* loaded from: classes17.dex */
public final class EventManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final EventManager INSTANCE = new EventManager();
    public static final Handler handler = new Handler(Looper.getMainLooper());
    public static final HashMap<String, LinkedList<AbstractC2126a>> observers = new HashMap<>();

    static {
        Covode.recordClassIndex(6013);
    }

    public final synchronized void notify(BaseEvent baseEvent) {
        MethodCollector.m14708i(354);
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, changeQuickRedirect, false, 3).isSupported) {
            MethodCollector.m14707o(354);
            return;
        }
        C106862S5w.LIZ(baseEvent);
        LinkedList<AbstractC2126a> linkedList = observers.get(baseEvent.getClass().getName());
        if (linkedList != null) {
            for (AbstractC2126a abstractC2126a : linkedList) {
                handler.post(new RunnableC135467cBS(abstractC2126a, baseEvent));
            }
            MethodCollector.m14707o(354);
            return;
        }
        MethodCollector.m14707o(354);
    }

    public final synchronized void notifyNow(BaseEvent baseEvent) {
        MethodCollector.m14708i(355);
        if (PatchProxy.proxy(new Object[]{baseEvent}, this, changeQuickRedirect, false, 4).isSupported) {
            MethodCollector.m14707o(355);
            return;
        }
        C106862S5w.LIZ(baseEvent);
        LinkedList<AbstractC2126a> linkedList = observers.get(baseEvent.getClass().getName());
        if (linkedList != null) {
            for (AbstractC2126a abstractC2126a : linkedList) {
                abstractC2126a.onEvent(baseEvent);
            }
            MethodCollector.m14707o(355);
            return;
        }
        MethodCollector.m14707o(355);
    }

    public final synchronized void register(AbstractC2126a abstractC2126a) {
        Class<? extends BaseEvent>[] listEvents;
        MethodCollector.m14708i(352);
        if (PatchProxy.proxy(new Object[]{abstractC2126a}, this, changeQuickRedirect, false, 1).isSupported) {
            MethodCollector.m14707o(352);
        } else if (abstractC2126a != null && (listEvents = abstractC2126a.listEvents()) != null) {
            for (Class<? extends BaseEvent> cls : listEvents) {
                LinkedList<AbstractC2126a> linkedList = observers.get(cls.getName());
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    HashMap<String, LinkedList<AbstractC2126a>> hashMap = observers;
                    String name = cls.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "");
                    hashMap.put(name, linkedList);
                }
                if (!linkedList.contains(abstractC2126a)) {
                    linkedList.add(abstractC2126a);
                }
            }
            MethodCollector.m14707o(352);
        } else {
            MethodCollector.m14707o(352);
        }
    }

    public final synchronized void unregister(AbstractC2126a abstractC2126a) {
        Class<? extends BaseEvent>[] listEvents;
        MethodCollector.m14708i(353);
        if (PatchProxy.proxy(new Object[]{abstractC2126a}, this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(353);
        } else if (abstractC2126a != null && (listEvents = abstractC2126a.listEvents()) != null) {
            for (Class<? extends BaseEvent> cls : listEvents) {
                LinkedList<AbstractC2126a> linkedList = observers.get(cls.getName());
                if (linkedList != null) {
                    linkedList.removeLastOccurrence(abstractC2126a);
                }
            }
            MethodCollector.m14707o(353);
        } else {
            MethodCollector.m14707o(353);
        }
    }
}
