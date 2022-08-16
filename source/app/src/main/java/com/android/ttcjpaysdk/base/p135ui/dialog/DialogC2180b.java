package com.android.ttcjpaysdk.base.p135ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.data.RetainMessageInfo;
import com.android.ttcjpaysdk.base.p135ui.widget.FakeBoldColorSpan;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC135399cAM;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C123323YgH;
import p003X.C135400cAN;
import p003X.View$OnClickListenerC135397cAK;
import p003X.View$OnClickListenerC135398cAL;

/* renamed from: com.android.ttcjpaysdk.base.ui.dialog.b */
/* loaded from: classes17.dex */
public final class DialogC2180b extends Dialog {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public CJPayCustomButton LIZJ;
    public AbstractC135399cAM LIZLLL;

    /* renamed from: LJ */
    public ImageView f25457LJ;
    public TextView LJFF;
    public TextView LJI;
    public LinearLayout LJII;

    static {
        Covode.recordClassIndex(6668);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DialogC2180b(Context context) {
        this(context, 2131493160);
        C106862S5w.LIZ(context);
    }

    public final DialogC2180b LIZ(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (DialogC2180b) proxy.result;
        }
        C106862S5w.LIZ(obj);
        if (obj instanceof String) {
            LIZJ((String) obj);
        } else if (obj instanceof ArrayList) {
            LIZ((ArrayList) obj);
            return this;
        }
        return this;
    }

    public final DialogC2180b LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (DialogC2180b) proxy.result;
        }
        C106862S5w.LIZ(str);
        CJPayCustomButton cJPayCustomButton = this.LIZJ;
        if (cJPayCustomButton == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        cJPayCustomButton.setText(str);
        return this;
    }

    public final DialogC2180b LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (DialogC2180b) proxy.result;
        }
        C106862S5w.LIZ(str);
        TextView textView = this.LJFF;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView.setText(str);
        return this;
    }

    private final DialogC2180b LIZJ(String str) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (DialogC2180b) proxy.result;
        }
        TextView textView = this.LJI;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (Intrinsics.areEqual(str, "")) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        LinearLayout linearLayout = this.LJII;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        linearLayout.setVisibility(8);
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                if (str.charAt(i2) == '$') {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        int length2 = str.length() - 1;
        while (true) {
            if (length2 >= 0) {
                if (str.charAt(length2) == '$') {
                    break;
                }
                length2--;
            } else {
                length2 = -1;
                break;
            }
        }
        if (i2 != -1 && i2 != length2) {
            StringBuilder sb = new StringBuilder();
            int length3 = str.length();
            for (int i3 = 0; i3 < length3; i3++) {
                char charAt = str.charAt(i3);
                if (charAt != '$') {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "");
            SpannableString spannableString = new SpannableString(sb2);
            Context context = CJPayHostInfo.applicationContext;
            if (context != null) {
                C116971W2r.LIZ(spannableString, new FakeBoldColorSpan(0.0f, C116971W2r.LIZ(context.getResources(), 2131624878), 1), i2, length2 - 1, 33);
            }
            TextView textView2 = this.LJI;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView2.setText(spannableString);
            return this;
        }
        TextView textView3 = this.LJI;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView3.setText(str);
        return this;
    }

    private final DialogC2180b LIZ(ArrayList<RetainMessageInfo> arrayList) {
        Context context;
        float f;
        MethodCollector.m14708i(420);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            DialogC2180b dialogC2180b = (DialogC2180b) proxy.result;
            MethodCollector.m14707o(420);
            return dialogC2180b;
        }
        LinearLayout linearLayout = this.LJII;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        linearLayout.setVisibility(0);
        TextView textView = this.LJI;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        textView.setVisibility(8);
        LinearLayout linearLayout2 = this.LJII;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        linearLayout2.removeAllViews();
        int dipToPX = CJPayBasicUtils.dipToPX(getContext(), 64.0f);
        int dipToPX2 = CJPayBasicUtils.dipToPX(getContext(), 20.0f);
        if (arrayList != null) {
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                RetainMessageInfo retainMessageInfo = (RetainMessageInfo) obj;
                View inflate = LayoutInflater.from(getContext()).inflate(2131690674, (ViewGroup) null);
                if (i == 0) {
                    context = getContext();
                    f = 10.0f;
                } else {
                    context = getContext();
                    f = 8.0f;
                }
                int dipToPX3 = CJPayBasicUtils.dipToPX(context, f);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, dipToPX);
                layoutParams.setMargins(dipToPX2, dipToPX3, dipToPX2, 0);
                Intrinsics.checkNotNullExpressionValue(inflate, "");
                inflate.setLayoutParams(layoutParams);
                TextView textView2 = (TextView) inflate.findViewById(2131169886);
                if (!TextUtils.isEmpty(retainMessageInfo.top_left_msg)) {
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                    textView2.setText(retainMessageInfo.top_left_msg);
                }
                TextView textView3 = (TextView) inflate.findViewById(2131169887);
                TextView textView4 = (TextView) inflate.findViewById(2131169883);
                TextView textView5 = (TextView) inflate.findViewById(2131169885);
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setTypeface(C135400cAN.LIZJ(getContext()));
                Intrinsics.checkNotNullExpressionValue(textView4, "");
                textView4.setTypeface(C135400cAN.LIZJ(getContext()));
                if (retainMessageInfo.left_msg_type == 2) {
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setText(retainMessageInfo.left_msg);
                    textView5.setVisibility(0);
                    textView3.setVisibility(8);
                    textView4.setVisibility(8);
                } else {
                    textView4.setText(retainMessageInfo.left_msg);
                    textView3.setVisibility(0);
                    textView4.setVisibility(0);
                    Intrinsics.checkNotNullExpressionValue(textView5, "");
                    textView5.setVisibility(8);
                }
                TextView textView6 = (TextView) inflate.findViewById(2131169889);
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                textView6.setText(retainMessageInfo.right_msg);
                LinearLayout linearLayout3 = this.LJII;
                if (linearLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                linearLayout3.addView(inflate);
                i = i2;
            }
        }
        MethodCollector.m14707o(420);
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC2180b(Context context, int i) {
        super(context, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(421);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            View inflate = LayoutInflater.from(getContext()).inflate(2131690752, (ViewGroup) null);
            setContentView(inflate);
            setCancelable(false);
            View findViewById = inflate.findViewById(2131179805);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.f25457LJ = (ImageView) findViewById;
            View findViewById2 = inflate.findViewById(2131179819);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LJFF = (TextView) findViewById2;
            View findViewById3 = inflate.findViewById(2131179817);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LJI = (TextView) findViewById3;
            View findViewById4 = inflate.findViewById(2131171526);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LJII = (LinearLayout) findViewById4;
            View findViewById5 = inflate.findViewById(2131179803);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.LIZJ = (CJPayCustomButton) findViewById5;
            View findViewById6 = inflate.findViewById(2131179802);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "");
            this.LIZIZ = (TextView) findViewById6;
            ImageView imageView = this.f25457LJ;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            imageView.setOnClickListener(new View$OnClickListenerC135397cAK(this));
            CJPayCustomButton cJPayCustomButton = this.LIZJ;
            if (cJPayCustomButton == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            cJPayCustomButton.setOnClickListener(new View$OnClickListenerC135398cAL(this));
            TextView textView = this.LIZIZ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C123323YgH.LIZ(textView, new CJPayKeepDialog$init$3(this));
            inflate.getLayoutParams().width = CJPayBasicUtils.dipToPX(getContext(), 280.0f);
            inflate.getLayoutParams().height = -2;
        }
        MethodCollector.m14707o(421);
    }
}
