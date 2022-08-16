package com.bytedance.android.live.liveinteract.feed;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C80695HrN;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.liveinteract.feed.CameraTalkRoomNewFeedView$checkChallengePlayMode$$inlined$let$lambda$1 */
/* loaded from: classes3.dex */
public final class C4412xb671c375 extends Lambda implements Function1<ViewGroup.LayoutParams, ViewGroup.LayoutParams> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ConstraintLayout.LayoutParams $layoutParams$inlined;
    public final /* synthetic */ C80695HrN this$0;

    static {
        Covode.recordClassIndex(26889);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4412xb671c375(C80695HrN c80695HrN, ConstraintLayout.LayoutParams layoutParams) {
        super(1);
        this.this$0 = c80695HrN;
        this.$layoutParams$inlined = layoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.ViewGroup$LayoutParams, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ ViewGroup.LayoutParams invoke(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.LayoutParams layoutParams2 = layoutParams;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutParams2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams2 = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
        if (marginLayoutParams == null) {
            marginLayoutParams = this.this$0.getKsongLp();
        }
        marginLayoutParams.topMargin += LK5.LIZ(28.0f);
        return marginLayoutParams;
    }
}
