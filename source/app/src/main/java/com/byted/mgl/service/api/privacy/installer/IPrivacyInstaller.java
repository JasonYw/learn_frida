package com.byted.mgl.service.api.privacy.installer;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface IPrivacyInstaller {
    static {
        Covode.recordClassIndex(9802);
    }

    Object createTaskBuilder(Context context, String str, String str2);
}
