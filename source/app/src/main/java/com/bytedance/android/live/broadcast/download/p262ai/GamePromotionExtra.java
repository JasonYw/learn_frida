package com.bytedance.android.live.broadcast.download.p262ai;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.download.ai.GamePromotionExtra */
/* loaded from: classes3.dex */
public final class GamePromotionExtra {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ai_intro_status")
    public final AiIntroStatus statusList;

    static {
        Covode.recordClassIndex(15539);
    }

    public static /* synthetic */ GamePromotionExtra copy$default(GamePromotionExtra gamePromotionExtra, AiIntroStatus aiIntroStatus, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gamePromotionExtra, aiIntroStatus, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (GamePromotionExtra) proxy.result;
        }
        if ((i & 1) != 0) {
            aiIntroStatus = gamePromotionExtra.statusList;
        }
        return gamePromotionExtra.copy(aiIntroStatus);
    }

    private Object[] getObjects() {
        return new Object[]{this.statusList};
    }

    public final AiIntroStatus component1() {
        return this.statusList;
    }

    public final GamePromotionExtra copy(AiIntroStatus aiIntroStatus) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{aiIntroStatus}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (GamePromotionExtra) proxy.result;
        }
        C106862S5w.LIZ(aiIntroStatus);
        return new GamePromotionExtra(aiIntroStatus);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof GamePromotionExtra) {
            return C106862S5w.LIZ(((GamePromotionExtra) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("GamePromotionExtra:%s", getObjects());
    }

    public final AiIntroStatus getStatusList() {
        return this.statusList;
    }

    public GamePromotionExtra(AiIntroStatus aiIntroStatus) {
        C106862S5w.LIZ(aiIntroStatus);
        this.statusList = aiIntroStatus;
    }
}
