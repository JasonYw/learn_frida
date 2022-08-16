package com.bytedance.android.live.broadcast.dialog;

import com.bytedance.android.live.broadcast.p274n.C3166a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class ForenoticeSettingDialog$mPresenter$2 extends Lambda implements Function0<C3166a> {
    public static final ForenoticeSettingDialog$mPresenter$2 INSTANCE = new ForenoticeSettingDialog$mPresenter$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(15389);
    }

    public ForenoticeSettingDialog$mPresenter$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.n.a, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3166a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3166a();
    }
}
