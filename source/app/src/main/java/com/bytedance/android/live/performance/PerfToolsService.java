package com.bytedance.android.live.performance;

import android.app.Activity;
import android.app.Dialog;
import android.text.TextUtils;
import android.view.WindowManager;
import com.bytedance.android.live.performance.api.IPerfToolsService;
import com.bytedance.android.live.performance.p404b.C5179a;
import com.bytedance.android.live.performance.p405c.a$a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C129386aay;
import p003X.C129387aaz;
import p003X.C138615d0N;
import p003X.C138617d0P;
import p003X.C138625d0X;
import p003X.LK5;

/* loaded from: classes17.dex */
public class PerfToolsService implements IPerfToolsService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public C138615d0N mPresenter = new C138615d0N();

    static {
        Covode.recordClassIndex(32757);
    }

    public PerfToolsService() {
        ServiceManager.registerService(IPerfToolsService.class, this);
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public int getCurrentEntrance() {
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N == null) {
            return -1;
        }
        return c138615d0N.LJIIJJI;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public int getCurrentPerformanceType() {
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N == null) {
            return -1;
        }
        return c138615d0N.LJIIL;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public boolean isContentVisible() {
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N != null && c138615d0N.f18364LJ) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void clearData() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && !PatchProxy.proxy(new Object[0], null, C138617d0P.LIZ, true, 6).isSupported) {
            C138617d0P.LIZJ.clear();
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void dismiss() {
        C138615d0N c138615d0N;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16).isSupported && (c138615d0N = this.mPresenter) != null && !PatchProxy.proxy(new Object[0], c138615d0N, C138615d0N.LIZ, false, 12).isSupported) {
            c138615d0N.LIZJ();
            c138615d0N.LIZIZ();
            c138615d0N.LJIIJ = null;
            c138615d0N.LJIIIIZZ = null;
            c138615d0N.LIZIZ = null;
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public boolean isNormalViewVisible() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N == null || !c138615d0N.m21647LJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public boolean isPerformanceViewVisible() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N == null || !c138615d0N.LIZLLL()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void clearSceneInfo() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15).isSupported && !PatchProxy.proxy(new Object[0], null, C138617d0P.LIZ, true, 18).isSupported) {
            for (String str : C138617d0P.LIZJ.keySet()) {
                a$a a_a = C138617d0P.LIZJ.get(str);
                if (a_a != null && a_a.LIZLLL == 1) {
                    if (a_a.LIZIZ != null) {
                        a_a.LIZIZ.clear();
                    }
                    C138617d0P.LIZJ.remove(str);
                    C138617d0P.LIZ(str, false);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void verifyEntranceNormalData() {
        C138615d0N c138615d0N;
        List arrayList;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported && C138625d0X.LIZ() && (c138615d0N = this.mPresenter) != null) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c138615d0N, C138615d0N.LIZ, false, 7);
            if (proxy.isSupported) {
                arrayList = (List) proxy.result;
            } else {
                arrayList = new ArrayList();
                if (c138615d0N.LJIIJJI == 4) {
                    if (c138615d0N.LJII != null && c138615d0N.LIZLLL()) {
                        arrayList.addAll(c138615d0N.LJII.LIZIZ);
                    }
                } else if (c138615d0N.LJI != null && c138615d0N.m21647LJ()) {
                    arrayList.addAll(c138615d0N.LJI.LIZIZ);
                }
            }
            C138617d0P.LIZ(this.mPresenter.LJIIJJI, arrayList);
            C138615d0N c138615d0N2 = this.mPresenter;
            if (!PatchProxy.proxy(new Object[]{arrayList}, c138615d0N2, C138615d0N.LIZ, false, 6).isSupported) {
                if (c138615d0N2.LJIIJJI == 4) {
                    if (c138615d0N2.LJII != null && c138615d0N2.LIZLLL()) {
                        C129386aay c129386aay = c138615d0N2.LJII;
                        if (!PatchProxy.proxy(new Object[]{arrayList}, c129386aay, C129386aay.LIZ, false, 3).isSupported && arrayList != null) {
                            c129386aay.LIZIZ.clear();
                            c129386aay.LIZIZ.addAll(arrayList);
                            c129386aay.notifyDataSetChanged();
                        }
                    }
                } else if (c138615d0N2.LJI != null && c138615d0N2.m21647LJ()) {
                    C129387aaz c129387aaz = c138615d0N2.LJI;
                    if (!PatchProxy.proxy(new Object[]{arrayList}, c129387aaz, C129387aaz.LIZ, false, 2).isSupported && arrayList != null) {
                        c129387aaz.LIZIZ.clear();
                        c129387aaz.LIZIZ.addAll(arrayList);
                        c129387aaz.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public List<C5179a> getDataForEntrance(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return C138617d0P.LIZ(i);
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public String getNormalInfo(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C138617d0P.LIZJ(str);
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void updatePerformanceChart(double d) {
        C138615d0N c138615d0N;
        if (PatchProxy.proxy(new Object[]{Double.valueOf(d)}, this, changeQuickRedirect, false, 7).isSupported || (c138615d0N = this.mPresenter) == null) {
            return;
        }
        c138615d0N.LIZ(d);
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public String getPerformanceChartTitle(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C138617d0P.LIZIZ(i).get("data_performance_title");
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void initAndShowDebugTool(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        if (this.mPresenter == null) {
            this.mPresenter = new C138615d0N();
        }
        if (!z) {
            dismiss();
        } else if (!this.mPresenter.LJFF && !this.mPresenter.f18364LJ) {
            this.mPresenter.LIZ();
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public List<Double> getDataForPerformanceEntrance(int i) {
        a$a a_a;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, C138617d0P.LIZ, true, 3);
        if (proxy2.isSupported) {
            return (List) proxy2.result;
        }
        String str = C138617d0P.LIZIZ(i).get("data_performance_type");
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{str}, null, C138617d0P.LIZ, true, 24);
        if (proxy3.isSupported) {
            return (List) proxy3.result;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str) && C138617d0P.LIZJ.containsKey(str) && (a_a = C138617d0P.LIZJ.get(str)) != null && a_a.LIZLLL == 2) {
            arrayList.addAll(a_a.LIZJ);
        }
        return arrayList;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void removeSceneInfo(String str) {
        a$a a_a;
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14).isSupported && !PatchProxy.proxy(new Object[]{str}, null, C138617d0P.LIZ, true, 17).isSupported && !TextUtils.isEmpty(str) && C138617d0P.LIZJ.containsKey(str) && (a_a = C138617d0P.LIZJ.get(str)) != null && a_a.LIZLLL == 1) {
            C138617d0P.LIZJ.remove(str);
            C138617d0P.LIZ(str, false);
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public IPerfToolsService setActivity(Activity activity) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (IPerfToolsService) proxy.result;
        }
        C138615d0N c138615d0N = this.mPresenter;
        if (c138615d0N == null) {
            return this;
        }
        if (!PatchProxy.proxy(new Object[]{activity}, c138615d0N, C138615d0N.LIZ, false, 11).isSupported) {
            c138615d0N.LJIIJ = activity;
            if (c138615d0N.LJIIJ != null) {
                c138615d0N.LIZIZ = (WindowManager) c138615d0N.LJIIJ.getApplicationContext().getSystemService("window");
            }
        }
        return this;
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void updateNormalInfo(final C5179a c5179a) {
        C138615d0N c138615d0N;
        boolean LIZ;
        final C138615d0N c138615d0N2;
        if (!PatchProxy.proxy(new Object[]{c5179a}, this, changeQuickRedirect, false, 6).isSupported && c5179a != null && !TextUtils.isEmpty(c5179a.LIZIZ) && (c138615d0N = this.mPresenter) != null && c138615d0N.LJI != null && this.mPresenter.m21647LJ()) {
            String str = c5179a.LIZ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, C138617d0P.LIZ, true, 21);
            if (proxy.isSupported) {
                LIZ = ((Boolean) proxy.result).booleanValue();
            } else if (TextUtils.isEmpty(str) || C138617d0P.LIZIZ == null) {
                return;
            } else {
                int currentEntrance = C138617d0P.LIZIZ.getCurrentEntrance();
                if (currentEntrance == 1) {
                    if (C138617d0P.LIZ()) {
                        currentEntrance = 9;
                    } else {
                        currentEntrance = 10;
                    }
                } else if (currentEntrance == 2) {
                    LIZ = C138617d0P.LIZ(str);
                }
                List<String> list = C138617d0P.LIZLLL.get(Integer.valueOf(currentEntrance));
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (String str2 : list) {
                    if (str2.equals(str)) {
                        c138615d0N2 = this.mPresenter;
                        if (PatchProxy.proxy(new Object[]{c5179a}, c138615d0N2, C138615d0N.LIZ, false, 9).isSupported && c138615d0N2.LJI != null && c138615d0N2.m21647LJ()) {
                            if (!C138625d0X.LIZ()) {
                                c138615d0N2.LJIILIIL.post(new Runnable(c138615d0N2, c5179a) { // from class: X.d0U
                                    public static ChangeQuickRedirect LIZ;
                                    public final C138615d0N LIZIZ;
                                    public final C5179a LIZJ;

                                    static {
                                        Covode.recordClassIndex(32782);
                                    }

                                    {
                                        this.LIZIZ = c138615d0N2;
                                        this.LIZJ = c5179a;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                            return;
                                        }
                                        C138615d0N c138615d0N3 = this.LIZIZ;
                                        C5179a c5179a2 = this.LIZJ;
                                        if (PatchProxy.proxy(new Object[]{c5179a2}, c138615d0N3, C138615d0N.LIZ, false, 17).isSupported) {
                                            return;
                                        }
                                        c138615d0N3.LJI.LIZ(c5179a2);
                                    }
                                });
                                return;
                            } else {
                                c138615d0N2.LJI.LIZ(c5179a);
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            }
            if (!LIZ) {
                return;
            }
            c138615d0N2 = this.mPresenter;
            if (PatchProxy.proxy(new Object[]{c5179a}, c138615d0N2, C138615d0N.LIZ, false, 9).isSupported) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void setDialog(Dialog dialog, boolean z) {
        C138615d0N c138615d0N;
        if (!PatchProxy.proxy(new Object[]{dialog, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported && (c138615d0N = this.mPresenter) != null && !PatchProxy.proxy(new Object[]{dialog, Byte.valueOf((byte) z)}, c138615d0N, C138615d0N.LIZ, false, 8).isSupported) {
            c138615d0N.LJIIIIZZ = dialog;
            c138615d0N.LJIIIZ = z;
            if (c138615d0N.LJFF) {
                c138615d0N.LIZLLL.setDialog(dialog);
            } else if (c138615d0N.f18364LJ) {
                c138615d0N.LIZJ.setDialog(dialog);
            }
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void setData(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 11).isSupported && !PatchProxy.proxy(new Object[]{str, str2}, null, C138617d0P.LIZ, true, 4).isSupported && !TextUtils.isEmpty(str) && str2 != null && C138617d0P.LIZIZ != null) {
            String trim = str2.trim();
            a$a a_a = new a$a();
            a_a.LIZ = trim;
            a_a.LIZLLL = 0;
            C138617d0P.LIZJ.put(str, a_a);
            if (C138617d0P.LIZIZ.isContentVisible()) {
                int currentEntrance = C138617d0P.LIZIZ.getCurrentEntrance();
                if (currentEntrance == 1) {
                    if (C138617d0P.LIZ()) {
                        currentEntrance = 9;
                    } else {
                        currentEntrance = 10;
                    }
                }
                List<String> list = C138617d0P.LIZLLL.get(Integer.valueOf(currentEntrance));
                if (list != null && !list.isEmpty() && list.contains(str)) {
                    if (currentEntrance == 2 && !C138617d0P.LIZ(str)) {
                        return;
                    }
                    C138617d0P.LIZIZ.updateNormalInfo(new C5179a(str, C138617d0P.LIZIZ(str), trim));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void setSceneInfo(String str, Map<String, String> map) {
        String str2;
        if (!PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 13).isSupported && !PatchProxy.proxy(new Object[]{str, map}, null, C138617d0P.LIZ, true, 16).isSupported && !TextUtils.isEmpty(str) && map != null && C138617d0P.LIZIZ != null) {
            a$a a_a = new a$a();
            a_a.LIZIZ = new HashMap<>();
            a_a.LIZIZ.putAll(map);
            a_a.LIZLLL = 1;
            C138617d0P.LIZJ.put(str, a_a);
            C138617d0P.LIZ(str, true);
            if ("link_mic".equals(str) && map.containsKey("stream_mix_on_client")) {
                String str3 = map.get("stream_mix_on_client");
                if (str3 != null && str3.equals("1")) {
                    str2 = "mixOnClient";
                } else {
                    str2 = "mixOnServer";
                }
                C138617d0P.LIZIZ.updateNormalInfo(new C5179a("data_mix_type", LK5.LIZ(2131586826), str2));
                a$a a_a2 = new a$a();
                a_a2.LIZLLL = 0;
                a_a2.LIZ = str2;
                C138617d0P.LIZJ.put("data_mix_type", a_a2);
            }
            List<String> list = C138617d0P.LIZLLL.get(Integer.valueOf(C138617d0P.m21646LJ(str)));
            if (list != null && !list.isEmpty()) {
                for (String str4 : list) {
                    C138617d0P.LIZIZ.updateNormalInfo(new C5179a(str4, C138617d0P.LIZIZ(str4), C138617d0P.LIZJ(str4)));
                }
            }
        }
    }

    @Override // com.bytedance.android.live.performance.api.IPerfToolsService
    public void addPerformanceData(String str, double d) {
        if (!PatchProxy.proxy(new Object[]{str, Double.valueOf(d)}, this, changeQuickRedirect, false, 12).isSupported && !PatchProxy.proxy(new Object[]{str, Double.valueOf(d)}, null, C138617d0P.LIZ, true, 23).isSupported && !TextUtils.isEmpty(str) && C138617d0P.LIZIZ != null) {
            if (!C138617d0P.LIZIZ.isPerformanceViewVisible() && C138617d0P.LIZIZ.isNormalViewVisible()) {
                if (C138617d0P.LIZLLL("gift_effect")) {
                    String LIZ = C138617d0P.LIZ("gift_effect", str);
                    switch (str.hashCode()) {
                        case -1304311193:
                            if (str.equals("data_avg_fps")) {
                                IPerfToolsService iPerfToolsService = C138617d0P.LIZIZ;
                                String LIZ2 = LK5.LIZ(2131586807);
                                StringBuilder sb = new StringBuilder();
                                sb.append(d);
                                iPerfToolsService.updateNormalInfo(new C5179a(LIZ, LIZ2, sb.toString()));
                                a$a a_a = C138617d0P.LIZJ.get(LIZ);
                                if (a_a == null) {
                                    a_a = new a$a();
                                    a_a.LIZLLL = 0;
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(d);
                                a_a.LIZ = sb2.toString();
                                C138617d0P.LIZJ.put(LIZ, a_a);
                                break;
                            }
                            break;
                        case -947329893:
                            if (str.equals("data_cpu_speed")) {
                                IPerfToolsService iPerfToolsService2 = C138617d0P.LIZIZ;
                                String LIZ3 = LK5.LIZ(2131586796);
                                iPerfToolsService2.updateNormalInfo(new C5179a(LIZ, LIZ3, d + NotifyType.SOUND));
                                a$a a_a2 = C138617d0P.LIZJ.get(LIZ);
                                if (a_a2 == null) {
                                    a_a2 = new a$a();
                                    a_a2.LIZLLL = 0;
                                }
                                a_a2.LIZ = d + NotifyType.SOUND;
                                C138617d0P.LIZJ.put(LIZ, a_a2);
                                break;
                            }
                            break;
                        case -816061345:
                            if (str.equals("data_temperature")) {
                                IPerfToolsService iPerfToolsService3 = C138617d0P.LIZIZ;
                                String LIZ4 = LK5.LIZ(2131586787);
                                iPerfToolsService3.updateNormalInfo(new C5179a(LIZ, LIZ4, d + LK5.LIZ(2131586790)));
                                a$a a_a3 = C138617d0P.LIZJ.get(LIZ);
                                if (a_a3 == null) {
                                    a_a3 = new a$a();
                                    a_a3.LIZLLL = 0;
                                }
                                a_a3.LIZ = d + LK5.LIZ(2131586790);
                                C138617d0P.LIZJ.put(LIZ, a_a3);
                                break;
                            }
                            break;
                        case 1077775884:
                            if (str.equals("data_cpu_rate")) {
                                IPerfToolsService iPerfToolsService4 = C138617d0P.LIZIZ;
                                String LIZ5 = LK5.LIZ(2131586794);
                                StringBuilder sb3 = new StringBuilder();
                                double d2 = 100.0d * d;
                                sb3.append(d2);
                                sb3.append("%");
                                iPerfToolsService4.updateNormalInfo(new C5179a(LIZ, LIZ5, sb3.toString()));
                                a$a a_a4 = C138617d0P.LIZJ.get(LIZ);
                                if (a_a4 == null) {
                                    a_a4 = new a$a();
                                    a_a4.LIZLLL = 0;
                                }
                                a_a4.LIZ = d2 + "%";
                                C138617d0P.LIZJ.put(LIZ, a_a4);
                                break;
                            }
                            break;
                    }
                }
                if (C138617d0P.LIZLLL("ktv")) {
                    String LIZ6 = C138617d0P.LIZ("ktv", str);
                    if ("data_http_rtt".equals(str)) {
                        IPerfToolsService iPerfToolsService5 = C138617d0P.LIZIZ;
                        String LIZ7 = LK5.LIZ(2131586813);
                        iPerfToolsService5.updateNormalInfo(new C5179a(LIZ6, LIZ7, d + "ms"));
                        a$a a_a5 = C138617d0P.LIZJ.get(LIZ6);
                        if (a_a5 == null) {
                            a_a5 = new a$a();
                            a_a5.LIZLLL = 0;
                        }
                        a_a5.LIZ = d + "ms";
                        C138617d0P.LIZJ.put(LIZ6, a_a5);
                    }
                }
            }
            if (!C138617d0P.LIZJ.containsKey(str)) {
                a$a a_a6 = new a$a();
                a_a6.LIZJ = new ArrayList();
                a_a6.LIZJ.add(Double.valueOf(d));
                a_a6.LIZLLL = 2;
            } else {
                a$a a_a7 = C138617d0P.LIZJ.get(str);
                if (a_a7 != null && a_a7.LIZLLL == 2) {
                    if (a_a7.LIZJ == null) {
                        a_a7.LIZJ = new ArrayList();
                    }
                    a_a7.LIZJ.add(Double.valueOf(d));
                } else {
                    a$a a_a8 = new a$a();
                    a_a8.LIZJ = new ArrayList();
                    a_a8.LIZJ.add(Double.valueOf(d));
                    a_a8.LIZLLL = 2;
                }
            }
            if (C138617d0P.LIZIZ != null && C138617d0P.LIZIZ.isPerformanceViewVisible()) {
                String str2 = C138617d0P.LIZIZ(C138617d0P.LIZIZ.getCurrentPerformanceType()).get("data_performance_type");
                if (str2 == null || str2.equals(str)) {
                    C138617d0P.LIZIZ.updatePerformanceChart(d);
                }
            }
        }
    }
}
