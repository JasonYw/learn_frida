package com.byted.mgl.service.api.privacy.permission;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Set;

/* loaded from: classes15.dex */
public interface IPrivacyPermission {
    static {
        Covode.recordClassIndex(9809);
    }

    void addPermissionResultListener(OnGlobalPermitListener onGlobalPermitListener);

    boolean hasPermission(Context context, String str);

    boolean hasPermissions(Context context, String[] strArr);

    void removePermissionResultListener(OnGlobalPermitListener onGlobalPermitListener);

    void requestPermissions(Activity activity, String str, Set<String> set, AbsPermitListener absPermitListener);

    void requestPermissions(Activity activity, String str, String[] strArr, AbsPermitListener absPermitListener);
}
