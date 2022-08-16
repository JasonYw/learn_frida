package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcastgame.api.channel.AbstractC3332b;
import com.bytedance.android.live.broadcastgame.api.interactgame.JsFuncInjector;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public interface IAnchorAudienceMsgService extends IService, AbstractC3332b, AbstractC3334d {
    static {
        Covode.recordClassIndex(19036);
    }

    /* renamed from: createAnchorAudienceMsgChannel */
    AbstractC3332b mo25451createAnchorAudienceMsgChannel(DataCenter dataCenter, AbstractC5436a abstractC5436a, boolean z, Room room);

    void release(long j);

    @Deprecated(message = "对外接口暂时保留")
    void sendMsgToAnchor(String str, String str2, long j, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b);

    @Deprecated(message = "对外接口暂时保留")
    void sendMsgToAudience(String str, String str2, long j, int i, long j2, String str3, JsFuncInjector.Type type, AbstractC3332b.AbstractC3333b abstractC3333b, int i2);
}
