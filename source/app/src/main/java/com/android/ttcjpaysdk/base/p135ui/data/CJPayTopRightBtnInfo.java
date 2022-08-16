package com.android.ttcjpaysdk.base.p135ui.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayTopRightBtnInfo */
/* loaded from: classes17.dex */
public final class CJPayTopRightBtnInfo implements CJPayObject {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String desc = "";
    public String action = "";
    public String bio_type = "";

    /* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayTopRightBtnInfo$ActionType */
    /* loaded from: classes17.dex */
    public enum ActionType {
        BIO_VERIFY,
        FACE_VERIFY,
        DEFAULT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6645);
        }

        public static ActionType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ActionType) (proxy.isSupported ? proxy.result : Enum.valueOf(ActionType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ActionType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ActionType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    /* renamed from: com.android.ttcjpaysdk.base.ui.data.CJPayTopRightBtnInfo$BioType */
    /* loaded from: classes17.dex */
    public enum BioType {
        FINGER,
        DEFAULT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6646);
        }

        public static BioType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (BioType) (proxy.isSupported ? proxy.result : Enum.valueOf(BioType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BioType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (BioType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(6644);
    }

    public final ActionType getActionType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ActionType) proxy.result;
        }
        String str = this.action;
        int hashCode = str.hashCode();
        if (hashCode != -815673456) {
            if (hashCode == 2103775565 && str.equals("forget_pwd_verify")) {
                return ActionType.FACE_VERIFY;
            }
        } else if (str.equals("bio_verify")) {
            return ActionType.BIO_VERIFY;
        }
        return ActionType.DEFAULT;
    }

    public final BioType getBioType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BioType) proxy.result;
        }
        String str = this.bio_type;
        if (str.hashCode() == 2073851753 && str.equals("FINGER")) {
            return BioType.FINGER;
        }
        return BioType.DEFAULT;
    }
}
