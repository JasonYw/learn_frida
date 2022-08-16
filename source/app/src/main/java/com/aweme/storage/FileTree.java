package com.aweme.storage;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;

/* loaded from: classes13.dex */
public final class FileTree {
    public static ChangeQuickRedirect LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static List<String> LIZLLL;

    static {
        Covode.recordClassIndex(9390);
    }

    /* renamed from: com.aweme.storage.FileTree$a */
    /* loaded from: classes13.dex */
    public static class C2436a {
        public static ChangeQuickRedirect LIZ;
        public long LIZIZ;
        public List<C2436a> LIZJ = new ArrayList();
        public String LIZLLL;

        /* renamed from: LJ */
        public C2436a f25558LJ;
        public String LJFF;

        static {
            Covode.recordClassIndex(9392);
        }

        public final boolean LIZ() {
            if (this.LIZIZ > FileTree.LIZIZ) {
                return true;
            }
            return false;
        }

        public final String LIZIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            String str = this.LJFF;
            if (str != null) {
                return str;
            }
            if (this.f25558LJ == null) {
                this.LJFF = this.LIZLLL;
            } else {
                new StringBuilder();
                this.LJFF = C0002O.m25085C(this.f25558LJ.LIZIZ(), File.separator, this.LIZLLL);
            }
            return this.LJFF;
        }

        public final JSONObject LIZJ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
            if (proxy.isSupported) {
                return (JSONObject) proxy.result;
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("name", this.LIZLLL);
                jSONObject.put("size", this.LIZIZ);
                if (this.LIZJ != null && this.LIZJ.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    for (C2436a c2436a : this.LIZJ) {
                        if (c2436a != null) {
                            jSONArray.put(c2436a.LIZJ());
                        }
                    }
                    jSONObject.put("child", jSONArray);
                    return jSONObject;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        public final void LIZ(C2436a c2436a) {
            if (PatchProxy.proxy(new Object[]{c2436a}, this, LIZ, false, 3).isSupported) {
                return;
            }
            this.LIZJ.add(c2436a);
        }

        public static C2436a LIZ(JSONObject jSONObject, C2436a c2436a) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject, c2436a}, null, LIZ, true, 5);
            if (proxy.isSupported) {
                return (C2436a) proxy.result;
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                String optString = jSONObject.optString("name");
                long optLong = jSONObject.optLong("size", 0L);
                if (optString == null) {
                    return null;
                }
                C2436a c2436a2 = new C2436a(optString, optLong, c2436a);
                if (c2436a != null) {
                    c2436a.LIZ(c2436a2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("child");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            LIZ(jSONObject2, c2436a2);
                        }
                    }
                }
                return c2436a2;
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        public C2436a(String str, long j, C2436a c2436a) {
            this.LIZLLL = str;
            this.LIZIZ = j;
            this.f25558LJ = c2436a;
        }
    }

    /* loaded from: classes13.dex */
    public enum StorageType {
        p,
        e;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static StorageType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (StorageType[]) proxy.result;
            }
            return (StorageType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9391);
        }

        public static StorageType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (StorageType) proxy.result;
            }
            return (StorageType) Enum.valueOf(StorageType.class, str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v2 */
    public static C2436a LIZ(String str) {
        FileInputStream fileInputStream;
        MethodCollector.m14708i(577);
        ?? r3 = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            C2436a c2436a = (C2436a) proxy.result;
            MethodCollector.m14707o(577);
            return c2436a;
        }
        File file = new File(str);
        try {
            try {
                if (!file.exists()) {
                    MethodCollector.m14707o(577);
                    return null;
                }
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[fileInputStream.available()];
                        fileInputStream.read(bArr);
                        C2436a LIZ2 = C2436a.LIZ(new JSONObject(new String(bArr, "utf-8")), null);
                        try {
                            fileInputStream.close();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        MethodCollector.m14707o(577);
                        return LIZ2;
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        e.printStackTrace();
                        fileInputStream.close();
                        MethodCollector.m14707o(577);
                        return null;
                    } catch (IOException e3) {
                        e = e3;
                        e.printStackTrace();
                        fileInputStream.close();
                        MethodCollector.m14707o(577);
                        return null;
                    } catch (Exception e4) {
                        e = e4;
                        e.printStackTrace();
                        fileInputStream.close();
                        MethodCollector.m14707o(577);
                        return null;
                    }
                } catch (FileNotFoundException e5) {
                    e = e5;
                    fileInputStream = null;
                } catch (IOException e6) {
                    e = e6;
                    fileInputStream = null;
                } catch (Exception e7) {
                    e = e7;
                    fileInputStream = null;
                } catch (Throwable th) {
                    th = th;
                    r3 = 0;
                    try {
                        r3.close();
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    MethodCollector.m14707o(577);
                    throw th;
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LIZ(File file, List<File> list) {
        File[] listFiles;
        if (!PatchProxy.proxy(new Object[]{file, list}, null, LIZ, true, 7).isSupported && file.exists() && (listFiles = file.listFiles()) != null && listFiles.length > 0) {
            for (File file2 : listFiles) {
                if (file2 != null && file2.isFile() && file2.length() > LIZJ && !list.contains(file2)) {
                    list.add(file2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.aweme.storage.FileTree.C2436a LIZ(java.io.File r7, com.aweme.storage.FileTree.C2436a r8, com.aweme.storage.FileTree.StorageType r9) {
        /*
            r6 = 3
            java.lang.Object[] r3 = new java.lang.Object[r6]
            r4 = 0
            r3[r4] = r7
            r2 = 1
            r3[r2] = r8
            r1 = 2
            r3[r1] = r9
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.aweme.storage.FileTree.LIZ
            r5 = 0
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r5, r0, r2, r1)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r1.result
            com.aweme.storage.FileTree$a r0 = (com.aweme.storage.FileTree.C2436a) r0
            return r0
        L1c:
            if (r7 == 0) goto L8d
            boolean r0 = r7.exists()
            if (r0 == 0) goto L8d
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r4] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.aweme.storage.FileTree.LIZ
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r1, r5, r0, r2, r6)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L3d
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L52
        L3c:
            return r5
        L3d:
            boolean r0 = r7.isFile()
            if (r0 != 0) goto L3c
            java.util.List<java.lang.String> r1 = com.aweme.storage.FileTree.LIZLLL
            if (r1 == 0) goto L52
            java.lang.String r0 = r7.getName()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L52
            return r5
        L52:
            com.aweme.storage.FileTree$a r3 = new com.aweme.storage.FileTree$a
            if (r8 != 0) goto L6d
            java.lang.String r2 = r9.name()
        L5a:
            long r0 = p003X.C76564GGo.LIZ(r7)
            r3.<init>(r2, r0, r8)
            if (r8 == 0) goto L66
            r8.LIZ(r3)
        L66:
            boolean r0 = r7.isFile()
            if (r0 == 0) goto L72
            return r5
        L6d:
            java.lang.String r2 = r7.getName()
            goto L5a
        L72:
            boolean r0 = r7.isDirectory()
            if (r0 == 0) goto L8c
            java.io.File[] r2 = r7.listFiles()
            if (r2 == 0) goto L8c
            int r0 = r2.length
            if (r0 <= 0) goto L8c
            int r1 = r2.length
        L82:
            if (r4 >= r1) goto L8c
            r0 = r2[r4]
            LIZ(r0, r3, r9)
            int r4 = r4 + 1
            goto L82
        L8c:
            return r3
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.aweme.storage.FileTree.LIZ(java.io.File, com.aweme.storage.FileTree$a, com.aweme.storage.FileTree$StorageType):com.aweme.storage.FileTree$a");
    }

    public static void LIZ(C2436a c2436a, C2436a c2436a2, List<C2436a> list) {
        boolean equals;
        if (!PatchProxy.proxy(new Object[]{c2436a, c2436a2, list}, null, LIZ, true, 1).isSupported && c2436a != null && c2436a2 != null && list != null) {
            if (c2436a2.LIZIZ - c2436a.LIZIZ > LIZIZ) {
                list.add(c2436a2);
            }
            List<C2436a> list2 = c2436a2.LIZJ;
            if (list2 != null && !list2.isEmpty()) {
                List<C2436a> list3 = c2436a.LIZJ;
                if (list3 != null && !list3.isEmpty()) {
                    for (C2436a c2436a3 : list2) {
                        if (c2436a3 != null) {
                            Iterator<C2436a> it = list3.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C2436a next = it.next();
                                if (next != null) {
                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2436a3}, next, C2436a.LIZ, false, 1);
                                    if (proxy.isSupported) {
                                        equals = ((Boolean) proxy.result).booleanValue();
                                    } else {
                                        equals = c2436a3.LIZIZ().equals(next.LIZIZ());
                                    }
                                    if (equals) {
                                        LIZ(next, c2436a3, list);
                                        break;
                                    }
                                }
                                i++;
                            }
                            if (i >= list3.size() && c2436a3.LIZ()) {
                                list.add(c2436a3);
                            }
                        }
                    }
                    return;
                }
                for (C2436a c2436a4 : list2) {
                    if (c2436a4 != null && c2436a4.LIZ()) {
                        list.add(c2436a4);
                    }
                }
            }
        }
    }
}
