package com.benchmark.collection;

import com.benchmark.collection.CollectionSettings;
import com.benchmark.netUtils.BytebenchAPI;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Callback;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC108899SuD;
import p003X.C103913Qvz;
import p003X.C108306Ske;
import p003X.C108862Stc;
import p003X.C108868Sti;
import p003X.C108870Stk;
import p003X.C108874Sto;
import p003X.C108888Su2;
import p003X.C108890Su4;
import p003X.C108892Su6;
import p003X.C108894Su8;
import p003X.C108896SuA;
import p003X.C108911SuP;
import p003X.C5855799z;
import p003X.C64859BiX;
import p003X.CallableC103914Qw0;
import p003X.CallableC108887Su1;
import p003X.CallableC108889Su3;
import p003X.CallableC108891Su5;
import p003X.QXB;
import p003X.QXD;
import p003X.QXE;

/* loaded from: classes10.dex */
public final class ByteBenchV2 extends AbstractC108899SuD {
    public static ChangeQuickRedirect LIZIZ;
    public C108888Su2 LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public STATUS f25581LJ = STATUS.INVALID;
    public Callback<TypedInput> LJFF = new QXD(this);

    static {
        Covode.recordClassIndex(9634);
    }

    /* loaded from: classes10.dex */
    public enum STATUS {
        INVALID,
        INIT,
        LOADING,
        LOAD,
        START,
        RUN,
        STOPPING,
        STOP,
        QUITTING;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static STATUS[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (STATUS[]) proxy.result;
            }
            return (STATUS[]) values().clone();
        }

        static {
            Covode.recordClassIndex(9648);
        }

        public static STATUS valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (STATUS) proxy.result;
            }
            return (STATUS) Enum.valueOf(STATUS.class, str);
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 14).isSupported) {
            return;
        }
        C108888Su2 c108888Su2 = this.LIZJ;
        if (!PatchProxy.proxy(new Object[0], c108888Su2, C108888Su2.LIZ, false, 8).isSupported) {
            if (C108894Su8.LIZ().LIZIZ.f12297LJ) {
                c108888Su2.LIZJ();
            } else {
                c108888Su2.LJFF.release();
            }
        }
    }

    @Override // p003X.AbstractC107185SIh
    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.f25581LJ != STATUS.RUN) {
            C108306Ske.LIZLLL("BytebenchV2", "stopByteBench: invaild status: " + this.f25581LJ);
            return -4;
        }
        this.f25581LJ = STATUS.STOPPING;
        C108911SuP.LIZ(new CallableC108889Su3(this), C108911SuP.LIZIZ);
        return 0;
    }

    public final int LIZJ() {
        String[] result;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C108888Su2 c108888Su2 = this.LIZJ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c108888Su2, C108888Su2.LIZ, false, 6);
        if (proxy2.isSupported) {
            result = (String[]) proxy2.result;
        } else {
            result = c108888Su2.LJFF.getResult();
        }
        if (result != null) {
            String str2 = null;
            if (result.length > 0) {
                str = result[0];
            } else {
                str = null;
            }
            if (result.length > 1) {
                str2 = result[1];
            }
            if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZIZ, false, 13).isSupported) {
                C108306Ske.LIZIZ("BytebenchV2", C0002O.m25086C("result: ", str));
                C108306Ske.LIZIZ("BytebenchV2", C0002O.m25086C("leftTask: ", str2));
                try {
                    if (this.LIZ != null && str != null) {
                        JSONObject jSONObject = new JSONObject(str);
                        jSONObject.put("sdk_version", "3.8.0-d_7");
                        C108868Sti.LIZ("bytebench_task", jSONObject);
                        if (C108894Su8.LIZ().LIZIZ.LIZLLL == CollectionSettings.REPORT_MODE.FAAS_API && !PatchProxy.proxy(new Object[]{jSONObject}, this, LIZIZ, false, 12).isSupported) {
                            C108911SuP.LIZ(new QXB(this, jSONObject), C108911SuP.LIZIZ);
                        }
                    }
                } catch (Exception e) {
                    C108874Sto.LIZ(e);
                }
                if (str2 != null) {
                    C5855799z.LIZ().LIZ(C108862Stc.LIZIZ().LIZIZ, "benchmark", str2);
                    if (this.f25581LJ == STATUS.QUITTING) {
                        this.f25581LJ = STATUS.LOAD;
                    }
                } else {
                    this.f25581LJ = STATUS.INVALID;
                    return 0;
                }
            }
        }
        return 0;
    }

    @Override // p003X.AbstractC107185SIh
    public final void LIZ() {
        Object create;
        Map<String, String> LIZ;
        if (PatchProxy.proxy(new Object[0], this, LIZIZ, false, 4).isSupported) {
            return;
        }
        if (this.f25581LJ != STATUS.INIT) {
            C108306Ske.LIZLLL("BytebenchV2", "load ByteBench: invaild status: " + this.f25581LJ);
            return;
        }
        this.LIZLLL = System.currentTimeMillis();
        this.f25581LJ = STATUS.LOADING;
        HashMap hashMap = new HashMap();
        if (!PatchProxy.proxy(new Object[]{hashMap}, null, C108870Stk.LIZ, true, 1).isSupported && C108870Stk.LIZIZ != null && (LIZ = C108870Stk.LIZIZ.LIZ()) != null) {
            hashMap.putAll(LIZ);
        }
        if (hashMap.isEmpty()) {
            hashMap.put("", "");
        }
        C103913Qvz LIZ2 = C103913Qvz.LIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{BytebenchAPI.class}, LIZ2, C103913Qvz.LIZ, false, 4);
        if (proxy.isSupported) {
            create = proxy.result;
        } else {
            create = LIZ2.LIZIZ.create(BytebenchAPI.class);
        }
        BytebenchAPI bytebenchAPI = (BytebenchAPI) create;
        HashMap hashMap2 = new HashMap(C103913Qvz.LIZ().LIZIZ());
        if (C108894Su8.LIZ().LIZIZ.LIZ) {
            hashMap2.put(C64859BiX.LIZIZ, "123123");
            hashMap2.put("task_group_id", String.valueOf(C108894Su8.LIZ().LIZIZ.LIZIZ));
        }
        Call<TypedInput> defaultBenchmark = bytebenchAPI.getDefaultBenchmark(hashMap, hashMap2);
        C108306Ske.LIZIZ("BytebenchV2", "load task url: " + defaultBenchmark.request().getUrl());
        defaultBenchmark.enqueue(this.LJFF);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        C108911SuP.LIZ(new CallableC108891Su5(this, str), C108911SuP.LIZIZ);
    }

    @Override // p003X.AbstractC107185SIh
    public final int LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (this.f25581LJ != STATUS.LOAD && this.f25581LJ != STATUS.STOP) {
            C108306Ske.LIZLLL("BytebenchV2", "startByteBench: invaild status: " + this.f25581LJ);
            return -4;
        }
        this.f25581LJ = STATUS.START;
        if (i == -1) {
            return -1;
        }
        C108911SuP.LIZ(new CallableC108887Su1(this, i), C108911SuP.LIZIZ);
        return 0;
    }

    @Override // p003X.AbstractC107185SIh
    public final int LIZ(CollectionSettings collectionSettings) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{collectionSettings}, this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!C108862Stc.LIZIZ().LIZ()) {
            return -105;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C108896SuA c108896SuA = C108894Su8.LIZ().LIZIZ;
        c108896SuA.LIZ = collectionSettings.LIZ;
        c108896SuA.LIZIZ = collectionSettings.LIZIZ;
        c108896SuA.LIZLLL = collectionSettings.LIZJ;
        c108896SuA.f12297LJ = collectionSettings.LIZLLL;
        if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 11).isSupported) {
            this.LIZ = new C108890Su4(this);
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 2);
        if (proxy2.isSupported) {
            i = ((Integer) proxy2.result).intValue();
        } else {
            if (!PatchProxy.proxy(new Object[0], this, LIZIZ, false, 3).isSupported) {
                C108896SuA c108896SuA2 = C108894Su8.LIZ().LIZIZ;
                new StringBuilder();
                c108896SuA2.LIZJ = C0002O.m25086C(C108862Stc.LIZIZ().LJIILIIL, "/bytebench_collection");
                this.LIZJ = C108888Su2.LIZ();
                this.LIZJ.LIZ(this.LIZ);
            }
            this.LIZ.LIZ(100, "bytebench init");
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost_time", currentTimeMillis2);
            C108868Sti.LIZ("bytebench_collection_init", jSONObject);
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            return i;
        }
    }

    public final void LIZ(final String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        if (str != null) {
            C5855799z.LIZ().LIZ(C108862Stc.LIZIZ().LIZIZ, "benchmark", str);
        } else {
            str = C5855799z.LIZ().LIZ(C108862Stc.LIZIZ().LIZIZ, "benchmark");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("status_code");
            if (optInt != 0) {
                C108306Ske.LIZLLL("BytebenchV2", "loadByteBenchProcess failed: " + optInt + "  " + jSONObject.optString("message"));
                this.LIZ.LIZ(103, -optInt, "loadBytebench with invalid status_code");
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONObject(C2521l.LJIIL).getJSONArray("resource_list");
            if (jSONArray == null) {
                LIZIZ(str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            Runnable runnable = new Runnable() { // from class: com.benchmark.collection.ByteBenchV2.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(9635);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    ByteBenchV2.this.LIZIZ(str);
                }
            };
            QXE qxe = new QXE(this);
            if (!PatchProxy.proxy(new Object[]{arrayList, runnable, qxe}, this, LIZIZ, false, 6).isSupported) {
                C108306Ske.LIZIZ("BytebenchV2", "checkTestResource called");
                C108911SuP.LIZ(new CallableC103914Qw0(this, arrayList), C108911SuP.LIZIZ).LIZ(new C108892Su6(this, runnable, qxe), C108911SuP.LIZJ);
            }
        } catch (Exception e) {
            this.LIZ.LIZ(103, -1, e.getMessage());
            C108874Sto.LIZ(e);
        }
    }
}
