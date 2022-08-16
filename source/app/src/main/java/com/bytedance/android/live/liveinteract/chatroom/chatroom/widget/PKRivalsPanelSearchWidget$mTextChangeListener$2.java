package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.text.Editable;
import android.text.TextWatcher;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C17U;
import p003X.C80070HhI;
import p003X.C88306Kqq;

/* loaded from: classes3.dex */
public final class PKRivalsPanelSearchWidget$mTextChangeListener$2 extends Lambda implements Function0<C43801> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PKRivalsPanelSearchWidget this$0;

    static {
        Covode.recordClassIndex(26517);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKRivalsPanelSearchWidget$mTextChangeListener$2(PKRivalsPanelSearchWidget pKRivalsPanelSearchWidget) {
        super(0);
        this.this$0 = pKRivalsPanelSearchWidget;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsPanelSearchWidget$mTextChangeListener$2$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C43801 mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C43801();
    }

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKRivalsPanelSearchWidget$mTextChangeListener$2$1 */
    /* loaded from: classes3.dex */
    public static final class C43801 implements TextWatcher {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(26518);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public C43801() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 1).isSupported) {
                return;
            }
            Editable text = PKRivalsPanelSearchWidget.LIZ(PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0).getText();
            Intrinsics.checkNotNullExpressionValue(text, "");
            if (text.length() > 0) {
                PKRivalsPanelSearchWidget.LIZIZ(PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0).setVisibility(0);
                PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0.LIZIZ();
                PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0.LIZJ();
                ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).searchRivalsHint("live_pk", 30010L, String.valueOf(editable)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C80070HhI(this), C17U.LIZ);
                return;
            }
            PKRivalsPanelSearchWidget.LIZIZ(PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0).setVisibility(8);
            PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0.LIZ();
            PKRivalsPanelSearchWidget$mTextChangeListener$2.this.this$0.LJIIIIZZ.LIZIZ();
        }
    }
}
