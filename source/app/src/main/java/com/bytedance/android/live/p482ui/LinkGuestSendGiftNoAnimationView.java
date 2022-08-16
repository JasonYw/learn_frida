package com.bytedance.android.live.p482ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.ui.LinkGuestSendGiftNoAnimationView */
/* loaded from: classes3.dex */
public final class LinkGuestSendGiftNoAnimationView extends LinkGuestSendGiftView {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(36321);
    }

    public LinkGuestSendGiftNoAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LinkGuestSendGiftNoAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.live.p482ui.LinkGuestSendGiftView
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GIFT_MULTIPLE_SEND_OPTIMIZE_BLOCK_INTERACT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return value.booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkGuestSendGiftNoAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ LinkGuestSendGiftNoAnimationView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
