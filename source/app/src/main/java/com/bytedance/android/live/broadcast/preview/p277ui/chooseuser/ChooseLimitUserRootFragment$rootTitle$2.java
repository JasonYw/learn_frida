package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77323Ge5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserRootFragment$rootTitle$2 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserRootFragment$rootTitle$2 extends Lambda implements Function0<TextView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77323Ge5 this$0;

    static {
        Covode.recordClassIndex(17380);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserRootFragment$rootTitle$2(C77323Ge5 c77323Ge5) {
        super(0);
        this.this$0 = c77323Ge5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.widget.TextView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ TextView mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View view = this.this$0.LIZLLL;
        if (view != null) {
            return view.findViewById(2131188368);
        }
        return null;
    }
}
