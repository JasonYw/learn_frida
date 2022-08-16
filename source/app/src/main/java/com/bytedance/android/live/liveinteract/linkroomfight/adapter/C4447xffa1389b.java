package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.adapter.LinkRoomFightSearchResultViewBinder$ResultViewHolder$onBindViewHolder$1 */
/* loaded from: classes3.dex */
public final class C4447xffa1389b extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ i$b $item;
    public final /* synthetic */ i$c this$0;

    static {
        Covode.recordClassIndex(27507);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4447xffa1389b(i$c i_c, i$b i_b) {
        super(1);
        this.this$0 = i_c;
        this.$item = i_b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (this.this$0.LJIIIIZZ) {
                this.this$0.LJIIIZ.LIZ(this.$item.LIZIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
