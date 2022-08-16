package com.bytedance.android.live.broadcast.props;

import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC89180LBu;

/* loaded from: classes5.dex */
public final class PropDetailDialog$initView$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89180LBu this$0;

    static {
        Covode.recordClassIndex(17582);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropDetailDialog$initView$$inlined$apply$lambda$1(DialogC89180LBu dialogC89180LBu) {
        super(0);
        this.this$0 = dialogC89180LBu;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LoadingStatusView loadingStatusView = this.this$0.LJIIIIZZ;
            if (loadingStatusView != null) {
                loadingStatusView.LIZIZ();
            }
            DialogC89180LBu.LIZ(this.this$0).LIZ((String) this.this$0.LJIIL.get("prop_id"), (String) this.this$0.LJIIL.get("game_id"));
        }
        return Unit.INSTANCE;
    }
}
