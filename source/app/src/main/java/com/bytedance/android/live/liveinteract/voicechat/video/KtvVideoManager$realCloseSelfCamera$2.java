package com.bytedance.android.live.liveinteract.voicechat.video;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdk.chatroom.model.interact.UpdateLinkTypeApplyResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80486Ho0;
import p003X.C106862S5w;
import p003X.C80478Hns;

/* loaded from: classes3.dex */
public final class KtvVideoManager$realCloseSelfCamera$2 extends Lambda implements Function1<UpdateLinkTypeApplyResponse, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC80486Ho0 $closeType;
    public final /* synthetic */ C80478Hns this$0;

    static {
        Covode.recordClassIndex(31735);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoManager$realCloseSelfCamera$2(C80478Hns c80478Hns, AbstractC80486Ho0 abstractC80486Ho0) {
        super(1);
        this.this$0 = c80478Hns;
        this.$closeType = abstractC80486Ho0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(UpdateLinkTypeApplyResponse updateLinkTypeApplyResponse) {
        UpdateLinkTypeApplyResponse updateLinkTypeApplyResponse2 = updateLinkTypeApplyResponse;
        if (!PatchProxy.proxy(new Object[]{updateLinkTypeApplyResponse2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(updateLinkTypeApplyResponse2);
            if (!updateLinkTypeApplyResponse2.isValid()) {
                ALogger.m15800e("ttlive_link_camera", "update audio linkType resp invalid");
            }
            String str = updateLinkTypeApplyResponse2.rtcExtInfo;
            if (str == null) {
                if (this.this$0.LJIJJ) {
                    str = "";
                } else {
                    str = this.this$0.LJIL.LJIIIIZZ;
                }
            }
            String str2 = updateLinkTypeApplyResponse2.liveCoreExtInfo;
            if (str2 == null) {
                str2 = "";
            }
            if (this.$closeType.LIZJ) {
                this.this$0.LIZ(str, str2);
            }
        }
        return Unit.INSTANCE;
    }
}
