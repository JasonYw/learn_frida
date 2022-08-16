package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3341h;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.Observable;
import org.json.JSONObject;
import p003X.C45S;

/* renamed from: com.bytedance.android.live.broadcastgame.api.channel.b */
/* loaded from: classes5.dex */
public interface AbstractC3332b {
    public static final C45S LIZ = C45S.LIZLLL;

    /* renamed from: com.bytedance.android.live.broadcastgame.api.channel.b$b */
    /* loaded from: classes5.dex */
    public interface AbstractC3333b {
        static {
            Covode.recordClassIndex(19047);
        }

        void LIZ(Throwable th);

        void LIZ(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(19045);
    }

    void clearSeiMessage();

    void enterRoom(DataCenter dataCenter, Room room, AbstractC5436a abstractC5436a);

    void onPause();

    void onResume();

    void onSeiUpdate(String str);

    void registerMessage(AbstractC3335e abstractC3335e);

    void release();

    void sendHeartBeat(int i, long j);

    Observable<AbstractC3341h.AbstractC3343b> sendMessage(AbstractC3341h.AbstractC3342a abstractC3342a);

    void setCurrentPlayId(long j);

    void setGameExtra(C3383p c3383p);

    void unregisterMessage(AbstractC3335e abstractC3335e);
}
