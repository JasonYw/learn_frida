package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.C2919v;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C86816KIw;

/* loaded from: classes5.dex */
public final class PreviewStickerWidget$showBlessingSticker$$inlined$let$lambda$1 extends Lambda implements Function1<PreviewSourceParam, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Sticker $it;
    public final /* synthetic */ PreviewStickerWidget this$0;

    static {
        Covode.recordClassIndex(18717);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewStickerWidget$showBlessingSticker$$inlined$let$lambda$1(Sticker sticker, PreviewStickerWidget previewStickerWidget) {
        super(1);
        this.$it = sticker;
        this.this$0 = previewStickerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(PreviewSourceParam previewSourceParam) {
        PreviewSourceParam previewSourceParam2 = previewSourceParam;
        if (!PatchProxy.proxy(new Object[]{previewSourceParam2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(previewSourceParam2);
            C2919v LIZ = previewSourceParam2.LIZ();
            String LIZ2 = this.this$0.LIZ();
            ALogger.m15795w(LIZ2, "getPayload:" + LIZ);
            if (LIZ != null) {
                String LIZ3 = C86816KIw.LIZ(LIZ);
                if (LIZ3.length() > 0) {
                    this.this$0.LJIILL = Intrinsics.areEqual(previewSourceParam2.stickerTaskOptional, Boolean.FALSE);
                    this.this$0.LJIIJJI().LIZLLL().LIZ(this.$it);
                    String LIZ4 = this.this$0.LIZ();
                    ALogger.m15795w(LIZ4, "get task_id " + LIZ3 + " from sourceParam , needShowToast = " + this.this$0.LJIILL + " , set currentSticker to [" + this.$it.getId() + LoggerUtil.M_RIGHT_TAG);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
