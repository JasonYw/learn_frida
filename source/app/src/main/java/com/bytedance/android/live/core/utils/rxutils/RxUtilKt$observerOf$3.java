package com.bytedance.android.live.core.utils.rxutils;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class RxUtilKt$observerOf$3 extends Lambda implements Function1<CharSequence, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TextView $view;

    static {
        Covode.recordClassIndex(23979);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxUtilKt$observerOf$3(TextView textView) {
        super(1);
        this.$view = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (!PatchProxy.proxy(new Object[]{charSequence2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(charSequence2);
            this.$view.setText(charSequence2);
        }
        return Unit.INSTANCE;
    }
}
