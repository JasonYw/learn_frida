package com.bytedance.alliance.bean;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C76666GKm;
import p003X.GDN;
import p003X.GKU;
import p003X.GLG;
import p003X.GLQ;

/* renamed from: com.bytedance.alliance.bean.b */
/* loaded from: classes2.dex */
public final class C2528b {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;

    /* renamed from: LJ */
    public String f25593LJ;
    public long LJI;
    public List<C2533e> LJIIIIZZ;
    public List<C2529a> LJIIIZ;
    public List<C2531c> LJIIJ;
    public List<C2532d> LJIIJJI;
    public List<C2530b> LJIIL;
    public int LJIILL;
    public String LIZJ = "source_app_package";
    public String LIZLLL = "source_app_name";
    public long LJFF = C76666GKm.LIZJ;
    public int LJII = 2;
    public String LJIILIIL = "";
    public String LJIILJJIL = "";

    static {
        Covode.recordClassIndex(9925);
    }

    /* renamed from: com.bytedance.alliance.bean.b$b */
    /* loaded from: classes2.dex */
    public static class C2530b {
        public static ChangeQuickRedirect LIZ;
        public int LIZIZ;
        public String LIZJ;
        public String LIZLLL;

        static {
            Covode.recordClassIndex(9927);
        }

        public final boolean LIZIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            return GDN.LIZ(this.LIZJ, this.LIZLLL);
        }

        public final JSONObject LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.LIZIZ);
                jSONObject.put("uri", this.LIZJ);
                jSONObject.put("uri_sign", this.LIZLLL);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }

        public final int hashCode() {
            int hashCode;
            int i = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            int i2 = this.LIZIZ * 31;
            if (TextUtils.isEmpty(this.LIZJ)) {
                hashCode = 0;
            } else {
                hashCode = this.LIZJ.hashCode();
            }
            int i3 = (i2 + hashCode) * 31;
            if (!TextUtils.isEmpty(this.LIZLLL)) {
                i = this.LIZLLL.hashCode();
            }
            return i3 + i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static List<C2530b> LIZ(JSONArray jSONArray) {
            C2530b c2530b;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONArray}, null, LIZ, true, 1);
            if (proxy.isSupported) {
                return (List) proxy.result;
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{optJSONObject}, null, LIZ, true, 2);
                        if (proxy2.isSupported) {
                            Object obj = proxy2.result;
                            c2530b = obj;
                            if (obj == 0) {
                            }
                        } else {
                            C2530b c2530b2 = new C2530b();
                            c2530b2.LIZIZ = optJSONObject.optInt("type", 0);
                            c2530b2.LIZJ = optJSONObject.optString("uri", "");
                            c2530b2.LIZLLL = optJSONObject.optString("uri_sign", "");
                            c2530b = c2530b2;
                        }
                        arrayList.add(c2530b);
                    }
                }
            }
            return arrayList;
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C2530b c2530b = (C2530b) obj;
                if (this.LIZIZ != c2530b.LIZIZ) {
                    return false;
                }
                String str = this.LIZJ;
                if (str != null) {
                    if (!str.equals(c2530b.LIZJ)) {
                        return false;
                    }
                } else if (c2530b.LIZJ != null) {
                    return false;
                }
                String str2 = this.LIZLLL;
                String str3 = c2530b.LIZLLL;
                if (str2 != null) {
                    return str2.equals(str3);
                }
                if (str3 == null) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.alliance.bean.b$c */
    /* loaded from: classes2.dex */
    public static class C2531c {
        public static ChangeQuickRedirect LIZ;
        public String LIZIZ = "";
        public boolean LIZJ;
        public boolean LIZLLL;

        static {
            Covode.recordClassIndex(9928);
        }

        public final JSONObject LIZ() {
            int i;
            int i2 = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("authority", this.LIZIZ);
                if (this.LIZJ) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("query", i);
                if (this.LIZLLL) {
                    i2 = 1;
                }
                jSONObject.put("get_type", i2);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        public final int hashCode() {
            int i = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            String str = this.LIZIZ;
            if (str != null) {
                i = str.hashCode();
            }
            return (((i * 31) + (this.LIZJ ? 1 : 0)) * 31) + (this.LIZLLL ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2531c)) {
                return false;
            }
            C2531c c2531c = (C2531c) obj;
            if (this.LIZJ != c2531c.LIZJ || this.LIZLLL != c2531c.LIZLLL) {
                return false;
            }
            String str = this.LIZIZ;
            String str2 = c2531c.LIZIZ;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
            if (r1 != 0) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List<com.bytedance.alliance.bean.C2528b.C2531c> LIZ(org.json.JSONArray r11, java.lang.String r12) {
            /*
                r8 = 2
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r7 = 0
                r1[r7] = r11
                r6 = 1
                r1[r6] = r12
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.alliance.bean.C2528b.C2531c.LIZ
                r5 = 0
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r6, r8)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L19
                java.lang.Object r0 = r1.result
                java.util.List r0 = (java.util.List) r0
                return r0
            L19:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                if (r11 == 0) goto L8f
                int r3 = r11.length()
                if (r3 <= 0) goto L8f
                r2 = 0
            L27:
                org.json.JSONObject r9 = r11.optJSONObject(r2)
                if (r9 == 0) goto L44
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r7] = r9
                r1[r6] = r12
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.alliance.bean.C2528b.C2531c.LIZ
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r6, r6)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L49
                java.lang.Object r1 = r1.result
                if (r1 == 0) goto L44
            L41:
                r4.add(r1)
            L44:
                int r2 = r2 + 1
                if (r2 >= r3) goto L8f
                goto L27
            L49:
                com.bytedance.alliance.bean.b$c r1 = new com.bytedance.alliance.bean.b$c
                r1.<init>()
                java.lang.String r10 = "authority"
                java.lang.String r0 = ""
                java.lang.String r0 = r9.optString(r10, r0)
                r1.LIZIZ = r0
                java.lang.String r0 = r1.LIZIZ
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L6a
                java.lang.String r10 = r1.LIZIZ
                java.lang.String r0 = "null"
                boolean r0 = r0.equalsIgnoreCase(r10)
                if (r0 == 0) goto L74
            L6a:
                java.lang.String r10 = "content://"
                java.lang.String r0 = ".alliance.provider1"
                java.lang.String r0 = p002O.C0002O.m25085C(r10, r12, r0)
                r1.LIZIZ = r0
            L74:
                java.lang.String r0 = "query"
                int r0 = r9.optInt(r0, r7)
                if (r0 <= 0) goto L8d
                r0 = 1
            L7d:
                r1.LIZJ = r0
                java.lang.String r0 = "get_type"
                int r0 = r9.optInt(r0, r7)
                if (r0 <= 0) goto L8b
                r0 = 1
            L88:
                r1.LIZLLL = r0
                goto L41
            L8b:
                r0 = 0
                goto L88
            L8d:
                r0 = 0
                goto L7d
            L8f:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.alliance.bean.C2528b.C2531c.LIZ(org.json.JSONArray, java.lang.String):java.util.List");
        }
    }

    /* renamed from: com.bytedance.alliance.bean.b$d */
    /* loaded from: classes2.dex */
    public static class C2532d {
        public static ChangeQuickRedirect LIZ;
        public String LIZIZ = "";
        public String LIZJ = "";
        public boolean LIZLLL;

        /* renamed from: LJ */
        public GLG f25595LJ;

        static {
            Covode.recordClassIndex(9929);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            String str = this.LIZIZ;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.LIZJ;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = (((i4 + i2) * 31) + (this.LIZLLL ? 1 : 0)) * 31;
            GLG glg = this.f25595LJ;
            if (glg != null) {
                i3 = glg.hashCode();
            }
            return i5 + i3;
        }

        public final JSONObject LIZ() {
            Object obj;
            int i = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.LIZIZ);
                jSONObject.put("action", this.LIZJ);
                if (this.LIZLLL) {
                    i = 1;
                }
                jSONObject.put("send", i);
                if (this.f25595LJ != null) {
                    obj = this.f25595LJ.LIZ();
                } else {
                    obj = "";
                }
                jSONObject.put("hw_intent_hook", obj);
                return jSONObject;
            } catch (Throwable unused) {
                return jSONObject;
            }
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2532d)) {
                return false;
            }
            C2532d c2532d = (C2532d) obj;
            if (this.LIZLLL != c2532d.LIZLLL) {
                return false;
            }
            String str = this.LIZIZ;
            if (str != null) {
                if (!str.equals(c2532d.LIZIZ)) {
                    return false;
                }
            } else if (c2532d.LIZIZ != null) {
                return false;
            }
            GLG glg = this.f25595LJ;
            if (glg != null) {
                if (!glg.equals(c2532d.f25595LJ)) {
                    return false;
                }
            } else if (c2532d.f25595LJ != null) {
                return false;
            }
            String str2 = this.LIZJ;
            String str3 = c2532d.LIZJ;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            if (r1 != 0) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List<com.bytedance.alliance.bean.C2528b.C2532d> LIZ(org.json.JSONArray r11) {
            /*
                r7 = 1
                java.lang.Object[] r1 = new java.lang.Object[r7]
                r6 = 0
                r1[r6] = r11
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.alliance.bean.C2528b.C2532d.LIZ
                r5 = 0
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r7, r7)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L16
                java.lang.Object r0 = r1.result
                java.util.List r0 = (java.util.List) r0
                return r0
            L16:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                if (r11 == 0) goto L90
                int r3 = r11.length()
                if (r3 <= 0) goto L90
                r2 = 0
            L24:
                org.json.JSONObject r8 = r11.optJSONObject(r2)
                if (r8 == 0) goto L40
                java.lang.Object[] r9 = new java.lang.Object[r7]
                r9[r6] = r8
                com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.alliance.bean.C2528b.C2532d.LIZ
                r0 = 2
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r9, r5, r1, r7, r0)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L45
                java.lang.Object r1 = r1.result
                if (r1 == 0) goto L40
            L3d:
                r4.add(r1)
            L40:
                int r2 = r2 + 1
                if (r2 >= r3) goto L90
                goto L24
            L45:
                com.bytedance.alliance.bean.b$d r1 = new com.bytedance.alliance.bean.b$d
                r1.<init>()
                java.lang.String r10 = ""
                java.lang.String r0 = "name"
                java.lang.String r0 = r8.optString(r0, r10)
                r1.LIZIZ = r0
                java.lang.String r0 = r1.LIZIZ
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L66
                java.lang.String r9 = r1.LIZIZ
                java.lang.String r0 = "null"
                boolean r0 = r0.equalsIgnoreCase(r9)
                if (r0 == 0) goto L6e
            L66:
                java.lang.Class<com.a.b.SmpReceiver1> r0 = com.p043a.p046b.SmpReceiver1.class
                java.lang.String r0 = r0.getName()
                r1.LIZIZ = r0
            L6e:
                java.lang.String r0 = "action"
                java.lang.String r0 = r8.optString(r0, r10)
                r1.LIZJ = r0
                java.lang.String r0 = "send"
                int r0 = r8.optInt(r0, r6)
                if (r0 <= 0) goto L8e
                r0 = 1
            L7f:
                r1.LIZLLL = r0
                java.lang.String r0 = "hw_intent_hook"
                org.json.JSONObject r0 = r8.optJSONObject(r0)
                X.GLG r0 = p003X.GLG.LIZ(r0)
                r1.f25595LJ = r0
                goto L3d
            L8e:
                r0 = 0
                goto L7f
            L90:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.alliance.bean.C2528b.C2532d.LIZ(org.json.JSONArray):java.util.List");
        }
    }

    /* renamed from: com.bytedance.alliance.bean.b$a */
    /* loaded from: classes.dex */
    public static class C2529a {
        public static ChangeQuickRedirect LIZ;
        public String LIZIZ;
        public String LIZJ;
        public int LIZLLL;

        /* renamed from: LJ */
        public String f25594LJ;
        public int LJFF;

        static {
            Covode.recordClassIndex(9926);
        }

        public final JSONObject LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.LIZIZ);
                jSONObject.put("action", this.LIZJ);
                jSONObject.put("start", this.LIZLLL);
                jSONObject.put("type", this.f25594LJ);
                jSONObject.put("trigger", this.LJFF);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            String str = this.LIZIZ;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i4 = i * 31;
            String str2 = this.LIZJ;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i5 = i4 + i2;
            String str3 = this.f25594LJ;
            if (str3 != null) {
                i3 = str3.hashCode();
            }
            return ((((i5 + i3) * 31) + this.LIZLLL) * 31) + this.LJFF;
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2529a)) {
                return false;
            }
            C2529a c2529a = (C2529a) obj;
            if (this.LIZLLL != c2529a.LIZLLL || this.LJFF != c2529a.LJFF) {
                return false;
            }
            String str = this.LIZIZ;
            if (str != null) {
                if (!str.equals(c2529a.LIZIZ)) {
                    return false;
                }
            } else if (c2529a.LIZIZ != null) {
                return false;
            }
            String str2 = this.f25594LJ;
            if (str2 != null) {
                if (!str2.equals(c2529a.f25594LJ)) {
                    return false;
                }
            } else if (c2529a.f25594LJ != null) {
                return false;
            }
            String str3 = this.LIZJ;
            String str4 = c2529a.LIZJ;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
            if (r2 != 0) goto L17;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.util.List<com.bytedance.alliance.bean.C2528b.C2529a> LIZ(org.json.JSONArray r11) {
            /*
                r8 = 1
                java.lang.Object[] r2 = new java.lang.Object[r8]
                r7 = 0
                r2[r7] = r11
                com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.alliance.bean.C2528b.C2529a.LIZ
                r6 = 0
                r0 = 2
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r8, r0)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L17
                java.lang.Object r0 = r1.result
                java.util.List r0 = (java.util.List) r0
                return r0
            L17:
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                if (r11 == 0) goto L8f
                int r4 = r11.length()
                if (r4 <= 0) goto L8f
                r3 = 0
            L25:
                org.json.JSONObject r9 = r11.optJSONObject(r3)
                if (r9 == 0) goto L40
                java.lang.Object[] r1 = new java.lang.Object[r8]
                r1[r7] = r9
                com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.alliance.bean.C2528b.C2529a.LIZ
                com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r6, r0, r8, r8)
                boolean r0 = r1.isSupported
                if (r0 == 0) goto L45
                java.lang.Object r2 = r1.result
                if (r2 == 0) goto L40
            L3d:
                r5.add(r2)
            L40:
                int r3 = r3 + 1
                if (r3 >= r4) goto L8f
                goto L25
            L45:
                com.bytedance.alliance.bean.b$a r2 = new com.bytedance.alliance.bean.b$a
                r2.<init>()
                java.lang.String r1 = ""
                java.lang.String r0 = "name"
                java.lang.String r0 = r9.optString(r0, r1)
                r2.LIZIZ = r0
                java.lang.String r0 = r2.LIZIZ
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto L66
                java.lang.String r10 = r2.LIZIZ
                java.lang.String r0 = "null"
                boolean r0 = r0.equalsIgnoreCase(r10)
                if (r0 == 0) goto L6e
            L66:
                java.lang.Class<com.bytedance.push.alliance.partner.Activity21> r0 = com.bytedance.push.alliance.partner.Activity21.class
                java.lang.String r0 = r0.getName()
                r2.LIZIZ = r0
            L6e:
                java.lang.String r0 = "action"
                java.lang.String r0 = r9.optString(r0, r1)
                r2.LIZJ = r0
                java.lang.String r0 = "start"
                int r0 = r9.optInt(r0, r7)
                r2.LIZLLL = r0
                java.lang.String r0 = "trigger"
                int r0 = r9.optInt(r0, r7)
                r2.LJFF = r0
                java.lang.String r0 = "type"
                java.lang.String r0 = r9.optString(r0, r1)
                r2.f25594LJ = r0
                goto L3d
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.alliance.bean.C2528b.C2529a.LIZ(org.json.JSONArray):java.util.List");
        }
    }

    /* renamed from: com.bytedance.alliance.bean.b$e */
    /* loaded from: classes2.dex */
    public static class C2533e {
        public static ChangeQuickRedirect LIZ;
        public String LIZIZ;
        public String LIZJ;
        public boolean LIZLLL;

        /* renamed from: LJ */
        public boolean f25596LJ;
        public GLG LJFF;
        public GLQ LJI;

        static {
            Covode.recordClassIndex(9930);
        }

        public final JSONObject LIZ() {
            int i;
            JSONObject LIZ2;
            int i2 = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.LIZIZ);
                jSONObject.put("action", this.LIZJ);
                if (this.LIZLLL) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("start", i);
                if (this.f25596LJ) {
                    i2 = 1;
                }
                jSONObject.put("bind", i2);
                Object obj = "";
                if (this.LJFF == null) {
                    LIZ2 = obj;
                } else {
                    LIZ2 = this.LJFF.LIZ();
                }
                jSONObject.put("hw_intent_hook", LIZ2);
                if (this.LJI != null) {
                    obj = this.LJI.LIZ();
                }
                jSONObject.put("xm_start_service_hook", obj);
                return jSONObject;
            } catch (JSONException e) {
                e.printStackTrace();
                return jSONObject;
            }
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4 = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            String str = this.LIZIZ;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i5 = i * 31;
            String str2 = this.LIZJ;
            if (str2 != null) {
                i2 = str2.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((((i5 + i2) * 31) + (this.LIZLLL ? 1 : 0)) * 31) + (this.f25596LJ ? 1 : 0)) * 31;
            GLG glg = this.LJFF;
            if (glg != null) {
                i3 = glg.hashCode();
            } else {
                i3 = 0;
            }
            int i7 = (i6 + i3) * 31;
            GLQ glq = this.LJI;
            if (glq != null) {
                i4 = glq.hashCode();
            }
            return i7 + i4;
        }

        public final boolean equals(Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2533e)) {
                return false;
            }
            C2533e c2533e = (C2533e) obj;
            if (this.LIZLLL != c2533e.LIZLLL || this.f25596LJ != c2533e.f25596LJ) {
                return false;
            }
            String str = this.LIZIZ;
            if (str != null) {
                if (!str.equals(c2533e.LIZIZ)) {
                    return false;
                }
            } else if (c2533e.LIZIZ != null) {
                return false;
            }
            String str2 = this.LIZJ;
            if (str2 != null) {
                if (!str2.equals(c2533e.LIZJ)) {
                    return false;
                }
            } else if (c2533e.LIZJ != null) {
                return false;
            }
            GLG glg = this.LJFF;
            if (glg != null) {
                if (!glg.equals(c2533e.LJFF)) {
                    return false;
                }
            } else if (c2533e.LJFF != null) {
                return false;
            }
            GLQ glq = this.LJI;
            GLQ glq2 = c2533e.LJI;
            if (glq == glq2 || (glq != null && glq.equals(glq2))) {
                return true;
            }
            return false;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        String str = this.LIZIZ;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i12 = i * 31;
        String str2 = this.LIZJ;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = (i12 + i2) * 31;
        String str3 = this.LIZLLL;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i14 = (i13 + i3) * 31;
        String str4 = this.f25593LJ;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        long j = this.LJFF;
        int i15 = (((((i14 + i4) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.LJII) * 31;
        List<C2533e> list = this.LJIIIIZZ;
        if (list != null) {
            i5 = list.hashCode();
        } else {
            i5 = 0;
        }
        int i16 = (i15 + i5) * 31;
        List<C2529a> list2 = this.LJIIIZ;
        if (list2 != null) {
            i6 = list2.hashCode();
        } else {
            i6 = 0;
        }
        int i17 = (i16 + i6) * 31;
        List<C2531c> list3 = this.LJIIJ;
        if (list3 != null) {
            i7 = list3.hashCode();
        } else {
            i7 = 0;
        }
        int i18 = (i17 + i7) * 31;
        List<C2532d> list4 = this.LJIIJJI;
        if (list4 != null) {
            i8 = list4.hashCode();
        } else {
            i8 = 0;
        }
        int i19 = (i18 + i8) * 31;
        List<C2530b> list5 = this.LJIIL;
        if (list5 != null) {
            i9 = list5.hashCode();
        } else {
            i9 = 0;
        }
        int i20 = (i19 + i9) * 31;
        String str5 = this.LJIILIIL;
        if (str5 != null) {
            i10 = str5.hashCode();
        } else {
            i10 = 0;
        }
        int i21 = (i20 + i10) * 31;
        String str6 = this.LJIILJJIL;
        if (str6 != null) {
            i11 = str6.hashCode();
        }
        return ((i21 + i11) * 31) + this.LJIILL;
    }

    public final JSONObject LIZ() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("package", this.LIZIZ);
            jSONObject.put("strategy", this.LJII);
            jSONObject.put("source_app_package_key", this.LIZJ);
            jSONObject.put("source_app_name_key", this.LIZLLL);
            jSONObject.put("partner_name", this.f25593LJ);
            jSONObject.put("radical_wakeup_interval_in_second", this.LJFF);
            jSONObject.put("last_wake_up_time_in_millisecond", this.LJI);
            if (this.LJIIIIZZ != null && !this.LJIIIIZZ.isEmpty()) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    for (C2533e c2533e : this.LJIIIIZZ) {
                        if (c2533e != null) {
                            jSONArray.put(c2533e.LIZ());
                        }
                    }
                    jSONObject.put("services", jSONArray);
                } catch (Throwable unused) {
                }
            }
            if (this.LJIIIZ != null && !this.LJIIIZ.isEmpty()) {
                try {
                    JSONArray jSONArray2 = new JSONArray();
                    for (C2529a c2529a : this.LJIIIZ) {
                        if (c2529a != null) {
                            jSONArray2.put(c2529a.LIZ());
                        }
                    }
                    jSONObject.put("activities", jSONArray2);
                } catch (Throwable unused2) {
                }
            }
            if (this.LJIIJ != null && !this.LJIIJ.isEmpty()) {
                try {
                    JSONArray jSONArray3 = new JSONArray();
                    for (C2531c c2531c : this.LJIIJ) {
                        if (c2531c != null) {
                            jSONArray3.put(c2531c.LIZ());
                        }
                    }
                    jSONObject.put("providers", jSONArray3);
                } catch (Throwable unused3) {
                }
            }
            if (this.LJIIJJI != null && !this.LJIIJJI.isEmpty()) {
                try {
                    JSONArray jSONArray4 = new JSONArray();
                    for (C2532d c2532d : this.LJIIJJI) {
                        if (c2532d != null) {
                            jSONArray4.put(c2532d.LIZ());
                        }
                    }
                    jSONObject.put("receivers", jSONArray4);
                } catch (Throwable unused4) {
                }
            }
            if (this.LJIIL != null && !this.LJIIL.isEmpty()) {
                try {
                    JSONArray jSONArray5 = new JSONArray();
                    for (C2530b c2530b : this.LJIIL) {
                        if (c2530b != null) {
                            jSONArray5.put(c2530b.LIZ());
                        }
                    }
                    jSONObject.put("components", jSONArray5);
                } catch (Throwable unused5) {
                }
            }
            String str2 = "";
            if (TextUtils.isEmpty(this.LJIILIIL)) {
                str = str2;
            } else {
                str = this.LJIILIIL;
            }
            jSONObject.put("compose_data_sign", str);
            if (!TextUtils.isEmpty(this.LJIILJJIL)) {
                str2 = this.LJIILJJIL;
            }
            jSONObject.put("compose_data", str2);
            jSONObject.put("use_compose_data", this.LJIILL);
        } catch (Throwable unused6) {
        }
        return jSONObject;
    }

    public final boolean LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!GKU.LIZ(context, this.LIZIZ) && this.LJFF > 0 && !TextUtils.isEmpty(this.LIZIZ) && !TextUtils.isEmpty(this.f25593LJ)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2528b)) {
            return false;
        }
        C2528b c2528b = (C2528b) obj;
        if (this.LJFF != c2528b.LJFF || this.LJII != c2528b.LJII) {
            return false;
        }
        String str = this.LIZIZ;
        if (str != null) {
            if (!str.equals(c2528b.LIZIZ)) {
                return false;
            }
        } else if (c2528b.LIZIZ != null) {
            return false;
        }
        String str2 = this.LIZJ;
        if (str2 != null) {
            if (!str2.equals(c2528b.LIZJ)) {
                return false;
            }
        } else if (c2528b.LIZJ != null) {
            return false;
        }
        String str3 = this.LIZLLL;
        if (str3 != null) {
            if (!str3.equals(c2528b.LIZLLL)) {
                return false;
            }
        } else if (c2528b.LIZLLL != null) {
            return false;
        }
        String str4 = this.f25593LJ;
        if (str4 != null) {
            if (!str4.equals(c2528b.f25593LJ)) {
                return false;
            }
        } else if (c2528b.f25593LJ != null) {
            return false;
        }
        List<C2533e> list = this.LJIIIIZZ;
        if (list != null) {
            if (!list.equals(c2528b.LJIIIIZZ)) {
                return false;
            }
        } else if (c2528b.LJIIIIZZ != null) {
            return false;
        }
        List<C2529a> list2 = this.LJIIIZ;
        if (list2 != null) {
            if (!list2.equals(c2528b.LJIIIZ)) {
                return false;
            }
        } else if (c2528b.LJIIIZ != null) {
            return false;
        }
        List<C2531c> list3 = this.LJIIJ;
        if (list3 != null) {
            if (!list3.equals(c2528b.LJIIJ)) {
                return false;
            }
        } else if (c2528b.LJIIJ != null) {
            return false;
        }
        List<C2532d> list4 = this.LJIIJJI;
        if (list4 != null) {
            if (!list4.equals(c2528b.LJIIJJI)) {
                return false;
            }
        } else if (c2528b.LJIIJJI != null) {
            return false;
        }
        List<C2530b> list5 = this.LJIIL;
        if (list5 != null) {
            if (list5.equals(c2528b.LJIIL)) {
                return false;
            }
        } else if (c2528b.LJIIL != null) {
            return false;
        }
        String str5 = this.LJIILIIL;
        if (str5 != null) {
            if (!str5.equals(c2528b.LJIILIIL)) {
                return false;
            }
        } else if (c2528b.LJIILIIL != null) {
            return false;
        }
        String str6 = this.LJIILJJIL;
        if (str6 != null) {
            if (!str6.equals(c2528b.LJIILJJIL)) {
                return false;
            }
        } else if (c2528b.LJIILJJIL != null) {
            return false;
        }
        if (this.LJIILL == c2528b.LJIILL) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
        if (r3 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.alliance.bean.C2528b.LIZ(org.json.JSONObject):void");
    }
}
