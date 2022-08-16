package com.android.ttcjpaysdk.thirdparty.view;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayBPEAService;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC135345c9U;
import p003X.C116971W2r;
import p003X.C135343c9S;

/* loaded from: classes17.dex */
public class CJPayPasteAwareEditText extends AppCompatEditText {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context mContext;
    public OnPasteListener mOnPasteListener;
    public AbstractC135345c9U onUserClickBack;
    public GradientDrawable shapeDrawable;

    /* loaded from: classes17.dex */
    public interface OnPasteListener {
        static {
            Covode.recordClassIndex(9230);
        }

        void onPaste(String str);
    }

    static {
        Covode.recordClassIndex(9229);
    }

    /* renamed from: com_android_ttcjpaysdk_thirdparty_view_CJPayPasteAwareEditText_android_content_ClipboardManager_getPrimaryClip */
    public static ClipData m16024xcb87fb00(ClipboardManager clipboardManager) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{clipboardManager}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            ActionInvokeEntrance.setEventUuid(101803);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(clipboardManager, new Object[0], 101803, "android.content.ClipData", false, null, false);
            if (!((Boolean) actionIntercept.first).booleanValue()) {
                ClipData LIZ = C116971W2r.LIZ(clipboardManager);
                ActionInvokeEntrance.actionInvoke(LIZ, clipboardManager, new Object[0], 101803, "com_android_ttcjpaysdk_thirdparty_view_CJPayPasteAwareEditText_android_content_ClipboardManager_getPrimaryClip(Landroid/content/ClipboardManager;)Landroid/content/ClipData;");
                return LIZ;
            }
            obj = actionIntercept.second;
        }
        return (ClipData) obj;
    }

    public void changeCursorColor() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        try {
            String str = C135343c9S.LIZ().LIZJ().LJFF.LIZ;
            if (!TextUtils.isEmpty(str)) {
                this.shapeDrawable = (GradientDrawable) ContextCompat.getDrawable(this.mContext, 2130840269);
                if (this.shapeDrawable != null) {
                    this.shapeDrawable.setColor(Color.parseColor(str));
                }
            }
        } catch (Exception unused) {
        }
    }

    public void setOnPasteListener(OnPasteListener onPasteListener) {
        this.mOnPasteListener = onPasteListener;
    }

    public void setOnUserClickBack(AbstractC135345c9U abstractC135345c9U) {
        this.onUserClickBack = abstractC135345c9U;
    }

    public CJPayPasteAwareEditText(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override // android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        ClipData m16024xcb87fb00;
        ClipData.Item itemAt;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 16908322) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                return super.onTextContextMenuItem(i);
            }
            ICJPayBPEAService iCJPayBPEAService = (ICJPayBPEAService) CJPayServiceManager.getInstance().getIService(ICJPayBPEAService.class);
            if (iCJPayBPEAService != null) {
                m16024xcb87fb00 = iCJPayBPEAService.getPrimaryClip(clipboardManager);
            } else {
                m16024xcb87fb00 = m16024xcb87fb00(clipboardManager);
            }
            if (m16024xcb87fb00 == null) {
                return super.onTextContextMenuItem(i);
            }
            String str = null;
            if (m16024xcb87fb00.getItemCount() > 0 && (itemAt = m16024xcb87fb00.getItemAt(0)) != null && itemAt.getText() != null) {
                str = itemAt.getText().toString();
            }
            OnPasteListener onPasteListener = this.mOnPasteListener;
            if (onPasteListener != null && str != null) {
                onPasteListener.onPaste(str);
                return false;
            }
        }
        return super.onTextContextMenuItem(i);
    }

    public CJPayPasteAwareEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mContext = context;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        AbstractC135345c9U abstractC135345c9U;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), keyEvent}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4 && (abstractC135345c9U = this.onUserClickBack) != null) {
            abstractC135345c9U.LIZ();
            return true;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public CJPayPasteAwareEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mContext = context;
    }
}
