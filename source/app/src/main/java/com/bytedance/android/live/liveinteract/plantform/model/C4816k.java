package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.k */
/* loaded from: classes3.dex */
public class C4816k {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("send_gift_user")
    public User LIZIZ;
    @SerializedName("thanks_carousel_duration")
    public long LIZJ;
    @SerializedName("thanks_content")
    public String LIZLLL;
    @SerializedName("receive_gift_user_id")

    /* renamed from: LJ */
    public long f26422LJ;

    static {
        Covode.recordClassIndex(29433);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LinkMicQuickInteract{sendGiftUser=" + this.LIZIZ + ", interactCarouselDuration=" + this.LIZJ + ", interactContent='" + this.LIZLLL + "', toUsedID=" + this.f26422LJ + '}';
    }
}
