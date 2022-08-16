package android.p006ss.com.vboost;

import android.p006ss.com.vboost.utils.RomUtils;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: android.ss.com.vboost.XmRomUtils */
/* loaded from: classes18.dex */
public class XmRomUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(45);
    }

    public static boolean isXmRom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(RomUtils.LIZ("ro.miui.ui.version.name"))) {
            return false;
        }
        return true;
    }
}
