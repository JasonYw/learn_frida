package com.bytedance.android.live.core.utils;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostBusiness;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import p003X.C88605Kvf;

/* loaded from: classes5.dex */
public class TTLiveFileProvider extends FileProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23829);
    }

    public static Uri getUri(Context context, String str, File file) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, file}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Uri) proxy.result;
        }
        if (ServiceManager.getService(IHostBusiness.class) != null && ((IHostBusiness) ServiceManager.getService(IHostBusiness.class)).isDouyinPreInstall()) {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context, file}, null, C88605Kvf.LIZ, true, 3);
            if (proxy2.isSupported) {
                return (Uri) proxy2.result;
            }
            return C88605Kvf.LIZLLL.LIZ(context, file);
        }
        return FileProvider.getUriForFile(context, str, file);
    }
}
