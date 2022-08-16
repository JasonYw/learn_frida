package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetail.order.C3102g;
import com.bytedance.android.live.broadcast.gamedetail.order.p269a.C3099a;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.livesdk.chatroom.viewmodule.game_union.GameOrderMonitor;
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
import p003X.C106862S5w;
import p003X.C442083eE;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.C89000L4w;
import p003X.C89022L5s;
import p003X.C89055L6z;
import p003X.L7J;

/* loaded from: classes5.dex */
public final class AudienceOrderEffect$receiveAction$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $currentTab;
    public final /* synthetic */ AbstractC89041L6l $gameInfo;
    public final /* synthetic */ C3100d $launchInfo;
    public final /* synthetic */ Function1 $modifyState;
    public final /* synthetic */ C3102g $orderState;
    public final /* synthetic */ C89055L6z this$0;

    static {
        Covode.recordClassIndex(16190);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderEffect$receiveAction$3(C89055L6z c89055L6z, AbstractC89041L6l abstractC89041L6l, C3100d c3100d, String str, Function1 function1, C3102g c3102g) {
        super(0);
        this.this$0 = c89055L6z;
        this.$gameInfo = abstractC89041L6l;
        this.$launchInfo = c3100d;
        this.$currentTab = str;
        this.$modifyState = function1;
        this.$orderState = c3102g;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        C3119b c3119b;
        C3243u c3243u;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C89000L4w c89000L4w = C89000L4w.LIZIZ;
            C3101e c3101e = (C3101e) this.$gameInfo.LIZIZ();
            if (c3101e != null && (c3119b = c3101e.LIZLLL) != null && (c3243u = c3119b.LIZIZ) != null) {
                str = c3243u.LIZLLL;
            } else {
                str = null;
            }
            C89000L4w.LIZ(c89000L4w, str, this.$launchInfo.LIZIZ, this.$currentTab, null, 8, null);
            C89055L6z c89055L6z = this.this$0;
            L7J l7j = C89055L6z.LIZJ;
            String str2 = this.$launchInfo.LIZIZ;
            if (str2 == null) {
                str2 = "";
            }
            Disposable subscribe = l7j.LIZ(str2).compose(C100839PnV.LIZJ()).subscribe(new Consumer<AbstractC5172c>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$receiveAction$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16191);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5172c abstractC5172c) {
                    if (!PatchProxy.proxy(new Object[]{abstractC5172c}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15801d("GameOrder-AudienceOrder", "取消预约请求成功");
                        AudienceOrderEffect$receiveAction$3.this.$modifyState.invoke(new C3102g(C89022L5s.LIZ(AudienceOrderEffect$receiveAction$3.this.$orderState.LIZIZ, false, true, 0, 4, null), false));
                        C87010KQi LIZ2 = C87010KQi.LIZ();
                        String str3 = AudienceOrderEffect$receiveAction$3.this.$launchInfo.LIZIZ;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = str4;
                        }
                        String str5 = AudienceOrderEffect$receiveAction$3.this.$launchInfo.f25876LJ;
                        if (str5 != null) {
                            str4 = str5;
                        }
                        LIZ2.LIZ(new C3099a(str3, str4, false, 0, 8));
                        GameOrderMonitor.LIZIZ(GameOrderMonitor.LIZJ, true, null, AudienceOrderEffect$receiveAction$3.this.$currentTab, 2, null);
                    }
                }
            }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$receiveAction$3.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16192);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    Throwable th2 = th;
                    if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                        Intrinsics.checkNotNullExpressionValue(th2, "");
                        String LIZJ = C442083eE.LIZJ(th2);
                        if (LIZJ == null) {
                            LIZJ = "取消预约失败，请重试";
                        }
                        C88440Kt0.LIZIZ(LIZJ, 0);
                        AudienceOrderEffect$receiveAction$3.this.$modifyState.invoke(new C3102g(AudienceOrderEffect$receiveAction$3.this.$orderState.LIZIZ.LIZ(false, false, C442083eE.LIZIZ(th2)), true));
                        C89055L6z.LIZJ.LIZ(th2);
                        GameOrderMonitor.LIZJ.LIZIZ(false, th2, AudienceOrderEffect$receiveAction$3.this.$currentTab);
                    }
                }
            });
            Intrinsics.checkNotNullExpressionValue(subscribe, "");
            if (!PatchProxy.proxy(new Object[]{subscribe}, c89055L6z, C89055L6z.LIZ, false, 6).isSupported) {
                C106862S5w.LIZ(subscribe);
                c89055L6z.LIZLLL.LIZ(subscribe);
            }
        }
        return Unit.INSTANCE;
    }
}
