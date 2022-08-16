package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.viewbinder.UserViewBinder$userViewItemSelectedJudgement$1 */
/* loaded from: classes3.dex */
public final class UserViewBinder$userViewItemSelectedJudgement$1 extends Lambda implements Function1<C3195i, Boolean> {
    public static final UserViewBinder$userViewItemSelectedJudgement$1 INSTANCE = new UserViewBinder$userViewItemSelectedJudgement$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17409);
    }

    public UserViewBinder$userViewItemSelectedJudgement$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(C3195i c3195i) {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3195i}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c3195i);
        }
        return Boolean.valueOf(z);
    }
}
