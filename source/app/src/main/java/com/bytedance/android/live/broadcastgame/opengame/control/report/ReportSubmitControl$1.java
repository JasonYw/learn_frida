package com.bytedance.android.live.broadcastgame.opengame.control.report;

import android.content.Intent;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;
import p003X.AbstractC88067Kmz;
import p003X.C106862S5w;
import p003X.C88068Kn0;
import p003X.C88069Kn1;
import p003X.C88070Kn2;
import p003X.C88118Kno;
import p003X.C88582KvI;

/* loaded from: classes5.dex */
public final class ReportSubmitControl$1 extends Lambda implements Function2<Integer, Intent, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88069Kn1 this$0;

    static {
        Covode.recordClassIndex(20021);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSubmitControl$1(C88069Kn1 c88069Kn1) {
        super(2);
        this.this$0 = c88069Kn1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Intent intent) {
        Single observeOn;
        int intValue = num.intValue();
        Intent intent2 = intent;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), intent2}, this, changeQuickRedirect, false, 1).isSupported && intValue == -1 && intent2 != null) {
            String LIZ = C88582KvI.LIZ(this.this$0.f8604LJ, intent2.getData());
            if (StringUtils.isEmpty(LIZ)) {
                UIUtils.displayToastWithIcon(this.this$0.f8604LJ, 2130855561, 2131586875);
            } else if (!new File(LIZ).exists()) {
                UIUtils.displayToastWithIcon(this.this$0.f8604LJ, 2130855561, 2131586875);
            } else {
                C88069Kn1 c88069Kn1 = this.this$0;
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (!PatchProxy.proxy(new Object[]{LIZ}, c88069Kn1, C88069Kn1.LIZ, false, 5).isSupported) {
                    if (!c88069Kn1.LIZ(LIZ, 0, 0)) {
                        c88069Kn1.LIZIZ();
                    } else if (!PatchProxy.proxy(new Object[]{LIZ}, c88069Kn1, C88069Kn1.LIZ, false, 6).isSupported) {
                        AbstractC88067Kmz abstractC88067Kmz = c88069Kn1.LIZIZ;
                        if (abstractC88067Kmz != null) {
                            abstractC88067Kmz.LIZIZ();
                        }
                        C88118Kno c88118Kno = c88069Kn1.LIZJ;
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ}, c88118Kno, C88118Kno.LIZ, false, 5);
                        if (proxy.isSupported) {
                            observeOn = (Single) proxy.result;
                        } else {
                            C106862S5w.LIZ(LIZ);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("scene", "webcast_report");
                            jSONObject.put("encrypt", 0);
                            observeOn = Single.just("https://webcast.amemv.com/webcast/resource/upload/?scene=webcast_report").subscribeOn(Schedulers.m138io()).map(new C88070Kn2(c88118Kno, LIZ, jSONObject)).observeOn(AndroidSchedulers.mainThread());
                            Intrinsics.checkNotNullExpressionValue(observeOn, "");
                        }
                        observeOn.subscribe(new C88068Kn0(c88069Kn1, LIZ));
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
