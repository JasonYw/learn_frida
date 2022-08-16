package com.bytedance.android.live.misc;

import androidx.fragment.app.DialogFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class KTExtendKt$asWeakDisposable$1 extends Lambda implements Function1<DialogFragment, Unit> {
    public static final KTExtendKt$asWeakDisposable$1 INSTANCE = new KTExtendKt$asWeakDisposable$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32492);
    }

    public KTExtendKt$asWeakDisposable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(DialogFragment dialogFragment) {
        DialogFragment dialogFragment2 = dialogFragment;
        if (!PatchProxy.proxy(new Object[]{dialogFragment2}, this, changeQuickRedirect, false, 1).isSupported && dialogFragment2 != null) {
            dialogFragment2.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
