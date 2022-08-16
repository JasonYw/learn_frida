package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.android.livesdk.rank.model.C9214c;
import com.bytedance.android.livesdk.rank.model.C9217e;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC80272HkY;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C140181dPd;
import p003X.C140192dPo;
import p003X.C80269HkV;
import p003X.C80270HkW;
import p003X.LK5;
import p003X.View$OnClickListenerC80267HkT;
import p003X.View$OnClickListenerC80268HkU;

/* loaded from: classes3.dex */
public final class PkFeedbackView extends ScrollView {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public int LIZLLL;

    /* renamed from: LJ */
    public String f26303LJ;
    public int LJFF;
    public String LJIIIIZZ;
    public C9217e LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public AbstractC80272HkY LJIJ;
    public HashMap LJIJJ;
    public ArrayList<String> LIZJ = new ArrayList<>();
    public ArrayList<String> LJIILL = new ArrayList<>();
    public ArrayList<C9214c> LJI = new ArrayList<>();
    public ArrayList<C9214c> LJII = new ArrayList<>();
    public final View.OnClickListener LJIJI = new View$OnClickListenerC80267HkT(this);
    public final View.OnClickListener LJIILJJIL = new View$OnClickListenerC80268HkU(this);

    static {
        Covode.recordClassIndex(26530);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJIJJ == null) {
            this.LJIJJ = new HashMap();
        }
        View view = (View) this.LJIJJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJIJJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final ArrayList<String> getSelectRandomTags() {
        return this.LJIILL;
    }

    public final String getSelectReportOther() {
        return this.LJIIIIZZ;
    }

    public final int getSelectReportSerialId() {
        return this.LJFF;
    }

    public final String getSelectReportTag() {
        return this.f26303LJ;
    }

    public final String getSelectTag() {
        return this.LIZIZ;
    }

    public final Integer getSelectTagType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        return Integer.valueOf(this.LIZLLL);
    }

    public final String getPkSelectTag() {
        Iterator<String> it;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = "";
        while (this.LJIILL.iterator().hasNext()) {
            str = str + it.next() + ',';
        }
        if (str.length() > 0) {
            return str.subSequence(0, str.length() - 2).toString();
        }
        return str;
    }

    public final String getSelectSubTag() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Iterator<String> it = this.LIZJ.iterator();
        String str = "";
        while (it.hasNext()) {
            String next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (next.length() > 0) {
                str = str + next + ',';
            }
        }
        if (StringsKt__StringsJVMKt.endsWith$default(str, Constants.ACCEPT_TIME_SEPARATOR_SP, false, 2, null)) {
            String substring = str.substring(0, str.length() - 1);
            Intrinsics.checkNotNullExpressionValue(substring, "");
            return substring;
        }
        return str;
    }

    private void LIZIZ() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700478, (ViewGroup) this, true);
        TextView textView = (TextView) LIZ(2131195099);
        if (textView != null) {
            textView.setVisibility(8);
        }
        WrapLineFlowLayout wrapLineFlowLayout = (WrapLineFlowLayout) LIZ(2131191528);
        if (wrapLineFlowLayout != null) {
            wrapLineFlowLayout.setVisibility(8);
        }
        TextView textView2 = (TextView) LIZ(2131172203);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) LIZ(2131195176);
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        WrapLineFlowLayout wrapLineFlowLayout2 = (WrapLineFlowLayout) LIZ(2131190961);
        if (wrapLineFlowLayout2 != null) {
            wrapLineFlowLayout2.setVisibility(8);
        }
        EditText editText = (EditText) LIZ(2131165215);
        if (editText != null) {
            editText.setVisibility(8);
        }
        EditText editText2 = (EditText) LIZ(2131165215);
        if (editText2 != null) {
            editText2.addTextChangedListener(new C80269HkV(this));
        }
        EditText editText3 = (EditText) LIZ(2131187772);
        if (editText3 != null) {
            editText3.setVisibility(8);
        }
        EditText editText4 = (EditText) LIZ(2131187772);
        if (editText4 != null) {
            editText4.addTextChangedListener(new C80270HkW(this));
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else if (this.LJIILLIIL && LinkCrossRoomDataHolder.LJII().LJIJJLI == 1 && this.LJIIZILJ) {
            z = true;
        }
        if (z) {
            TextView textView4 = (TextView) LIZ(2131172330);
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setText(LK5.LIZ(2131586917));
            return;
        }
        TextView textView5 = (TextView) LIZ(2131172330);
        Intrinsics.checkNotNullExpressionValue(textView5, "");
        textView5.setText(LK5.LIZ(2131586924));
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIILIIL) {
            EditText editText = (EditText) LIZ(2131165215);
            Intrinsics.checkNotNullExpressionValue(editText, "");
            if (TextUtils.isEmpty(editText.getText())) {
                return false;
            }
            return true;
        }
        TextView textView = (TextView) LIZ(2131172203);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() != 0) {
            return true;
        }
        if (this.LJIIL) {
            if (TextUtils.isEmpty(this.f26303LJ)) {
                return false;
            }
            return true;
        } else if (this.LIZJ.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public final void setListener(AbstractC80272HkY abstractC80272HkY) {
        this.LJIJ = abstractC80272HkY;
    }

    public final void setEditText(CharSequence charSequence) {
        AbstractC80272HkY abstractC80272HkY;
        if (!PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 11).isSupported && (abstractC80272HkY = this.LJIJ) != null) {
            abstractC80272HkY.LIZ(charSequence);
        }
    }

    public final void setSelectRandomTags(ArrayList<String> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(arrayList);
        this.LJIILL = arrayList;
    }

    public final void setTagSelected(boolean z) {
        AbstractC80272HkY abstractC80272HkY;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 10).isSupported && (abstractC80272HkY = this.LJIJ) != null) {
            abstractC80272HkY.LIZ(z);
        }
    }

    public PkFeedbackView(Context context) {
        super(context);
        MethodCollector.m14708i(1794);
        LIZIZ();
        MethodCollector.m14707o(1794);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, motionEvent}, null, LIZ, true, 14);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (C140192dPo.LIZ("dispatchScrollViewTouchEvent")) {
            C140181dPd.LJFF();
        }
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{motionEvent}, this, LIZ, false, 16);
        if (proxy3.isSupported) {
            return ((Boolean) proxy3.result).booleanValue();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final TextView LIZ(String str) {
        MethodCollector.m14708i(1793);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            TextView textView = (TextView) proxy.result;
            MethodCollector.m14707o(1793);
            return textView;
        }
        C106862S5w.LIZ(str);
        TextView textView2 = new TextView(getContext());
        textView2.setBackgroundResource(2130855293);
        textView2.setText(str);
        textView2.setTextColor(LK5.LIZIZ(2131629087));
        textView2.setTextSize(1, 12.0f);
        int dip2Px = (int) UIUtils.dip2Px(getContext(), 18.0f);
        int dip2Px2 = (int) UIUtils.dip2Px(getContext(), 6.0f);
        textView2.setPadding(dip2Px, dip2Px2, dip2Px, dip2Px2);
        MethodCollector.m14707o(1793);
        return textView2;
    }

    public PkFeedbackView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1795);
        LIZIZ();
        MethodCollector.m14707o(1795);
    }

    public PkFeedbackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1796);
        LIZIZ();
        MethodCollector.m14707o(1796);
    }

    public final void LIZ(C9217e c9217e, boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{c9217e, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9217e);
        this.LJIIIZ = c9217e;
        this.LJIILLIIL = z;
        this.LJIIZILJ = z2;
        TextView textView = (TextView) LIZ(2131172330);
        if (textView != null) {
            textView.setVisibility(8);
        }
        WrapLineFlowLayout wrapLineFlowLayout = (WrapLineFlowLayout) LIZ(2131191523);
        if (wrapLineFlowLayout != null) {
            wrapLineFlowLayout.setVisibility(0);
        }
        this.LJII.clear();
        this.LJII.addAll(c9217e.LIZLLL);
        for (C9214c c9214c : c9217e.LIZLLL) {
            TextView LIZ2 = LIZ(c9214c.LIZIZ);
            LIZ2.setOnClickListener(this.LJIJI);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
            WrapLineFlowLayout wrapLineFlowLayout2 = (WrapLineFlowLayout) LIZ(2131191523);
            if (wrapLineFlowLayout2 != null) {
                wrapLineFlowLayout2.addView(LIZ2, layoutParams);
            }
        }
    }
}
