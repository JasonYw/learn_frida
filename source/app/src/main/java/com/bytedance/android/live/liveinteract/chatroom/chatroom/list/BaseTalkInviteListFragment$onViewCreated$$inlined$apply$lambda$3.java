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
public final class BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26157);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$3(AbstractC78156GrW abstractC78156GrW, View view) {
        super(0);
        this.this$0 = abstractC78156GrW;
        this.$view$inlined = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIIJJI.remove(this.this$0.LJIJJLI);
            if (this.this$0.LJIIZILJ() == 4) {
                if (this.this$0.LJIJI.size() > 10) {
                    this.this$0.LJIIJJI.addAll(this.this$0.LJIJJLI, this.this$0.LJIJI.subList(10, this.this$0.LJIJI.size()));
                }
            } else {
                if (this.this$0.LJIILIIL) {
                    C78299Gtp.LIZIZ.LIZIZ(this.this$0.LJIIL());
                }
                if (this.this$0.LJIJI.size() > 10) {
                    this.this$0.LJIIJJI.addAll(this.this$0.LJIJJLI, this.this$0.LJIJI.subList(3, 10));
                    this.this$0.LJIJJLI += 7;
                    this.this$0.LJIIJJI.add(this.this$0.LJIJJLI, new C4363v(this.this$0.LJIJI.size() - 10));
                    if (this.this$0.LJIILIIL) {
                        C78299Gtp.LIZIZ.LIZ(this.this$0.LJIIL());
                    }
                } else {
                    this.this$0.LJIIJJI.addAll(this.this$0.LJIJJLI, this.this$0.LJIJI.subList(3, this.this$0.LJIJI.size()));
                    this.this$0.LJIJJLI += this.this$0.LJIJI.size() - 3;
                }
            }
            C35036d c35036d = this.this$0.LIZLLL;
            if (c35036d != null) {
                c35036d.notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }
}
