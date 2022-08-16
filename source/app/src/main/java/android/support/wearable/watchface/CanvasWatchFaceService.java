package android.support.wearable.watchface;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes10.dex */
public abstract class CanvasWatchFaceService extends WatchFaceService {
    static {
        Covode.recordClassIndex(354);
    }

    @Override // android.support.wearable.watchface.WatchFaceService, android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }
}
