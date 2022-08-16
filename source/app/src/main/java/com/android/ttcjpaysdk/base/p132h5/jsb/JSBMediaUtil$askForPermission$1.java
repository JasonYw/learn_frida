package com.android.ttcjpaysdk.base.p132h5.jsb;

import android.app.Activity;
import androidx.core.app.ActivityCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$askForPermission$1 */
/* loaded from: classes28.dex */
public final class JSBMediaUtil$askForPermission$1 extends Lambda implements Function2<String, Activity, Boolean> {
    public static final JSBMediaUtil$askForPermission$1 INSTANCE = new JSBMediaUtil$askForPermission$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6135);
    }

    public JSBMediaUtil$askForPermission$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Boolean invoke(String str, Activity activity) {
        return Boolean.valueOf(LIZ(str, activity));
    }

    public final boolean LIZ(String str, Activity activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, activity}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str, activity);
        if (ActivityCompat.shouldShowRequestPermissionRationale(activity, str)) {
            return false;
        }
        return true;
    }
}
