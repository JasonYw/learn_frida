package com.bytedance.android.annie.api.schema;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class FallbackUtil {
    public static final FallbackUtil INSTANCE = new FallbackUtil();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10485);
    }

    @JvmStatic
    public static final boolean isHttpScheme(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        return StringsKt__StringsJVMKt.startsWith$default(str, "http", false, 2, null);
    }

    @JvmStatic
    public static final String getHttpUrl(String str) {
        Object createFailure;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(str);
        if (isHttpScheme(str)) {
            return str;
        }
        try {
            createFailure = Uri.parse(str).getQueryParameter(PushConstants.WEB_URL);
            Result.m30308constructorimpl(createFailure);
        } catch (Throwable th) {
            createFailure = ResultKt.createFailure(th);
            Result.m30308constructorimpl(createFailure);
        }
        if (Result.m30314isFailureimpl(createFailure)) {
            createFailure = null;
        }
        String str2 = (String) createFailure;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0078 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:10:0x0027, B:12:0x0041, B:14:0x0047, B:16:0x004e, B:21:0x0058, B:23:0x005e, B:24:0x0062, B:25:0x0072, B:27:0x0078, B:30:0x0086, B:35:0x008c, B:36:0x0092, B:38:0x0098, B:40:0x00a6, B:41:0x00ae, B:43:0x00b4, B:45:0x00c6, B:47:0x00d7, B:52:0x00e7, B:60:0x00f9, B:62:0x00ff, B:64:0x0106), top: B:9:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[Catch: all -> 0x0115, LOOP:1: B:36:0x0092->B:38:0x0098, LOOP_END, TryCatch #0 {all -> 0x0115, blocks: (B:10:0x0027, B:12:0x0041, B:14:0x0047, B:16:0x004e, B:21:0x0058, B:23:0x005e, B:24:0x0062, B:25:0x0072, B:27:0x0078, B:30:0x0086, B:35:0x008c, B:36:0x0092, B:38:0x0098, B:40:0x00a6, B:41:0x00ae, B:43:0x00b4, B:45:0x00c6, B:47:0x00d7, B:52:0x00e7, B:60:0x00f9, B:62:0x00ff, B:64:0x0106), top: B:9:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:10:0x0027, B:12:0x0041, B:14:0x0047, B:16:0x004e, B:21:0x0058, B:23:0x005e, B:24:0x0062, B:25:0x0072, B:27:0x0078, B:30:0x0086, B:35:0x008c, B:36:0x0092, B:38:0x0098, B:40:0x00a6, B:41:0x00ae, B:43:0x00b4, B:45:0x00c6, B:47:0x00d7, B:52:0x00e7, B:60:0x00f9, B:62:0x00ff, B:64:0x0106), top: B:9:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0128 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0129 A[RETURN] */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String appendParamsToUrlAndFallbackUrl(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.api.schema.FallbackUtil.appendParamsToUrlAndFallbackUrl(java.lang.String, java.util.Map):java.lang.String");
    }
}
