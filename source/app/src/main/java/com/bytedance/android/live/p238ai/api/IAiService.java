package com.bytedance.android.live.p238ai.api;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import p003X.AbstractC91043Ltt;
import p003X.AbstractC91467M1t;
import p003X.LMJ;

/* renamed from: com.bytedance.android.live.ai.api.IAiService */
/* loaded from: classes5.dex */
public interface IAiService extends IService {
    static {
        Covode.recordClassIndex(13806);
    }

    View getDebugView(Context context);

    AbstractC91043Ltt getHarService();

    AbstractC91467M1t getOhrService();

    List<AbstractC2780a> getRoomLifecycleObserverList();

    LinkedList<Long> getRoomListNotToPredictResolution();

    boolean isDynamicSREnable();

    void preInit();

    boolean predict(AbstractC2789c abstractC2789c);

    String predictResolution();

    AbstractC2780a roomLifecycleObserver();

    void setResolutionStrategyInput(Room room, int i);

    void setRoomListNotToPredictResolution(Room room);

    void startStreamStrategy();

    void stopStreamStrategy();

    void triggerDrawerPredict(JSONObject jSONObject);

    void triggerGamePredict(JSONObject jSONObject, LMJ lmj);

    void triggerResolutionPredict();

    void triggerSRPredict();
}
