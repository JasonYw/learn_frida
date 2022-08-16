package com.android.ttcjpaysdk.thirdparty.view.wrapper;

import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.CJPayInputKeyboardHelper;
import com.android.ttcjpaysdk.thirdparty.view.CJPayPasteAwareEditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import p003X.AbstractC136172cMp;
import p003X.AbstractC136210cNR;
import p003X.AbstractC136211cNS;
import p003X.AbstractC136212cNT;
import p003X.AbstractC136213cNU;
import p003X.AbstractView$OnClickListenerC137362cg2;
import p003X.C116971W2r;
import p003X.C135100c5X;
import p003X.C135272c8J;
import p003X.C135820cH9;
import p003X.C135851cHe;

/* loaded from: classes17.dex */
public class BasicInputWrapper extends C135820cH9 {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int mBackGroundDrawableError;
    public int mBackGroundDrawableNormal;
    public InputData mData;
    public View mDivider;
    public CJPayPasteAwareEditText mEtInput;
    public boolean mHasError;
    public boolean mHasShowLabelAnimation;
    public boolean mInfoButtonEnabled;
    public RelativeLayout mInputBoxLayout;
    public AbstractC136210cNR mInputErrorDetector;
    public boolean mIsAuthLayoutInited;
    public ImageView mIvAuthIcon;
    public ImageView mIvClear;
    public ImageView mIvInfo;
    public ImageView mIvInfoNotFocus;
    public ImageView mIvLabelIcon;
    public CJPayInputKeyboardHelper mKeyboardHelper;
    public LinearLayout mLayoutAuth;
    public LinearLayout mLayoutLabel;
    public View mMaskView;
    public AbstractC136211cNS mOnClearListener;
    public View.OnFocusChangeListener mOnFocusChangeListener;
    public AbstractC136212cNT mOnInputErrorStatusChangedListener;
    public AbstractC136213cNU mOnRightLabelClickListener;
    public TextView mTvAuthText;
    public TextView mTvInputHint;
    public TextView mTvLabel;
    public TextView mTvRightLabel;
    public boolean needAnimation;
    public AbstractC136172cMp textChangeListener;

    static {
        Covode.recordClassIndex(9256);
    }

    public void updateRightLabel(String str) {
    }

    public CJPayPasteAwareEditText getEditText() {
        return this.mEtInput;
    }

    public View getMaskView() {
        return this.mMaskView;
    }

    public boolean hasError() {
        return this.mHasError;
    }

    public void disableInfoButton() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        this.mInfoButtonEnabled = false;
        this.mIvInfo.setVisibility(8);
        this.mIvInfoNotFocus.setVisibility(8);
    }

    public String getInputText() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return this.mEtInput.mo25203getText().toString();
    }

    private void initEditText() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported) {
            return;
        }
        this.mEtInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9260);
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                BasicInputWrapper.this.updateCloseIconStatus();
                BasicInputWrapper.this.updateInfoButtonVisibility();
                if (!z) {
                    if (BasicInputWrapper.this.mEtInput.mo25203getText().length() == 0) {
                        BasicInputWrapper.this.mTvInputHint.setVisibility(0);
                        BasicInputWrapper.this.mLayoutLabel.setVisibility(4);
                    }
                    BasicInputWrapper.this.mDivider.setBackgroundColor(C116971W2r.LIZ(BasicInputWrapper.this.mContext.getResources(), 2131624859));
                } else {
                    BasicInputWrapper.this.mKeyboardHelper.showKeyboard(BasicInputWrapper.this.mContext, BasicInputWrapper.this.mEtInput);
                    BasicInputWrapper.this.hideHint();
                    BasicInputWrapper.this.setBottomLineDarkAnimation();
                }
                if (BasicInputWrapper.this.mOnFocusChangeListener != null) {
                    BasicInputWrapper.this.mOnFocusChangeListener.onFocusChange(view, z);
                }
            }
        });
        this.mEtInput.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9261);
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return ((Boolean) proxy.result).booleanValue();
                }
                if (BasicInputWrapper.this.mEtInput.isFocusable() && BasicInputWrapper.this.mEtInput.isFocusableInTouchMode()) {
                    BasicInputWrapper.this.mKeyboardHelper.showKeyboard(BasicInputWrapper.this.mContext, BasicInputWrapper.this.mEtInput);
                    BasicInputWrapper.this.mEtInput.requestFocus();
                }
                return false;
            }
        });
        this.mEtInput.addTextChangedListener(new TextWatcher() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9262);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z = PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 1).isSupported;
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 3).isSupported) {
                    return;
                }
                if (BasicInputWrapper.this.textChangeListener != null) {
                    BasicInputWrapper.this.textChangeListener.LIZ(editable);
                }
                BasicInputWrapper.this.updateCloseIconStatus();
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (!PatchProxy.proxy(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, LIZ, false, 2).isSupported && BasicInputWrapper.this.textChangeListener != null) {
                    BasicInputWrapper.this.textChangeListener.LIZ(charSequence, i, i2, i3);
                }
            }
        });
    }

    private void initViews() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.mRootView.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9257);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                BasicInputWrapper.this.mEtInput.requestFocus();
                if (BasicInputWrapper.this.mEtInput.isFocusable() && BasicInputWrapper.this.mEtInput.isFocusableInTouchMode()) {
                    BasicInputWrapper.this.mKeyboardHelper.showKeyboard(BasicInputWrapper.this.mContext, BasicInputWrapper.this.mEtInput);
                }
            }
        });
        initEditText();
        this.mIvClear.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(9258);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                BasicInputWrapper.this.mEtInput.setText("");
                if (BasicInputWrapper.this.mOnClearListener != null) {
                    BasicInputWrapper.this.mOnClearListener.LIZ();
                }
            }
        });
        TextView textView = this.mTvRightLabel;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper.3
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9259);
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    boolean z = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported;
                }
            });
        }
        this.mEtInput.changeCursorColor();
    }

    private void updateLabelAnimatedAppear() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25).isSupported) {
            return;
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(400L);
        this.mLayoutLabel.setVisibility(0);
        this.mTvLabel.startAnimation(alphaAnimation);
        this.mIvLabelIcon.startAnimation(alphaAnimation);
    }

    public void clearText() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        getEditText().clearFocus();
        getEditText().mo25203getText().clear();
        setInputEnable(true);
    }

    public void hideHint() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21).isSupported && this.mEtInput.mo25203getText().length() == 0) {
            this.mTvInputHint.setVisibility(4);
            if (this.needAnimation) {
                showLabelBottomUp();
            } else {
                this.mLayoutLabel.setVisibility(0);
            }
        }
    }

    public void hideHintWithoutAnimation() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 22).isSupported && this.mEtInput.mo25203getText().length() == 0) {
            this.mTvInputHint.setVisibility(4);
            this.mLayoutLabel.setVisibility(0);
        }
    }

    public void setBottomLineDarkAnimation() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 26).isSupported) {
            return;
        }
        C135100c5X.LIZ(this.mDivider, CastProtectorUtils.parseColor("#e8e8e8"), CastProtectorUtils.parseColor("#222222")).start();
    }

    public void updateCloseIconStatus() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        if (this.mEtInput.mo25203getText().length() != 0 && this.mEtInput.hasFocus()) {
            this.mIvClear.setVisibility(0);
        } else {
            this.mIvClear.setVisibility(8);
        }
    }

    public void updateInfoButtonVisibility() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported || !this.mInfoButtonEnabled) {
            return;
        }
        if (this.mEtInput.hasFocus()) {
            this.mIvInfo.setVisibility(0);
            this.mIvInfoNotFocus.setVisibility(8);
            return;
        }
        this.mIvInfo.setVisibility(8);
        this.mIvInfoNotFocus.setVisibility(0);
    }

    private void showLabelBottomUp() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        this.mLayoutLabel.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, 0.0f, 0, this.mLayoutLabel.getHeight(), 0, 0.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(250L);
        this.mLayoutLabel.startAnimation(animationSet);
    }

    public void clearErrorMsg() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        if (this.mHasError) {
            updateLabelAnimatedAppear();
        }
        this.mHasError = false;
        this.mTvLabel.setText(this.mData.label);
        this.mTvLabel.setTextColor(C116971W2r.LIZ(this.mContext.getResources(), 2131623986));
        if (getEditText().hasFocus()) {
            this.mDivider.setBackgroundColor(C116971W2r.LIZ(this.mContext.getResources(), 2131623985));
        } else {
            this.mDivider.setBackgroundColor(C116971W2r.LIZ(this.mContext.getResources(), 2131624859));
        }
        this.mIvLabelIcon.setVisibility(8);
        this.mIvLabelIcon.setImageBitmap(null);
    }

    public void clearErrorMsgWithBackground() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        this.mHasError = false;
        this.mTvLabel.setText(this.mData.label);
        this.mTvLabel.setTextColor(C116971W2r.LIZ(this.mContext.getResources(), 2131623986));
        this.mInputBoxLayout.setBackgroundResource(this.mBackGroundDrawableNormal);
        this.mIvLabelIcon.setVisibility(8);
        this.mIvLabelIcon.setImageBitmap(null);
    }

    public void setHasShowLabelAnimation(boolean z) {
        this.mHasShowLabelAnimation = z;
    }

    public void setInputErrorDetector(AbstractC136210cNR abstractC136210cNR) {
        this.mInputErrorDetector = abstractC136210cNR;
    }

    public void setNeedAnimation(boolean z) {
        this.needAnimation = z;
    }

    public void setOnClearListener(AbstractC136211cNS abstractC136211cNS) {
        this.mOnClearListener = abstractC136211cNS;
    }

    public void setOnFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    public void setOnInputErrorStatusChangedListener(AbstractC136212cNT abstractC136212cNT) {
        this.mOnInputErrorStatusChangedListener = abstractC136212cNT;
    }

    public void setOnRightLabelClickListener(AbstractC136213cNU abstractC136213cNU) {
        this.mOnRightLabelClickListener = abstractC136213cNU;
    }

    public void setTextChangeListener(AbstractC136172cMp abstractC136172cMp) {
        this.textChangeListener = abstractC136172cMp;
    }

    public BasicInputWrapper(View view) {
        this(view, new CJPayInputKeyboardHelper(false, null));
    }

    public boolean checkError(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC136210cNR abstractC136210cNR = this.mInputErrorDetector;
        if (abstractC136210cNR == null) {
            return false;
        }
        return abstractC136210cNR.LIZ(str);
    }

    public void enableInfoButton(AbstractView$OnClickListenerC137362cg2 abstractView$OnClickListenerC137362cg2) {
        if (PatchProxy.proxy(new Object[]{abstractView$OnClickListenerC137362cg2}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.mInfoButtonEnabled = true;
        updateInfoButtonVisibility();
        if (abstractView$OnClickListenerC137362cg2 != null) {
            this.mIvInfo.setOnClickListener(abstractView$OnClickListenerC137362cg2);
            this.mIvInfoNotFocus.setOnClickListener(abstractView$OnClickListenerC137362cg2);
        }
    }

    public void setFocusable(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        this.mEtInput.setFocusable(z);
        this.mEtInput.setFocusableInTouchMode(z);
        this.mEtInput.setCursorVisible(z);
    }

    public void showMaskView(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27).isSupported) {
            return;
        }
        if (z) {
            this.mMaskView.setVisibility(0);
        } else {
            this.mMaskView.setVisibility(8);
        }
    }

    public void switchKeyboard(CJPayInputKeyboardHelper cJPayInputKeyboardHelper) {
        if (PatchProxy.proxy(new Object[]{cJPayInputKeyboardHelper}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mKeyboardHelper = cJPayInputKeyboardHelper;
        if (this.mEtInput.hasFocus()) {
            this.mKeyboardHelper.showKeyboard(this.mContext, this.mEtInput);
        }
    }

    public void tryShowAuthLayout(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8).isSupported || !this.mIsAuthLayoutInited) {
            return;
        }
        if (z) {
            this.mLayoutAuth.setVisibility(0);
        } else {
            this.mLayoutAuth.setVisibility(8);
        }
    }

    public void bindData(InputData inputData) {
        if (PatchProxy.proxy(new Object[]{inputData}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.mData = inputData;
        this.mTvLabel.setText(inputData.label);
        this.mTvInputHint.setText(inputData.hint);
        if (this.mTvRightLabel != null) {
            if (!TextUtils.isEmpty(this.mData.rightLabel)) {
                this.mTvRightLabel.setVisibility(0);
                this.mTvRightLabel.setText(inputData.rightLabel);
                return;
            }
            this.mTvRightLabel.setVisibility(8);
            this.mTvRightLabel.setText("");
        }
    }

    public void setInputEnable(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        setFocusable(z);
        if (CJPayHostInfo.applicationContext != null && CJPayHostInfo.applicationContext.getResources() != null) {
            if (z) {
                this.mEtInput.setTextColor(C116971W2r.LIZ(CJPayHostInfo.applicationContext.getResources(), 2131623985));
            } else {
                this.mEtInput.setTextColor(C116971W2r.LIZ(CJPayHostInfo.applicationContext.getResources(), 2131624851));
            }
        }
    }

    public void tryEnableAuthLayout(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 9).isSupported || !this.mIsAuthLayoutInited) {
            return;
        }
        if (z) {
            this.mIvAuthIcon.setColorFilter(ViewCompat.MEASURED_SIZE_MASK, PorterDuff.Mode.LIGHTEN);
            this.mTvAuthText.setTextColor(C116971W2r.LIZ(this.mContext.getResources(), 2131624820));
            this.mLayoutAuth.setClickable(true);
            return;
        }
        this.mIvAuthIcon.setColorFilter(-1711276033, PorterDuff.Mode.LIGHTEN);
        this.mTvAuthText.setTextColor(C116971W2r.LIZ(this.mContext.getResources(), 2131624868));
        this.mLayoutAuth.setClickable(false);
    }

    public void updateErrorMsg(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11).isSupported) {
            return;
        }
        if (!this.mHasError) {
            updateLabelAnimatedAppear();
        }
        this.mHasError = true;
        this.mTvLabel.setText(str);
        this.mTvLabel.setTextColor(C135272c8J.LIZ());
        this.mDivider.setBackgroundColor(C135272c8J.LIZ());
        this.mIvLabelIcon.setVisibility(8);
        this.mIvLabelIcon.setImageBitmap(null);
    }

    public void updateErrorMsgWithBackground(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        this.mHasError = true;
        this.mTvLabel.setText(str);
        this.mTvLabel.setTextColor(C135272c8J.LIZ());
        if (!TextUtils.isEmpty(str)) {
            this.mInputBoxLayout.setBackgroundResource(this.mBackGroundDrawableError);
        } else {
            this.mInputBoxLayout.setBackgroundResource(this.mBackGroundDrawableNormal);
        }
        this.mIvLabelIcon.setVisibility(8);
        this.mIvLabelIcon.setImageBitmap(null);
    }

    /* loaded from: classes17.dex */
    public static class InputData {
        public String hint;
        public String label;
        public String rightLabel;

        static {
            Covode.recordClassIndex(9263);
        }

        public InputData(String str, String str2) {
            this.hint = str;
            this.label = str2;
        }

        public InputData(String str, String str2, String str3) {
            this(str, str2);
            this.rightLabel = str3;
        }
    }

    public void updateLabelMsg(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        if (!this.mHasShowLabelAnimation) {
            updateLabelAnimatedAppear();
            this.mHasShowLabelAnimation = true;
        }
        clearErrorMsg();
        this.mTvLabel.setText(str);
        if (!TextUtils.isEmpty(str2)) {
            C135851cHe.LIZ(str2, this.mIvLabelIcon);
            this.mIvLabelIcon.setVisibility(0);
        }
    }

    public void initInputBackground(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 28).isSupported) {
            return;
        }
        this.mBackGroundDrawableError = i2;
        this.mBackGroundDrawableNormal = i;
        this.mInputBoxLayout = (RelativeLayout) this.mRootView.findViewById(2131169862);
        View view = this.mDivider;
        if (view != null) {
            view.setVisibility(8);
        }
        RelativeLayout relativeLayout = this.mInputBoxLayout;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundResource(this.mBackGroundDrawableNormal);
        }
    }

    public BasicInputWrapper(View view, CJPayInputKeyboardHelper cJPayInputKeyboardHelper) {
        super(view);
        this.needAnimation = true;
        this.mEtInput = (CJPayPasteAwareEditText) view.findViewById(2131174185);
        this.mTvInputHint = (TextView) view.findViewById(2131194412);
        this.mTvLabel = (TextView) view.findViewById(2131194467);
        this.mTvRightLabel = (TextView) view.findViewById(2131195193);
        this.mIvLabelIcon = (ImageView) view.findViewById(2131168088);
        this.mIvClear = (ImageView) view.findViewById(2131167988);
        this.mIvInfo = (ImageView) view.findViewById(2131179103);
        this.mIvInfoNotFocus = (ImageView) view.findViewById(2131179106);
        this.mLayoutAuth = (LinearLayout) view.findViewById(2131180292);
        this.mIvAuthIcon = (ImageView) view.findViewById(2131178565);
        this.mTvAuthText = (TextView) view.findViewById(2131193530);
        this.mDivider = view.findViewById(2131172666);
        this.mMaskView = view.findViewById(2131169000);
        this.mLayoutLabel = (LinearLayout) view.findViewById(2131180423);
        this.mKeyboardHelper = cJPayInputKeyboardHelper;
        initViews();
    }

    public void initAuthLayout(String str, String str2, AbstractView$OnClickListenerC137362cg2 abstractView$OnClickListenerC137362cg2) {
        if (PatchProxy.proxy(new Object[]{str, str2, abstractView$OnClickListenerC137362cg2}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        C135851cHe.LIZ(str, this.mIvAuthIcon);
        this.mTvAuthText.setText(str2);
        this.mLayoutAuth.setOnClickListener(abstractView$OnClickListenerC137362cg2);
        this.mIsAuthLayoutInited = true;
    }
}
