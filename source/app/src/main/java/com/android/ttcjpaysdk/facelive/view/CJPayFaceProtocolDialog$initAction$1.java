package com.android.ttcjpaysdk.facelive.view;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC135369c9s;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.DialogC135370c9t;

/* loaded from: classes17.dex */
public final class CJPayFaceProtocolDialog$initAction$1 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC135370c9t this$0;

    static {
        Covode.recordClassIndex(7427);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFaceProtocolDialog$initAction$1(DialogC135370c9t dialogC135370c9t) {
        super(1);
        this.this$0 = dialogC135370c9t;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            C116971W2r.LIZ(this.this$0);
            AbstractC135369c9s abstractC135369c9s = this.this$0.LJFF;
            if (abstractC135369c9s != null) {
                abstractC135369c9s.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
