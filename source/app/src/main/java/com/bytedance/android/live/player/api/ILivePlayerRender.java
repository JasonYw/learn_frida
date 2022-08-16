package com.bytedance.android.live.player.api;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.android.livesdkapi.view.IRenderView;
import com.bytedance.covode.number.Covode;
import com.p1594ss.texturerender.VideoSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C4575947t;

/* loaded from: classes12.dex */
public interface ILivePlayerRender {
    public static final C4575947t Companion = C4575947t.LIZ;

    static {
        Covode.recordClassIndex(32827);
    }

    void bindRenderView(IRenderView iRenderView);

    void clipRenderViewVertical(int i, int i2);

    Bitmap getBitmap();

    void getBitmap(Function1<? super Bitmap, Unit> function1);

    void saveByteBuffer(Bundle bundle, VideoSurface.SaveFrameCallback saveFrameCallback);

    void saveFrame(Function1<? super Bitmap, Unit> function1);

    void setImageLayout(int i);
}
