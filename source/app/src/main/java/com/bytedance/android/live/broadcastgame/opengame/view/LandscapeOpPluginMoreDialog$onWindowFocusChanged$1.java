package com.bytedance.android.live.broadcastgame.opengame.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89019L5p;
import p003X.DialogC87991Kll;

/* loaded from: classes5.dex */
public final class LandscapeOpPluginMoreDialog$onWindowFocusChanged$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC87991Kll this$0;

    static {
        Covode.recordClassIndex(21150);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LandscapeOpPluginMoreDialog$onWindowFocusChanged$1(DialogC87991Kll dialogC87991Kll) {
        super(0);
        this.this$0 = dialogC87991Kll;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C89019L5p.LIZ(this.this$0.getWindow());
        }
        return Unit.INSTANCE;
    }
}
