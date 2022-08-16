package com.bytedance.android.live.broadcast.api.p255g;

import android.view.SurfaceView;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.broadcast.api.g.g */
/* loaded from: classes3.dex */
public interface AbstractC2885g extends AbstractC6070q {

    /* renamed from: com.bytedance.android.live.broadcast.api.g.g$a */
    /* loaded from: classes5.dex */
    public interface AbstractC2886a {
        static {
            Covode.recordClassIndex(14460);
        }

        void LIZ();
    }

    /* renamed from: com.bytedance.android.live.broadcast.api.g.g$b */
    /* loaded from: classes5.dex */
    public interface AbstractC2887b {
        static {
            Covode.recordClassIndex(14461);
        }

        int LIZ(boolean z);
    }

    static {
        Covode.recordClassIndex(14459);
    }

    void LIZ();

    void LIZ(int i);

    void LIZ(AbstractC2886a abstractC2886a);

    void LIZ(boolean z);

    void LIZIZ();

    boolean LIZJ();

    void LIZLLL();

    /* renamed from: LJ */
    boolean mo15919LJ();

    void LJI();

    long getCameraDuration();

    @Override // com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q
    AbstractC5436a getLiveStream();

    SurfaceView getSurfaceView();

    int getVideoCapture();

    /* renamed from: k_ */
    void mo15918k_();

    void setBeautyPreviewStatus(boolean z);

    void setVideoCapture(int i);
}
