package com.bytedance.android.live.broadcastgame.opengame.runtime;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC87953Kl9;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class LiveBasePluginWithPanel$initPanelAndHide$2 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC87953Kl9 this$0;

    static {
        Covode.recordClassIndex(20840);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveBasePluginWithPanel$initPanelAndHide$2(AbstractC87953Kl9 abstractC87953Kl9) {
        super(1);
        this.this$0 = abstractC87953Kl9;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            this.this$0.startFail(str2);
        }
        return Unit.INSTANCE;
    }
}
