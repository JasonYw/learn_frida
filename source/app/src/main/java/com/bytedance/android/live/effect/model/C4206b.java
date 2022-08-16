package com.bytedance.android.live.effect.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.effect.model.b */
/* loaded from: classes3.dex */
public final class C4206b implements C3LJ {
    @SerializedName("image_uri")
    public String LIZ;
    @SerializedName("img_type")
    public int LIZIZ;
    @SerializedName("image")
    public ImageModel LIZJ;
    @SerializedName("imageThumbnail")
    public ImageModel LIZLLL;

    static {
        Covode.recordClassIndex(24559);
    }

    public C4206b() {
        this.LIZ = "";
        this.LIZIZ = -1;
    }

    public C4206b(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                break;
            } else if (LIZIZ != 1) {
                if (LIZIZ != 2) {
                    if (LIZIZ != 3) {
                        if (LIZIZ != 4) {
                            QV1.LJII(c10532g);
                        } else {
                            this.LIZLLL = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                        }
                    } else {
                        this.LIZJ = _ImageModel_ProtoDecoder.decodeStatic(c10532g);
                    }
                } else {
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                }
            } else {
                this.LIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ);
        if (this.LIZ == null) {
            this.LIZ = "";
        }
        if (this.LIZIZ == 0) {
            this.LIZIZ = -1;
        }
    }
}
