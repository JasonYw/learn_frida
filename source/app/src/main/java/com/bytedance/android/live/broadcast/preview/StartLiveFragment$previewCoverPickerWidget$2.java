package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$previewCoverPickerWidget$2 extends Lambda implements Function0<PreviewCoverPickerWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17144);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$previewCoverPickerWidget$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.widget.PreviewCoverPickerWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ PreviewCoverPickerWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        PreviewCoverPickerWidget previewCoverPickerWidget = new PreviewCoverPickerWidget();
        KJV kjv = this.this$0;
        if (!PatchProxy.proxy(new Object[]{kjv}, previewCoverPickerWidget, PreviewCoverPickerWidget.LJFF, false, 6).isSupported) {
            C106862S5w.LIZ(kjv);
            previewCoverPickerWidget.LJII = kjv;
        }
        return previewCoverPickerWidget;
    }
}