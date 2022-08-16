package android.support.wearable.complications;

import android.app.Service;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes2.dex */
public abstract class ComplicationProviderService extends Service {
    static {
        Covode.recordClassIndex(261);
    }

    public ComplicationProviderService() {
        new Handler(Looper.getMainLooper());
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }
}
