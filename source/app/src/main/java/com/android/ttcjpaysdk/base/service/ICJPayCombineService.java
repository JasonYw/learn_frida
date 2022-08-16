package com.android.ttcjpaysdk.base.service;

import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public interface ICJPayCombineService extends ICJPayService {
    static {
        Covode.recordClassIndex(6418);
    }

    CombineType getCombineType();

    String getCurrentMethod();

    CombinePayErrorType getErrorType();

    Fragment getFragment();

    CombinePaySource getPaySource();

    Object getSelectedCardInfo();

    String getSelectedCardNo();

    void hideBtnLoading();

    boolean isInsufficentStatus();

    void isQueryConnecting(boolean z);

    void logBackBtnClick();

    void processRoutineErrorCode(String str, boolean z, String str2);

    void refreshCardList();

    void refreshCombinePayHeader();

    void release();

    void setCallBack(ICJPayCombineCallback iCJPayCombineCallback);

    void setCombineType(CombineType combineType);

    void setErrorType(CombinePayErrorType combinePayErrorType);

    void setPaySource(CombinePaySource combinePaySource);

    void setShareData(Object obj);

    void setUnionPayDisable();

    void showBigLoading();

    void showBtnLoading();

    /* loaded from: classes17.dex */
    public enum CombinePayErrorType {
        Init(-1, "初始状态"),
        NewCardInsufficentError(0, "新卡余额不足"),
        NewCardOtherError(1, "新卡非余额不足"),
        OldCardInsufficentError(2, "老卡余额不足"),
        OldCardOtherError(3, "老卡非余额不足");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mDesc;
        public int mType;

        public static CombinePayErrorType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (CombinePayErrorType) (proxy.isSupported ? proxy.result : Enum.valueOf(CombinePayErrorType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CombinePayErrorType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (CombinePayErrorType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final String getMDesc() {
            return this.mDesc;
        }

        public final int getMType() {
            return this.mType;
        }

        static {
            Covode.recordClassIndex(6420);
        }

        public final void setMType(int i) {
            this.mType = i;
        }

        public final void setMDesc(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.mDesc = str;
        }

        CombinePayErrorType(int i, String str) {
            this.mType = i;
            this.mDesc = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum CombinePaySource {
        Init(-1, "初始状态"),
        FromConfirmFragment(0, "从收银台跳转过来，没有老卡的情况"),
        FromMethodFragment(1, "从卡列表跳转过来，有老卡的情况");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int from;
        public String mDesc;

        public static CombinePaySource valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (CombinePaySource) (proxy.isSupported ? proxy.result : Enum.valueOf(CombinePaySource.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CombinePaySource[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (CombinePaySource[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final int getFrom() {
            return this.from;
        }

        public final String getMDesc() {
            return this.mDesc;
        }

        static {
            Covode.recordClassIndex(6421);
        }

        public final void setFrom(int i) {
            this.from = i;
        }

        public final void setMDesc(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.mDesc = str;
        }

        CombinePaySource(int i, String str) {
            this.from = i;
            this.mDesc = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum CombineType {
        BalanceAndBankCard(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START, "零钱+银行卡", "balance"),
        IncomeAndBankCard("129", "收入+银行卡", "income");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String desc;
        public String payType;
        public String type;

        public static CombineType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
            return (CombineType) (proxy.isSupported ? proxy.result : Enum.valueOf(CombineType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CombineType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
            return (CombineType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final String getDesc() {
            return this.desc;
        }

        public final String getPayType() {
            return this.payType;
        }

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(6422);
        }

        public final void setDesc(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.desc = str;
        }

        public final void setPayType(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.payType = str;
        }

        public final void setType(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.type = str;
        }

        CombineType(String str, String str2, String str3) {
            this.type = str;
            this.desc = str2;
            this.payType = str3;
        }
    }

    /* loaded from: classes17.dex */
    public static final class DefaultImpls {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6423);
        }

        public static /* synthetic */ void processRoutineErrorCode$default(ICJPayCombineService iCJPayCombineService, String str, boolean z, String str2, int i, Object obj) {
            if (PatchProxy.proxy(new Object[]{iCJPayCombineService, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), str2, Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 1).isSupported) {
                return;
            }
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = "";
                }
                iCJPayCombineService.processRoutineErrorCode(str, z, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: processRoutineErrorCode");
        }
    }
}
