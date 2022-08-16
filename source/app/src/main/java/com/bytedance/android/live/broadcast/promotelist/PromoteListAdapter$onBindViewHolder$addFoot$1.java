package com.bytedance.android.live.broadcast.promotelist;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PromoteListAdapter$onBindViewHolder$addFoot$1 extends Lambda implements Function1<AbstractC3212b, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ n$c $holder;
    public final /* synthetic */ Ref.ObjectRef $lastFoot;

    static {
        Covode.recordClassIndex(17518);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromoteListAdapter$onBindViewHolder$addFoot$1(n$c n_c, Ref.ObjectRef objectRef) {
        super(1);
        this.$holder = n_c;
        this.$lastFoot = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, com.bytedance.android.live.broadcast.promotelist.b] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3212b abstractC3212b) {
        AbstractC3212b abstractC3212b2 = abstractC3212b;
        if (!PatchProxy.proxy(new Object[]{abstractC3212b2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3212b2);
            this.$holder.LJII.addView((View) abstractC3212b2);
            this.$lastFoot.element = abstractC3212b2;
        }
        return Unit.INSTANCE;
    }
}
