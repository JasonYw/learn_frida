package com.bytedance.android.live.broadcastgame.api.channel;

import com.bytedance.covode.number.Covode;
import io.reactivex.Observable;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcastgame.api.channel.h */
/* loaded from: classes5.dex */
public interface AbstractC3341h {

    /* renamed from: com.bytedance.android.live.broadcastgame.api.channel.h$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3342a {
        static {
            Covode.recordClassIndex(19057);
        }

        MessageTarget LIZ();

        String LIZIZ();
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.channel.h$b */
    /* loaded from: classes5.dex */
    public interface AbstractC3343b {
        static {
            Covode.recordClassIndex(19058);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.api.channel.h$c */
    /* loaded from: classes5.dex */
    public static final class C3344c implements AbstractC3343b {
        static {
            Covode.recordClassIndex(19059);
        }
    }

    static {
        Covode.recordClassIndex(19056);
    }

    Observable<AbstractC3343b> LIZ(AbstractC3342a abstractC3342a);

    List<ChannelType> LIZ();
}
