package com.bytedance.android.live.broadcastgame.opengame.sonicgame;

import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.panel.PanelType;
import com.bytedance.android.live.broadcastgame.opengame.runtime.LaunchMode;
import com.bytedance.android.live.broadcastgame.opengame.service.CommercialService;
import com.bytedance.android.live.broadcastgame.opengame.service.OpenPlatformMonitorService;
import com.bytedance.android.live.broadcastgame.opengame.service.ScreenshotsAuditService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin;
import com.bytedance.bdp.live.livecontainer.base.schema.LiveSchemaInfo;
import com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11524d;
import com.bytedance.bdp.live.livecontainer.sonicgame.C11526j;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC87959KlF;
import p003X.AbstractC87969KlP;
import p003X.C106862S5w;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class SonicGamePlugin$initSonicContext$2 extends Lambda implements Function1<AbstractC3609d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SonicGamePlugin this$0;

    static {
        Covode.recordClassIndex(21108);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SonicGamePlugin$initSonicContext$2(SonicGamePlugin sonicGamePlugin) {
        super(1);
        this.this$0 = sonicGamePlugin;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC3609d abstractC3609d) {
        MethodCollector.m14708i(1471);
        AbstractC3609d abstractC3609d2 = abstractC3609d;
        boolean z = true;
        if (!PatchProxy.proxy(new Object[]{abstractC3609d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC3609d2);
            ViewGroup LIZJ = abstractC3609d2.LIZJ();
            if (LIZJ != null) {
                LIZJ.removeAllViews();
            }
            ((CommercialService) this.this$0.LJIIIZ.LIZ((Class<AbstractC3719c>) CommercialService.class)).LIZ(PanelType.PANEL_TYPE_X_SCREEN);
            abstractC3609d2.LIZ(PanelType.PANEL_TYPE_X_SCREEN);
            if (LIZJ == null) {
                Function1<? super String, Unit> function1 = this.this$0.onLoadFail;
                if (function1 != null) {
                    function1.invoke("Couldn't find Panel Content View");
                }
            } else {
                Window LIZLLL = abstractC3609d2.LIZLLL();
                if (LIZLLL == null) {
                    Function1<? super String, Unit> function12 = this.this$0.onLoadFail;
                    if (function12 != null) {
                        function12.invoke("Panel Window Must Not Null");
                    }
                } else {
                    C11526j c11526j = new C11526j(LIZJ, LIZLLL, false, false, 12);
                    c11526j.LIZIZ = this.this$0.LJIIIZ.LIZLLL;
                    Map<String, Object> map = c11526j.LIZ;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("anchor", this.this$0.LJIIIZ.LJIIJ);
                    jSONObject.put("startMode", this.this$0.getStartMode());
                    map.put("key_ext_config_json", jSONObject);
                    if (this.this$0.launchMode == LaunchMode.FROM_PANEL) {
                        z = false;
                    }
                    c11526j.LJI = z;
                    LiveSchemaInfo LIZ = LiveSchemaInfo.LJII.LIZ(this.this$0.LIZJ);
                    if (LIZ == null) {
                        Function1<? super String, Unit> function13 = this.this$0.onLoadFail;
                        if (function13 != null) {
                            function13.invoke("Schema Parse Error");
                        }
                    } else {
                        SonicGamePlugin.LIZ(this.this$0, SonicGamePlugin.SonicState.DESTROY, false, 2, null);
                        AbstractC87959KlF<C11526j, AbstractC11524d> LIZIZ = this.this$0.LIZIZ();
                        if (LIZIZ != null) {
                            LIZIZ.LIZ(LIZ, c11526j, new C37221(abstractC3609d2));
                        }
                    }
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1471);
        return unit;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.sonicgame.SonicGamePlugin$initSonicContext$2$1 */
    /* loaded from: classes5.dex */
    public static final class C37221 implements AbstractC11524d {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ AbstractC3609d LIZJ;

        static {
            Covode.recordClassIndex(21109);
        }

        @Override // com.bytedance.bdp.live.livecontainer.base.AbstractC11513e
        public final void LIZ(String str) {
        }

        @Override // com.bytedance.bdp.live.livecontainer.base.AbstractC11513e
        public final void LIZ(String str, int i) {
        }

        @Override // com.bytedance.bdp.live.livecontainer.sonicgame.AbstractC11524d
        public final void LIZ(JSONObject jSONObject) {
            if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C106862S5w.LIZ(jSONObject);
        }

        public C37221(AbstractC3609d abstractC3609d) {
            this.LIZJ = abstractC3609d;
        }

        @Override // com.bytedance.bdp.live.livecontainer.base.AbstractC11513e
        public final void LIZ(String str, String str2) {
            if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 3).isSupported) {
                return;
            }
            ((OpenPlatformMonitorService) SonicGamePlugin$initSonicContext$2.this.this$0.LJIIIZ.LIZ((Class<AbstractC3719c>) OpenPlatformMonitorService.class)).LIZIZ(1, 1, str2);
            Function1<? super String, Unit> function1 = SonicGamePlugin$initSonicContext$2.this.this$0.onLoadFail;
            if (function1 != null) {
                function1.invoke(C0002O.m25084C("Sonic Game Load Fail: ", str, ", ", str2));
            }
        }

        @Override // com.bytedance.bdp.live.livecontainer.base.AbstractC11513e
        public final void LIZ(String str, AbstractC87969KlP abstractC87969KlP) {
            if (PatchProxy.proxy(new Object[]{str, abstractC87969KlP}, this, LIZ, false, 2).isSupported) {
                return;
            }
            C106862S5w.LIZ(abstractC87969KlP);
            OpenPlatformMonitorService.LIZJ((OpenPlatformMonitorService) SonicGamePlugin$initSonicContext$2.this.this$0.LJIIIZ.LIZ((Class<AbstractC3719c>) OpenPlatformMonitorService.class), 0, null, null, 6, null);
            Function0<Unit> function0 = SonicGamePlugin$initSonicContext$2.this.this$0.onLoadSuccess;
            if (function0 != null) {
                function0.mo30099invoke();
            }
            LK1.LIZ(0L, false, false, new SonicGamePlugin$initSonicContext$2$1$onLoadSuccess$1(this), 7, null);
            SonicGamePlugin$initSonicContext$2.this.this$0.LIZLLL = null;
            SonicGamePlugin$initSonicContext$2.this.this$0.LIZIZ = abstractC87969KlP;
            SonicGamePlugin.LIZ(SonicGamePlugin$initSonicContext$2.this.this$0, SonicGamePlugin.SonicState.RESUME, false, 2, null);
            SonicGamePlugin$initSonicContext$2.this.this$0.f26094LJ.LIZ(abstractC87969KlP);
            ((OpenPlatformMonitorService) SonicGamePlugin$initSonicContext$2.this.this$0.LJIIIZ.LIZ((Class<AbstractC3719c>) OpenPlatformMonitorService.class)).LIZ();
            ((ScreenshotsAuditService) SonicGamePlugin$initSonicContext$2.this.this$0.LJIIIZ.LIZ((Class<AbstractC3719c>) ScreenshotsAuditService.class)).LJIIIIZZ();
        }
    }
}
