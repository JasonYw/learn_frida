package com.android.ttcjpaysdk.bindcard.unionpay.p148ui.wrapper;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135812cH1;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.wrapper.UnionPayTwoElementsWrapper$initActions$2 */
/* loaded from: classes17.dex */
public final class UnionPayTwoElementsWrapper$initActions$2 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C135812cH1 this$0;

    static {
        Covode.recordClassIndex(7382);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayTwoElementsWrapper$initActions$2(C135812cH1 c135812cH1) {
        super(1);
        this.this$0 = c135812cH1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            Context context = this.this$0.mContext;
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                activity.onBackPressed();
            }
        }
        return Unit.INSTANCE;
    }
}
