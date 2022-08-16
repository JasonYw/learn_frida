package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87811Kir;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$initMountParams$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $result;

    static {
        Covode.recordClassIndex(21579);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniAppCardSettingManagerV2$initMountParams$1(Function1 function1) {
        super(1);
        this.$result = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                this.$result.invoke(Boolean.TRUE);
            } else {
                C87811Kir c87811Kir = C87811Kir.LJI;
                C87811Kir.LJFF = null;
                this.$result.invoke(Boolean.FALSE);
            }
        }
        return Unit.INSTANCE;
    }
}
