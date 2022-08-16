package com.bytedance.android.live.misc;

import android.app.Dialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes12.dex */
public final class KTExtendKt$asWeakDisposable$2 extends Lambda implements Function1<Dialog, Unit> {
    public static final KTExtendKt$asWeakDisposable$2 INSTANCE = new KTExtendKt$asWeakDisposable$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32493);
    }

    public KTExtendKt$asWeakDisposable$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Dialog dialog) {
        Dialog dialog2 = dialog;
        if (!PatchProxy.proxy(new Object[]{dialog2}, this, changeQuickRedirect, false, 1).isSupported && dialog2 != null) {
            C116971W2r.LIZ(dialog2);
        }
        return Unit.INSTANCE;
    }
}
