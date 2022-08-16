package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: com.bytedance.android.live.broadcast.preview.viewmodel.StartLiveVisibilityContext$cancelVisibilityUsersForSomePeopleNotCan$1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3204x4c1d190f extends FunctionReferenceImpl implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17453);
    }

    public C3204x4c1d190f(C3207d c3207d) {
        super(0, c3207d, C3207d.class, "loadSomePeopleCanNotList", "loadSomePeopleCanNotList()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ((C3207d) this.receiver).LJIIIIZZ();
        }
        return Unit.INSTANCE;
    }
}
