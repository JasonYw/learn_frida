package com.android.ttcjpaysdk.base.p135ui.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayButtonInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.ref.WeakReference;
import p003X.AbstractC136025cKS;
import p003X.C116971W2r;
import p003X.C137459chb;
import p003X.DialogC137460chc;

/* renamed from: com.android.ttcjpaysdk.base.ui.dialog.CJPayDialogBuilder */
/* loaded from: classes17.dex */
public class CJPayDialogBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int backgroundRes = -1;
    public CJPayButtonInfo buttonInfo;
    public String content;
    public int contentColor;
    public int height;
    public boolean isLeftBtnBold;
    public boolean isRightBtnBold;
    public boolean isSingleBtnBold;
    public boolean isTitleBold;
    public int leftBtnColor;
    public View.OnClickListener leftBtnListener;
    public String leftBtnStr;
    public int rightBtnColor;
    public View.OnClickListener rightBtnListener;
    public String rightBtnStr;
    public int singleBtnColor;
    public View.OnClickListener singleBtnListener;
    public String singleBtnStr;
    public String subTitle;
    public int subTitleColor;
    public SpannableString subTitleSpannableString;
    public int themeResId;
    public String title;
    public WeakReference<Activity> weakRef;
    public int width;

    static {
        Covode.recordClassIndex(6659);
    }

    public DialogC137460chc build() {
        int i;
        MethodCollector.m14708i(417);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            DialogC137460chc dialogC137460chc = (DialogC137460chc) proxy.result;
            MethodCollector.m14707o(417);
            return dialogC137460chc;
        }
        WeakReference<Activity> weakReference = this.weakRef;
        if (weakReference != null && weakReference.get() != null) {
            Activity activity = this.weakRef.get();
            String str = CJPayHostInfo.languageTypeStr;
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            if ("en".equals(str)) {
                i = 2131690720;
            } else {
                i = 2131690719;
            }
            View inflate = layoutInflater.inflate(i, (ViewGroup) null);
            C137459chb c137459chb = new C137459chb(activity, this.themeResId);
            c137459chb.LIZ(inflate);
            AbstractC136025cKS LIZIZ = c137459chb.LIZ(Boolean.TRUE).LIZIZ(Boolean.FALSE);
            LIZIZ.LJI(this.width);
            LIZIZ.LIZ(new DialogInterface.OnCancelListener(this) { // from class: com.android.ttcjpaysdk.base.ui.dialog.CJPayDialogBuilder.1
                static {
                    Covode.recordClassIndex(6660);
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                }
            });
            DialogC137460chc LIZ = LIZIZ.LIZ();
            int i2 = this.backgroundRes;
            if (i2 != -1) {
                inflate.setBackgroundResource(i2);
            }
            TextView textView = (TextView) inflate.findViewById(2131169758);
            TextView textView2 = (TextView) inflate.findViewById(2131169756);
            TextView textView3 = (TextView) inflate.findViewById(2131169753);
            TextView textView4 = (TextView) inflate.findViewById(2131169752);
            TextView textView5 = (TextView) inflate.findViewById(2131169751);
            TextView textView6 = (TextView) inflate.findViewById(2131169755);
            View findViewById = inflate.findViewById(2131169759);
            int i3 = 8;
            if (!TextUtils.isEmpty(this.title)) {
                textView.setText(this.title);
                textView.setVisibility(0);
                if (this.isTitleBold) {
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else {
                    textView.setTypeface(Typeface.defaultFromStyle(0));
                }
            } else {
                textView.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.subTitle)) {
                textView2.setText(this.subTitle);
                textView2.setVisibility(0);
                int i4 = this.subTitleColor;
                if (i4 != -1) {
                    textView2.setTextColor(i4);
                }
            } else {
                textView2.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.content)) {
                textView3.setText(this.content);
                textView3.setVisibility(0);
                int i5 = this.contentColor;
                if (i5 != -1) {
                    textView3.setTextColor(i5);
                }
            } else {
                textView3.setVisibility(8);
            }
            SpannableString spannableString = this.subTitleSpannableString;
            if (spannableString != null && !TextUtils.isEmpty(spannableString.toString())) {
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                textView2.setHighlightColor(C116971W2r.LIZ(activity.getResources(), 2131623991));
                textView2.setText(this.subTitleSpannableString);
                textView2.setVisibility(0);
            }
            initButton(textView4, this.rightBtnStr, Boolean.valueOf(this.isRightBtnBold), this.rightBtnColor);
            initButton(textView5, this.leftBtnStr, Boolean.valueOf(this.isLeftBtnBold), this.leftBtnColor);
            initButton(textView6, this.singleBtnStr, Boolean.valueOf(this.isSingleBtnBold), this.singleBtnColor);
            if (TextUtils.isEmpty(this.singleBtnStr)) {
                i3 = 0;
            }
            findViewById.setVisibility(i3);
            textView4.setOnClickListener(this.rightBtnListener);
            textView5.setOnClickListener(this.leftBtnListener);
            textView6.setOnClickListener(this.singleBtnListener);
            LIZ.setCanceledOnTouchOutside(false);
            LIZ.setOnKeyListener(new DialogInterface.OnKeyListener(this) { // from class: com.android.ttcjpaysdk.base.ui.dialog.CJPayDialogBuilder.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6661);
                }

                @Override // android.content.DialogInterface.OnKeyListener
                public final boolean onKey(DialogInterface dialogInterface, int i6, KeyEvent keyEvent) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i6), keyEvent}, this, LIZ, false, 1);
                    if (proxy2.isSupported) {
                        return ((Boolean) proxy2.result).booleanValue();
                    }
                    if (i6 != 4 || keyEvent.getRepeatCount() != 0) {
                        return false;
                    }
                    return true;
                }
            });
            MethodCollector.m14707o(417);
            return LIZ;
        }
        MethodCollector.m14707o(417);
        return null;
    }

    public CJPayDialogBuilder setContent(String str) {
        this.content = str;
        return this;
    }

    public CJPayDialogBuilder setContentColor(int i) {
        this.contentColor = i;
        return this;
    }

    public CJPayDialogBuilder setHeight(int i) {
        this.height = i;
        return this;
    }

    public CJPayDialogBuilder setLeftBtnBold(boolean z) {
        this.isLeftBtnBold = z;
        return this;
    }

    public CJPayDialogBuilder setLeftBtnColor(int i) {
        this.leftBtnColor = i;
        return this;
    }

    public CJPayDialogBuilder setLeftBtnListener(View.OnClickListener onClickListener) {
        this.leftBtnListener = onClickListener;
        return this;
    }

    public CJPayDialogBuilder setLeftBtnStr(String str) {
        this.leftBtnStr = str;
        return this;
    }

    public CJPayDialogBuilder setRightBtnBold(boolean z) {
        this.isRightBtnBold = z;
        return this;
    }

    public CJPayDialogBuilder setRightBtnColor(int i) {
        this.rightBtnColor = i;
        return this;
    }

    public CJPayDialogBuilder setRightBtnListener(View.OnClickListener onClickListener) {
        this.rightBtnListener = onClickListener;
        return this;
    }

    public CJPayDialogBuilder setRightBtnStr(String str) {
        this.rightBtnStr = str;
        return this;
    }

    public CJPayDialogBuilder setSingleBtnBold(boolean z) {
        this.isSingleBtnBold = z;
        return this;
    }

    public CJPayDialogBuilder setSingleBtnColor(int i) {
        this.singleBtnColor = i;
        return this;
    }

    public CJPayDialogBuilder setSingleBtnListener(View.OnClickListener onClickListener) {
        this.singleBtnListener = onClickListener;
        return this;
    }

    public CJPayDialogBuilder setSingleBtnStr(String str) {
        this.singleBtnStr = str;
        return this;
    }

    public CJPayDialogBuilder setSpanSubTitle(SpannableString spannableString) {
        this.subTitleSpannableString = spannableString;
        return this;
    }

    public CJPayDialogBuilder setSubTitle(String str) {
        this.subTitle = str;
        return this;
    }

    public CJPayDialogBuilder setSubtitleColor(int i) {
        this.subTitleColor = i;
        return this;
    }

    public CJPayDialogBuilder setThemeResId(int i) {
        this.themeResId = i;
        return this;
    }

    public CJPayDialogBuilder setTitle(String str) {
        this.title = str;
        return this;
    }

    public CJPayDialogBuilder setTitleBold(boolean z) {
        this.isTitleBold = z;
        return this;
    }

    public CJPayDialogBuilder setWidth(int i) {
        this.width = i;
        return this;
    }

    public CJPayDialogBuilder setActivity(Activity activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (CJPayDialogBuilder) proxy.result;
        }
        this.weakRef = new WeakReference<>(activity);
        return this;
    }

    public CJPayDialogBuilder setAllButtonColor(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (CJPayDialogBuilder) proxy.result;
        }
        setLeftBtnColor(i);
        setRightBtnColor(i);
        setSingleBtnColor(i);
        return this;
    }

    public void setButtonInfo(CJPayButtonInfo cJPayButtonInfo) {
        char c;
        if (PatchProxy.proxy(new Object[]{cJPayButtonInfo}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.buttonInfo = cJPayButtonInfo;
        if (cJPayButtonInfo != null) {
            setTitle(cJPayButtonInfo.page_desc);
            setRightBtnStr(cJPayButtonInfo.right_button_desc);
            setLeftBtnStr(cJPayButtonInfo.left_button_desc);
            setSingleBtnStr(cJPayButtonInfo.button_desc);
            String str = cJPayButtonInfo.button_type;
            int hashCode = str.hashCode();
            if (hashCode != 50) {
                if (hashCode != 51) {
                    if (hashCode == 53 && str.equals("5")) {
                        c = 1;
                    }
                    c = 65535;
                } else {
                    if (str.equals(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START)) {
                        c = 2;
                    }
                    c = 65535;
                }
            } else {
                if (str.equals("2")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c != 0) {
                if (c != 1) {
                    setLeftBtnStr("");
                    setRightBtnStr("");
                    return;
                }
                this.backgroundRes = 2130840211;
                setSingleBtnStr("");
                setLeftBtnColor(-15329245);
                setRightBtnColor(-15043329);
                setLeftBtnBold(false);
                setRightBtnBold(true);
                this.isTitleBold = true;
                return;
            }
            setSingleBtnStr("");
        }
    }

    private void initButton(TextView textView, String str, Boolean bool, int i) {
        if (PatchProxy.proxy(new Object[]{textView, str, bool, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            if (bool.booleanValue()) {
                textView.setTypeface(Typeface.defaultFromStyle(1));
            } else {
                textView.setTypeface(Typeface.defaultFromStyle(0));
            }
            textView.setTextColor(i);
            textView.setVisibility(0);
            return;
        }
        textView.setVisibility(8);
    }
}
