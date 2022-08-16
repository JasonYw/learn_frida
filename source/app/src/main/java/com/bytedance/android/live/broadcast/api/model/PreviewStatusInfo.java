package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AnonymousClass336;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PreviewStatusInfo implements Serializable {
    public static final AnonymousClass336 Companion = new AnonymousClass336((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("commodityCount")
    public int commodityCount;
    @SerializedName("group_purchase_count")
    public int groupPurchaseCount;
    @SerializedName("group_purchase_permission")
    public boolean groupPurchasePermission;
    @SerializedName("permission")
    public boolean hasMiniAppPermission;
    @SerializedName("paid_live_ticket")
    public boolean hasPaidLiveTicket;
    @SerializedName("has_welfare_permission")
    public boolean hasWelfarePermission;
    @SerializedName("mini_app_count")
    public int miniAppCount;
    @SerializedName("mix_mini_app_count")
    public long mixMiniAppCount;
    @SerializedName("transformCardCount")
    public int transformCardCount;
    @SerializedName("welfare_project_id")
    public long welfareProjectId;

    static {
        Covode.recordClassIndex(14506);
    }

    public final int LIZ() {
        if (this.transformCardCount > 0) {
            return 3;
        }
        if (this.miniAppCount > 0) {
            return 2;
        }
        if (this.commodityCount > 0) {
            return 1;
        }
        if (this.welfareProjectId > 0) {
            return 4;
        }
        if (this.mixMiniAppCount > 0) {
            return 2;
        }
        if (this.groupPurchaseCount > 0) {
            return 5;
        }
        if (this.hasPaidLiveTicket) {
            return 6;
        }
        return 0;
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        switch (LIZ()) {
            case 1:
                String LIZ = LK5.LIZ(2131586069);
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                return LIZ;
            case 2:
                String LIZ2 = LK5.LIZ(2131586303);
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                return LIZ2;
            case 3:
                String LIZ3 = LK5.LIZ(2131588134);
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                return LIZ3;
            case 4:
                String LIZ4 = LK5.LIZ(2131588477);
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                return LIZ4;
            case 5:
                String LIZ5 = LK5.LIZ(2131583884);
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                return LIZ5;
            case 6:
                String LIZ6 = LK5.LIZ(2131586755);
                Intrinsics.checkNotNullExpressionValue(LIZ6, "");
                return LIZ6;
            default:
                return "";
        }
    }
}
