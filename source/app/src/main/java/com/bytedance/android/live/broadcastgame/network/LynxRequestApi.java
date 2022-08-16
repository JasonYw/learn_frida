package com.bytedance.android.live.broadcastgame.network;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.Observable;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public interface LynxRequestApi {

    /* renamed from: com.bytedance.android.live.broadcastgame.network.LynxRequestApi$a */
    /* loaded from: classes5.dex */
    public static final class C3476a {
        public static ChangeQuickRedirect LIZ;
        @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD)
        public final String LIZIZ;
        @SerializedName("extra")
        public final String LIZJ;

        static {
            Covode.recordClassIndex(19880);
        }

        private Object[] LIZ() {
            return new Object[]{this.LIZIZ, this.LIZJ};
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj instanceof C3476a) {
                return C106862S5w.LIZ(((C3476a) obj).LIZ(), LIZ());
            }
            return false;
        }

        public final int hashCode() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
        }

        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("LynxRequestApi$LynxRequestResponse:%s,%s", LIZ());
        }
    }

    static {
        Covode.recordClassIndex(19879);
    }

    @FormUrlEncoded
    @POST("/webcast/game/lynx/data/")
    Observable<C5176i<C3476a>> requestServer(@Field("room_id") long j, @Field("game_id") long j2, @Field("anchor_id") long j3, @Field("method") String str, @Field("extra") String str2);
}
