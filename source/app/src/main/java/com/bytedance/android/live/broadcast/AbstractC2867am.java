package com.bytedance.android.live.broadcast;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.broadcast.widget.AbsCaptureWidget;
import com.bytedance.android.live.effect.view.EffectLiveBroadcastActivityProxy;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.p417a.AbstractC5437g;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.covode.number.Covode;
import p003X.K06;
import p003X.K2T;

/* renamed from: com.bytedance.android.live.broadcast.am */
/* loaded from: classes5.dex */
public interface AbstractC2867am {
    static {
        Covode.recordClassIndex(14345);
    }

    K2T LIZ();

    Fragment LIZ(K06 k06, LiveMode liveMode, StreamUrlExtra streamUrlExtra, String str);

    AbsCaptureWidget LIZ(AbstractC5437g abstractC5437g, AbstractC5436a abstractC5436a);

    AbsCaptureWidget LIZ(AbstractC5437g abstractC5437g, StreamUrlExtra streamUrlExtra, AbstractC5436a abstractC5436a, EffectLiveBroadcastActivityProxy effectLiveBroadcastActivityProxy);

    String LIZ(String str);
}
