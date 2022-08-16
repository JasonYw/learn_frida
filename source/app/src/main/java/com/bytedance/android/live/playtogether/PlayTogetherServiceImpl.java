package com.bytedance.android.live.playtogether;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.api.INetworkService;
import com.bytedance.android.live.playtogether.api.AbstractC5188a;
import com.bytedance.android.live.playtogether.p409c.C5192a;
import com.bytedance.android.live.playtogether.p409c.C5194b;
import com.bytedance.android.live.playtogether.p409c.C5195c;
import com.bytedance.android.live.playtogether.p409c.C5197d;
import com.bytedance.android.live.playtogether.p409c.C5198e;
import com.bytedance.android.live.playtogether.p409c.C5200f;
import com.bytedance.android.live.playtogether.p409c.C5201g;
import com.bytedance.android.live.playtogether.p409c.C5204h;
import com.bytedance.android.live.playtogether.p409c.C5206i;
import com.bytedance.android.live.playtogether.p409c.C5208j;
import com.bytedance.android.live.playtogether.p409c.C5210k;
import com.bytedance.android.live.playtogether.p409c.C5213m;
import com.bytedance.android.live.playtogether.p409c.C5214n;
import com.bytedance.android.live.playtogether.p409c.C5215o;
import com.bytedance.android.live.playtogether.p409c.C5216p;
import com.bytedance.android.live.playtogether.p409c.C5217q;
import com.bytedance.android.live.playtogether.p409c.C5218s;
import com.bytedance.android.live.playtogether.p409c.C5222t;
import com.bytedance.android.live.playtogether.p409c.C5225u;
import com.bytedance.android.live.playtogether.p409c.C5227v;
import com.bytedance.android.live.playtogether.p409c.C5228w;
import com.bytedance.android.live.playtogether.p409c.C5229x;
import com.bytedance.android.live.playtogether.p409c.C5231y;
import com.bytedance.android.live.playtogether.widget.PlayTogetherWidget;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.tools.p859a.p860a.AbstractC10531b;
import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC426192th;
import p003X.AbstractC88815Kz3;
import p003X.AbstractC89645LTr;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C375950ur;
import p003X.C409882Kg;
import p003X.C78603Gyj;
import p003X.C89605LSd;
import p003X.C89606LSe;
import p003X.C89607LSf;
import p003X.C89608LSg;
import p003X.C89618LSq;
import p003X.C89619LSr;
import p003X.C89621LSt;
import p003X.C89622LSu;
import p003X.C89628LTa;
import p003X.C89629LTb;
import p003X.C89630LTc;
import p003X.C89631LTd;
import p003X.C89632LTe;
import p003X.C89633LTf;
import p003X.C89634LTg;
import p003X.C89635LTh;
import p003X.C89636LTi;
import p003X.C89637LTj;
import p003X.C89638LTk;
import p003X.C89639LTl;
import p003X.C89640LTm;
import p003X.C89642LTo;
import p003X.C89643LTp;
import p003X.C89644LTq;
import p003X.C89646LTs;
import p003X.C89647LTt;
import p003X.C89648LTu;
import p003X.C89665LUl;
import p003X.LSR;
import p003X.LT3;
import p003X.LTG;
import p003X.LTI;
import p003X.LTJ;
import p003X.LTK;
import p003X.LTT;
import p003X.LTU;
import p003X.LTV;
import p003X.LTW;
import p003X.LTX;
import p003X.LTY;
import p003X.LTZ;
import p003X.LUJ;

/* loaded from: classes5.dex */
public final class PlayTogetherServiceImpl implements AbstractC5188a {
    public static final C89643LTp Companion;
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(32837);
        Companion = new C89643LTp((byte) 0);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(32837);
        Companion = new C89643LTp((byte) 0);
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final Class<? extends Widget> getWidget() {
        return PlayTogetherWidget.class;
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final AbstractC88815Kz3 genPlayTogetherFloatWindowPanel() {
        Object obj;
        C2WD<Object> LLLIIIIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (AbstractC88815Kz3) proxy.result;
        }
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ != null && (LLLIIIIL = LIZ.LLLIIIIL()) != null) {
            obj = LLLIIIIL.LIZ();
        } else {
            obj = null;
        }
        if (!(obj instanceof AbstractC89645LTr)) {
            obj = null;
        }
        AbstractC89645LTr abstractC89645LTr = (AbstractC89645LTr) obj;
        ALogger.m15797i("Together#PlayTogetherServiceImpl", "genPlayTogetherFloatWindowPanel, floatWindowContainerGetter not null " + (abstractC89645LTr instanceof AbstractC89645LTr));
        if (abstractC89645LTr == null) {
            return null;
        }
        return abstractC89645LTr.LIZ();
    }

    public PlayTogetherServiceImpl() {
        ServiceManager.registerService(AbstractC5188a.class, this);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!PatchProxy.proxy(new Object[]{linkedHashMap}, null, C89646LTs.LIZ, true, 1).isSupported && !PatchProxy.proxy(new Object[]{linkedHashMap}, new C89642LTo(), C89642LTo.LIZ, false, 1).isSupported) {
            linkedHashMap.put(C5214n.class, new LTT());
            linkedHashMap.put(C5216p.class, new LTU());
            linkedHashMap.put(C5215o.class, new LTW());
            linkedHashMap.put(C5213m.class, new C89665LUl());
            linkedHashMap.put(C5217q.class, new C89619LSr());
            linkedHashMap.put(C5225u.class, new C89636LTi());
            linkedHashMap.put(C5225u.C5226a.class, new C89644LTq());
            linkedHashMap.put(C5201g.class, new C89632LTe());
            linkedHashMap.put(C5201g.C5203b.class, new C89647LTt());
            linkedHashMap.put(C5201g.C5202a.class, new C89648LTu());
            linkedHashMap.put(C5218s.class, new C89608LSg());
            linkedHashMap.put(C5218s.C5221c.class, new C89607LSf());
            linkedHashMap.put(C5218s.C5220b.class, new C89606LSe());
            linkedHashMap.put(C5218s.C5219a.class, new C89605LSd());
            linkedHashMap.put(C5204h.class, new C89621LSt());
            linkedHashMap.put(C5204h.C5205a.class, new C89618LSq());
            linkedHashMap.put(C5229x.class, new LT3());
            linkedHashMap.put(C5229x.C5230a.class, new C89622LSu());
            linkedHashMap.put(C5222t.class, new C89635LTh());
            linkedHashMap.put(C5222t.C5224b.class, new AbstractC10531b<C5222t.C5224b>() { // from class: X.3Xs
                public static ChangeQuickRedirect LIZ;

                static {
                    if (ReDexClinitStringAb.abTest >= 5) {
                        Covode.recordClassIndex(32889);
                    } else {
                        Covode.recordClassIndex(32889);
                    }
                }

                /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.playtogether.c.t$b] */
                /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.playtogether.c.t$b] */
                @Override // com.bytedance.android.tools.p859a.p860a.AbstractC10531b
                /* renamed from: decode */
                public final /* synthetic */ C5222t.C5224b mo25795decode(C10532g c10532g) {
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c10532g}, this, LIZ, false, 2);
                    if (proxy.isSupported) {
                        return proxy.result;
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c10532g}, null, LIZ, true, 1);
                    if (proxy2.isSupported) {
                        return proxy2.result;
                    }
                    C5222t.C5224b c5224b = new C5222t.C5224b();
                    long LIZ2 = c10532g.LIZ();
                    while (true) {
                        int LIZIZ = c10532g.LIZIZ();
                        if (LIZIZ != -1) {
                            if (LIZIZ != 1) {
                                if (LIZIZ != 2) {
                                    QV1.LJII(c10532g);
                                } else {
                                    c5224b.LIZIZ = QV1.LIZIZ(c10532g);
                                }
                            } else {
                                c5224b.LIZ = _User_ProtoDecoder.decodeStatic(c10532g);
                            }
                        } else {
                            c10532g.LIZ(LIZ2);
                            return c5224b;
                        }
                    }
                }
            });
            linkedHashMap.put(C5222t.C5223a.class, new LUJ());
            linkedHashMap.put(C5200f.class, new LTY());
            linkedHashMap.put(C5194b.class, new C89639LTl());
            linkedHashMap.put(C5227v.class, new C78603Gyj());
            linkedHashMap.put(C5228w.class, new LSR());
            linkedHashMap.put(C5231y.class, new C89637LTj());
            linkedHashMap.put(C5231y.C5232a.class, new C89638LTk());
            linkedHashMap.put(C5197d.class, new C89628LTa());
            linkedHashMap.put(C5198e.class, new C89631LTd());
            linkedHashMap.put(C5198e.C5199a.class, new C89630LTc());
            linkedHashMap.put(C5208j.class, new LTK());
            linkedHashMap.put(C5208j.C5209a.class, new LTI());
            linkedHashMap.put(C5206i.class, new C89634LTg());
            linkedHashMap.put(C5206i.C5207a.class, new C89633LTf());
            linkedHashMap.put(C5192a.class, new LTZ());
            linkedHashMap.put(C5192a.C5193a.class, new LTV());
            linkedHashMap.put(C5195c.class, new LTJ());
            linkedHashMap.put(C5195c.C5196a.class, new LTG());
            linkedHashMap.put(C5210k.class, new C89629LTb());
            linkedHashMap.put(C5210k.C5211a.class, new LTX());
        }
        ((INetworkService) ServiceManager.getService(INetworkService.class)).injectProtoDecoders(linkedHashMap);
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final boolean openDownloadSchema(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(context, str);
        return ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(context, str);
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final void reportEvent(String str, Map<String, String> map) {
        AbstractC426192th<Object> LLLII;
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, map);
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ != null && (LLLII = LIZ.LLLII()) != null) {
            LLLII.LIZ(new C375950ur(str, map));
        }
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final void techEvent(String str, Map<String, String> map) {
        AbstractC426192th<Object> LLLII;
        if (PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, map);
        C5923dp LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ != null && (LLLII = LIZ.LLLII()) != null) {
            LLLII.LIZ(new C89640LTm(str, map));
        }
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final boolean isInstalled(Context context, String str) {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(context, str);
        if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() == 0) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 1) != null) {
                z = true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            ALogger.m15801d("Together#PlayTogetherServiceImpl", "PackageName " + str + " is not installed");
        }
        ALogger.m15797i("Together#PlayTogetherServiceImpl", "isInstall, " + str + " => " + z);
        return z;
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final boolean launchGame(Context context, String str) {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(context, str);
        try {
            ALogger.m15797i("Together#PlayTogetherServiceImpl", "launch Game: " + str);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            C116971W2r.LIZ(context, intent);
            z = true;
            return true;
        } catch (Throwable th) {
            ALogger.m15800e("Together#PlayTogetherServiceImpl", "err: " + th);
            return z;
        }
    }

    @Override // com.bytedance.android.live.playtogether.api.AbstractC5188a
    public final void openPlayTogetherPanel(Context context, Long l) {
        String str;
        AbstractC426192th<Long> LLLI;
        long j;
        C2WC<Room> LIZ;
        Room LIZ2;
        if (PatchProxy.proxy(new Object[]{context, l}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        StringBuilder sb = new StringBuilder("openPlayTogetherPanel, roomIdStr=");
        if (LIZ3 != null && (LIZ = LIZ3.LIZ()) != null && (LIZ2 = LIZ.LIZ()) != null) {
            str = LIZ2.getIdStr();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append("，play_id: ");
        sb.append(l);
        ALogger.m15797i("Together#PlayTogetherServiceImpl", sb.toString());
        if (LIZ3 != null && (LLLI = LIZ3.LLLI()) != null) {
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            LLLI.LIZ(Long.valueOf(j));
        }
    }
}
