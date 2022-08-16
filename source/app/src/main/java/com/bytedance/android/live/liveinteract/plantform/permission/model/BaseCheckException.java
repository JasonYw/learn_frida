package com.bytedance.android.live.liveinteract.plantform.permission.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public class BaseCheckException extends RuntimeException {
    public final CheckType checkType;
    public final String detailMessage;
    public final int linkType;
    public final OperateType operateType;

    /* loaded from: classes3.dex */
    public enum CheckType {
        Login,
        HostOperate,
        AndroidPermission,
        VideoShortPlugin,
        InteractPlugin,
        ServerPermission,
        Shield;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(29492);
        }

        public static CheckType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (CheckType) (proxy.isSupported ? proxy.result : Enum.valueOf(CheckType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static CheckType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (CheckType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(29491);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCheckException(int i, OperateType operateType, CheckType checkType, String str) {
        super(str);
        C106862S5w.LIZ(operateType, checkType, str);
        this.linkType = i;
        this.operateType = operateType;
        this.checkType = checkType;
        this.detailMessage = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseCheckException(int i, OperateType operateType, CheckType checkType, String str, Throwable th) {
        super(str, th);
        C106862S5w.LIZ(operateType, checkType, str, th);
        this.linkType = i;
        this.operateType = operateType;
        this.checkType = checkType;
        this.detailMessage = str;
    }
}
