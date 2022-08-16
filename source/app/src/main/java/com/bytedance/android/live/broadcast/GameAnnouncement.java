package com.bytedance.android.live.broadcast;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.L9C;
import p003X.QV1;

/* loaded from: classes5.dex */
public final class GameAnnouncement implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("title")
    public String LIZIZ;
    @SerializedName("action_type")
    public Integer LIZJ;
    @SerializedName("announcement_type")
    public Integer LIZLLL;
    @SerializedName("jump_content")

    /* renamed from: LJ */
    public String f25766LJ;

    static {
        Covode.recordClassIndex(14293);
    }

    public GameAnnouncement() {
        this.LIZIZ = "";
        this.LIZJ = 0;
        this.LIZLLL = 0;
        this.f25766LJ = "";
    }

    /* loaded from: classes5.dex */
    public enum GameAnnouncementType {
        UNKNOWN(0),
        H5(1),
        LIVE(2),
        VIDEO(3),
        PERSON_PAGE(4),
        POPLAYER(5);
        
        public static final L9C Companion = new L9C((byte) 0);
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int type;

        public static GameAnnouncementType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (GameAnnouncementType) (proxy.isSupported ? proxy.result : Enum.valueOf(GameAnnouncementType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static GameAnnouncementType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (GameAnnouncementType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(14294);
        }

        GameAnnouncementType(int i) {
            this.type = i;
        }
    }

    public GameAnnouncement(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
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
                            this.f25766LJ = QV1.LJFF(c10532g);
                        }
                    } else {
                        this.LIZLLL = Integer.valueOf(QV1.LIZIZ(c10532g));
                    }
                } else {
                    this.LIZJ = Integer.valueOf(QV1.LIZIZ(c10532g));
                }
            } else {
                this.LIZIZ = QV1.LJFF(c10532g);
            }
        }
        c10532g.LIZ(LIZ2);
        if (this.LIZIZ == null) {
            this.LIZIZ = "";
        }
        if (this.LIZJ == null) {
            this.LIZJ = 0;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = 0;
        }
        if (this.f25766LJ == null) {
            this.f25766LJ = "";
        }
    }
}
