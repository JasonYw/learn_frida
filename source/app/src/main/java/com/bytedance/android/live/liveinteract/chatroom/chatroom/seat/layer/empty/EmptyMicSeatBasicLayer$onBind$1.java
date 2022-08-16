package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.empty;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC149372foG;
import p003X.C106862S5w;
import p003X.C80787Hsr;

/* loaded from: classes3.dex */
public final class EmptyMicSeatBasicLayer$onBind$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ List $list;
    public final /* synthetic */ int $position;
    public final /* synthetic */ C80787Hsr this$0;

    static {
        Covode.recordClassIndex(26360);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmptyMicSeatBasicLayer$onBind$1(C80787Hsr c80787Hsr, List list, int i) {
        super(1);
        this.this$0 = c80787Hsr;
        this.$list = list;
        this.$position = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            AbstractC149372foG abstractC149372foG = this.this$0.LJIILLIIL;
            if (abstractC149372foG != null && abstractC149372foG.LJJII) {
                AbstractC149372foG abstractC149372foG2 = this.this$0.LJIILLIIL;
                if (abstractC149372foG2 != null && abstractC149372foG2.LJJIII) {
                    this.this$0.LJII();
                }
            } else {
                this.this$0.LIZIZ(this.$list, this.$position);
            }
        }
        return Unit.INSTANCE;
    }
}
