package com.bytedance.android.live.broadcastgame.opengame.runtime;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC87834KjE;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.runtime.g */
/* loaded from: classes5.dex */
public interface AbstractC3659g {
    static {
        Covode.recordClassIndex(20910);
    }

    Observable<Bitmap> captureView();

    void downloadResource(Context context, String str, AbstractC3661j abstractC3661j);

    Long getTotalShowTime();

    void injectOpenApi(AbstractC87834KjE abstractC87834KjE);

    void onFail(String str);

    void onHide();

    void onLaunch();

    void onShow(Map<String, String> map);

    void onStart();

    void onStop();

    <T> void sendEvent(String str, T t);
}
