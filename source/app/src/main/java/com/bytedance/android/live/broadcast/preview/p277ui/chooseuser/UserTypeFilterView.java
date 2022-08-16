package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C392771gt;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.UserTypeFilterView */
/* loaded from: classes.dex */
public final class UserTypeFilterView extends LinearLayout implements View.OnClickListener {
    public static ChangeQuickRedirect LIZ;
    public static final C392771gt LIZIZ = new C392771gt((byte) 0);
    public Function1<? super Integer, Unit> LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(17382);
    }

    public UserTypeFilterView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UserTypeFilterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Function1<Integer, Unit> getOnFilterSelectedListener() {
        return this.LIZJ;
    }

    public final void setOnFilterSelectedListener(Function1<? super Integer, Unit> function1) {
        this.LIZJ = function1;
    }

    private final void setTextViewSelectedStyle(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 4).isSupported) {
            return;
        }
        textView.setTextColor(LK5.LIZIZ(2131629387));
    }

    private final void setTextViewUnSelectedStyle(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 3).isSupported) {
            return;
        }
        textView.setTextColor(LK5.LIZIZ(2131629391));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == 2131194143) {
                setSelectedFilter(0);
            } else if (valueOf.intValue() == 2131194148) {
                setSelectedFilter(1);
                i = 1;
            } else if (valueOf.intValue() == 2131194145) {
                setSelectedFilter(2);
                i = 2;
            } else if (valueOf.intValue() == 2131194147) {
                setSelectedFilter(3);
                i = 3;
            }
        }
        Function1<? super Integer, Unit> function1 = this.LIZJ;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i));
        }
    }

    private final void setSelectedFilter(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            TextView textView = (TextView) LIZ(2131194143);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            setTextViewUnSelectedStyle(textView);
            TextView textView2 = (TextView) LIZ(2131194148);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            setTextViewUnSelectedStyle(textView2);
            TextView textView3 = (TextView) LIZ(2131194145);
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            setTextViewUnSelectedStyle(textView3);
            TextView textView4 = (TextView) LIZ(2131194147);
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            setTextViewUnSelectedStyle(textView4);
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        TextView textView5 = (TextView) LIZ(2131194147);
                        Intrinsics.checkNotNullExpressionValue(textView5, "");
                        setTextViewSelectedStyle(textView5);
                        return;
                    }
                    return;
                }
                TextView textView6 = (TextView) LIZ(2131194145);
                Intrinsics.checkNotNullExpressionValue(textView6, "");
                setTextViewSelectedStyle(textView6);
                return;
            }
            TextView textView7 = (TextView) LIZ(2131194148);
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            setTextViewSelectedStyle(textView7);
            return;
        }
        TextView textView8 = (TextView) LIZ(2131194143);
        Intrinsics.checkNotNullExpressionValue(textView8, "");
        setTextViewSelectedStyle(textView8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserTypeFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1305);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699908, (ViewGroup) this, true);
        ((TextView) LIZ(2131194143)).setOnClickListener(this);
        ((TextView) LIZ(2131194148)).setOnClickListener(this);
        ((TextView) LIZ(2131194145)).setOnClickListener(this);
        ((TextView) LIZ(2131194147)).setOnClickListener(this);
        setSelectedFilter(0);
        MethodCollector.m14707o(1305);
    }

    public /* synthetic */ UserTypeFilterView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
