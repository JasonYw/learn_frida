package com.android.ttcjpaysdk.base.auth.wrapper;

import android.widget.ImageView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137454chW;
import p003X.C106862S5w;
import p003X.C135423cAk;

/* loaded from: classes17.dex */
public final class CJPayAgreementListWrapper$showWithAnim$1 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ int $height;
    public final /* synthetic */ C135423cAk this$0;

    static {
        Covode.recordClassIndex(5953);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayAgreementListWrapper$showWithAnim$1(C135423cAk c135423cAk, int i) {
        super(1);
        this.this$0 = c135423cAk;
        this.$height = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        if (!PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView);
            CJPayBasicUtils.upAndDownAnimation(this.this$0.mRootView, false, this.$height, (AbstractC137454chW) null);
        }
        return Unit.INSTANCE;
    }
}
