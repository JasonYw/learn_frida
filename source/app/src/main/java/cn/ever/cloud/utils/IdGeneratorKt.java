package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class IdGeneratorKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3429);
    }

    public static final void main(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) strArr);
        int i = 0;
        do {
            long gen2 = IdGenerator.INSTANCE.gen(0);
            System.out.println((Object) ("random: " + gen2));
            i++;
        } while (i < 100);
    }
}
