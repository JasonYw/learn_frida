package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayAuthActivity$initActions$1 */
/* loaded from: classes17.dex */
public final class UnionPayAuthActivity$initActions$1 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UnionPayAuthActivity this$0;

    static {
        Covode.recordClassIndex(7363);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayAuthActivity$initActions$1(UnionPayAuthActivity unionPayAuthActivity) {
        super(1);
        this.this$0 = unionPayAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            this.this$0.LIZ();
        }
        return Unit.INSTANCE;
    }
}
