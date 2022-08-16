package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.android.livesdk.rank.model.C9213b;
import com.bytedance.android.livesdk.rank.model.C9220h;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC80258HkK;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C2LD;
import p003X.C80266HkS;
import p003X.LK5;
import p003X.View$OnClickListenerC80264HkQ;
import p003X.View$OnClickListenerC80265HkR;

/* loaded from: classes3.dex */
public final class TalkRoomFeedbackView extends ScrollView {
    public static ChangeQuickRedirect LIZ;
    public C9220h LIZIZ;
    public String LIZJ;
    public AbstractC80258HkK LJFF;
    public TextView LJI;
    public HashMap LJIIIZ;
    public List<String> LIZLLL = new ArrayList();

    /* renamed from: LJ */
    public String f26304LJ = "";
    public final View.OnClickListener LJII = new View$OnClickListenerC80264HkQ(this);
    public final View.OnClickListener LJIIIIZZ = new View$OnClickListenerC80265HkR(this);

    static {
        Covode.recordClassIndex(26536);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new HashMap();
        }
        View view = (View) this.LJIIIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIIIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getSelectedTag() {
        return this.LIZJ;
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700536, (ViewGroup) this, true);
        ((EditText) LIZ(2131184663)).addTextChangedListener(new C80266HkS(this));
        ((EditText) LIZ(2131184663)).setOnTouchListener(C2LD.LIZIZ);
    }

    public final String getSelectedSubTag() {
        Iterator<String> it;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(this.f26304LJ)) {
            return this.f26304LJ;
        }
        String str = "";
        while (this.LIZLLL.iterator().hasNext()) {
            str = str + it.next() + ',';
        }
        if (StringsKt__StringsJVMKt.endsWith$default(str, Constants.ACCEPT_TIME_SEPARATOR_SP, false, 2, null)) {
            String substring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            return substring;
        }
        return str;
    }

    public final void setListener(AbstractC80258HkK abstractC80258HkK) {
        this.LJFF = abstractC80258HkK;
    }

    public TalkRoomFeedbackView(Context context) {
        super(context);
        MethodCollector.m14708i(1798);
        LIZ();
        MethodCollector.m14707o(1798);
    }

    public final void setTagTitleText(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        TextView textView = (TextView) LIZ(2131191516);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setText(str);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, motionEvent}, null, LIZ, true, 9);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 11);
        if (proxy3.isSupported) {
            return ((Boolean) proxy3.result).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final TextView LIZ(String str) {
        MethodCollector.m14708i(1797);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            TextView textView = (TextView) proxy.result;
            MethodCollector.m14707o(1797);
            return textView;
        }
        TextView textView2 = new TextView(getContext());
        textView2.setBackgroundResource(2130855293);
        textView2.setText(str);
        textView2.setTextColor(LK5.LIZIZ(2131629087));
        textView2.setTextSize(1, 12.0f);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 18.0f);
        int dip2Px2 = (int) UIUtils.dip2Px(getContext(), 6.0f);
        textView2.setPadding(dip2Px, dip2Px2, dip2Px, dip2Px2);
        MethodCollector.m14707o(1797);
        return textView2;
    }

    public final void LIZ(C9213b c9213b) {
        if (PatchProxy.proxy(new Object[]{c9213b}, this, LIZ, false, 4).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LIZ(2131190979);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        if (Lists.isEmpty(c9213b.LIZJ)) {
            TextView textView = (TextView) LIZ(2131190980);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(LK5.LIZ(2131587964));
            EditText editText = (EditText) LIZ(2131184663);
            Intrinsics.checkNotNullExpressionValue(editText, "");
            editText.setVisibility(0);
            WrapLineFlowLayout wrapLineFlowLayout = (WrapLineFlowLayout) LIZ(2131190981);
            Intrinsics.checkNotNullExpressionValue(wrapLineFlowLayout, "");
            wrapLineFlowLayout.setVisibility(8);
            return;
        }
        TextView textView2 = (TextView) LIZ(2131190980);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setText(LK5.LIZ(2131587963));
        ((WrapLineFlowLayout) LIZ(2131190981)).removeAllViews();
        for (String str : c9213b.LIZJ) {
            TextView LIZ2 = LIZ(str);
            ((WrapLineFlowLayout) LIZ(2131190981)).addView(LIZ2);
            LIZ2.setOnClickListener(this.LJIIIIZZ);
        }
        WrapLineFlowLayout wrapLineFlowLayout2 = (WrapLineFlowLayout) LIZ(2131190981);
        Intrinsics.checkNotNullExpressionValue(wrapLineFlowLayout2, "");
        wrapLineFlowLayout2.setVisibility(0);
        EditText editText2 = (EditText) LIZ(2131184663);
        Intrinsics.checkNotNullExpressionValue(editText2, "");
        editText2.setVisibility(8);
    }

    public TalkRoomFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1799);
        LIZ();
        MethodCollector.m14707o(1799);
    }

    public TalkRoomFeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1800);
        LIZ();
        MethodCollector.m14707o(1800);
    }
}
