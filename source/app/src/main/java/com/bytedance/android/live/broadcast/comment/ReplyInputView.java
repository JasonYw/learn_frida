package com.bytedance.android.live.broadcast.comment;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C9P;
import p003X.L0W;
import p003X.LK1;
import p003X.LK5;
import p003X.View$OnClickListenerC89152LAs;

/* loaded from: classes5.dex */
public final class ReplyInputView extends LinearLayout {
    public static ChangeQuickRedirect LIZ;
    public EditText LIZIZ;
    public TextView LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public L0W f25807LJ;

    static {
        Covode.recordClassIndex(15250);
    }

    public ReplyInputView(Context context) {
        this(context, null, 0, 6, null);
    }

    public ReplyInputView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setHintText(String str) {
        EditText editText;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported && (editText = this.LIZIZ) != null) {
            editText.setHint(str);
        }
    }

    public final void setOnInputClickListener(Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{function0}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(function0);
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setOnClickListener(new View$OnClickListenerC89152LAs(function0));
        }
    }

    public final void setOnSendClickListener(Function1<? super String, Unit> function1) {
        if (PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(function1);
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            imageView.setOnClickListener(new C9P(this, function1));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReplyInputView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1225);
        this.f25807LJ = new L0W(this, context);
        setOrientation(0);
        setPadding(LK5.LIZ(16.0f), LK5.LIZ(9.0f), LK5.LIZ(16.0f), LK5.LIZ(9.0f));
        setBackground(LK5.LIZJ(2130857931));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2, 1.0f);
        this.LIZIZ = new EditText(context);
        EditText editText = this.LIZIZ;
        if (editText != null) {
            editText.setLayoutParams(layoutParams);
        }
        EditText editText2 = this.LIZIZ;
        if (editText2 != null) {
            editText2.setMinLines(1);
        }
        EditText editText3 = this.LIZIZ;
        if (editText3 != null) {
            editText3.setBackground(LK5.LIZJ(2130854569));
        }
        EditText editText4 = this.LIZIZ;
        if (editText4 != null) {
            editText4.setPadding(LK5.LIZ(10.0f), LK5.LIZ(10.0f), LK5.LIZ(10.0f), LK5.LIZ(10.0f));
        }
        EditText editText5 = this.LIZIZ;
        if (editText5 != null) {
            editText5.setHint(LK5.LIZ(2131583554));
        }
        EditText editText6 = this.LIZIZ;
        if (editText6 != null) {
            editText6.setHintTextColor(LK5.LIZIZ(2131628462));
        }
        EditText editText7 = this.LIZIZ;
        if (editText7 != null) {
            editText7.setTextColor(LK5.LIZIZ(2131629518));
        }
        EditText editText8 = this.LIZIZ;
        if (editText8 != null) {
            editText8.setTextSize(13.0f);
        }
        EditText editText9 = this.LIZIZ;
        if (editText9 != null) {
            editText9.setImeOptions(268435456);
        }
        EditText editText10 = this.LIZIZ;
        if (editText10 != null) {
            editText10.addTextChangedListener(this.f25807LJ);
        }
        this.LIZJ = new TextView(context);
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setTextSize(13.0f);
        }
        TextView textView2 = this.LIZJ;
        if (textView2 != null) {
            textView2.setTextColor(LK5.LIZIZ(2131628462));
        }
        TextView textView3 = this.LIZJ;
        if (textView3 != null) {
            textView3.setText(LK5.LIZ(2131583554));
        }
        TextView textView4 = this.LIZJ;
        if (textView4 != null) {
            textView4.setBackground(LK5.LIZJ(2130854568));
        }
        TextView textView5 = this.LIZJ;
        if (textView5 != null) {
            textView5.setPadding(LK5.LIZ(10.0f), LK5.LIZ(10.0f), LK5.LIZ(10.0f), LK5.LIZ(10.0f));
        }
        TextView textView6 = this.LIZJ;
        if (textView6 != null) {
            textView6.setLayoutParams(layoutParams);
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(LK5.LIZ(22.0f), LK5.LIZ(22.0f));
        layoutParams2.leftMargin = LK5.LIZ(12.0f);
        layoutParams2.bottomMargin = LK5.LIZ(7.0f);
        layoutParams2.gravity = 80;
        this.LIZLLL = new ImageView(context);
        ImageView imageView = this.LIZLLL;
        if (imageView != null) {
            imageView.setLayoutParams(layoutParams2);
        }
        ImageView imageView2 = this.LIZLLL;
        if (imageView2 != null) {
            imageView2.setImageResource(2130856567);
        }
        EditText editText11 = this.LIZIZ;
        if (editText11 != null) {
            LK1.LIZ(editText11);
        }
        ImageView imageView3 = this.LIZLLL;
        if (imageView3 != null) {
            LK1.LIZ(imageView3);
        }
        TextView textView7 = this.LIZJ;
        if (textView7 != null) {
            LK1.LIZJ(textView7);
        }
        addView(this.LIZIZ);
        addView(this.LIZJ);
        addView(this.LIZLLL);
        MethodCollector.m14707o(1225);
    }

    public /* synthetic */ ReplyInputView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
