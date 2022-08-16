package com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm;

import android.os.Handler;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6856bm;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.BidPaidLinkmicStatus;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C3J9;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.LinkBidViewModel$$special$$inlined$apply$lambda$3 */
/* loaded from: classes3.dex */
public final class LinkBidViewModel$$special$$inlined$apply$lambda$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4378a this$0;

    static {
        Covode.recordClassIndex(26456);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBidViewModel$$special$$inlined$apply$lambda$3(C4378a c4378a) {
        super(0);
        this.this$0 = c4378a;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C4378a c4378a = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c4378a, C4378a.LIZ, false, 8).isSupported && c4378a.LJIIL() && c4378a.LJIIZILJ.getValue() == BidPaidLinkmicStatus.BidPaid_Bid) {
                SettingKey<C6856bm> settingKey = LiveSettingKeys.LINK_BIDDING_CONFIG;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                if (settingKey.getValue().LIZIZ) {
                    c4378a.LJJIIZ = true;
                    Handler LIZ = C3J9.LIZ();
                    Runnable runnable = c4378a.LJJIJIIJI;
                    SettingKey<C6856bm> settingKey2 = LiveSettingKeys.LINK_BIDDING_CONFIG;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    LIZ.postDelayed(runnable, settingKey2.getValue().LIZJ * 1000);
                    ALogger.m15801d("LinkBidViewModel", "bid end, back up.");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
