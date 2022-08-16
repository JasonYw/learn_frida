package com.bytedance.android.live.broadcastgame.behavior;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88131Ko1;
import p003X.C2TD;

/* loaded from: classes5.dex */
public final class BaseToolbarInteractBehavior$onCommand$$inlined$lets$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C2TD $command$inlined;

    /* renamed from: $r */
    public final /* synthetic */ View f26034$r;
    public final /* synthetic */ AbstractC88131Ko1 this$0;

    static {
        Covode.recordClassIndex(19289);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseToolbarInteractBehavior$onCommand$$inlined$lets$lambda$1(View view, AbstractC88131Ko1 abstractC88131Ko1, C2TD c2td) {
        super(0);
        this.f26034$r = view;
        this.this$0 = abstractC88131Ko1;
        this.$command$inlined = c2td;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.onClick(this.f26034$r);
        }
        return Unit.INSTANCE;
    }
}
