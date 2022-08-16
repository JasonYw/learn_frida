package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.UserViewBinder$UserClickListener$1 */
/* loaded from: classes3.dex */
public final class UserViewBinder$UserClickListener$1 extends Lambda implements Function2<C3195i, Boolean, Boolean> {
    public static final UserViewBinder$UserClickListener$1 INSTANCE = new UserViewBinder$UserClickListener$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17408);
    }

    public UserViewBinder$UserClickListener$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Boolean invoke(C3195i c3195i, Boolean bool) {
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3195i, Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c3195i);
        }
        return Boolean.valueOf(z);
    }
}
