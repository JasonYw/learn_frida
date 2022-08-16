package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import com.bytedance.android.live.broadcast.gamedetail.order.p269a.C3099a;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.livesdk.chatroom.viewmodule.game_union.GameOrderMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC89095L8n;
import p003X.C100839PnV;
import p003X.C442083eE;
import p003X.C87010KQi;
import p003X.C88440Kt0;
import p003X.C89055L6z;

/* loaded from: classes5.dex */
public final class AudienceOrderEffect$Companion$cancelOrderGame$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $anchorId;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ String $gameId;
    public final /* synthetic */ AbstractC89095L8n $listener;

    static {
        Covode.recordClassIndex(16184);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderEffect$Companion$cancelOrderGame$1(AbstractC89095L8n abstractC89095L8n, String str, String str2, String str3) {
        super(0);
        this.$listener = abstractC89095L8n;
        this.$gameId = str;
        this.$anchorId = str2;
        this.$enterFrom = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC89095L8n abstractC89095L8n = this.$listener;
            if (abstractC89095L8n != null) {
                abstractC89095L8n.LIZ();
            }
            C89055L6z.LIZJ.LIZ(this.$gameId).compose(C100839PnV.LIZJ()).subscribe(new Consumer<AbstractC5172c>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$Companion$cancelOrderGame$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16185);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(AbstractC5172c abstractC5172c) {
                    if (!PatchProxy.proxy(new Object[]{abstractC5172c}, this, LIZ, false, 1).isSupported) {
                        ALogger.m15801d("GameOrder-AudienceOrder", "取消预约请求成功");
                        AbstractC89095L8n abstractC89095L8n2 = AudienceOrderEffect$Companion$cancelOrderGame$1.this.$listener;
                        if (abstractC89095L8n2 != null) {
                            abstractC89095L8n2.LIZIZ();
                        }
                        C87010KQi.LIZ().LIZ(new C3099a(AudienceOrderEffect$Companion$cancelOrderGame$1.this.$gameId, AudienceOrderEffect$Companion$cancelOrderGame$1.this.$anchorId, false, 0, 8));
                        GameOrderMonitor.LIZIZ(GameOrderMonitor.LIZJ, true, null, AudienceOrderEffect$Companion$cancelOrderGame$1.this.$enterFrom, 2, null);
                    }
                }
            }, new Consumer<Throwable>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$Companion$cancelOrderGame$1.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16186);
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
                        C89055L6z.LIZJ.LIZ(th2);
                        AbstractC89095L8n abstractC89095L8n2 = AudienceOrderEffect$Companion$cancelOrderGame$1.this.$listener;
                        if (abstractC89095L8n2 != null) {
                            abstractC89095L8n2.LIZ(th2);
                        }
                        GameOrderMonitor.LIZJ.LIZIZ(false, th2, AudienceOrderEffect$Companion$cancelOrderGame$1.this.$enterFrom);
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
