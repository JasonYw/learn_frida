package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3799p;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C413202Xa;
import p003X.C4317436i;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class AudienceMiniGameIntroCardService$hideCard$1 extends Lambda implements Function1<C3799p, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $gameExit;
    public final /* synthetic */ C88098KnU $widget;

    static {
        Covode.recordClassIndex(20970);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniGameIntroCardService$hideCard$1(C88098KnU c88098KnU, boolean z) {
        super(1);
        this.$widget = c88098KnU;
        this.$gameExit = z;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$hideCard$1$1 */
    /* loaded from: classes5.dex */
    public static final class C36831 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ C3799p $this_addTask;

        static {
            Covode.recordClassIndex(20971);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36831(C3799p c3799p) {
            super(0);
            this.$this_addTask = c3799p;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                if (AudienceMiniGameIntroCardService$hideCard$1.this.$gameExit) {
                    this.$this_addTask.LIZ();
                } else {
                    C413202Xa.LIZ().LIZ(ToolbarButton.OPEN_PLATFORM_MINI_GAME, new C4317436i(new Pair(Boolean.FALSE, new Function0<Unit>() { // from class: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService.hideCard.1.1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(20972);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: invoke */
                        public final /* synthetic */ Unit mo30099invoke() {
                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                C36831.this.$this_addTask.LIZ();
                            }
                            return Unit.INSTANCE;
                        }
                    })));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3799p c3799p) {
        C3799p c3799p2 = c3799p;
        if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3799p2);
            this.$widget.LIZ(new C36831(c3799p2));
        }
        return Unit.INSTANCE;
    }
}
