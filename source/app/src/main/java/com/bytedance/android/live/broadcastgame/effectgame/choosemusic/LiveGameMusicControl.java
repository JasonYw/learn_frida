package com.bytedance.android.live.broadcastgame.effectgame.choosemusic;

import com.bytedance.android.livesdk.message.model.MusicPanel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import kotlin.Pair;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveGameMusicControl {
    public static ChangeQuickRedirect LIZ;
    public Pair<MusicPanel, MusicPanel> LIZIZ;
    public final Operation LIZJ;

    /* loaded from: classes5.dex */
    public enum Operation {
        START,
        STOP,
        PLAY_END;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(19800);
        }

        public static Operation valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Operation) (proxy.isSupported ? proxy.result : Enum.valueOf(Operation.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Operation[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Operation[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(19799);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiveGameMusicControl) {
            return C106862S5w.LIZ(((LiveGameMusicControl) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LiveGameMusicControl:%s", LIZ());
    }

    public LiveGameMusicControl(Operation operation) {
        C106862S5w.LIZ(operation);
        this.LIZJ = operation;
    }
}
