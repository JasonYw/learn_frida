package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.H5C;

/* loaded from: classes3.dex */
public final class LinkRoomFightSelectGuestsDialog$initSureBtn$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H5C this$0;

    static {
        Covode.recordClassIndex(27692);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSelectGuestsDialog$initSureBtn$1(H5C h5c) {
        super(1);
        this.this$0 = h5c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
