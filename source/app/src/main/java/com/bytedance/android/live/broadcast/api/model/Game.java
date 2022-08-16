package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import p003X.C90787Lpl;
import p003X.KM9;

/* loaded from: classes5.dex */
public class Game {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("game_id")
    public long gameId;
    @SerializedName("icon")
    public ImageModel icon;
    @SerializedName("name")
    public String name;

    static {
        Covode.recordClassIndex(14494);
    }

    public String toJsonString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (C90787Lpl.LIZJ() != null) {
            return GsonProtectorUtils.toJson(C90787Lpl.LIZJ(), this);
        }
        return GsonProtectorUtils.toJson(KM9.LIZ(), this);
    }

    public static Game fromJson(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (Game) proxy.result;
        }
        try {
            if (C90787Lpl.LIZJ() != null) {
                return (Game) GsonProtectorUtils.fromJson(C90787Lpl.LIZJ(), str, (Class<Object>) Game.class);
            }
            return (Game) GsonProtectorUtils.fromJson(KM9.LIZ(), str, (Class<Object>) Game.class);
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return null;
        }
    }
}
