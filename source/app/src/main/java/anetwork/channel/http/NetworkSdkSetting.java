package anetwork.channel.http;

import android.content.Context;
import anet.channel.entity.ENV;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class NetworkSdkSetting implements Serializable {
    public static Context context;
    public static ENV CURRENT_ENV = ENV.ONLINE;
    public static AtomicBoolean isInit = new AtomicBoolean(false);
    public static HashMap<String, Object> initParams = null;

    public static Context LIZ() {
        return context;
    }

    static {
        Covode.recordClassIndex(2471);
    }
}
