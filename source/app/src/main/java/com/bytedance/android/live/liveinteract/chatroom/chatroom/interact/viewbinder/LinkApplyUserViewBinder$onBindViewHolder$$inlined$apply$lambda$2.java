package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder;

import android.view.View;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C78284Gta;
import p003X.C88440Kt0;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class LinkApplyUserViewBinder$onBindViewHolder$$inlined$apply$lambda$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LinkPlayerInfo $info$inlined;
    public final /* synthetic */ C78284Gta this$0;

    static {
        Covode.recordClassIndex(26019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApplyUserViewBinder$onBindViewHolder$$inlined$apply$lambda$2(C78284Gta c78284Gta, LinkPlayerInfo linkPlayerInfo) {
        super(1);
        this.this$0 = c78284Gta;
        this.$info$inlined = linkPlayerInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.$info$inlined.LJJJIL) {
                ALogger.m15797i("ttlive_link_apply_user_view_binder", "click on the anonymous user avatar for apply , do not pull up the profile card");
                C88440Kt0.LIZ(LK5.LIZ(2131585171));
            } else {
                this.this$0.LIZ(this.$info$inlined.LIZ());
            }
        }
        return Unit.INSTANCE;
    }
}
