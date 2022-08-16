package com.bytedance.android.btm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public interface BtmPageLifecycle {
    static {
        Covode.recordClassIndex(11277);
    }

    State getNativeState(Object obj);

    State getPageState(Object obj);

    void ignoreAShow(Object obj);

    void onPageDestroy(Object obj);

    void onPageHide(Object obj, Boolean bool);

    void onPageShow(Object obj, Boolean bool);

    void setNativeState(Object obj, State state);

    void setUserVisibleHint(Object obj, boolean z);

    /* loaded from: classes18.dex */
    public enum State {
        INITIALIZED,
        CREATED,
        RESUMED,
        PAUSED,
        DESTROYED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            if (ReDexClinitStringAb.abTest >= 5) {
                clinit$r$fake();
                return;
            }
            Covode.recordClassIndex(11279);
        }

        private static void clinit$r$fake() {
            Covode.recordClassIndex(11279);
            State state = new State();
            INITIALIZED = state;
            State state2 = new State();
            CREATED = state2;
            State state3 = new State();
            RESUMED = state3;
            State state4 = new State();
            PAUSED = state4;
            State state5 = new State();
            DESTROYED = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (State) (proxy.isSupported ? proxy.result : Enum.valueOf(State.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static State[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (State[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final boolean isAtLeast(State state) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            C106862S5w.LIZ(state);
            if (compareTo(state) >= 0) {
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes18.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(11278);
        }

        public static /* synthetic */ void onPageHide$default(BtmPageLifecycle btmPageLifecycle, Object obj, Boolean bool, int i, Object obj2) {
            if (PatchProxy.proxy(new Object[]{btmPageLifecycle, obj, bool, Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 2).isSupported) {
                return;
            }
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    bool = null;
                }
                btmPageLifecycle.onPageHide(obj, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPageHide");
        }

        public static /* synthetic */ void onPageShow$default(BtmPageLifecycle btmPageLifecycle, Object obj, Boolean bool, int i, Object obj2) {
            if (PatchProxy.proxy(new Object[]{btmPageLifecycle, obj, bool, Integer.valueOf(i), obj2}, null, changeQuickRedirect, true, 1).isSupported) {
                return;
            }
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    bool = null;
                }
                btmPageLifecycle.onPageShow(obj, bool);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onPageShow");
        }
    }
}
