package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.gamedetail.anchor.AnchorGamePromoteDetailApi;
import com.bytedance.android.live.broadcast.gamedetail.anchor.C3036d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3098a;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3104i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC89041L6l;
import p003X.C100839PnV;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C88946L2u;
import p003X.C89000L4w;
import p003X.C89008L5e;
import p003X.C89022L5s;
import p003X.C89042L6m;
import p003X.L6Y;

/* loaded from: classes5.dex */
public final class AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3100d $launchInfo$inlined;
    public final /* synthetic */ Function1 $modifyState$inlined;
    public final /* synthetic */ C3104i $promoteState$inlined;
    public final /* synthetic */ C89008L5e this$0;

    static {
        Covode.recordClassIndex(16180);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1(C89008L5e c89008L5e, C3100d c3100d, Function1 function1, C3104i c3104i) {
        super(0);
        this.this$0 = c89008L5e;
        this.$launchInfo$inlined = c3100d;
        this.$modifyState$inlined = function1;
        this.$promoteState$inlined = c3104i;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C3036d c3036d;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C89000L4w c89000L4w = C89000L4w.LIZIZ;
            long j = this.$launchInfo$inlined.LJIIJJI;
            C89042L6m LIZ = new C89042L6m(null, null, null, null, null, 31).LIZ(this.$launchInfo$inlined);
            C3098a c3098a = (C3098a) ((AbstractC89041L6l) this.this$0.LIZ(L6Y.LIZ).component1()).LIZIZ();
            if (c3098a != null) {
                c3036d = c3098a.LIZLLL;
            } else {
                c3036d = null;
            }
            c89000L4w.LIZ("livesdk_game_promote_anchor_not_promote_click", j, LIZ, c3036d, "promote_detail");
            this.$modifyState$inlined.invoke(new C3104i(this.$promoteState$inlined.LIZIZ, C89022L5s.LIZ(this.$promoteState$inlined.LIZJ, true, false, 0, 6, null), this.$promoteState$inlined.LIZLLL));
            C89008L5e c89008L5e = this.this$0;
            AnchorGamePromoteDetailApi anchorGamePromoteDetailApi = (AnchorGamePromoteDetailApi) C88306Kqq.LIZ().LIZ(AnchorGamePromoteDetailApi.class);
            String str = this.$launchInfo$inlined.LIZIZ;
            if (str == null) {
                str = "";
            }
            String str2 = this.$launchInfo$inlined.LJFF;
            if (str2 == null) {
                str2 = "";
            }
            Disposable subscribe = anchorGamePromoteDetailApi.cancelPromoteReserveGame(str, str2).compose(C100839PnV.LIZJ()).subscribe(new Consumer<AbstractC5172c>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16181);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5172c abstractC5172c) {
                    if (!PatchProxy.proxy(new Object[]{abstractC5172c}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15801d("GameOrder-AnchorPromote", "取消推广请求成功");
                        AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$modifyState$inlined.invoke(new C3104i(AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$promoteState$inlined.LIZIZ, C89022L5s.LIZ(AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$promoteState$inlined.LIZJ, false, true, 0, 4, null), false));
                        C88440Kt0.LIZ(2131583568);
                        AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.this$0.LIZ("2");
                        C88946L2u c88946L2u = C89008L5e.LIZLLL;
                        String str3 = AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$launchInfo$inlined.LIZIZ;
                        if (str3 == null) {
                            str3 = "";
                        }
                        c88946L2u.LIZ(str3, false);
                    }
                }
            }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16182);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        C88440Kt0.LIZIZ("取消推广失败，请重试", 0);
                        AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$modifyState$inlined.invoke(new C3104i(AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$promoteState$inlined.LIZIZ, C89022L5s.LIZ(AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.$promoteState$inlined.LIZJ, false, false, 0, 4, null), true));
                        C89008L5e c89008L5e2 = AnchorPromoteEffect$receiveAction$$inlined$apply$lambda$1.this.this$0;
                        Intrinsics.checkNotNullExpressionValue(th2, "");
                        c89008L5e2.LIZ(th2);
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            c89008L5e.LIZ(subscribe);
        }
        return Unit.INSTANCE;
    }
}
