package com.bytedance.android.annie.api;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnnieHelper {
    public static final AnnieHelper INSTANCE = new AnnieHelper();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10449);
    }

    @JvmStatic
    public static final boolean canHandle(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual(str, "webcast_webview") || Intrinsics.areEqual(str, "webcast_lynxview")) {
            return true;
        }
        return false;
    }

    @JvmStatic
    public static final Uri createH5SchemeByUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        C106862S5w.LIZ(str);
        Uri build = Uri.parse("sslocal://webcast_webview?hybrid_type=h5").buildUpon().appendQueryParameter(PushConstants.WEB_URL, str).build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    @JvmStatic
    public static final Uri.Builder createLynxSchemeBuilderByUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Uri.Builder) proxy.result;
        }
        C106862S5w.LIZ(str);
        Uri.Builder appendQueryParameter = Uri.parse("sslocal://webcast_lynxview?hybrid_type=lynx").buildUpon().appendQueryParameter(PushConstants.WEB_URL, str);
        Intrinsics.checkNotNullExpressionValue(appendQueryParameter, "");
        return appendQueryParameter;
    }

    @JvmStatic
    public static final Uri createLynxSchemeByUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        C106862S5w.LIZ(str);
        Uri build = Uri.parse("sslocal://webcast_lynxview?hybrid_type=lynx").buildUpon().appendQueryParameter(PushConstants.WEB_URL, str).build();
        Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
