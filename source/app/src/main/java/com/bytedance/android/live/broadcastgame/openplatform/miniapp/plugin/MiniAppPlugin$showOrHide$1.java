package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C87823Kj3;

/* loaded from: classes5.dex */
public final class MiniAppPlugin$showOrHide$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function2 $callLoadingFinish;
    public final /* synthetic */ String $page;
    public final /* synthetic */ C87823Kj3 this$0;

    static {
        Covode.recordClassIndex(21709);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppPlugin$showOrHide$1(C87823Kj3 c87823Kj3, Function2 function2, String str) {
        super(1);
        this.this$0 = c87823Kj3;
        this.$callLoadingFinish = function2;
        this.$page = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.$callLoadingFinish.invoke(Boolean.valueOf(booleanValue), this.this$0.LIZ(this.$page).getPageStatus());
            if (booleanValue) {
                this.this$0.LIZIZ(this.$page);
            }
        }
        return Unit.INSTANCE;
    }
}
