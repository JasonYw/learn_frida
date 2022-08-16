package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.android.live.broadcastgame.api.model.PageDataV2;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.livehostapi.business.depend.livead.p486a.C5814u;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C1KL;
import p003X.C87871Kjp;

/* loaded from: classes5.dex */
public final class MiniAppTitleEditorDialogFragmentV2$startCheckContent$1 extends Lambda implements Function1<C5814u, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $title;
    public final /* synthetic */ C87871Kjp this$0;

    static {
        Covode.recordClassIndex(21592);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppTitleEditorDialogFragmentV2$startCheckContent$1(C87871Kjp c87871Kjp, String str) {
        super(1);
        this.this$0 = c87871Kjp;
        this.$title = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C5814u c5814u) {
        C5814u c5814u2 = c5814u;
        if (!PatchProxy.proxy(new Object[]{c5814u2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c5814u2);
            if (c5814u2.LIZ) {
                this.this$0.LIZJ().setVisibility(0);
            } else {
                C3796c LIZ = this.this$0.LIZ();
                if (LIZ != null) {
                    String str = this.$title;
                    if (!PatchProxy.proxy(new Object[]{str}, LIZ, C3796c.LIZ, false, 22).isSupported) {
                        C106862S5w.LIZ(str);
                        PageDataV2 pageDataV2 = LIZ.LIZJ;
                        if (pageDataV2 != null) {
                            pageDataV2.LIZ(str);
                        }
                        LIZ.LIZ((C1KL<C1KL<String>>) LIZ.LIZ(), (C1KL<String>) str);
                        LIZ.LIZ((C1KL<C1KL<Pair<C8733af, C3561g>>>) LIZ.LIZJ(), (C1KL<Pair<C8733af, C3561g>>) LIZ.f26110LJ);
                    }
                }
                this.this$0.LIZJ().setVisibility(8);
                this.this$0.LIZJ(this.$title);
            }
        }
        return Unit.INSTANCE;
    }
}
