package com.bytedance.android.live.liveinteract.videotalk.p391ui;

import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.videotalk.p388c.AbstractC4912d;
import com.bytedance.covode.number.Covode;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p003X.C78616Gyw;
import p003X.C79400HRq;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.m */
/* loaded from: classes3.dex */
public interface AbstractC4964m {

    /* renamed from: com.bytedance.android.live.liveinteract.videotalk.ui.m$a */
    /* loaded from: classes3.dex */
    public interface AbstractC4965a {
        static {
            Covode.recordClassIndex(30537);
        }

        void LIZ(String str, boolean z);

        ILayerControl.ILayer LJI(String str);

        ArrayList<LinkPlayerInfo> LJI();

        void LJII(String str);

        ArrayList<LinkPlayerInfo> LJJIIZI();

        SurfaceView LJJIJ();

        String LJJIJIIJI();

        void LJJIJIIJIL();

        LiveCore LJJIJIL();

        HashMap<String, Boolean> ah_();

        HashMap<String, View> ai_();
    }

    static {
        Covode.recordClassIndex(30536);
    }

    void LIZ(C78616Gyw c78616Gyw);

    void LIZ(C79400HRq c79400HRq);

    void LIZ(View view);

    void LIZ(View view, MotionEvent motionEvent);

    void LIZ(String str);

    void LIZ(String str, View view);

    void LIZ(Map<String, Long> map);

    void LIZ(String[] strArr, boolean[] zArr);

    void LIZIZ(String str);

    void LIZIZ(String str, boolean z);

    void LIZJ();

    boolean LIZJ(String str);

    int LIZLLL(String str);

    void LIZLLL();

    /* renamed from: LJ */
    boolean mo15677LJ(String str);

    void LJI();

    AbstractC4912d LJII();

    SurfaceView LJIIIIZZ();

    void LJIIIZ();

    void LJIIJ();

    void LJIIJJI();

    boolean LJIIL();

    void LJIILIIL();

    void LJIILJJIL();

    void LJIILL();

    void LJIILLIIL();

    void LJIJ();

    void LJIJI();
}
