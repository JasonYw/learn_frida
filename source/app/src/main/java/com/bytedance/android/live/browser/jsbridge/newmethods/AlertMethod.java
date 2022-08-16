package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.browser.jsbridge.newmethods.AlertMethod;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.google.gson.annotations.SerializedName;
import p003X.C116971W2r;
import p003X.C138336cvs;
import p003X.LHN;
import p003X.LK5;

/* loaded from: classes17.dex */
public final class AlertMethod extends AbstractC13049f<C3991a, C3992b> {
    public static ChangeQuickRedirect LIZ;
    public AlertDialog LIZIZ;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.AlertMethod$a */
    /* loaded from: classes17.dex */
    public static final class C3991a {
        @SerializedName("title")
        public String LIZ;
        @SerializedName("content")
        public String LIZIZ;
        @SerializedName("confirmText")
        public String LIZJ;
        @SerializedName("showCancel")
        public boolean LIZLLL;
        @SerializedName("cancelText")

        /* renamed from: LJ */
        public String f26151LJ;
        @SerializedName("tapMaskToDismiss")
        public boolean LJFF = true;

        static {
            Covode.recordClassIndex(22574);
        }
    }

    static {
        Covode.recordClassIndex(22572);
    }

    /* loaded from: classes17.dex */
    public enum ActionType {
        CONFIRM,
        CANCEL,
        MASK;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (ActionType[]) proxy.result;
            }
            return (ActionType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(22573);
        }

        public static ActionType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (ActionType) proxy.result;
            }
            return (ActionType) Enum.valueOf(ActionType.class, str);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        AlertDialog alertDialog = this.LIZIZ;
        if (alertDialog != null) {
            C116971W2r.LIZ(alertDialog);
        }
        this.LIZIZ = null;
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.AlertMethod$b */
    /* loaded from: classes17.dex */
    public static final class C3992b {
        @SerializedName(C2521l.LJIIL)
        public C138336cvs LIZ;
        @SerializedName("msg")
        public String LIZIZ;

        static {
            Covode.recordClassIndex(22575);
        }

        public C3992b(boolean z, ActionType actionType) {
            this.LIZ = new C138336cvs(z, actionType);
            this.LIZIZ = "SUCCESS";
        }

        public /* synthetic */ C3992b(boolean z, ActionType actionType, byte b) {
            this(z, actionType);
        }
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(C3991a c3991a, C13052h c13052h) {
        String str;
        WindowManager.LayoutParams attributes;
        String str2;
        C3991a c3991a2 = c3991a;
        if (!PatchProxy.proxy(new Object[]{c3991a2, c13052h}, this, LIZ, false, 1).isSupported) {
            AlertDialog.Builder builder = new AlertDialog.Builder(c13052h.LIZIZ);
            builder.setMessage(c3991a2.LIZIZ);
            if (!TextUtils.isEmpty(c3991a2.LIZ)) {
                builder.setTitle(c3991a2.LIZ);
            }
            if (TextUtils.isEmpty(c3991a2.LIZJ)) {
                str = LK5.LIZ(2131586570);
            } else {
                str = c3991a2.LIZJ;
            }
            builder.setPositiveButton(str, new DialogInterface.OnClickListener(this) { // from class: X.cvp
                public static ChangeQuickRedirect LIZ;
                public final AlertMethod LIZIZ;

                static {
                    Covode.recordClassIndex(22887);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    AlertMethod alertMethod = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, alertMethod, AlertMethod.LIZ, false, 5).isSupported) {
                        return;
                    }
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    alertMethod.finishWithResult(new AlertMethod.C3992b(true, AlertMethod.ActionType.CONFIRM, (byte) 0));
                }
            });
            if (c3991a2.LIZLLL) {
                if (TextUtils.isEmpty(c3991a2.f26151LJ)) {
                    str2 = LK5.LIZ(2131582393);
                } else {
                    str2 = c3991a2.f26151LJ;
                }
                builder.setNegativeButton(str2, new DialogInterface.OnClickListener(this) { // from class: X.cvq
                    public static ChangeQuickRedirect LIZ;
                    public final AlertMethod LIZIZ;

                    static {
                        Covode.recordClassIndex(22888);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        AlertMethod alertMethod = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, alertMethod, AlertMethod.LIZ, false, 4).isSupported) {
                            return;
                        }
                        if (dialogInterface != null) {
                            dialogInterface.dismiss();
                        }
                        alertMethod.finishWithResult(new AlertMethod.C3992b(false, AlertMethod.ActionType.CANCEL, (byte) 0));
                    }
                });
            }
            this.LIZIZ = builder.create();
            this.LIZIZ.setCanceledOnTouchOutside(c3991a2.LJFF);
            C116971W2r.LIZ(this.LIZIZ, new DialogInterface.OnCancelListener(this) { // from class: X.cvr
                public static ChangeQuickRedirect LIZ;
                public final AlertMethod LIZIZ;

                static {
                    Covode.recordClassIndex(22889);
                }

                {
                    this.LIZIZ = this;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    AlertMethod alertMethod = this.LIZIZ;
                    if (PatchProxy.proxy(new Object[]{dialogInterface}, alertMethod, AlertMethod.LIZ, false, 3).isSupported) {
                        return;
                    }
                    alertMethod.finishWithResult(new AlertMethod.C3992b(false, AlertMethod.ActionType.MASK, (byte) 0));
                }
            });
            C116971W2r.LIZJ(this.LIZIZ);
            try {
                if (this.LIZIZ != null && this.LIZIZ.getWindow() != null && (attributes = this.LIZIZ.getWindow().getAttributes()) != null) {
                    attributes.width = (LHN.LIZLLL() / 10) * 9;
                    attributes.gravity = 17;
                    this.LIZIZ.getWindow().setAttributes(attributes);
                }
            } catch (Exception unused) {
                ALogger.m15800e("alert_jsb_method_error", "alert jsb method resize dialog error");
            }
        }
    }
}
