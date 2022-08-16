package com.bytedance.android.live.media.impl.widget;

import com.bytedance.android.livesdk.chatroom.p518ui.C6337ge;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class MediaAnchorInfoWidget$startAnimationListener$2 extends Lambda implements Function1<C6337ge, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MediaAnchorInfoWidget this$0;

    static {
        Covode.recordClassIndex(32467);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaAnchorInfoWidget$startAnimationListener$2(MediaAnchorInfoWidget mediaAnchorInfoWidget) {
        super(1);
        this.this$0 = mediaAnchorInfoWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C6337ge c6337ge) {
        C6337ge c6337ge2 = c6337ge;
        if (!PatchProxy.proxy(new Object[]{c6337ge2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c6337ge2);
            c6337ge2.LIZ(this.this$0.LJI);
        }
        return Unit.INSTANCE;
    }
}
