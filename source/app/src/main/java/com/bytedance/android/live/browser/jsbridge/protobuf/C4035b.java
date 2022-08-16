package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.browser.jsbridge.protobuf.C4036c;
import com.bytedance.android.live.browser.jsbridge.protobuf.C4041d;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C102252QOo;
import p003X.C102253QOp;
import p003X.C102273QPj;
import p003X.C106862S5w;
import p003X.PM4;
import p003X.QOZ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.b */
/* loaded from: classes8.dex */
public final class C4035b {
    public static ChangeQuickRedirect LIZ;
    public static final PM4 LIZLLL = new PM4((byte) 0);
    public final C4036c LIZIZ;
    public final C4041d LIZJ;

    static {
        Covode.recordClassIndex(22949);
    }

    public C4035b(C4036c c4036c, C4041d c4041d) {
        C106862S5w.LIZ(c4036c, c4041d);
        this.LIZIZ = c4036c;
        this.LIZJ = c4041d;
    }

    private Object LIZ(C4036c.C4037b c4037b, C10532g c10532g, C4041d.C4042b c4042b) {
        Object LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4037b, c10532g, c4042b}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return proxy.result;
        }
        int i = c4037b.LIZJ;
        if (i != 20) {
            if (i == 21) {
                if (c4037b.LJFF != null) {
                    LIZ2 = LIZ(c4037b.LJFF.getFirst(), c4037b.LJFF.getSecond(), c10532g, c4042b);
                } else {
                    throw new IllegalStateException(("type of [" + c4037b.LIZ + "] is map but lacks mapInfo").toString());
                }
            } else {
                switch (i) {
                    case 0:
                        LIZ2 = Boolean.valueOf(QV1.LIZ(c10532g));
                        break;
                    case 1:
                        LIZ2 = QV1.LJI(c10532g);
                        break;
                    case 2:
                        LIZ2 = Double.valueOf(QV1.m22903LJ(c10532g));
                        break;
                    case 3:
                        LIZ2 = Float.valueOf(QV1.LIZLLL(c10532g));
                        break;
                    case 4:
                    case 7:
                        LIZ2 = Integer.valueOf(QV1.LIZIZ(c10532g));
                        break;
                    case 5:
                    case 8:
                        LIZ2 = Long.valueOf(QV1.LIZJ(c10532g));
                        break;
                    case 6:
                        LIZ2 = QV1.LJFF(c10532g);
                        break;
                    default:
                        throw new IllegalStateException(("field type [" + c4037b.LIZJ + "] is not supported").toString());
                }
            }
        } else if (c4037b.f26164LJ != null) {
            C4036c.C4040c LIZ3 = this.LIZIZ.LIZ(c4037b.f26164LJ);
            if (LIZ3 != null) {
                LIZ2 = LIZ(LIZ3, c10532g, c4042b);
            } else {
                throw new IllegalStateException(("message with fqName [" + c4037b.f26164LJ + "] not found").toString());
            }
        } else {
            throw new IllegalStateException(("field [" + c4037b.LIZ + "] is pointing to fqName but not found in def").toString());
        }
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return LIZ2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0085, code lost:
        if (r11 != null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private org.json.JSONObject LIZ(com.bytedance.android.live.browser.jsbridge.protobuf.C4036c.C4040c r9, com.bytedance.android.tools.p859a.p860a.C10532g r10, com.bytedance.android.live.browser.jsbridge.protobuf.C4041d.C4042b r11) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.jsbridge.protobuf.C4035b.LIZ(com.bytedance.android.live.browser.jsbridge.protobuf.c$c, com.bytedance.android.tools.a.a.g, com.bytedance.android.live.browser.jsbridge.protobuf.d$b):org.json.JSONObject");
    }

    private final Pair<Object, Object> LIZ(C4036c.C4037b.C4038b c4038b, C4036c.C4037b.C4039c c4039c, C10532g c10532g, C4041d.C4042b c4042b) {
        boolean z;
        C4041d.C4042b c4042b2;
        C102253QOp c102253QOp;
        C4041d.C4042b c4042b3;
        C102252QOo c102252QOo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4038b, c4039c, c10532g, c4042b}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        long LIZ2 = c10532g.LIZ();
        Object obj = null;
        Object obj2 = null;
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ != -1) {
                if (LIZIZ != 1) {
                    if (LIZIZ == 2) {
                        if (c4042b != null && (c102253QOp = (C102253QOp) c4042b.LIZ.get(C102253QOp.class)) != null) {
                            c4042b2 = c102253QOp.LIZIZ;
                        } else {
                            c4042b2 = null;
                        }
                        obj2 = LIZ(c4039c, c10532g, c4042b2);
                    } else {
                        throw new IllegalStateException(("unknown tag [" + LIZIZ + "] for map").toString());
                    }
                } else {
                    if (c4042b != null && (c102252QOo = (C102252QOo) c4042b.LIZ.get(C102252QOo.class)) != null) {
                        c4042b3 = c102252QOo.LIZIZ;
                    } else {
                        c4042b3 = null;
                    }
                    obj = LIZ(c4038b, c10532g, c4042b3);
                }
            } else {
                c10532g.LIZ(LIZ2);
                if (obj != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (obj2 != null) {
                        return new Pair<>(obj, obj2);
                    }
                    throw new IllegalStateException(("malformed data: value of type [" + c4039c + "] in map is null").toString());
                }
                throw new IllegalStateException(("malformed data: key of type [" + c4038b + "] in map is null").toString());
            }
        }
    }

    public final JSONObject LIZ(byte[] bArr, String str, String str2, String str3, String str4) {
        C4036c.C4040c c4040c;
        C4036c.C4040c LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, str, str2, str3, str4}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        C106862S5w.LIZ(bArr, str);
        JSONObject jSONObject = new JSONObject();
        C10532g c10532g = new C10532g();
        c10532g.LIZ(C102273QPj.LIZ(bArr));
        QOZ LIZ3 = QOZ.LIZ(c10532g);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        jSONObject.put("status_code", LIZ3.LIZIZ.LIZIZ);
        if (LIZ3.LIZIZ.LIZIZ == 0) {
            C4036c.C4040c LIZ4 = this.LIZIZ.LIZ(str);
            if (LIZ4 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("now", LIZ3.LIZIZ.LJFF);
                jSONObject.put("extra", jSONObject2);
                byte[] bArr2 = LIZ3.LIZJ;
                if (bArr2 != null) {
                    c10532g.LIZ(C102273QPj.LIZ(bArr2));
                    long LIZ5 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ == -1) {
                            break;
                        } else if (LIZIZ != 1) {
                            if (LIZIZ == 2 && str2 != null && (LIZ2 = this.LIZIZ.LIZ(str2)) != null) {
                                JSONObject LIZ6 = LIZ(LIZ2, c10532g, this.LIZJ.LIZ(str4));
                                Iterator<String> keys = LIZ6.keys();
                                Intrinsics.checkNotNullExpressionValue(keys, "");
                                while (keys.hasNext()) {
                                    String next = keys.next();
                                    jSONObject2.put(next, LIZ6.get(next));
                                }
                            } else {
                                QV1.LJII(c10532g);
                            }
                        } else {
                            jSONObject.put(C2521l.LJIIL, LIZ(LIZ4, c10532g, this.LIZJ.LIZ(str3)));
                        }
                    }
                    c10532g.LIZ(LIZ5);
                }
            } else {
                throw new IllegalArgumentException(C0002O.m25085C("data message [", str, "] definition not found").toString());
            }
        } else {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("message", LIZ3.LIZIZ.LIZJ);
            jSONObject3.put("prompts", LIZ3.LIZIZ.LIZLLL);
            jSONObject3.put("alert", LIZ3.LIZIZ.f26525LJ);
            jSONObject.put(C2521l.LJIIL, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("now", LIZ3.LIZIZ.LJFF);
            jSONObject.put("extra", jSONObject4);
            if (str2 != null) {
                c4040c = this.LIZIZ.LIZ(str2);
            } else {
                c4040c = null;
            }
            String str5 = LIZ3.LIZIZ.LJI;
            if (c4040c != null && str5 != null && str5.length() != 0) {
                JSONObject jSONObject5 = new JSONObject(str5);
                Iterator<String> keys2 = jSONObject5.keys();
                Intrinsics.checkNotNullExpressionValue(keys2, "");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject4.put(next2, jSONObject5.get(next2));
                }
            }
        }
        return jSONObject;
    }
}
