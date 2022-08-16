package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._FollowInfo_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.api.model.ap */
/* loaded from: classes3.dex */
public final class C2906ap implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33968a.f42937f)
    public long LIZIZ;
    @SerializedName("sec_id")
    public String LIZJ;
    @SerializedName("nickname")
    public String LIZLLL;
    @SerializedName("follow_info")

    /* renamed from: LJ */
    public FollowInfo f25778LJ;
    @SerializedName("avatar_thumb")
    public ImageModel LJFF;
    @SerializedName("avatar_medium")
    public ImageModel LJI;
    @SerializedName("avatar_large")
    public ImageModel LJII;

    static {
        Covode.recordClassIndex(14542);
    }

    public C2906ap() {
        this.LIZJ = "";
        this.LIZLLL = "";
    }

    public final User LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (User) proxy.result;
        }
        User user = new User();
        user.setId(this.LIZIZ);
        user.setSecUid(this.LIZJ);
        user.setNickName(this.LIZLLL);
        user.setFollowInfo(this.f25778LJ);
        user.setAvatarThumb(this.LJFF);
        user.setAvatarMedium(this.LJI);
        user.setAvatarLarge(this.LJII);
        return user;
    }

    public C2906ap(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                switch (LIZIZ) {
                    case 1:
                        this.LIZIZ = QV1.LIZJ(c10532g);
                        break;
                    case 2:
                        this.LIZLLL = QV1.LJFF(c10532g);
                        break;
                    case 3:
                        this.LJFF = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 4:
                        this.LJI = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 5:
                        this.LJII = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 6:
                        this.f25778LJ = _FollowInfo_ProtoDecoder.decodeStatic(c10532g);
                        break;
                    case 7:
                        this.LIZJ = QV1.LJFF(c10532g);
                        break;
                    default:
                        QV1.LJII(c10532g);
                        break;
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (this.LIZJ == null) {
                    this.LIZJ = "";
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                    return;
                }
                return;
            }
        }
    }
}
