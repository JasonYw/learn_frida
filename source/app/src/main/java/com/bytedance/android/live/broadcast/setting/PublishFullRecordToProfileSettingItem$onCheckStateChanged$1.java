package com.bytedance.android.live.broadcast.setting;

import com.bytedance.android.live.broadcast.api.model.C2922y;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C420632kj;
import p003X.C4574547f;
import p003X.C87308Kak;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class PublishFullRecordToProfileSettingItem$onCheckStateChanged$1 extends Lambda implements Function1<C2922y, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $isChecked;
    public final /* synthetic */ C420632kj this$0;

    static {
        Covode.recordClassIndex(17878);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishFullRecordToProfileSettingItem$onCheckStateChanged$1(C420632kj c420632kj, boolean z) {
        super(1);
        this.this$0 = c420632kj;
        this.$isChecked = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C2922y c2922y) {
        C2922y c2922y2 = c2922y;
        if (!PatchProxy.proxy(new Object[]{c2922y2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c2922y2);
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.LLLZIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Boolean.valueOf(c2922y2.LIZIZ));
            if (c2922y2.LIZIZ) {
                C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.LLLZIIL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
                c87308Kak2.LIZ(Boolean.valueOf(c2922y2.LIZ));
            } else {
                C87308Kak<Boolean> c87308Kak3 = AbstractC80293Hkt.LLLZL;
                Intrinsics.checkNotNullExpressionValue(c87308Kak3, "");
                c87308Kak3.LIZ(Boolean.FALSE);
            }
            C4574547f LIZ = C4574547f.LIZ();
            HashMap hashMap = new HashMap();
            hashMap.put("action_type", LK1.LIZ(this.$isChecked));
            hashMap.put("event_page", "live_take_page");
            hashMap.put("user_id", String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ()));
            LIZ.LIZ("livesdk_live_replay_is_auto_publish", hashMap, new Object[0]);
            this.this$0.LJIIJJI.LIZLLL();
        }
        return Unit.INSTANCE;
    }
}
