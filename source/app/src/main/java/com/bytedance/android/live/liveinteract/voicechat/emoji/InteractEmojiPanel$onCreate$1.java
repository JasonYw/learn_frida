package com.bytedance.android.live.liveinteract.voicechat.emoji;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C100839PnV;
import p003X.C432823Am;
import p003X.C78621Gz1;
import p003X.C88306Kqq;
import p003X.H1T;
import p003X.H1U;

/* loaded from: classes3.dex */
public final class InteractEmojiPanel$onCreate$1 extends Lambda implements Function1<IUser, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ H1U this$0;

    static {
        Covode.recordClassIndex(31121);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractEmojiPanel$onCreate$1(H1U h1u) {
        super(1);
        this.this$0 = h1u;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(IUser iUser) {
        IUser iUser2 = iUser;
        if (!PatchProxy.proxy(new Object[]{iUser2}, this, changeQuickRedirect, false, 1).isSupported) {
            long j = 0;
            if (iUser2 == null || iUser2.getId() != 0) {
                this.this$0.LJI = User.from(iUser2);
                this.this$0.LJIILIIL.LIZLLL = this.this$0.LJI;
                C432823Am c432823Am = this.this$0.LJII;
                long id = this.this$0.LIZLLL.getId();
                User user = this.this$0.LJI;
                if (user != null) {
                    j = user.getId();
                }
                if (!PatchProxy.proxy(new Object[]{new Long(id), new Long(j)}, c432823Am, C432823Am.LIZ, false, 3).isSupported) {
                    ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).fetchInteractEntrances(id, j).compose(C100839PnV.LIZJ()).subscribe(new H1T(c432823Am), new C78621Gz1<>(c432823Am));
                }
            }
        }
        return Unit.INSTANCE;
    }
}
