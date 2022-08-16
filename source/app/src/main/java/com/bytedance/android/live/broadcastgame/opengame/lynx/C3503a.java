package com.bytedance.android.live.broadcastgame.opengame.lynx;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import p003X.C64859BiX;
import p003X.C87972KlS;
import p003X.C88022KmG;
import p003X.C88023KmH;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.lynx.a */
/* loaded from: classes5.dex */
public final class C3503a {
    @SerializedName("setting")
    public C88023KmH LIZ;
    @SerializedName("compilerOptions")

    /* renamed from: LJ */
    public C88022KmG f26059LJ;
    @SerializedName("globalConfig")
    public C87972KlS LJII;
    @SerializedName("appid")
    public String LIZIZ = "";
    @SerializedName("projectname")
    public String LIZJ = "";
    @SerializedName("views")
    public List<C3504d> LIZLLL = CollectionsKt__CollectionsKt.emptyList();
    @SerializedName("appType")
    public String LJFF = "";
    @SerializedName("targetSdkVersion")
    public String LJI = "";

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.lynx.a$d */
    /* loaded from: classes5.dex */
    public static final class C3504d {
        @SerializedName(C64859BiX.LIZLLL)
        public String LIZ = "";
        @SerializedName("type")
        public String LIZIZ = "";
        @SerializedName(MiPushMessage.KEY_ALIAS)
        public String LIZJ = "";
        @SerializedName("entry")
        public String LIZLLL = "";

        static {
            Covode.recordClassIndex(20228);
        }
    }

    static {
        Covode.recordClassIndex(20224);
    }
}
