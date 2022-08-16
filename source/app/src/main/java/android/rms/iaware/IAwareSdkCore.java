package android.rms.iaware;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class IAwareSdkCore {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(22);
    }

    public static boolean handleEvent(int i, Parcel parcel, Parcel parcel2, int i2) {
        return false;
    }

    public static boolean handleEvent(int i, Parcel parcel, Parcel parcel2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), parcel, parcel2}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return handleEvent(i, parcel, parcel2, -1);
    }
}
