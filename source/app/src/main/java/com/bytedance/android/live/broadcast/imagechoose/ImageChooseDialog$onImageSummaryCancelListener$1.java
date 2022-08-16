package com.bytedance.android.live.broadcast.imagechoose;

import com.bytedance.android.live.broadcast.api.model.C2917q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C89322LHg;
import p003X.DialogC89316LHa;

/* loaded from: classes5.dex */
public final class ImageChooseDialog$onImageSummaryCancelListener$1 extends Lambda implements Function1<C2917q, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89316LHa this$0;

    static {
        Covode.recordClassIndex(16793);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageChooseDialog$onImageSummaryCancelListener$1(DialogC89316LHa dialogC89316LHa) {
        super(1);
        this.this$0 = dialogC89316LHa;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2917q c2917q) {
        C2917q c2917q2 = c2917q;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2917q2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c2917q2);
        C89322LHg c89322LHg = this.this$0.LJII;
        if (c89322LHg == null) {
            return null;
        }
        if (!PatchProxy.proxy(new Object[]{c2917q2}, c89322LHg, C89322LHg.LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(c2917q2);
            C89322LHg.LIZ(c89322LHg, c2917q2, null, 2, null);
            Function1<? super LinkedList<C2917q>, Unit> function1 = c89322LHg.LJFF;
            if (function1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            function1.invoke(c89322LHg.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
