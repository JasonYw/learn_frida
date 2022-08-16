package com.android.ttcjpaysdk.base.service.bean;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.service.ICJPayNormalBindCardService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class NormalBindCardBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bindCardInfo;
    public Integer bindSourceType;
    public String bizOrderType;
    public Boolean cardBinAutoFocus;
    public String exts;
    public JSONObject hostInfoJSON;
    public Boolean isBindCardWithPay;
    public boolean isFront;
    public Boolean needAuthGuide;
    public JSONObject processInfo;
    public String source;
    public String totalAmount;
    public ICJPayNormalBindCardService.SourceType type = ICJPayNormalBindCardService.SourceType.Null;

    static {
        Covode.recordClassIndex(6548);
    }

    public final String getBindCardInfo() {
        return this.bindCardInfo;
    }

    public final Integer getBindSourceType() {
        return this.bindSourceType;
    }

    public final String getBizOrderType() {
        return this.bizOrderType;
    }

    public final Boolean getCardBinAutoFocus() {
        return this.cardBinAutoFocus;
    }

    public final String getExts() {
        return this.exts;
    }

    public final JSONObject getHostInfoJSON() {
        return this.hostInfoJSON;
    }

    public final Boolean getNeedAuthGuide() {
        return this.needAuthGuide;
    }

    public final JSONObject getProcessInfo() {
        return this.processInfo;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getTotalAmount() {
        return this.totalAmount;
    }

    public final ICJPayNormalBindCardService.SourceType getType() {
        return this.type;
    }

    public final Boolean isBindCardWithPay() {
        return this.isBindCardWithPay;
    }

    public final boolean isFront() {
        return this.isFront;
    }

    public final JSONObject getExt() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (!TextUtils.isEmpty(this.bindCardInfo)) {
            try {
                String str = this.bindCardInfo;
                Intrinsics.checkNotNull(str);
                return new JSONObject(str);
            } catch (Exception unused) {
                return new JSONObject();
            }
        }
        return null;
    }

    public final void setBindCardInfo(String str) {
        this.bindCardInfo = str;
    }

    public final void setBindCardWithPay(Boolean bool) {
        this.isBindCardWithPay = bool;
    }

    public final void setBindSourceType(Integer num) {
        this.bindSourceType = num;
    }

    public final void setBizOrderType(String str) {
        this.bizOrderType = str;
    }

    public final void setCardBinAutoFocus(Boolean bool) {
        this.cardBinAutoFocus = bool;
    }

    public final void setExts(String str) {
        this.exts = str;
    }

    public final void setFront(boolean z) {
        this.isFront = z;
    }

    public final void setHostInfoJSON(JSONObject jSONObject) {
        this.hostInfoJSON = jSONObject;
    }

    public final void setNeedAuthGuide(Boolean bool) {
        this.needAuthGuide = bool;
    }

    public final void setProcessInfo(JSONObject jSONObject) {
        this.processInfo = jSONObject;
    }

    public final void setSource(String str) {
        this.source = str;
    }

    public final void setTotalAmount(String str) {
        this.totalAmount = str;
    }

    public final void setType(ICJPayNormalBindCardService.SourceType sourceType) {
        if (PatchProxy.proxy(new Object[]{sourceType}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(sourceType);
        this.type = sourceType;
    }
}
