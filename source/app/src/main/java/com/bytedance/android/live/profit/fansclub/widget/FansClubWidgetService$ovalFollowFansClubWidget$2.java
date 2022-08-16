package com.bytedance.android.live.profit.fansclub.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class FansClubWidgetService$ovalFollowFansClubWidget$2 extends Lambda implements Function0<OvalFollowFansClubWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isVSRoom;

    static {
        Covode.recordClassIndex(33357);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FansClubWidgetService$ovalFollowFansClubWidget$2(boolean z) {
        super(0);
        this.$isVSRoom = z;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, com.bytedance.android.live.profit.fansclub.widget.OvalFollowFansClubWidget] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ OvalFollowFansClubWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new OvalFollowFansClubWidget(this.$isVSRoom);
    }
}
