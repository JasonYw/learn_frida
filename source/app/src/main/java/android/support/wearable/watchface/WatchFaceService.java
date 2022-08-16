package android.support.wearable.watchface;

import android.content.Context;
import android.service.wallpaper.WallpaperService;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.AppMonitor;
import p003X.C140181dPd;
import p003X.C140192dPo;

/* loaded from: classes10.dex */
public abstract class WatchFaceService extends WallpaperService {
    static {
        Covode.recordClassIndex(356);
        new String[]{"charging", "airplane_mode", "connected", "theater_mode", "gps_active", "keyguard_locked", "interruption_filter"};
    }

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        if (!AppMonitor.INSTANCE.isAppBackground() && C140192dPo.LIZ("serviceAttachBaseContext")) {
            C140181dPd.LIZLLL();
        }
        super.attachBaseContext(context);
    }
}
