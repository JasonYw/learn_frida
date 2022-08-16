package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.H91;

/* loaded from: classes3.dex */
public final class DigitAvatarRecognitionDialog$onViewCreated$4$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H91 this$0;

    static {
        Covode.recordClassIndex(26609);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitAvatarRecognitionDialog$onViewCreated$4$1(H91 h91) {
        super(0);
        this.this$0 = h91;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }
}
