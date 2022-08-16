package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.android.live.browser.jsbridge.newmethods.GetAppInfoResultModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.PermissionGroup;
import com.google.gson.JsonObject;

/* loaded from: classes5.dex */
public abstract class AbsGetAppInfoMethod<P extends JsonObject, R extends GetAppInfoResultModel> extends AbstractC13049f<P, R> {
    public final String methodName = "getAppInfo";

    static {
        Covode.recordClassIndex(22571);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public void onTerminate() {
    }

    public final String getMethodName() {
        return this.methodName;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13047d
    public PermissionGroup getPermissionGroup() {
        return PermissionGroup.PRIVATE;
    }
}
