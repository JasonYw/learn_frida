package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import com.android.ttcjpaysdk.base.service.bean.NormalBindCardBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public interface ICJPayNormalBindCardService extends ICJPayService {
    public static final Companion Companion = Companion.$$INSTANCE;

    static {
        Covode.recordClassIndex(6472);
    }

    INormalBindCardCallback getNormalBindCardCallback();

    void release();

    void setPayNewCardCallback(ICJPayNewCardCallback iCJPayNewCardCallback);

    void setPayTimeTrackCallback(ICJPayTimeTrackCallback iCJPayTimeTrackCallback);

    void startBindCardProcess(Activity activity, BindCardType bindCardType, NormalBindCardBean normalBindCardBean, INormalBindCardCallback iNormalBindCardCallback);

    /* loaded from: classes17.dex */
    public enum BindCardType {
        TYPE_PAY("绑卡并支付"),
        TYPE_BALANCE("余额充提"),
        TYPE_MY_BANK_CARD("我的银行卡"),
        TYPE_INDEPENDENT("独立绑卡");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String string;

        public static BindCardType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (BindCardType) (proxy.isSupported ? proxy.result : Enum.valueOf(BindCardType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BindCardType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (BindCardType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final String getString() {
            return this.string;
        }

        static {
            Covode.recordClassIndex(6474);
        }

        public final void setString(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(str);
            this.string = str;
        }

        BindCardType(String str) {
            this.string = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum SourceType {
        Null(-1, ""),
        Pay(0, "支付收银台"),
        Charge(1, "充值收银台"),
        WithDraw(2, "提现收银台"),
        CardList(3, "卡列表"),
        MyBindCard(4, "我的银行卡绑卡"),
        MyBindCardTwo(5, "我的银行卡首页"),
        ChargeMain(6, "充值收银台入口"),
        WithDrawMain(7, "提现收银台入口"),
        FrontPay(8, "电商前置收银台"),
        IndependentBindCard(9, "H5独立绑卡入口");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mDesc;
        public int mType;

        public static SourceType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
            return (SourceType) (proxy.isSupported ? proxy.result : Enum.valueOf(SourceType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SourceType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
            return (SourceType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        public final String getMDesc() {
            return this.mDesc;
        }

        public final int getMType() {
            return this.mType;
        }

        static {
            Covode.recordClassIndex(6476);
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

        SourceType(int i, String str) {
            this.mType = i;
            this.mDesc = str;
        }
    }

    /* loaded from: classes17.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        static {
            Covode.recordClassIndex(6475);
        }
    }
}
