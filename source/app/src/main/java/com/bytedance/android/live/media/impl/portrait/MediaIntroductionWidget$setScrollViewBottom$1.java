package com.bytedance.android.live.media.impl.portrait;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AnonymousClass425;

/* loaded from: classes12.dex */
public final class MediaIntroductionWidget$setScrollViewBottom$1 extends Lambda implements Function0<Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MediaIntroductionWidget this$0;

    static {
        Covode.recordClassIndex(32441);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaIntroductionWidget$setScrollViewBottom$1(MediaIntroductionWidget mediaIntroductionWidget) {
        super(0);
        this.this$0 = mediaIntroductionWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int i;
        int dip2Px;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            dip2Px = ((Integer) proxy.result).intValue();
        } else {
            TextView textView = this.this$0.LIZLLL;
            if (textView != null) {
                i = textView.getHeight();
            } else {
                i = 0;
            }
            LinearLayout linearLayout = this.this$0.f26518LJ;
            if (linearLayout != null) {
                i2 = linearLayout.getHeight();
            }
            dip2Px = (i + i2) - ((int) UIUtils.dip2Px(AnonymousClass425.LIZ(), 54.0f));
        }
        return Integer.valueOf(dip2Px);
    }
}
