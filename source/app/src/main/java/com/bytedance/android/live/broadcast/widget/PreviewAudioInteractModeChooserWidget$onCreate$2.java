package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C86870KKy;
import p003X.KKB;

/* loaded from: classes5.dex */
public final class PreviewAudioInteractModeChooserWidget$onCreate$2 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewAudioInteractModeChooserWidget this$0;

    static {
        Covode.recordClassIndex(18425);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewAudioInteractModeChooserWidget$onCreate$2(PreviewAudioInteractModeChooserWidget previewAudioInteractModeChooserWidget) {
        super(1);
        this.this$0 = previewAudioInteractModeChooserWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        boolean z;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            PreviewAudioInteractModeChooserWidget previewAudioInteractModeChooserWidget = this.this$0;
            C86870KKy c86870KKy = previewAudioInteractModeChooserWidget.LIZIZ;
            if (roomCreateInfo2 != null && roomCreateInfo2.LJIILIIL == 0 && KKB.LIZJ(roomCreateInfo2, LiveMode.AUDIO)) {
                z = true;
            } else {
                z = false;
            }
            previewAudioInteractModeChooserWidget.LIZ(C86870KKy.LIZ(c86870KKy, false, z, 1, null));
        }
        return Unit.INSTANCE;
    }
}
