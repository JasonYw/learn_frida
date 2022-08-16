package com.android.ttcjpaysdk.base;

import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class CJPayPageLoadTrace {
    public static ChangeQuickRedirect LIZ;
    public static volatile CJPayPageLoadTrace LJI;
    public String LIZJ;
    public long LIZLLL;
    public long LJFF;
    public Map<String, Long> LIZIZ = new HashMap();

    /* renamed from: LJ */
    public Map<String, Long> f25441LJ = new HashMap();

    static {
        Covode.recordClassIndex(5896);
    }

    /* loaded from: classes17.dex */
    public enum Page {
        INTEGRATED_COUNTER("聚合支付收银台"),
        BD_COUNTER("追光支付收银台"),
        EC_COUNTER("电商收银台"),
        RECHARGE("充值"),
        WITHDRAW("提现"),
        MY_CARD("我的银行卡"),
        NEW_CARD_PAY("新卡支付");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Page[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Page[]) proxy.result;
            }
            return (Page[]) values().clone();
        }

        static {
            Covode.recordClassIndex(5897);
        }

        public static Page valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Page) proxy.result;
            }
            return (Page) Enum.valueOf(Page.class, str);
        }

        Page(String str) {
            this.name = str;
        }
    }

    /* loaded from: classes17.dex */
    public enum Section {
        START("api调用", 0),
        NETWORK("网络请求", -1),
        PARSER("解析数据", -1),
        RENDERING("渲染", -1),
        END("完成", 1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int level;
        public String name;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Section[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Section[]) proxy.result;
            }
            return (Section[]) values().clone();
        }

        static {
            Covode.recordClassIndex(5898);
        }

        public static Section valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Section) proxy.result;
            }
            return (Section) Enum.valueOf(Section.class, str);
        }

        Section(String str, int i) {
            this.name = str;
            this.level = i;
        }
    }

    public static CJPayPageLoadTrace LIZ() {
        MethodCollector.m14708i(344);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            CJPayPageLoadTrace cJPayPageLoadTrace = (CJPayPageLoadTrace) proxy.result;
            MethodCollector.m14707o(344);
            return cJPayPageLoadTrace;
        }
        if (LJI == null) {
            synchronized (CJPayPageLoadTrace.class) {
                try {
                    if (LJI == null) {
                        LJI = new CJPayPageLoadTrace();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(344);
                    throw th;
                }
            }
        }
        CJPayPageLoadTrace cJPayPageLoadTrace2 = LJI;
        MethodCollector.m14707o(344);
        return cJPayPageLoadTrace2;
    }

    public final void LIZ(Page page, Section section) {
        if (PatchProxy.proxy(new Object[]{page, section}, this, LIZ, false, 2).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (section.level == 0) {
            this.LIZIZ.clear();
            this.LIZJ = null;
            this.LIZLLL = currentTimeMillis;
        }
        if (!this.LIZIZ.containsKey(section.name)) {
            if (this.LIZIZ.containsKey(this.LIZJ)) {
                LIZ(page.name, this.LIZJ, currentTimeMillis - this.LIZIZ.get(this.LIZJ).longValue());
            }
            if (section.level == 1) {
                LIZ(page.name, "总和", currentTimeMillis - this.LIZLLL);
            }
            this.LIZIZ.put(section.name, Long.valueOf(currentTimeMillis));
            this.LIZJ = section.name;
        }
    }

    private void LIZ(String str, String str2, long j) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ("", "");
            LIZ2.put("page_name", str);
            LIZ2.put("sub_section", str2);
            LIZ2.put("time", j);
            C2118a.LIZ().LIZ("wallet_rd_page_load_time", LIZ2);
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(Page page, Section section, String str) {
        if (PatchProxy.proxy(new Object[]{page, section, str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (section.level == 0) {
            this.f25441LJ.clear();
            this.LJFF = currentTimeMillis;
        }
        if (!this.f25441LJ.containsKey(section.name)) {
            if (section.level == 1 && this.LJFF != 0) {
                String str2 = page.name;
                long j = currentTimeMillis - this.LJFF;
                if (!PatchProxy.proxy(new Object[]{str2, "总和", str, new Long(j)}, this, LIZ, false, 7).isSupported) {
                    try {
                        JSONObject LIZ2 = CJPayParamsUtils.LIZ("", "");
                        LIZ2.put("page_name", str2);
                        LIZ2.put("sub_section", "总和");
                        LIZ2.put("time", j);
                        LIZ2.put("type", str);
                        C2118a.LIZ().LIZ("wallet_rd_bind_card_all_time", LIZ2);
                    } catch (Exception unused) {
                    }
                }
            }
            this.f25441LJ.put(section.name, Long.valueOf(currentTimeMillis));
        }
    }

    public final void LIZ(Page page, Section section, String str) {
        if (PatchProxy.proxy(new Object[]{page, section, str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (section.level == 0) {
            this.LIZIZ.clear();
            this.LIZJ = null;
            this.LIZLLL = currentTimeMillis;
        }
        if (!this.LIZIZ.containsKey(section.name)) {
            if (this.LIZIZ.containsKey(this.LIZJ)) {
                LIZ(page.name, this.LIZJ, currentTimeMillis - this.LIZIZ.get(this.LIZJ).longValue(), str);
            }
            if (section.level == 1) {
                LIZ(page.name, "总和", currentTimeMillis - this.LIZLLL, str);
            }
            this.LIZIZ.put(section.name, Long.valueOf(currentTimeMillis));
            this.LIZJ = section.name;
        }
    }

    private void LIZ(String str, String str2, long j, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, new Long(j), str3}, this, LIZ, false, 5).isSupported) {
            return;
        }
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ("", "");
            LIZ2.put("page_name", str);
            LIZ2.put("sub_section", str2);
            LIZ2.put("time", j);
            LIZ2.put("page_type", str3);
            C2118a.LIZ().LIZ("wallet_rd_page_load_time", LIZ2);
        } catch (Exception unused) {
        }
    }
}
