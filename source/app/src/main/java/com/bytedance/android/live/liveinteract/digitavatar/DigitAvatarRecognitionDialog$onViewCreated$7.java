package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class DigitAvatarRecognitionDialog$onViewCreated$7 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DigitAvatarRecognitionDialog this$0;

    static {
        Covode.recordClassIndex(26611);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitAvatarRecognitionDialog$onViewCreated$7(DigitAvatarRecognitionDialog digitAvatarRecognitionDialog) {
        super(0);
        this.this$0 = digitAvatarRecognitionDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIIIIZZ();
        }
        return Unit.INSTANCE;
    }
}
