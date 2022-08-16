package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80087HhZ;

/* loaded from: classes3.dex */
public final class LinkRoomFightSearchFragment$initView$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80087HhZ this$0;

    static {
        Covode.recordClassIndex(27685);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSearchFragment$initView$2(C80087HhZ c80087HhZ) {
        super(1);
        this.this$0 = c80087HhZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJIILJJIL();
            C80087HhZ.LIZ(this.this$0).LIZIZ();
            C80087HhZ.LIZIZ(this.this$0).setText((CharSequence) null);
        }
        return Unit.INSTANCE;
    }
}
