package com.android.ttcjpaysdk.bindcard.base.p142ui;

import android.text.TextUtils;
import android.util.Base64;
import com.android.ttcjpaysdk.base.theme.widget.CJPayCustomButton;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.bindcard.base.p140a.C2200c;
import com.android.ttcjpaysdk.bindcard.base.p141b.C2211c;
import com.bdcaijing.tfccsmsdk.Tfcc;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C136009cKC;
import p003X.FWT;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.ui.SetPwdActivity$initActions$4 */
/* loaded from: classes17.dex */
public final class SetPwdActivity$initActions$4 extends Lambda implements Function1<CJPayCustomButton, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SetPwdActivity this$0;

    static {
        Covode.recordClassIndex(7102);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetPwdActivity$initActions$4(SetPwdActivity setPwdActivity) {
        super(1);
        this.this$0 = setPwdActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(CJPayCustomButton cJPayCustomButton) {
        if (!PatchProxy.proxy(new Object[]{cJPayCustomButton}, this, changeQuickRedirect, false, 1).isSupported) {
            if (CJPayBasicUtils.isNetworkAvailable(this.this$0)) {
                String LIZ = C136009cKC.LIZIZ.LIZ(this.this$0.LJIIIZ);
                C136009cKC c136009cKC = C136009cKC.LIZIZ;
                String str = this.this$0.LJIIIZ;
                String str2 = this.this$0.LIZIZ.payUid;
                String str3 = "";
                Intrinsics.checkNotNullExpressionValue(str2, str3);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, c136009cKC, C136009cKC.LIZ, false, 1);
                if (proxy.isSupported) {
                    str3 = (String) proxy.result;
                } else {
                    C106862S5w.LIZ(str, str2);
                    if (str.length() != 0 && str2.length() != 0) {
                        int[] iArr = {-1};
                        new StringBuilder();
                        String md5Encrypt = CJPayEncryptUtil.md5Encrypt(C0002O.m25086C(CJPayEncryptUtil.md5Encrypt(CJPayEncryptUtil.md5Encrypt(str)), str2));
                        if (!TextUtils.isEmpty(md5Encrypt)) {
                            Intrinsics.checkNotNullExpressionValue(md5Encrypt, str3);
                            byte[] bytes = md5Encrypt.getBytes(Charsets.UTF_8);
                            Intrinsics.checkNotNullExpressionValue(bytes, str3);
                            String encodeToString = Base64.encodeToString(bytes, 2);
                            if (!TextUtils.isEmpty(encodeToString)) {
                                Tfcc tfcc = new Tfcc();
                                byte[] tfccKey = CJPayBasicUtils.getTfccKey();
                                Intrinsics.checkNotNullExpressionValue(tfccKey, str3);
                                String LIZ2 = tfcc.LIZ(new String(tfccKey, Charsets.UTF_8), encodeToString, iArr);
                                if (!TextUtils.isEmpty(LIZ2)) {
                                    Intrinsics.checkNotNullExpressionValue(LIZ2, str3);
                                    str3 = new Regex("=").replace(StringsKt__StringsJVMKt.replace$default(StringsKt__StringsJVMKt.replace$default(LIZ2, '+', '-', false, 4, (Object) null), '/', '_', false, 4, (Object) null), str3);
                                }
                            }
                        }
                    }
                }
                if (LIZ.length() == 0) {
                    this.this$0.LIZ();
                    SetPwdActivity setPwdActivity = this.this$0;
                    CJPayBasicUtils.displayToast(setPwdActivity, setPwdActivity.getResources().getString(2131561782));
                } else {
                    C2211c c2211c = (C2211c) this.this$0.mBasePresenter;
                    if (c2211c != null) {
                        c2211c.LIZ(this.this$0.LIZIZ.commonBean.smchId, this.this$0.LIZIZ.commonBean.signOrderNo, LIZ, str3);
                    }
                    this.this$0.LIZIZ(true);
                }
            } else {
                this.this$0.LIZ();
                SetPwdActivity setPwdActivity2 = this.this$0;
                CJPayBasicUtils.displayToast(setPwdActivity2, setPwdActivity2.getResources().getString(2131558456));
            }
            C2200c c2200c = this.this$0.mvpLogger;
            if (c2200c != null && !PatchProxy.proxy(new Object[0], c2200c, C2200c.LIZ, false, 6).isSupported) {
                C2200c.LIZ(c2200c, "wallet_second_password_click", null, 2, null);
            }
            FWT.LIZ("caijing_risk_set_pay_pwd_request");
        }
        return Unit.INSTANCE;
    }
}
