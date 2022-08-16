package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.broadcastgame.api.openplatform.C3397a;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.C3799p;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C88098KnU;

/* loaded from: classes5.dex */
public final class AudienceMiniGameIntroCardService$hideCard$2 extends Lambda implements Function1<C3799p, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $manualClose;
    public final /* synthetic */ C88098KnU $widget;
    public final /* synthetic */ AudienceMiniGameIntroCardService this$0;

    static {
        Covode.recordClassIndex(20973);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceMiniGameIntroCardService$hideCard$2(AudienceMiniGameIntroCardService audienceMiniGameIntroCardService, C88098KnU c88098KnU, boolean z) {
        super(1);
        this.this$0 = audienceMiniGameIntroCardService;
        this.$widget = c88098KnU;
        this.$manualClose = z;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.service.AudienceMiniGameIntroCardService$hideCard$2$1 */
    /* loaded from: classes5.dex */
    public static final class C36851 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ C3799p $this_addTask;

        static {
            Covode.recordClassIndex(20974);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36851(C3799p c3799p) {
            super(0);
            this.$this_addTask = c3799p;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                this.$this_addTask.LIZ();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3799p c3799p) {
        String str;
        byte b;
        String str2;
        byte b2;
        String str3;
        String str4;
        C3799p c3799p2 = c3799p;
        if (!PatchProxy.proxy(new Object[]{c3799p2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3799p2);
            this.$widget.LJIIIIZZ();
            TrackMiniGameCardService trackMiniGameCardService = (TrackMiniGameCardService) this.this$0.LIZ().LIZ((Class<AbstractC3719c>) TrackMiniGameCardService.class);
            C3397a c3397a = this.this$0.f26083LJ;
            if (c3397a != null) {
                str = c3397a.LIZLLL;
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                b = 0;
            } else {
                b = 1;
            }
            String str5 = "type1";
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b)}, trackMiniGameCardService, TrackMiniGameCardService.LIZ, false, 7).isSupported) {
                C4574547f LIZ = C4574547f.LIZ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(trackMiniGameCardService.LIZ());
                trackMiniGameCardService.LIZ(linkedHashMap);
                if (b == 0) {
                    str4 = "type2";
                } else {
                    str4 = str5;
                }
                linkedHashMap.put("ad_show_type", str4);
                LIZ.LIZ("livesdk_audience_ad_close", linkedHashMap, Room.class, C8668v.class);
            }
            long currentTimeMillis = (System.currentTimeMillis() - this.this$0.LIZLLL) / 1000;
            TrackMiniGameCardService trackMiniGameCardService2 = (TrackMiniGameCardService) this.this$0.LIZ().LIZ((Class<AbstractC3719c>) TrackMiniGameCardService.class);
            C3397a c3397a2 = this.this$0.f26083LJ;
            if (c3397a2 != null) {
                str2 = c3397a2.LIZLLL;
            } else {
                str2 = null;
            }
            if (str2 != null && str2.length() != 0) {
                b2 = 0;
            } else {
                b2 = 1;
            }
            String valueOf = String.valueOf(currentTimeMillis);
            boolean z = this.$manualClose;
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(b2), valueOf, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, trackMiniGameCardService2, TrackMiniGameCardService.LIZ, false, 8).isSupported) {
                C106862S5w.LIZ(valueOf);
                C4574547f LIZ2 = C4574547f.LIZ();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(trackMiniGameCardService2.LIZ());
                trackMiniGameCardService2.LIZ(linkedHashMap2);
                if (b2 == 0) {
                    str5 = "type2";
                }
                linkedHashMap2.put("ad_show_type", str5);
                linkedHashMap2.put("duration", valueOf);
                if (z) {
                    str3 = "audience_close";
                } else {
                    str3 = "show_end";
                }
                linkedHashMap2.put("close_type", str3);
                LIZ2.LIZ("livesdk_audience_ad_duration", linkedHashMap2, Room.class, C8668v.class);
            }
            AudienceMiniGameIntroCardService audienceMiniGameIntroCardService = this.this$0;
            audienceMiniGameIntroCardService.f26083LJ = null;
            audienceMiniGameIntroCardService.LIZLLL = 0L;
            C88098KnU.LIZ(this.$widget, 0L, new C36851(c3799p2), 1, null);
        }
        return Unit.INSTANCE;
    }
}
