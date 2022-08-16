package androidx.core.net;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public final class ConnectivityManagerCompat {
    static {
        Covode.recordClassIndex(1007);
    }

    public static int getRestrictBackgroundStatus(ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }

    public static boolean isActiveNetworkMetered(ConnectivityManager connectivityManager) {
        int i = Build.VERSION.SDK_INT;
        return connectivityManager.isActiveNetworkMetered();
    }

    public static NetworkInfo getNetworkInfoFromBroadcast(ConnectivityManager connectivityManager, Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return C116971W2r.LIZ(connectivityManager, networkInfo.getType());
        }
        return null;
    }
}
