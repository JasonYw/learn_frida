package com.bytedance.android.live.broadcastgame.debug;

import com.bytedance.android.live.broadcastgame.api.C3324a;
import com.bytedance.android.live.broadcastgame.debug.ListStore$array$2;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C6D5;

/* renamed from: com.bytedance.android.live.broadcastgame.debug.b */
/* loaded from: classes23.dex */
public final class C3465b {
    public static ChangeQuickRedirect LIZ;
    public final Map<Class<?>, C6D5<?, ?>> LIZIZ;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(LiveGameDebugChannel$listeners$2.INSTANCE);

    static {
        Covode.recordClassIndex(19708);
    }

    public final Map<Class<?>, List<Function1<?, Unit>>> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Map) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public C3465b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        final LiveGameDebugChannel$$special$$inlined$apply$lambda$1 liveGameDebugChannel$$special$$inlined$apply$lambda$1 = new LiveGameDebugChannel$$special$$inlined$apply$lambda$1(this);
        linkedHashMap.put(C3324a.class, new C6D5<IN, List<? extends IN>>(liveGameDebugChannel$$special$$inlined$apply$lambda$1) { // from class: X.6D2
            public static ChangeQuickRedirect LIZ;
            public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(ListStore$array$2.INSTANCE);
            public final Function1<List<? extends IN>, Unit> LIZJ;

            static {
                Covode.recordClassIndex(19707);
            }

            private final List<IN> LIZJ() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                return (List) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
            }

            @Override // p003X.C6D5
            public final void LIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
                    return;
                }
                this.LIZJ.invoke(LIZJ());
            }

            @Override // p003X.C6D5
            public final void LIZIZ() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
                    return;
                }
                LIZJ().clear();
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                C106862S5w.LIZ(liveGameDebugChannel$$special$$inlined$apply$lambda$1);
                this.LIZJ = liveGameDebugChannel$$special$$inlined$apply$lambda$1;
            }

            @Override // p003X.C6D5
            public final void LIZ(IN in) {
                if (PatchProxy.proxy(new Object[]{in}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                LIZJ().add(in);
                LIZ();
            }
        });
        this.LIZIZ = linkedHashMap;
    }
}
