package com.bytedance.android.live.liveinteract.plantform.core;

import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import p003X.HHU;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.core.r */
/* loaded from: classes3.dex */
public interface AbstractC4805r extends HHU {
    static {
        Covode.recordClassIndex(29304);
    }

    void LIZ(long j, long j2);

    void LIZ(long j, Exception exc);

    void LIZ(String str, int i, int i2);

    void LIZ(String str, long j);

    void LIZ(String str, SurfaceView surfaceView, int i, int i2);

    void LIZ(String str, TextureView textureView, int i, int i2);

    void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2);

    void LIZ(String str, Boolean bool);

    void LIZ(String[] strArr, boolean[] zArr, int[] iArr);

    void LIZIZ(long j, Exception exc);

    void LIZIZ(String str, Boolean bool);

    void LIZJ(long j, Exception exc);

    /* renamed from: V_ */
    void mo15660V_();

    /* renamed from: W_ */
    void mo15659W_();

    /* renamed from: d_ */
    void mo15658d_(String str);

    /* renamed from: e_ */
    void mo15661e_(String str);

    /* renamed from: f_ */
    void mo15657f_(String str);
}
