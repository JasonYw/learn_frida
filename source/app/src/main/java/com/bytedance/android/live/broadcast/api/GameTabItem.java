package com.bytedance.android.live.broadcast.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import p003X.C106862S5w;
import p003X.C3LJ;
import p003X.C78608Gyo;
import p003X.QV1;

/* loaded from: classes3.dex */
public final class GameTabItem implements Parcelable, C3LJ {
    public static final Parcelable.Creator<GameTabItem> CREATOR = new C78608Gyo();
    public static ChangeQuickRedirect LIZ;
    @SerializedName("id_str")
    public String LIZIZ;
    @SerializedName("title")
    public String LIZJ;
    @SerializedName("children")
    public List<GameTabItem> LIZLLL;

    static {
        Covode.recordClassIndex(14394);
    }

    public GameTabItem() {
    }

    public GameTabItem(C10532g c10532g) {
        this.LIZLLL = new ArrayList();
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ2);
                this.LIZLLL.isEmpty();
                return;
            } else if (LIZIZ == 1) {
                this.LIZIZ = QV1.LJFF(c10532g);
            } else if (LIZIZ == 2) {
                this.LIZJ = QV1.LJFF(c10532g);
            } else if (LIZIZ != 3) {
                QV1.LJII(c10532g);
            } else {
                this.LIZLLL.add(new GameTabItem(c10532g));
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(parcel);
        parcel.writeInt(1);
    }
}
