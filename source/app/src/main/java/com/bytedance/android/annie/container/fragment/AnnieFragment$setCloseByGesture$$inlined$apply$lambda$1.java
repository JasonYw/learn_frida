package com.bytedance.android.annie.container.fragment;

import android.view.KeyEvent;
import com.bytedance.android.annie.api.card.IHybridComponent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class AnnieFragment$setCloseByGesture$$inlined$apply$lambda$1 extends Lambda implements Function1<KeyEvent, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $data$inlined;
    public final /* synthetic */ boolean $enable$inlined;
    public final /* synthetic */ String $eventName$inlined;
    public final /* synthetic */ C2606a this$0;

    static {
        Covode.recordClassIndex(10753);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieFragment$setCloseByGesture$$inlined$apply$lambda$1(C2606a c2606a, String str, JSONObject jSONObject, boolean z) {
        super(1);
        this.this$0 = c2606a;
        this.$eventName$inlined = str;
        this.$data$inlined = jSONObject;
        this.$enable$inlined = z;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Boolean, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
        KeyEvent keyEvent2 = keyEvent;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{keyEvent2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Intrinsics.checkNotNullExpressionValue(keyEvent2, "");
        if (keyEvent2.getKeyCode() == 4) {
            IHybridComponent mAnnieCard = this.this$0.getMAnnieCard();
            if (mAnnieCard != null) {
                mAnnieCard.sendJsEvent(this.$eventName$inlined, this.$data$inlined);
            }
            return Boolean.valueOf(!this.$enable$inlined);
        }
        return Boolean.FALSE;
    }
}
