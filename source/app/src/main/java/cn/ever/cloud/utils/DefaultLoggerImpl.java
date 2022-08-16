package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC521786jU;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DefaultLoggerImpl implements AbstractC521786jU {
    public static final DefaultLoggerImpl INSTANCE = new DefaultLoggerImpl();
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // p003X.AbstractC521786jU
    public final void print(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
    }

    static {
        Covode.recordClassIndex(3423);
    }
}
