package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.permissioncheck.p407c.C5184a;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostSocial;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC78156GrW;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C78157GrX;
import p003X.C78299Gtp;
import p003X.C78828H5q;
import p003X.HKN;
import p003X.IQV;

/* loaded from: classes3.dex */
public final class BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $view$inlined;
    public final /* synthetic */ AbstractC78156GrW this$0;

    static {
        Covode.recordClassIndex(26153);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1(AbstractC78156GrW abstractC78156GrW, View view) {
        super(0);
        this.this$0 = abstractC78156GrW;
        this.$view$inlined = view;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        C5185b c5185b;
        C2WC<C5184a> LJIIZILJ;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], C5185b.LIZLLL, C78157GrX.LIZ, false, 1);
            if (proxy.isSupported) {
                c5185b = (C5185b) proxy.result;
            } else {
                C13491f LIZ = IQV.LIZ(C5185b.class);
                if (!(LIZ instanceof C5185b)) {
                    LIZ = null;
                }
                c5185b = (C5185b) LIZ;
                if (c5185b == null) {
                    C13491f LIZ2 = IQV.LIZ("RulesDataContext");
                    if (!(LIZ2 instanceof C5185b)) {
                        LIZ2 = null;
                    }
                    c5185b = (C5185b) LIZ2;
                }
            }
            if (c5185b != null && (LJIIZILJ = c5185b.LJIIZILJ()) != null) {
                LJIIZILJ.LIZ(new C5184a(Boolean.TRUE, 0L, 2));
            }
            C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
            boolean LJIIL = this.this$0.LJIIL();
            if (!PatchProxy.proxy(new Object[]{Byte.valueOf(LJIIL ? (byte) 1 : (byte) 0)}, c78299Gtp, C78299Gtp.LIZ, false, 16).isSupported) {
                Map<String, String> mutableMapOf = MapsKt__MapsKt.mutableMapOf(c78299Gtp.LIZJ(LJIIL), c78299Gtp.LIZ(), TuplesKt.m137to("request_page", "invite"));
                C78828H5q.LIZIZ(mutableMapOf, (Integer) null, (Integer) null, 6, (Object) null);
                c78299Gtp.LIZ("anchor_invite_user_button_click", mutableMapOf, new Object[0]);
            }
            ((IRoomService) ServiceManager.getService(IRoomService.class)).setIsOnNeedMuteAudioFullPage(true);
            Context context = this.$view$inlined.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ((IHostSocial) ServiceManager.getService(IHostSocial.class)).showInviteFriendActivity(context, new C43531());
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.list.BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1$1 */
    /* loaded from: classes3.dex */
    public static final class C43531 extends Lambda implements Function1<IHostSocial.InviteFriendsConfig, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26154);
        }

        public C43531() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(IHostSocial.InviteFriendsConfig inviteFriendsConfig) {
            String str;
            IHostSocial.InviteFriendsConfig inviteFriendsConfig2 = inviteFriendsConfig;
            if (!PatchProxy.proxy(new Object[]{inviteFriendsConfig2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(inviteFriendsConfig2);
                HKN.LIZ(inviteFriendsConfig2, (String) null, BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIL, BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIL(), BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIJ(), BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIILJJIL(), 1, (Object) null);
                inviteFriendsConfig2.LIZ(BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIL);
                inviteFriendsConfig2.LIZ(new IHostSocial.InviteFriendsConfig.AbstractC5788b() { // from class: com.bytedance.android.live.liveinteract.chatroom.chatroom.list.BaseTalkInviteListFragment$onViewCreated$.inlined.apply.lambda.1.1.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(26155);
                    }

                    @Override // com.bytedance.android.livehostapi.business.IHostSocial.InviteFriendsConfig.AbstractC5788b
                    public final void LIZ() {
                        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported;
                    }

                    @Override // com.bytedance.android.livehostapi.business.IHostSocial.InviteFriendsConfig.AbstractC5788b
                    public final void LIZ(Map<String, String> map) {
                        boolean z = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 3).isSupported;
                    }

                    @Override // com.bytedance.android.livehostapi.business.IHostSocial.InviteFriendsConfig.AbstractC5788b
                    public final void LIZIZ() {
                        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported;
                    }

                    @Override // com.bytedance.android.livehostapi.business.IHostSocial.InviteFriendsConfig.AbstractC5788b
                    public final void LIZIZ(Map<String, String> map) {
                        boolean z = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5).isSupported;
                    }

                    @Override // com.bytedance.android.livehostapi.business.IHostSocial.InviteFriendsConfig.AbstractC5788b
                    public final void LIZ(List<? extends IHostSocial.InviteFriendsConfig.AbstractC5787a> list, Function2<? super List<? extends IHostSocial.InviteFriendsConfig.AbstractC5787a>, ? super Room, Unit> function2) {
                        Object createFailure;
                        boolean z;
                        if (PatchProxy.proxy(new Object[]{list, function2}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C106862S5w.LIZ(list, function2);
                        ((g$a) BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIIZ).LIZ(list, function2);
                        for (IHostSocial.InviteFriendsConfig.AbstractC5787a abstractC5787a : list) {
                            C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                            boolean LJIIL = BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIL();
                            try {
                                createFailure = Long.valueOf(Long.parseLong(abstractC5787a.LIZIZ()));
                                Result.m30308constructorimpl(createFailure);
                            } catch (Throwable th) {
                                createFailure = ResultKt.createFailure(th);
                                Result.m30308constructorimpl(createFailure);
                            }
                            boolean m30314isFailureimpl = Result.m30314isFailureimpl(createFailure);
                            Long l = createFailure;
                            if (m30314isFailureimpl) {
                                l = -1L;
                            }
                            long longValue = ((Number) l).longValue();
                            Boolean LIZJ = abstractC5787a.LIZJ();
                            if (LIZJ != null) {
                                z = LIZJ.booleanValue();
                            } else {
                                z = false;
                            }
                            C78299Gtp.LIZ(c78299Gtp, LJIIL, longValue, z, "mutual_page", false, null, null, 96, null);
                        }
                    }
                });
                C78299Gtp c78299Gtp = C78299Gtp.LIZIZ;
                boolean LJIIL = BaseTalkInviteListFragment$onViewCreated$$inlined$apply$lambda$1.this.this$0.LJIIL();
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(LJIIL ? (byte) 1 : (byte) 0)}, c78299Gtp, C78299Gtp.LIZ, false, 12).isSupported && !c78299Gtp.LIZIZ()) {
                    HashMap hashMap = new HashMap();
                    if (LJIIL) {
                        str = "voice_live";
                    } else {
                        str = "video_live";
                    }
                    hashMap.put("live_type", str);
                    IService service = ServiceManager.getService(IInteractService.class);
                    Intrinsics.checkNotNullExpressionValue(service, "");
                    C78828H5q.LIZIZ(hashMap, Integer.valueOf(((IInteractService) service).getCurrentScene()), (Integer) null, 4, (Object) null);
                    c78299Gtp.LIZ("livesdk_audience_invite_user_button_click", hashMap, new Object[0]);
                }
            }
            return Unit.INSTANCE;
        }
    }
}
