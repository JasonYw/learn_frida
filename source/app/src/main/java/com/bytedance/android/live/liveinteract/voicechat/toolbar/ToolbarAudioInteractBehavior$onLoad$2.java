package com.bytedance.android.live.liveinteract.voicechat.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C448583oi;

/* loaded from: classes12.dex */
public final /* synthetic */ class ToolbarAudioInteractBehavior$onLoad$2 extends FunctionReferenceImpl implements Function1<KVData, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31699);
    }

    public ToolbarAudioInteractBehavior$onLoad$2(C448583oi c448583oi) {
        super(1, c448583oi, C448583oi.class, "onChanged", "onChanged(Lcom/bytedance/ies/sdk/widgets/KVData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, changeQuickRedirect, false, 1).isSupported) {
            ((C448583oi) this.receiver).onChanged(kVData2);
        }
        return Unit.INSTANCE;
    }
}
