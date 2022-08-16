package com.bytedance.android.live.base.model.user;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class ProfileFansClubData {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("anchor_id")
    public long anchorId;
    @SerializedName("available_gift_ids")
    public List<Long> availableGiftIds;
    @SerializedName("badge")
    public ProfileUserBadge badge;
    @SerializedName("club_name")
    public String clubName;
    @SerializedName("level")
    public int level;
    @SerializedName("user_fans_club_status")
    public int userFansClubStatus;

    static {
        Covode.recordClassIndex(14172);
    }

    /* loaded from: classes12.dex */
    public static class ProfileUserBadge {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("icons")
        public Map<Integer, ImageModel> icons;
        @SerializedName("title")
        public String title;

        static {
            Covode.recordClassIndex(14173);
        }

        public ImageModel getToShowIcon() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (ImageModel) proxy.result;
            }
            Map<Integer, ImageModel> map = this.icons;
            if (map == null) {
                return null;
            }
            if (map.get(6) != null) {
                return this.icons.get(6);
            }
            if (this.icons.get(5) != null) {
                return this.icons.get(5);
            }
            if (this.icons.get(4) == null) {
                return null;
            }
            return this.icons.get(4);
        }
    }

    public static boolean isValid(ProfileFansClubData profileFansClubData) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{profileFansClubData}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (profileFansClubData != null && !TextUtils.isEmpty(profileFansClubData.clubName)) {
            return true;
        }
        return false;
    }
}
