package com.android.ttcjpaysdk.base.p135ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135508cC7;

/* renamed from: com.android.ttcjpaysdk.base.ui.widget.CJPayTextLoadingView */
/* loaded from: classes17.dex */
public class CJPayTextLoadingView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isShow;
    public AbstractC135508cC7 mAdapter;
    public Object mAdapterView;
    public View mDefaultLoadingLayout;
    public TextView mDefaultLoadingText;
    public View mDefaultLoadingView;
    public String messageInfo;

    static {
        Covode.recordClassIndex(6689);
    }

    public boolean isShow() {
        return this.isShow;
    }

    public void hide() {
        Object obj;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        this.isShow = false;
        AbstractC135508cC7 abstractC135508cC7 = this.mAdapter;
        if (abstractC135508cC7 != null && (obj = this.mAdapterView) != null) {
            abstractC135508cC7.LIZIZ(obj);
            return;
        }
        View view = this.mDefaultLoadingView;
        if (view != null) {
            view.setVisibility(8);
        }
        View view2 = this.mDefaultLoadingLayout;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        setPayMessage("");
    }

    public void show() {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.isShow = true;
        if (this.mAdapter != null && this.mAdapterView != null) {
            if (!TextUtils.isEmpty(this.messageInfo) && getContext() != null) {
                AbstractC135508cC7 abstractC135508cC7 = this.mAdapter;
                Context context = getContext();
                if (!TextUtils.isEmpty(this.messageInfo)) {
                    string = this.messageInfo;
                } else {
                    string = getContext().getString(2131561686);
                }
                this.mAdapterView = abstractC135508cC7.LIZ(context, string);
                try {
                    LinearLayout linearLayout = (LinearLayout) ((FrameLayout) ((RelativeLayout) ((View) this.mAdapterView).getRootView()).getChildAt(0)).getChildAt(0);
                    linearLayout.setMinimumWidth(CJPayBasicUtils.dipToPX(getContext(), 85.0f));
                    linearLayout.setMinimumHeight(CJPayBasicUtils.dipToPX(getContext(), 85.0f));
                    linearLayout.setGravity(17);
                    linearLayout.setPadding(CJPayBasicUtils.dipToPX(getContext(), 16.0f), 0, CJPayBasicUtils.dipToPX(getContext(), 16.0f), 0);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                    layoutParams.width = -2;
                    layoutParams.height = CJPayBasicUtils.dipToPX(getContext(), 85.0f);
                    removeAllViews();
                    if (this.mAdapterView instanceof View) {
                        addView((View) this.mAdapterView);
                    }
                    invalidate();
                } catch (Exception unused) {
                    AbstractC135508cC7 abstractC135508cC72 = this.mAdapter;
                    Context context2 = getContext();
                    if (!TextUtils.isEmpty(this.messageInfo)) {
                        string2 = this.messageInfo;
                    } else {
                        string2 = getContext().getString(2131561686);
                    }
                    this.mAdapterView = abstractC135508cC72.LIZ(context2, string2);
                    Object obj = this.mAdapterView;
                    if (obj instanceof View) {
                        addView((View) obj);
                    }
                }
            }
            this.mAdapter.LIZ(this.mAdapterView);
            return;
        }
        View view = this.mDefaultLoadingView;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.mDefaultLoadingLayout;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        if (this.mDefaultLoadingText != null) {
            if (!TextUtils.isEmpty(this.messageInfo)) {
                this.mDefaultLoadingText.setText(this.messageInfo);
            } else {
                this.mDefaultLoadingText.setText(2131561686);
            }
        }
    }

    public void setPayMessage(String str) {
        this.messageInfo = str;
    }

    public CJPayTextLoadingView(Context context) {
        this(context, null);
    }

    public CJPayTextLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void init(Context context, AttributeSet attributeSet) {
        MethodCollector.m14708i(432);
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, 1).isSupported) {
            MethodCollector.m14707o(432);
            return;
        }
        this.mAdapter = C2118a.LIZ().LJI;
        AbstractC135508cC7 abstractC135508cC7 = this.mAdapter;
        if (abstractC135508cC7 != null) {
            this.mAdapterView = abstractC135508cC7.LIZ(context, context.getString(2131561686));
            Object obj = this.mAdapterView;
            if (obj instanceof View) {
                addView((View) obj, generateLayoutParams(attributeSet));
            }
            MethodCollector.m14707o(432);
            return;
        }
        this.mDefaultLoadingView = LayoutInflater.from(context).inflate(2131690780, this);
        View view = this.mDefaultLoadingView;
        if (view != null) {
            this.mDefaultLoadingLayout = view.findViewById(2131170107);
            this.mDefaultLoadingText = (TextView) this.mDefaultLoadingView.findViewById(2131194558);
        }
        MethodCollector.m14707o(432);
    }

    public CJPayTextLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(431);
        this.messageInfo = "";
        init(context, attributeSet);
        MethodCollector.m14707o(431);
    }
}
