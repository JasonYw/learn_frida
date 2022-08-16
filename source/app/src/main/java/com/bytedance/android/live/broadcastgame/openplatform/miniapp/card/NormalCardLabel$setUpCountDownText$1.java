package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class NormalCardLabel$setUpCountDownText$1 extends Lambda implements Function1<Drawable, Unit> {
    public static final NormalCardLabel$setUpCountDownText$1 INSTANCE = new NormalCardLabel$setUpCountDownText$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21601);
    }

    public NormalCardLabel$setUpCountDownText$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Drawable drawable) {
        Drawable drawable2 = drawable;
        if (!PatchProxy.proxy(new Object[]{drawable2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(drawable2);
            drawable2.setBounds(0, 0, LK1.LIZLLL(28), LK1.LIZLLL(14));
        }
        return Unit.INSTANCE;
    }
}
