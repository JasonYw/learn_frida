package com.android.ttcjpaysdk.base.utils;

import android.text.TextUtils;
import android.util.Base64;
import com.bdcaijing.tfccsmsdk.Tfcc;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p002O.C0002O;

/* loaded from: classes17.dex */
public class CJPayEncryptUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static Tfcc tfcc;

    static {
        Covode.recordClassIndex(6721);
    }

    public static String getEncryptDataSM(String str) {
        String encStringWithTfcc;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = {-1};
        String encodeToString = Base64.encodeToString(str.getBytes(), 2);
        if (TextUtils.isEmpty(encodeToString) || (encStringWithTfcc = getEncStringWithTfcc(iArr, encodeToString)) == null) {
            return null;
        }
        return encStringWithTfcc;
    }

    public static String getDecryptDataSM(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int[] iArr = new int[1];
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String replace = str.replace('-', '+').replace('_', '/');
        Tfcc tfcc2 = tfcc;
        if (tfcc2 != null) {
            return tfcc2.LIZIZ(new String(CJPayBasicUtils.getTfccKey()), replace, iArr);
        }
        return new Tfcc().LIZIZ(new String(CJPayBasicUtils.getTfccKey()), replace, iArr);
    }

    public static String md5Encrypt(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String getEncStringWithTfcc(int[] iArr, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr, str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Tfcc tfcc2 = new Tfcc();
        tfcc = tfcc2;
        String LIZ = tfcc2.LIZ(new String(CJPayBasicUtils.getTfccKey()), str, iArr);
        if (TextUtils.isEmpty(LIZ)) {
            return null;
        }
        return LIZ.replace('+', '-').replace('/', '_').replaceAll("=", "");
    }

    public static String getEncryptData(String str, String str2) {
        String encStringWithTfcc;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int[] iArr = {-1};
        String md5Encrypt = md5Encrypt(md5Encrypt(str));
        if (TextUtils.isEmpty(md5Encrypt) || TextUtils.isEmpty(str2)) {
            return null;
        }
        new StringBuilder();
        String encodeToString = Base64.encodeToString(C0002O.m25086C(md5Encrypt, str2).getBytes(), 2);
        if (TextUtils.isEmpty(encodeToString) || (encStringWithTfcc = getEncStringWithTfcc(iArr, encodeToString)) == null) {
            return null;
        }
        return encStringWithTfcc;
    }

    public static String getEncryptDataWithoutMd5(String str, String str2) {
        String encStringWithTfcc;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int[] iArr = {-1};
        new StringBuilder();
        String encodeToString = Base64.encodeToString(C0002O.m25086C(str, str2).getBytes(), 2);
        if (TextUtils.isEmpty(encodeToString) || (encStringWithTfcc = getEncStringWithTfcc(iArr, encodeToString)) == null) {
            return null;
        }
        return encStringWithTfcc;
    }
}
