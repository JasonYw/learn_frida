package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class IntroduceCardWidget$setCloseClickListener$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View.OnClickListener $closeListener;
    public final /* synthetic */ C88098KnU this$0;

    static {
        Covode.recordClassIndex(21543);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroduceCardWidget$setCloseClickListener$1(C88098KnU c88098KnU, View.OnClickListener onClickListener) {
        super(0);
        this.this$0 = c88098KnU;
        this.$closeListener = onClickListener;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        View.OnClickListener onClickListener;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (onClickListener = this.$closeListener) != null) {
            Object obj = this.this$0.LIZLLL;
            if (obj != null) {
                onClickListener.onClick((View) obj);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
        }
        return Unit.INSTANCE;
    }
}
