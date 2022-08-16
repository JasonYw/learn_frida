package com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin;

import android.os.Bundle;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.C3800g;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.service.AnchorMiniCardService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AnonymousClass425;
import p003X.C106862S5w;
import p003X.C1L9;
import p003X.C64877Bip;
import p003X.C87010KQi;
import p003X.C87811Kir;
import p003X.C87823Kj3;
import p003X.C87911KkT;

/* loaded from: classes5.dex */
public final class MiniAppPlugin$onStart$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87823Kj3 this$0;

    static {
        Covode.recordClassIndex(21706);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppPlugin$onStart$1(C87823Kj3 c87823Kj3) {
        super(1);
        this.this$0 = c87823Kj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            ((AnchorMiniCardService) this.this$0.LJIIJJI.LIZ((Class<AbstractC3719c>) AnchorMiniCardService.class)).LIZ(str2, false, new C38391(str2));
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.plugin.MiniAppPlugin$onStart$1$1 */
    /* loaded from: classes5.dex */
    public static final class C38391 extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ String $page;

        static {
            Covode.recordClassIndex(21707);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38391(String str) {
            super(1);
            this.$page = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            String str;
            boolean booleanValue = bool.booleanValue();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
                C87823Kj3 c87823Kj3 = MiniAppPlugin$onStart$1.this.this$0;
                String str2 = this.$page;
                if (!PatchProxy.proxy(new Object[]{str2}, c87823Kj3, C87823Kj3.LJI, false, 14).isSupported) {
                    C87911KkT c87911KkT = C87911KkT.LIZIZ;
                    C87911KkT.LIZ(c87911KkT, "changeExplainState " + c87823Kj3.LIZ(str2).getPageStatus(), null, 2, null);
                    if (AnonymousClass425.LIZIZ()) {
                        C87010KQi.LIZ().LIZ(new C3800g("update_anchor_btn_state", c87823Kj3.LIZ(str2).getPageStatus().getDes()));
                    } else {
                        C64877Bip c64877Bip = c87823Kj3.LJII;
                        if (c64877Bip != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("state", c87823Kj3.LIZ(str2).getPageStatus().getDes());
                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c87823Kj3.LJIIJJI.LIZ((Class<AbstractC3719c>) AnchorMiniCardService.class), AnchorMiniCardService.LIZ, false, 12);
                            if (proxy.isSupported) {
                                str = (String) proxy.result;
                            } else {
                                C1L9 LIZJ = C87811Kir.LJI.LIZJ();
                                if (LIZJ == null || (str = LIZJ.LIZJ) == null) {
                                    str = "";
                                }
                            }
                            bundle.putString("page", str);
                            if (!PatchProxy.proxy(new Object[]{"update_anchor_btn_state", bundle}, c64877Bip, C64877Bip.LIZ, false, 6).isSupported) {
                                C106862S5w.LIZ("update_anchor_btn_state");
                                c64877Bip.LIZJ.sendCustomEvent("update_anchor_btn_state", bundle);
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }
}
