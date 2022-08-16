package cn.everphoto.template_panel.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83345It1;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$compressDone$1 extends Lambda implements Function0<IEffectNetWorker> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3720);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$compressDone$1(C83345It1 c83345It1) {
        super(0);
        this.this$0 = c83345It1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.ss.android.ugc.effectmanager.common.listener.IEffectNetWorker] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IEffectNetWorker mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZ().LIZIZ().LIZJ;
    }
}
