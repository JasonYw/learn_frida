package com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.fragment;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C135356c9f;
import p003X.C135440cB1;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.fragment.CJPayBindCardKeepDialogFragment$initActions$4 */
/* loaded from: classes17.dex */
public final class CJPayBindCardKeepDialogFragment$initActions$4 extends Lambda implements Function1<TextView, Unit> {
    public static final CJPayBindCardKeepDialogFragment$initActions$4 INSTANCE = new CJPayBindCardKeepDialogFragment$initActions$4();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6947);
    }

    public CJPayBindCardKeepDialogFragment$initActions$4() {
        super(1);
    }

    /* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.ui.fragment.CJPayBindCardKeepDialogFragment$initActions$4$1 */
    /* loaded from: classes.dex */
    public static final class C21961 extends Lambda implements Function1<Boolean, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ String $followedText;
        public final /* synthetic */ TextView $view;

        static {
            Covode.recordClassIndex(6948);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21961(TextView textView, String str) {
            super(1);
            this.$view = textView;
            this.$followedText = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue) {
                this.$view.setText(this.$followedText);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(TextView textView) {
        TextView textView2 = textView;
        if (!PatchProxy.proxy(new Object[]{textView2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(textView2);
            String string = textView2.getContext().getString(2131561671);
            Intrinsics.checkNotNullExpressionValue(string, "");
            if (true ^ Intrinsics.areEqual(textView2.getText(), string)) {
                C135356c9f.LIZ(new C21961(textView2, string));
                C135440cB1.LIZ("", textView2.getText().toString(), "");
            } else {
                C135440cB1.LIZ("1", textView2.getText().toString(), "");
            }
        }
        return Unit.INSTANCE;
    }
}
