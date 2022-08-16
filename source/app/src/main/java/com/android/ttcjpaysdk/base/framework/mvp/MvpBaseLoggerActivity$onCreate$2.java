package com.android.ttcjpaysdk.base.framework.mvp;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractActivityC135987cJq;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class MvpBaseLoggerActivity$onCreate$2 extends Lambda implements Function1<ImageView, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractActivityC135987cJq this$0;

    static {
        Covode.recordClassIndex(6072);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MvpBaseLoggerActivity$onCreate$2(AbstractActivityC135987cJq abstractActivityC135987cJq) {
        super(1);
        this.this$0 = abstractActivityC135987cJq;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(ImageView imageView) {
        ImageView imageView2 = imageView;
        if (!PatchProxy.proxy(new Object[]{imageView2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(imageView2);
            View.OnClickListener onClickListener = this.this$0.mBackClickListener;
            if (onClickListener != null) {
                onClickListener.onClick(imageView2);
            }
            this.this$0.onBackPressed();
        }
        return Unit.INSTANCE;
    }
}
