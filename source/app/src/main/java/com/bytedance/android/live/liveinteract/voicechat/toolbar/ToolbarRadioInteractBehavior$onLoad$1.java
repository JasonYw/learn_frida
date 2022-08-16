package com.bytedance.android.live.liveinteract.voicechat.toolbar;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p003X.C448653op;

/* loaded from: classes12.dex */
public final /* synthetic */ class ToolbarRadioInteractBehavior$onLoad$1 extends FunctionReferenceImpl implements Function1<KVData, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(31702);
    }

    public ToolbarRadioInteractBehavior$onLoad$1(C448653op c448653op) {
        super(1, c448653op, C448653op.class, "onChanged", "onChanged(Lcom/bytedance/ies/sdk/widgets/KVData;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(KVData kVData) {
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, changeQuickRedirect, false, 1).isSupported) {
            ((C448653op) this.receiver).onChanged(kVData2);
        }
        return Unit.INSTANCE;
    }
}
