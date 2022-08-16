package com.bytedance.android.live.p238ai.impl.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.PZO;
import p003X.PZP;
import p003X.PZQ;
import p003X.PZU;

/* renamed from: com.bytedance.android.live.ai.impl.core.CoreStrategy$MainThreadTaskResultCallback$onResult$1 */
/* loaded from: classes8.dex */
public final class CoreStrategy$MainThreadTaskResultCallback$onResult$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PZQ $error;
    public final /* synthetic */ boolean $isFromEventRunTask;
    public final /* synthetic */ PZO $outputData;
    public final /* synthetic */ PZP $packageInfo;
    public final /* synthetic */ boolean $success;
    public final /* synthetic */ PZU this$0;

    static {
        Covode.recordClassIndex(13901);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreStrategy$MainThreadTaskResultCallback$onResult$1(PZU pzu, boolean z, PZQ pzq, PZO pzo, PZP pzp, boolean z2) {
        super(0);
        this.this$0 = pzu;
        this.$success = z;
        this.$error = pzq;
        this.$outputData = pzo;
        this.$packageInfo = pzp;
        this.$isFromEventRunTask = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ(this.$success, this.$error, this.$outputData, this.$packageInfo, this.$isFromEventRunTask);
        }
        return Unit.INSTANCE;
    }
}
