package android.p006ss.com.vboost;

import android.p006ss.com.vboost.utils.RomUtils;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.VoRomUtils */
/* loaded from: classes18.dex */
public class VoRomUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(44);
    }

    public static boolean isVoRom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String LIZ = RomUtils.LIZ("ro.vivo.os.name");
        if (TextUtils.isEmpty(LIZ) || !LIZ.toLowerCase().contains("funtouch")) {
            return false;
        }
        return true;
    }
}
