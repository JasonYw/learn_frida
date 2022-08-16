package com.android.ttcjpaysdk.base.p135ui.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC136025cKS;
import p003X.C116971W2r;
import p003X.C137459chb;
import p003X.DialogC137460chc;

/* renamed from: com.android.ttcjpaysdk.base.ui.dialog.CJPayDialogUtils */
/* loaded from: classes17.dex */
public class CJPayDialogUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6662);
    }

    public static DialogC137460chc initDialog(AbstractC136025cKS abstractC136025cKS) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC136025cKS}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (DialogC137460chc) proxy.result;
        }
        if (abstractC136025cKS == null) {
            return null;
        }
        return abstractC136025cKS.LIZ();
    }

    public static DialogC137460chc initDialog(CJPayDialogBuilder cJPayDialogBuilder) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayDialogBuilder}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (DialogC137460chc) proxy.result;
        }
        if (cJPayDialogBuilder == null) {
            return null;
        }
        return cJPayDialogBuilder.build();
    }

    public static CJPayDialogBuilder getDefaultBuilder(Activity activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (CJPayDialogBuilder) proxy.result;
        }
        if (activity == null) {
            return null;
        }
        CJPayDialogBuilder cJPayDialogBuilder = new CJPayDialogBuilder();
        cJPayDialogBuilder.setLeftBtnStr("");
        cJPayDialogBuilder.setLeftBtnColor(C116971W2r.LIZ(activity, 2131624875));
        cJPayDialogBuilder.setLeftBtnBold(false);
        cJPayDialogBuilder.setLeftBtnListener(null);
        cJPayDialogBuilder.setRightBtnStr("");
        cJPayDialogBuilder.setRightBtnColor(C116971W2r.LIZ(activity, 2131624875));
        cJPayDialogBuilder.setRightBtnBold(false);
        cJPayDialogBuilder.setRightBtnListener(null);
        cJPayDialogBuilder.setSingleBtnStr("");
        cJPayDialogBuilder.setSingleBtnColor(C116971W2r.LIZ(activity, 2131624875));
        cJPayDialogBuilder.setSingleBtnBold(false);
        cJPayDialogBuilder.setSingleBtnListener(null);
        cJPayDialogBuilder.setWidth(272);
        cJPayDialogBuilder.setHeight(0);
        cJPayDialogBuilder.setThemeResId(2131493160);
        cJPayDialogBuilder.setTitle("");
        cJPayDialogBuilder.setSubTitle("");
        cJPayDialogBuilder.setSubtitleColor(-1);
        cJPayDialogBuilder.setContent("");
        cJPayDialogBuilder.setContentColor(-1);
        cJPayDialogBuilder.setActivity(activity).setTitleBold(false);
        return cJPayDialogBuilder;
    }

    public static C137459chb getDyStandardBuilder(Activity activity) {
        int i;
        MethodCollector.m14708i(418);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            C137459chb c137459chb = (C137459chb) proxy.result;
            MethodCollector.m14707o(418);
            return c137459chb;
        } else if (activity == null) {
            MethodCollector.m14707o(418);
            return null;
        } else {
            C137459chb c137459chb2 = new C137459chb(activity);
            c137459chb2.LIZIZ("");
            c137459chb2.LIZ(C116971W2r.LIZ(activity, 2131624854));
            c137459chb2.LIZ(false);
            c137459chb2.LIZ((View.OnClickListener) null);
            c137459chb2.LIZJ("");
            c137459chb2.LIZIZ(C116971W2r.LIZ(activity, 2131624820));
            c137459chb2.LIZIZ(true);
            c137459chb2.LIZIZ((View.OnClickListener) null);
            c137459chb2.LIZLLL("");
            c137459chb2.LIZJ(C116971W2r.LIZ(activity, 2131624820));
            c137459chb2.LIZJ(true);
            c137459chb2.LIZJ((View.OnClickListener) null);
            LayoutInflater from = LayoutInflater.from(activity);
            if ("en".equals(CJPayHostInfo.languageTypeStr)) {
                i = 2131690728;
            } else {
                i = 2131690727;
            }
            c137459chb2.LIZ(from.inflate(i, (ViewGroup) null));
            c137459chb2.LJI(280);
            c137459chb2.LIZ("");
            c137459chb2.LIZLLL(C116971W2r.LIZ(activity, 2131624820));
            c137459chb2.LJFF("");
            c137459chb2.LJFF(C116971W2r.LIZ(activity, 2131624854));
            c137459chb2.LIZLLL(true);
            c137459chb2.mo21699LJ(false);
            MethodCollector.m14707o(418);
            return c137459chb2;
        }
    }
}
