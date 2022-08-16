package android.p006ss.com.vboost;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.CHRYRomUtils */
/* loaded from: classes2.dex */
public class CHRYRomUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24);
    }

    public static boolean isCHRYRom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String str = Build.MANUFACTURER;
        if (TextUtils.isEmpty(str) || !str.contains("HUAWEI")) {
            return false;
        }
        return true;
    }
}
