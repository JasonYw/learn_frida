package com.bytedance.android.live.broadcast.bgbroadcast.game.mirror.view;

import android.widget.Button;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.K68;
import p003X.KDY;

/* loaded from: classes5.dex */
public final class StateError$btnTryAgain$2 extends Lambda implements Function0<Button> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KDY this$0;

    static {
        Covode.recordClassIndex(14800);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StateError$btnTryAgain$2(KDY kdy) {
        super(0);
        this.this$0 = kdy;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.widget.Button, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Button mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Button button = (Button) this.this$0.LIZIZ.findViewById(2131183205);
        button.setOnClickListener(K68.LIZIZ);
        return button;
    }
}
