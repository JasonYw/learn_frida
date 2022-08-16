package com.bytedance.android.live.broadcast.gamedetailv2.comment;

import android.app.Dialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.L46;

/* loaded from: classes5.dex */
public final class GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$2 extends Lambda implements Function2<Dialog, View, Unit> {
    public static final GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$2 INSTANCE = new GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16609);
    }

    public GamePromoteCommentDetailAdapterV2$onCreateViewHolder$7$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Dialog dialog, View view) {
        Dialog dialog2 = dialog;
        if (!PatchProxy.proxy(new Object[]{dialog2, view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(dialog2, view);
            L46.LIZIZ.LIZ(false);
            C116971W2r.LIZ(dialog2);
        }
        return Unit.INSTANCE;
    }
}
