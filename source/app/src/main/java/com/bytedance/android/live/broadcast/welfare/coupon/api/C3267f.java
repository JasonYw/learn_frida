package com.bytedance.android.live.broadcast.welfare.coupon.api;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.welfare.coupon.api.f */
/* loaded from: classes5.dex */
public final class C3267f implements C3LJ {
    @SerializedName("user_coupons")
    public List<C3263b> LIZ;
    @SerializedName("default_coupons")
    public Map<String, C3263b> LIZIZ;

    static {
        Covode.recordClassIndex(18197);
    }

    public C3267f() {
        this.LIZ = new ArrayList();
        this.LIZIZ = new LinkedHashMap();
    }

    public C3267f(C10532g c10532g) {
        this.LIZ = new ArrayList();
        this.LIZIZ = new HashMap();
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ != 2) {
                        QV1.LJII(c10532g);
                    } else {
                        long LIZ2 = c10532g.LIZ();
                        String str = null;
                        C3263b c3263b = null;
                        while (true) {
                            int LIZIZ2 = c10532g.LIZIZ();
                            if (LIZIZ2 == -1) {
                                break;
                            } else if (LIZIZ2 != 1) {
                                if (LIZIZ2 != 2) {
                                    QV1.LJII(c10532g);
                                } else {
                                    c3263b = new C3263b(c10532g);
                                }
                            } else {
                                str = QV1.LJFF(c10532g);
                            }
                        }
                        c10532g.LIZ(LIZ2);
                        Map<String, C3263b> map = this.LIZIZ;
                        if (str != null) {
                            if (c3263b != null) {
                                map.put(str, c3263b);
                            } else {
                                throw new IllegalStateException("Value must not be null");
                            }
                        } else {
                            throw new IllegalStateException("Key must not be null");
                        }
                    }
                } else {
                    this.LIZ.add(new C3263b(c10532g));
                }
            } else {
                c10532g.LIZ(LIZ);
                if (this.LIZ.isEmpty()) {
                    this.LIZ = new ArrayList();
                }
                if (this.LIZIZ == null) {
                    this.LIZIZ = new LinkedHashMap();
                    return;
                }
                return;
            }
        }
    }
}
