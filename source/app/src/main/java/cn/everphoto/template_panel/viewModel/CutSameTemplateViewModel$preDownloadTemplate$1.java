package cn.everphoto.template_panel.viewModel;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class CutSameTemplateViewModel$preDownloadTemplate$1 extends Lambda implements Function0<IEffectNetWorker> {
    public final /* synthetic */ IEffectNetWorker $effectNetWorker;

    static {
        Covode.recordClassIndex(3847);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateViewModel$preDownloadTemplate$1(IEffectNetWorker iEffectNetWorker) {
        super(0);
        this.$effectNetWorker = iEffectNetWorker;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* bridge */ /* synthetic */ IEffectNetWorker mo30099invoke() {
        return this.$effectNetWorker;
    }
}
