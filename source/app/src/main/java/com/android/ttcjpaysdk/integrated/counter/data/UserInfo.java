package com.android.ttcjpaysdk.integrated.counter.data;

import com.android.ttcjpaysdk.base.json.CJPayObject;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;

/* loaded from: classes17.dex */
public class UserInfo implements CJPayObject, Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public long balance_amount;
    public boolean is_new_user;
    public int pay_id_state;
    public int uid_type;
    public String auth_status = "";
    public String auth_url = "";
    public String certificate_num = "";
    public String certificate_type = "";
    public String m_name = "";
    public String mobile = "";
    public String mid = "";
    public String uid = "";
    public String find_pwd_url = "";
    public String pwd_status = "";
    public String bind_url = "";
    public String declive_url = "";
    public String pwd_check_way = "";
    public String real_check_type = "";
    public String pay_uid = "";
    public String jruid = "";

    static {
        Covode.recordClassIndex(7574);
    }

    /* loaded from: classes17.dex */
    public enum PayIdState {
        PAY_ID_STATE_UNKNOWN,
        PAY_ID_STATE_ONE,
        PAY_ID_STATE_TWO,
        PAY_ID_STATE_THREE,
        PAY_ID_STATE_FOUR;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PayIdState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PayIdState[]) proxy.result;
            }
            return (PayIdState[]) values().clone();
        }

        static {
            Covode.recordClassIndex(7575);
        }

        public static PayIdState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PayIdState) proxy.result;
            }
            return (PayIdState) Enum.valueOf(PayIdState.class, str);
        }
    }

    /* loaded from: classes17.dex */
    public enum PwdCheckWay {
        PWD_CHECK_PWD,
        PWD_CHECK_FINGER,
        PWD_CHECK_FACE,
        PWD_NOT_CHECK_PWD;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PwdCheckWay[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PwdCheckWay[]) proxy.result;
            }
            return (PwdCheckWay[]) values().clone();
        }

        static {
            Covode.recordClassIndex(7576);
        }

        public static PwdCheckWay valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PwdCheckWay) proxy.result;
            }
            return (PwdCheckWay) Enum.valueOf(PwdCheckWay.class, str);
        }
    }

    /* loaded from: classes17.dex */
    public enum PwdStatus {
        PWD_STATUS_UNKNOWN,
        PWD_STATUS_NEGATIVE,
        PWD_STATUS_POSITIVE,
        PWD_STATUS_LOCKED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PwdStatus[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PwdStatus[]) proxy.result;
            }
            return (PwdStatus[]) values().clone();
        }

        static {
            Covode.recordClassIndex(7577);
        }

        public static PwdStatus valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PwdStatus) proxy.result;
            }
            return (PwdStatus) Enum.valueOf(PwdStatus.class, str);
        }
    }

    public PayIdState getPayIdState() {
        int i = this.pay_id_state;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return PayIdState.PAY_ID_STATE_UNKNOWN;
                    }
                    return PayIdState.PAY_ID_STATE_FOUR;
                }
                return PayIdState.PAY_ID_STATE_THREE;
            }
            return PayIdState.PAY_ID_STATE_TWO;
        }
        return PayIdState.PAY_ID_STATE_ONE;
    }

    public PwdCheckWay getPwdCheckWay() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (PwdCheckWay) proxy.result;
        }
        String str = this.pwd_check_way;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    return PwdCheckWay.PWD_CHECK_FINGER;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return PwdCheckWay.PWD_CHECK_FACE;
                }
                break;
            case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20 /* 51 */:
                if (str.equals(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START)) {
                    return PwdCheckWay.PWD_NOT_CHECK_PWD;
                }
                break;
        }
        return PwdCheckWay.PWD_CHECK_PWD;
    }

    public PwdStatus getPwdStatus() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (PwdStatus) proxy.result;
        }
        String str = this.pwd_status;
        switch (str.hashCode()) {
            case 48:
                if (str.equals("0")) {
                    return PwdStatus.PWD_STATUS_NEGATIVE;
                }
                break;
            case 49:
                if (str.equals("1")) {
                    return PwdStatus.PWD_STATUS_POSITIVE;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return PwdStatus.PWD_STATUS_LOCKED;
                }
                break;
        }
        return PwdStatus.PWD_STATUS_UNKNOWN;
    }
}
