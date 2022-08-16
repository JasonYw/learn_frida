package com.bytedance.android.live.liveinteract.videotalk.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class BaseEqualTalkRoomAdapter$BaseGuestViewHolder$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $itemClick;

    static {
        Covode.recordClassIndex(29630);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEqualTalkRoomAdapter$BaseGuestViewHolder$2(Function0 function0) {
        super(1);
        this.$itemClick = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.$itemClick.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
