package com.bytedance.android.live.browser.webview.fragment;

import com.bytedance.android.live.browser.webview.config.LiveHybridSettingKeys;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C101346Pvg;
import p003X.C3VF;
import p003X.C99783PRp;

/* loaded from: classes8.dex */
public final class LiveAnnieFragment$canShowFloatLive$2 extends Lambda implements Function0<Boolean> {
    public static final LiveAnnieFragment$canShowFloatLive$2 INSTANCE = new LiveAnnieFragment$canShowFloatLive$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23118);
    }

    public LiveAnnieFragment$canShowFloatLive$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        Long l;
        C3VF user;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            Room LIZIZ = C101346Pvg.LIZIZ();
            Long l2 = null;
            if (LIZIZ != null) {
                l = Long.valueOf(LIZIZ.ownerUserId);
            } else {
                l = null;
            }
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                l2 = Long.valueOf(user.LIZIZ());
            }
            if ((!Intrinsics.areEqual(l, l2)) && C99783PRp.LJIIIZ() && !C99783PRp.m22998LJ().LIZJ) {
                SettingKey<Boolean> settingKey = LiveHybridSettingKeys.ENABLE_AUTO_SHOW_FLOAT_LIVE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
