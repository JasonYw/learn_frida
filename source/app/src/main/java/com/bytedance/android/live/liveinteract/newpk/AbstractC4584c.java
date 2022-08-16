package com.bytedance.android.live.liveinteract.newpk;

import android.view.SurfaceView;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.p1594ss.avframework.livestreamv2.core.ILayerControl;
import java.nio.ByteBuffer;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.c */
/* loaded from: classes3.dex */
public interface AbstractC4584c {
    static {
        Covode.recordClassIndex(28496);
    }

    void LIZ(long j, long j2);

    void LIZ(long j, Exception exc);

    void LIZ(String str, long j);

    void LIZ(String str, SurfaceView surfaceView, int i, int i2);

    void LIZ(String str, TextureView textureView, int i, int i2);

    void LIZ(String str, ILayerControl.ILayer iLayer, int i, int i2);

    void LIZ(String str, Boolean bool);

    void LIZ(String str, ByteBuffer byteBuffer);

    void LIZ(String[] strArr, boolean[] zArr, int[] iArr);

    void LIZIZ(long j, Exception exc);

    void LIZIZ(String str);

    void LIZIZ(String str, SurfaceView surfaceView, int i, int i2);

    void LIZIZ(String str, TextureView textureView, int i, int i2);

    void LIZIZ(String str, ILayerControl.ILayer iLayer, int i, int i2);

    void LIZIZ(String str, Boolean bool);

    /* renamed from: Z_ */
    void mo15698Z_();

    /* renamed from: g_ */
    void mo15697g_(String str);
}
