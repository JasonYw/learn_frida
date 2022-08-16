package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.drakeet.multitype.C35036d;
import p003X.AbstractC78156GrW;
import p003X.C78299Gtp;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$4 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26158);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$4(AbstractC78156GrW abstractC78156GrW, View view) {
        super(0);
        this.this$0 = abstractC78156GrW;
        this.$view$inlined = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.this$0.LJIILIIL) {
                C78299Gtp.LIZIZ.LIZIZ(this.this$0.LJIIL());
            }
            this.this$0.LJIIJJI.remove(this.this$0.LJIJJLI);
            this.this$0.LJIIJJI.addAll(this.this$0.LJIJJLI, this.this$0.LJIJI.subList(10, this.this$0.LJIJI.size()));
            this.this$0.LJIJJLI += this.this$0.LJIJI.size() - 10;
            C35036d c35036d = this.this$0.LIZLLL;
            if (c35036d != null) {
                c35036d.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }
}
