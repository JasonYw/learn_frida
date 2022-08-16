package com.bytedance.android.live.broadcast.api.model;

import android.content.Context;
import com.bytedance.android.live.broadcast.api.model.AnchorVideoResolutionManager;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C86565K9f;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.KA2;

/* loaded from: classes5.dex */
public final class AnchorVideoResolutionManager$showResolutionPicker$1 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $inLiving;
    public final /* synthetic */ Room $room;

    static {
        Covode.recordClassIndex(14489);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorVideoResolutionManager$showResolutionPicker$1(Room room, boolean z, Context context) {
        super(1);
        this.$room = room;
        this.$inLiving = z;
        this.$context = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        Object obj;
        Disposable disposable;
        Long l;
        String str2;
        Object obj2;
        Object obj3;
        List split$default;
        List split$default2;
        C3VF user;
        String str3 = str;
        if (!PatchProxy.proxy(new Object[]{str3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str3);
            if (Intrinsics.areEqual(AnchorVideoResolutionManager.LJI.getValue(), str3)) {
                AnchorVideoResolutionManager.LJIIIZ.m15916LJ("selected same resolution");
            } else {
                AnchorVideoResolutionManager anchorVideoResolutionManager = AnchorVideoResolutionManager.LJIIIZ;
                Room room = this.$room;
                if (!PatchProxy.proxy(new Object[]{"livesdk_anchor_definition_setting", room, str3}, anchorVideoResolutionManager, AnchorVideoResolutionManager.LIZ, false, 24).isSupported) {
                    C4574547f LIZ = C4574547f.LIZ();
                    Pair[] pairArr = new Pair[7];
                    pairArr[0] = TuplesKt.m137to("live_type", C2VQ.LIZ(AnchorVideoResolutionManager.LJIIIIZZ));
                    IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
                    if (iUserService != null && (user = iUserService.user()) != null) {
                        l = Long.valueOf(user.LIZIZ());
                    } else {
                        l = null;
                    }
                    pairArr[1] = TuplesKt.m137to("anchor_id", String.valueOf(l));
                    if (room != null) {
                        str2 = "live_take_detail";
                    } else {
                        str2 = "live_take_page";
                    }
                    pairArr[2] = TuplesKt.m137to("event_page", str2);
                    pairArr[3] = TuplesKt.m137to("show_type", "icon");
                    pairArr[4] = TuplesKt.m137to("definition", str3);
                    String value = AnchorVideoResolutionManager.LJI.getValue();
                    if (value != null && (split$default2 = StringsKt__StringsKt.split$default((CharSequence) value, new String[]{" "}, false, 0, 6, (Object) null)) != null) {
                        obj2 = split$default2.get(0);
                    } else {
                        obj2 = null;
                    }
                    pairArr[5] = TuplesKt.m137to("old_resolution", obj2);
                    if (str3 != null && (split$default = StringsKt__StringsKt.split$default((CharSequence) str3, new String[]{" "}, false, 0, 6, (Object) null)) != null) {
                        obj3 = split$default.get(0);
                    } else {
                        obj3 = null;
                    }
                    pairArr[6] = TuplesKt.m137to("new_resolution", obj3);
                    LIZ.LIZ("livesdk_anchor_definition_setting", MapsKt__MapsKt.mapOf(pairArr), Room.class);
                }
                Iterator<T> it = AnchorVideoResolutionManager.LIZIZ.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((RoomCreateInfo.C2896g.C2897a) obj).LIZ, str3)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                RoomCreateInfo.C2896g.C2897a c2897a = (RoomCreateInfo.C2896g.C2897a) obj;
                if (c2897a != null && !Intrinsics.areEqual(c2897a.LIZIZ, AnchorVideoResolutionManager.LIZ())) {
                    if (this.$inLiving) {
                        AnchorVideoResolutionManager anchorVideoResolutionManager2 = AnchorVideoResolutionManager.LJIIIZ;
                        Room room2 = this.$room;
                        Context context = this.$context;
                        if (!PatchProxy.proxy(new Object[]{c2897a, room2, context}, anchorVideoResolutionManager2, AnchorVideoResolutionManager.LIZ, false, 16).isSupported && context != null && room2 != null) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("resolution_key", c2897a.LIZIZ);
                            String idStr = room2.getIdStr();
                            if (idStr == null) {
                                idStr = "";
                            }
                            hashMap.put("room_id", idStr);
                            hashMap.put("stream_id", room2.getStreamIdStr());
                            Disposable disposable2 = AnchorVideoResolutionManager.f25774LJ;
                            if (disposable2 != null && !disposable2.isDisposed() && (disposable = AnchorVideoResolutionManager.f25774LJ) != null) {
                                disposable.dispose();
                            }
                            AnchorVideoResolutionManager.f25774LJ = ((AnchorVideoResolutionManager.ResolutionApi) C88306Kqq.LIZ().LIZ(AnchorVideoResolutionManager.ResolutionApi.class)).changeResolution(hashMap).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new KA2(c2897a, room2), new C86565K9f(room2));
                        }
                    } else {
                        AnchorVideoResolutionManager.LJIIIZ.LIZ(c2897a.LIZIZ);
                        AnchorVideoResolutionManager.LJIIIZ.LIZLLL(AnchorVideoResolutionManager.LIZ());
                        AnchorVideoResolutionManager.LIZ("anchor_change", this.$room);
                        if (this.$room != null && (!Intrinsics.areEqual(AnchorVideoResolutionManager.LJI.getValue(), c2897a.LIZ))) {
                            C88440Kt0.LIZ(C0002O.m25086C("已切换到", (String) CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) StringsKt__StringsKt.split$default((CharSequence) c2897a.LIZ, new String[]{" "}, false, 0, 6, (Object) null))));
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
