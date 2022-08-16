package android.p006ss.com.vboost;

import android.p006ss.com.vboost.utils.RomUtils;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.OpRomUtils */
/* loaded from: classes18.dex */
public class OpRomUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(38);
    }

    public static boolean isOpRom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String LIZ = RomUtils.LIZ("ro.product.brand");
        if (TextUtils.isEmpty(LIZ) || !LIZ.toLowerCase().contains("oppo")) {
            return false;
        }
        return true;
    }
}
