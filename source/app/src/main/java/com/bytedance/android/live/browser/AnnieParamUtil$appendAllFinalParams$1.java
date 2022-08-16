package com.bytedance.android.live.browser;

import com.bytedance.android.annie.param.C2613i;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class AnnieParamUtil$appendAllFinalParams$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2613i $param;

    static {
        Covode.recordClassIndex(21865);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieParamUtil$appendAllFinalParams$1(C2613i c2613i) {
        super(0);
        this.$param = c2613i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        IHostContext iHostContext;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (iHostContext = (IHostContext) ServiceManager.getService(IHostContext.class)) != null) {
            C2613i c2613i = this.$param;
            String valueOf = String.valueOf(iHostContext.appId());
            if (!PatchProxy.proxy(new Object[]{valueOf}, c2613i, C2613i.LIZ, false, 2).isSupported) {
                C106862S5w.LIZ(valueOf);
                c2613i.LIZJ = valueOf;
            }
            C2613i c2613i2 = this.$param;
            String appName = iHostContext.appName();
            Intrinsics.checkNotNullExpressionValue(appName, "");
            if (!PatchProxy.proxy(new Object[]{appName}, c2613i2, C2613i.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(appName);
                c2613i2.LIZLLL = appName;
            }
            C2613i c2613i3 = this.$param;
            String channel = iHostContext.getChannel();
            Intrinsics.checkNotNullExpressionValue(channel, "");
            if (!PatchProxy.proxy(new Object[]{channel}, c2613i3, C2613i.LIZ, false, 1).isSupported) {
                C106862S5w.LIZ(channel);
                c2613i3.LIZIZ = channel;
            }
            C2613i c2613i4 = this.$param;
            String versionCode = iHostContext.getVersionCode();
            Intrinsics.checkNotNullExpressionValue(versionCode, "");
            if (!PatchProxy.proxy(new Object[]{versionCode}, c2613i4, C2613i.LIZ, false, 5).isSupported) {
                C106862S5w.LIZ(versionCode);
                c2613i4.LJFF = versionCode;
            }
            C2613i c2613i5 = this.$param;
            if (!PatchProxy.proxy(new Object[]{"2560"}, c2613i5, C2613i.LIZ, false, 7).isSupported) {
                C106862S5w.LIZ("2560");
                c2613i5.LJII = "2560";
            }
        }
        return Unit.INSTANCE;
    }
}
