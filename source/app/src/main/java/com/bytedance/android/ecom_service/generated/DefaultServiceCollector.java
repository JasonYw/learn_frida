package com.bytedance.android.ecom_service.generated;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.android.p225ec.adapter.api.IAdapterService;
import com.bytedance.android.p225ec.adapter.api.net.IECNetMonitorService;
import com.bytedance.android.p225ec.base.plugin.IHookResources;
import com.bytedance.android.p225ec.common.api.IECCommonService;
import com.bytedance.android.p225ec.common.api.IEShoppingCommonService;
import com.bytedance.android.p225ec.common.api.ILiveCommerceService;
import com.bytedance.android.p225ec.common.api.domainselect.IDomainSelect;
import com.bytedance.android.p225ec.host.api.alog.IECHostALogService;
import com.bytedance.android.p225ec.host.api.btm.IECBTMService;
import com.bytedance.android.p225ec.host.api.core.api.IECMonitorService;
import com.bytedance.android.p225ec.host.api.core.api.IECRouterService;
import com.bytedance.android.p225ec.host.api.fresco.IECHostFrescoService;
import com.bytedance.android.p225ec.host.api.info.IECHostAppInfo;
import com.bytedance.android.p225ec.host.api.location.IHostLocationService;
import com.bytedance.android.p225ec.host.api.log.IECHostLogService;
import com.bytedance.android.p225ec.host.api.media.IChooseMediaAbility;
import com.bytedance.android.p225ec.host.api.media.IUploadFileAbility;
import com.bytedance.android.p225ec.host.api.mini.IECHostMiniAppService;
import com.bytedance.android.p225ec.host.api.opt.IShoppingPerfOptService;
import com.bytedance.android.p225ec.host.api.order.IOrderShowOffService;
import com.bytedance.android.p225ec.host.api.p233sp.IECSPService;
import com.bytedance.android.p225ec.host.api.router.IECHostRouterManager;
import com.bytedance.android.p225ec.host.api.service.IECHostService;
import com.bytedance.android.p225ec.host.api.user.IECHostUserService;
import com.bytedance.android.p225ec.sdk.IECSdkInfoService;
import com.bytedance.android.shopping.api.IEShoppingService;
import com.bytedance.android.shopping.api.host.IEShoppingHostService;
import com.bytedance.android.shopping.api.host.IFullLiveCommerceExperimentService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
import p003X.AbstractC113008UeI;
import p003X.AbstractC113493Um7;
import p003X.AbstractC113520UmY;
import p003X.AbstractC98434Opo;
import p003X.C102359QSr;
import p003X.C109785TKh;
import p003X.C111838U1g;
import p003X.C112082UAq;
import p003X.C112119UCb;
import p003X.C112469UPn;
import p003X.C112797Uat;
import p003X.C113496UmA;
import p003X.C113497UmB;
import p003X.C113499UmD;
import p003X.C113500UmE;
import p003X.C113503UmH;
import p003X.C113504UmI;
import p003X.C113505UmJ;
import p003X.C113506UmK;
import p003X.C113507UmL;
import p003X.C113508UmM;
import p003X.C113509UmN;
import p003X.C113510UmO;
import p003X.C113511UmP;
import p003X.C113512UmQ;
import p003X.C113513UmR;
import p003X.C113514UmS;
import p003X.C113515UmT;
import p003X.C113516UmU;
import p003X.C113517UmV;
import p003X.C98433Opn;
import p003X.SNO;
import p003X.U96;
import p003X.UNX;
import p003X.URA;
import p003X.URP;

/* loaded from: classes11.dex */
public final class DefaultServiceCollector {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(13649);
    }

    public static void inject(Map<Class, Object> map) {
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        map.put(IECSdkInfoService.class, new C113515UmT());
        map.put(IChooseMediaAbility.class, new SNO());
        map.put(IECBTMService.class, new C113511UmP());
        map.put(AbstractC98434Opo.class, new C98433Opn());
        map.put(IECHostALogService.class, new C113512UmQ());
        map.put(IECHostAppInfo.class, new C113504UmI());
        map.put(IECHostFrescoService.class, new C109785TKh());
        map.put(IECHostLogService.class, new C111838U1g());
        map.put(IECHostMiniAppService.class, new C113505UmJ());
        map.put(AbstractC113493Um7.class, new C113499UmD());
        map.put(IECHostRouterManager.class, new URP());
        map.put(IECHostService.class, new C113496UmA());
        map.put(URA.class, new C113506UmK());
        map.put(IECHostUserService.class, new C113497UmB());
        map.put(IECMonitorService.class, new IECMonitorService() { // from class: X.90e
            static {
                Covode.recordClassIndex(13673);
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void apiResponseMonitor(String str, String str2, String str3, String str4, String str5, HashMap<String, String> hashMap) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void customErrorMonitor(String str, HashMap<String, String> hashMap) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void lynxErrorMonitor(String str, String str2, String str3, String str4) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void paramsMonitor(String str, String str2, String str3, String str4, String str5, String str6) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void schemaMonitor(String str, String str2, String str3, Map<String, String> map2) {
            }

            @Override // com.bytedance.android.p225ec.host.api.core.api.IECMonitorService
            public final void schemaMonitorExtra(String str, String str2, String str3, Map<String, String> map2, HashMap<String, String> hashMap) {
            }
        });
        map.put(IECRouterService.class, new C113507UmL());
        map.put(IECSPService.class, new C113514UmS());
        map.put(IHostLocationService.class, new C113503UmH());
        map.put(IOrderShowOffService.class, new IOrderShowOffService() { // from class: X.1ec
            static {
                Covode.recordClassIndex(13654);
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final Function0<Unit> getSynthesizedOrderShowOffVideo(Context context, List<String> list, String str, Function2<? super String, ? super String, Unit> function2) {
                return null;
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final void getVideoPublishModelBySilent(Context context, Bundle bundle, Function1<Object, Unit> function1) {
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final void publishVideo(Context context, Bundle bundle, Object obj, Function2<? super Boolean, ? super String, Unit> function2) {
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final void startComposerEditor(Context context, Bundle bundle) {
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final void startUGEditActivity(Context context, Bundle bundle, int i) {
            }

            @Override // com.bytedance.android.p225ec.host.api.order.IOrderShowOffService
            public final void startVideoEditActivity(Context context, Bundle bundle, int i, Function2<? super Integer, Object, Unit> function2) {
            }
        });
        map.put(AbstractC113520UmY.class, new C113508UmM());
        map.put(IShoppingPerfOptService.class, new C113509UmN());
        map.put(IUploadFileAbility.class, new C113500UmE());
        map.put(IDomainSelect.class, new C113510UmO());
        map.put(IECCommonService.class, new C112119UCb());
        map.put(IEShoppingCommonService.class, new C112082UAq());
        map.put(ILiveCommerceService.class, new UNX());
        map.put(AbstractC113008UeI.class, new C112797Uat());
        map.put(IAdapterService.class, new C102359QSr());
        map.put(IECNetMonitorService.class, new C113513UmR());
        map.put(IEShoppingHostService.class, new C112469UPn());
        map.put(IEShoppingService.class, new U96());
        map.put(IFullLiveCommerceExperimentService.class, new C113516UmU());
        map.put(IHookResources.class, new C113517UmV());
    }
}
