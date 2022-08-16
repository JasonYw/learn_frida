package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.L6F;

/* loaded from: classes5.dex */
public enum GroupJoinStatus {
    NOT_APPLY(0, "申请加入"),
    APLLYING(1, "已申请"),
    ALREADY_IN(2, "已加入"),
    GROUP_IS_FULL(3, "群已满"),
    APPLY_TO_JOIN(4, "申请加入"),
    JOIN_NOW(5, "加入"),
    VIEW_CONDITIONS(6, "查看条件");
    
    public static final L6F Companion = new L6F((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public final String des;
    public final int status;

    public static GroupJoinStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (GroupJoinStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(GroupJoinStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static GroupJoinStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (GroupJoinStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(16513);
    }

    GroupJoinStatus(int i, String str) {
        this.status = i;
        this.des = str;
    }
}
