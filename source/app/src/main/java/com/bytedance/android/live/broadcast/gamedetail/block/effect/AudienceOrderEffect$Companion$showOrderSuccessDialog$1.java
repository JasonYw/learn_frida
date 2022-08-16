package com.bytedance.android.live.broadcast.gamedetail.block.effect;

import android.content.Context;
import com.bytedance.android.live.broadcast.gamedetail.audience.AudienceGamePromoteDetailApi;
import com.bytedance.android.live.broadcast.track.GamePromoteOrderTrack$trackOrderDialogConfirm$1;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.umeng.commonsdk.vchannel.C33968a;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC91481M2h;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C88306Kqq;
import p003X.C89000L4w;
import p003X.C89055L6z;
import p003X.C89076L7u;
import p003X.C95452Nio;
import p003X.L7J;
import p003X.LF2;

/* loaded from: classes5.dex */
public final class AudienceOrderEffect$Companion$showOrderSuccessDialog$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $enterFrom;
    public final /* synthetic */ C89076L7u $orderInfo;

    static {
        Covode.recordClassIndex(16187);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceOrderEffect$Companion$showOrderSuccessDialog$1(C89076L7u c89076L7u, String str, Context context) {
        super(1);
        this.$orderInfo = c89076L7u;
        this.$enterFrom = str;
        this.$context = context;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$Companion$showOrderSuccessDialog$1$2 */
    /* loaded from: classes5.dex */
    public static final class C30592<T> implements Consumer<Throwable> {
        public static ChangeQuickRedirect LIZ;
        public static final C30592 LIZIZ = new C30592();

        static {
            Covode.recordClassIndex(16189);
        }

        @Override // io.reactivex.functions.Consumer
        public final /* synthetic */ void accept(Throwable th) {
            Throwable th2 = th;
            if (!PatchProxy.proxy(new Object[]{th2}, this, LIZ, false, 1).isSupported) {
                L7J l7j = C89055L6z.LIZJ;
                Intrinsics.checkNotNullExpressionValue(th2, "");
                l7j.LIZ(th2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [byte, boolean] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        ?? booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue == true ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C89000L4w c89000L4w = C89000L4w.LIZIZ;
            String str = this.$orderInfo.LIZLLL;
            String str2 = this.$orderInfo.LIZJ;
            String str3 = this.$enterFrom;
            if (!PatchProxy.proxy(new Object[]{str, str2, str3, Byte.valueOf((byte) booleanValue)}, c89000L4w, C89000L4w.LIZ, false, 23).isSupported) {
                C89000L4w.LIZ(c89000L4w, "livesdk_game_promote_user_game_book_success_confirm", str, str2, str3, (String) null, new GamePromoteOrderTrack$trackOrderDialogConfirm$1(booleanValue), 16, (Object) null);
            }
            if (booleanValue != 0) {
                ((AudienceGamePromoteDetailApi) C88306Kqq.LIZ().LIZ(AudienceGamePromoteDetailApi.class)).setAutoDownload(this.$orderInfo.LIZJ).compose(C100839PnV.LIZJ()).subscribe(new Consumer<AbstractC5172c>() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.effect.AudienceOrderEffect$Companion$showOrderSuccessDialog$1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(16188);
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final /* synthetic */ void accept(AbstractC5172c abstractC5172c) {
                        IHostApp LJIJJ;
                        LF2 gameCenterService;
                        JSONObject jSONObject;
                        Long l;
                        C2WC<Room> LIZ2;
                        Room LIZ3;
                        C2WC<Room> LIZ4;
                        Room LIZ5;
                        if (!PatchProxy.proxy(new Object[]{abstractC5172c}, this, LIZ, false, 1).isSupported) {
                            ALogger.m15801d("GameOrder-AudienceOrder", "自动下载请求成功");
                            AbstractC91481M2h m23163LJ = C95452Nio.m23163LJ();
                            if (m23163LJ != null && (LJIJJ = m23163LJ.LJIJJ()) != null && (gameCenterService = LJIJJ.getGameCenterService()) != null) {
                                Context context = AudienceOrderEffect$Companion$showOrderSuccessDialog$1.this.$context;
                                C89076L7u c89076L7u = AudienceOrderEffect$Companion$showOrderSuccessDialog$1.this.$orderInfo;
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c89076L7u, C89076L7u.LIZ, false, 1);
                                if (proxy.isSupported) {
                                    jSONObject = (JSONObject) proxy.result;
                                } else {
                                    jSONObject = new JSONObject();
                                    C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                                    Long l2 = null;
                                    if (LIZ6 != null && (LIZ4 = LIZ6.LIZ()) != null && (LIZ5 = LIZ4.LIZ()) != null) {
                                        l = Long.valueOf(LIZ5.getRoomId());
                                    } else {
                                        l = null;
                                    }
                                    C5923dp LIZ7 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
                                    if (LIZ7 != null && (LIZ2 = LIZ7.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
                                        l2 = Long.valueOf(LIZ3.ownerUserId);
                                    }
                                    jSONObject.put("order_id", c89076L7u.LIZIZ);
                                    jSONObject.put("order_url", c89076L7u.LJFF);
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put(C33968a.f42937f, c89076L7u.LIZJ);
                                    jSONObject2.put("name", c89076L7u.LIZLLL);
                                    JSONObject jSONObject3 = c89076L7u.f8771LJ;
                                    jSONObject3.put("product_type", "live_union");
                                    jSONObject3.put("app_type", "2");
                                    if (l2 == null) {
                                        l2 = "";
                                    }
                                    jSONObject3.put("from_author_id", l2);
                                    if (l == null) {
                                        l = "";
                                    }
                                    jSONObject3.put("from_group_id", l);
                                    jSONObject2.put("extra", jSONObject3);
                                    jSONObject2.put("event_tag", "book_download");
                                    jSONObject.put("download_model", jSONObject2);
                                }
                                gameCenterService.LIZ(context, jSONObject);
                            }
                        }
                    }
                }, C30592.LIZIZ);
            }
        }
        return Unit.INSTANCE;
    }
}
