package com.android.ttcjpaysdk.thirdparty.utils;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.android.ttcjpaysdk.thirdparty.view.wrapper.BasicInputWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.Character;
import java.util.Arrays;
import p003X.AbstractC136210cNR;
import p003X.C103922Qw8;
import p003X.C103923Qw9;
import p003X.C135847cHa;
import p003X.C136098cLd;
import p003X.C136113cLs;
import p003X.C136119cLy;
import p003X.C136120cLz;
import p003X.C136121cM0;
import p003X.C136122cM1;
import p003X.C136123cM2;
import p003X.C136195cNC;
import p003X.C136196cND;
import p003X.WXP;

/* loaded from: classes17.dex */
public class CJPayIdUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils$a */
    /* loaded from: classes17.dex */
    public interface AbstractC2391a {
        static {
            Covode.recordClassIndex(8865);
        }

        void LIZ();
    }

    static {
        Covode.recordClassIndex(8851);
    }

    public static AbstractC136210cNR generateCardNoErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C135847cHa();
    }

    public static AbstractC136210cNR generateHKMacauErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C136123cM2();
    }

    public static AbstractC136210cNR generateMainlandErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C136196cND();
    }

    public static AbstractC136210cNR generateNameErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C136195cNC();
    }

    public static AbstractC136210cNR generatePassportErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C136113cLs();
    }

    public static AbstractC136210cNR generateTWErrorDetector() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return (AbstractC136210cNR) proxy.result;
        }
        return new C136122cM1();
    }

    public static InputFilter getHMIdFilterWithRegex() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            return (InputFilter) proxy.result;
        }
        return new C103922Qw8();
    }

    public static InputFilter getPPIdFilterWithRegex() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return (InputFilter) proxy.result;
        }
        return new C103923Qw9();
    }

    public static String getIDFilterRegex(CJPayIdType cJPayIdType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{cJPayIdType}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = C136098cLd.LIZ[cJPayIdType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i != 4) {
                    return "[^\\d]";
                }
                return "[^\\d[A-Za-z]]";
            }
            return "[^\\dhHmM]";
        }
        return "[^\\dxX]";
    }

    public static boolean isHkMacauResidenceValid(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String replaceAll = str.replaceAll(" ", "");
        if (replaceAll.length() == 18 && (replaceAll.startsWith("810000") || replaceAll.startsWith("820000"))) {
            return true;
        }
        return false;
    }

    public static boolean isMainLandIdValid(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String replaceAll = str.replaceAll(" ", "");
        if (replaceAll.matches("^\\d{6}\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}$") || replaceAll.matches("^\\d{6}(18|19|(2\\d))\\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\\d{3}[0-9Xx]$")) {
            return true;
        }
        return false;
    }

    public static boolean isTaiwanResidenceValid(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String replaceAll = str.replaceAll(" ", "");
        if (replaceAll.length() == 18 && replaceAll.startsWith("830000")) {
            return true;
        }
        return false;
    }

    public static boolean checkIDError(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String replaceAll = str.replaceAll(" ", "");
        if (replaceAll.length() > 18) {
            return true;
        }
        for (int i = 0; i < replaceAll.length(); i++) {
            char charAt = replaceAll.charAt(i);
            if (charAt != 'X') {
                if (!Character.isDigit(charAt)) {
                    return true;
                }
                if (charAt != 'X') {
                    continue;
                }
            }
            if (i != 17) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkNameError(String str) {
        char charAt;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (str.length() > 0 && ((charAt = str.charAt(0)) == 183 || charAt == 8226 || charAt == ' ')) {
            return true;
        }
        for (char c : str.toCharArray()) {
            Character valueOf = Character.valueOf(c);
            if (!isChineseOrDot(valueOf) && !Character.isSpaceChar(valueOf.charValue()) && !Character.isLetter(valueOf.charValue())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isChineseOrDot(Character ch) {
        Character.UnicodeBlock of;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ch}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (ch.charValue() == 183 || ch.charValue() == 8226 || (of = Character.UnicodeBlock.of(ch.charValue())) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A) {
            return true;
        }
        return false;
    }

    public static TextWatcher generateHKMacauTextWatcher(Context context, BasicInputWrapper basicInputWrapper, AbstractC2391a abstractC2391a, AbstractC136210cNR abstractC136210cNR) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, basicInputWrapper, abstractC2391a, abstractC136210cNR}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (TextWatcher) proxy.result;
        }
        return new C136120cLz(abstractC136210cNR, basicInputWrapper, context, abstractC2391a);
    }

    public static TextWatcher generateMainlandTextWatcher(final Context context, final BasicInputWrapper basicInputWrapper, final AbstractC2391a abstractC2391a, final AbstractC136210cNR abstractC136210cNR) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, basicInputWrapper, abstractC2391a, abstractC136210cNR}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (TextWatcher) proxy.result;
        }
        return new WXP(Arrays.asList(6, 14)) { // from class: com.android.ttcjpaysdk.thirdparty.utils.CJPayIdUtils.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(8852);
            }

            @Override // p003X.WXP, android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.proxy(new Object[]{editable}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                super.afterTextChanged(editable);
                CJPayIdUtils.afterTextChange(editable, abstractC136210cNR, basicInputWrapper, context, abstractC2391a, 2131558468);
            }
        };
    }

    public static TextWatcher generatePassportTextWatcher(Context context, BasicInputWrapper basicInputWrapper, AbstractC2391a abstractC2391a, AbstractC136210cNR abstractC136210cNR) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, basicInputWrapper, abstractC2391a, abstractC136210cNR}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (TextWatcher) proxy.result;
        }
        return new C136119cLy(abstractC136210cNR, basicInputWrapper, context, abstractC2391a);
    }

    public static TextWatcher generateTWTextWatcher(Context context, BasicInputWrapper basicInputWrapper, AbstractC2391a abstractC2391a, AbstractC136210cNR abstractC136210cNR) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, basicInputWrapper, abstractC2391a, abstractC136210cNR}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (TextWatcher) proxy.result;
        }
        return new C136121cM0(abstractC136210cNR, basicInputWrapper, context, abstractC2391a);
    }

    public static void afterTextChange(Editable editable, AbstractC136210cNR abstractC136210cNR, BasicInputWrapper basicInputWrapper, Context context, AbstractC2391a abstractC2391a, int i) {
        if (PatchProxy.proxy(new Object[]{editable, abstractC136210cNR, basicInputWrapper, context, abstractC2391a, Integer.valueOf(i)}, null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        if (abstractC136210cNR.LIZ(editable.toString())) {
            basicInputWrapper.updateErrorMsg(context.getString(i));
            if (abstractC2391a != null) {
                abstractC2391a.LIZ();
                return;
            }
            return;
        }
        basicInputWrapper.clearErrorMsg();
        if (abstractC2391a != null) {
            abstractC2391a.LIZ();
        }
    }
}
