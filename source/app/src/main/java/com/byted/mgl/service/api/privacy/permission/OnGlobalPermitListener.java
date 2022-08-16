package com.byted.mgl.service.api.privacy.permission;

import com.byted.mgl.service.api.privacy.permission.PermitResult;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface OnGlobalPermitListener {
    static {
        Covode.recordClassIndex(9810);
    }

    void onPermissionNeverAsk(String[] strArr, int[] iArr, String[] strArr2);

    void onPermissionResult(String str, PermitResult.Type type);
}
