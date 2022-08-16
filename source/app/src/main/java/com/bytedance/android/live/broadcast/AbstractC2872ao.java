package com.bytedance.android.live.broadcast;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.api.IXTBroadcastService;
import com.bytedance.android.live.broadcast.api.model.MiniGame;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.preview.C3180k;
import com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p771a.C9477q;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import io.reactivex.Observable;
import java.util.List;
import p003X.AbstractC86584K9y;
import p003X.AbstractC86810KIq;
import p003X.C2FC;
import p003X.LKD;

/* renamed from: com.bytedance.android.live.broadcast.ao */
/* loaded from: classes5.dex */
public interface AbstractC2872ao {
    static {
        Covode.recordClassIndex(14377);
    }

    C2FC LIZ(Fragment fragment, Room room);

    AbstractC86584K9y LIZ();

    AbsStartLiveWidget LIZ(WidgetManager widgetManager, FastStartLiveConfig fastStartLiveConfig, C3180k c3180k);

    Observable<String> LIZ(ScheduledSettingInfo scheduledSettingInfo);

    Observable<Integer> LIZ(C9477q c9477q);

    void LIZ(Context context);

    void LIZ(Context context, DataCenter dataCenter);

    void LIZ(Context context, String str);

    void LIZ(Context context, boolean z, boolean z2, ScheduledSettingInfo scheduledSettingInfo, LKD lkd, int i, String str);

    void LIZ(Room room, LiveMode liveMode, MiniGame miniGame);

    void LIZ(List<String> list);

    IXTBroadcastService LIZIZ();

    void LIZIZ(Context context);

    AbstractC86810KIq LIZJ();
}
