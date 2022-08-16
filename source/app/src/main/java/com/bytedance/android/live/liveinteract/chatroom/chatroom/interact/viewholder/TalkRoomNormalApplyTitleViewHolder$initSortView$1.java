package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.list.AbstractC4357d;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C77036GYs;
import p003X.C77565Ghz;
import p003X.C78828H5q;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.KDS;

/* loaded from: classes3.dex */
public final class TalkRoomNormalApplyTitleViewHolder$initSortView$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4339an this$0;

    static {
        Covode.recordClassIndex(26086);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TalkRoomNormalApplyTitleViewHolder$initSortView$1(C4339an c4339an) {
        super(1);
        this.this$0 = c4339an;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.TalkRoomNormalApplyTitleViewHolder$initSortView$1$1 */
    /* loaded from: classes3.dex */
    public static final class C43301 extends Lambda implements Function1<Integer, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26087);
        }

        public C43301() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Integer num) {
            if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
                LinkedList<?> linkedList = TalkRoomNormalApplyTitleViewHolder$initSortView$1.this.this$0.LIZLLL;
                if (linkedList != null) {
                    linkedList.clear();
                }
                TalkRoomNormalApplyTitleViewHolder$initSortView$1.this.this$0.LIZJ.LIZ(true, "anchorChangeSortType", 50L, "");
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        String str;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7203eS;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Integer LIZ = c87308Kak.LIZ();
            AbstractC4357d abstractC4357d = this.this$0.LIZJ;
            if (abstractC4357d != null) {
                int i = 40;
                if (LIZ != null && LIZ.intValue() == 40) {
                    i = 41;
                }
                C43301 c43301 = new C43301();
                if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), c43301}, abstractC4357d, AbstractC4357d.LJFF, false, 8).isSupported) {
                    C106862S5w.LIZ(c43301);
                    Room room = abstractC4357d.LJIIJ;
                    if (room != null) {
                        Map<String, Object> mutableMapOf = MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("scene", 4));
                        JSONArray jSONArray = new JSONArray();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("key", 58);
                        jSONObject.put("value", i);
                        jSONArray.put(jSONObject);
                        mutableMapOf.put("incremental_update", jSONArray);
                        ((KDS) ((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).updateSetting(room.getRoomId(), mutableMapOf).m149as(abstractC4357d.LIZLLL())).LIZ(new C77036GYs(abstractC4357d, i, c43301), new C77565Ghz(abstractC4357d, i, c43301));
                        if (i == 41) {
                            str = "money_first";
                        } else {
                            str = "time_first";
                        }
                        HashMap hashMapOf = MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("ordering_type", str));
                        C78828H5q.LIZIZ(hashMapOf, (Integer) null, (Integer) null, 6, (Object) null);
                        C4574547f.LIZ().LIZ("livesdk_anchor_apply_list_order_change_success", hashMapOf, C8668v.class, Room.class);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
