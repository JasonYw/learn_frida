package com.bytedance.android.live.liveinteract.interact.audience;

import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.view.C4985a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC413402Xu;
import p003X.C409882Kg;
import p003X.C429582zA;
import p003X.HC1;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class InteractAudienceGuestWidget$mLinkBidCardView$2 extends Lambda implements Function0<C4985a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractAudienceGuestWidget this$0;

    static {
        Covode.recordClassIndex(27007);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractAudienceGuestWidget$mLinkBidCardView$2(InteractAudienceGuestWidget interactAudienceGuestWidget) {
        super(0);
        this.this$0 = interactAudienceGuestWidget;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, com.bytedance.android.live.liveinteract.view.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4985a mo30099invoke() {
        int LIZ;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C4985a c4985a = new C4985a(this.this$0.context, this.this$0.m15738LJ(), new C44141());
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && !LJIILJJIL.LIZIZ().booleanValue() && C429582zA.LIZ()) {
            LIZ = LK5.LIZ(84.0f);
        } else {
            LIZ = LK5.LIZ(52.0f);
        }
        int LIZ3 = LK5.LIZ(12.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(c4985a.getResources().getDimensionPixelSize(2131429226), c4985a.getResources().getDimensionPixelSize(2131429225));
        layoutParams.gravity = 8388693;
        layoutParams.bottomMargin = LIZ;
        layoutParams.rightMargin = LIZ3;
        c4985a.setLayoutParams(layoutParams);
        c4985a.setOnClickListener(new HC1(this));
        return c4985a;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.interact.audience.InteractAudienceGuestWidget$mLinkBidCardView$2$1 */
    /* loaded from: classes3.dex */
    public static final class C44141 extends Lambda implements Function2<Boolean, Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(27008);
        }

        public C44141() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Unit invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            int intValue = num.intValue();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue && !InteractAudienceGuestWidget$mLinkBidCardView$2.this.this$0.isDestroyed) {
                InteractAudienceGuestWidget$mLinkBidCardView$2.this.this$0.LIZ(2, intValue, "host_auto_apply");
            }
            return Unit.INSTANCE;
        }
    }
}
