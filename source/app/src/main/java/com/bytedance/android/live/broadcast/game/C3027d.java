package com.bytedance.android.live.broadcast.game;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C410982Om;
import p003X.C4574547f;
import p003X.M0Q;
import p003X.View$OnClickListenerC100267PeH;

/* renamed from: com.bytedance.android.live.broadcast.game.d */
/* loaded from: classes8.dex */
public final class C3027d extends RecyclerView.Adapter<C3028a> {
    public static ChangeQuickRedirect LIZ;
    public final List<FeedItem> LIZIZ = new ArrayList();
    public int LIZJ;
    public Context LIZLLL;

    /* renamed from: LJ */
    public final String f25837LJ;
    public final String LJFF;
    public final String LJI;

    static {
        Covode.recordClassIndex(15992);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.LIZIZ.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onViewAttachedToWindow(C3028a c3028a) {
        C3028a c3028a2 = c3028a;
        if (!PatchProxy.proxy(new Object[]{c3028a2}, this, LIZ, false, 6).isSupported) {
            C106862S5w.LIZ(c3028a2);
            super.onViewAttachedToWindow(c3028a2);
            LIZ(c3028a2.getAdapterPosition());
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.game.d$a */
    /* loaded from: classes8.dex */
    public static final class C3028a extends RecyclerView.ViewHolder {
        public HSImageView LIZ;
        public ViewGroup LIZIZ;
        public TextView LIZJ;
        public HSImageView LIZLLL;

        /* renamed from: LJ */
        public TextView f25838LJ;
        public TextView LJFF;

        static {
            Covode.recordClassIndex(15993);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3028a(View view) {
            super(view);
            C106862S5w.LIZ(view);
            View findViewById = view.findViewById(2131175903);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            this.LIZ = (HSImageView) findViewById;
            View findViewById2 = view.findViewById(2131175923);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
            this.LIZIZ = (ViewGroup) findViewById2;
            View findViewById3 = view.findViewById(2131175956);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "");
            this.LIZJ = (TextView) findViewById3;
            View findViewById4 = view.findViewById(2131166442);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "");
            this.LIZLLL = (HSImageView) findViewById4;
            View findViewById5 = view.findViewById(2131166430);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "");
            this.f25838LJ = (TextView) findViewById5;
            View findViewById6 = view.findViewById(2131167093);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "");
            this.LJFF = (TextView) findViewById6;
        }
    }

    public final void LIZ(int i) {
        FeedItem feedItem;
        Room room;
        String str;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported && (feedItem = (FeedItem) CollectionsKt___CollectionsKt.getOrNull(this.LIZIZ, i)) != null && (room = feedItem.getRoom()) != null) {
            int i2 = this.LIZJ;
            String str2 = "";
            if (i2 != 1) {
                if (i2 != 2) {
                    str = str2;
                } else {
                    str = "live_game_game";
                }
            } else {
                str = "live_game_all";
            }
            Pair[] pairArr = new Pair[8];
            pairArr[0] = TuplesKt.m137to("enter_from_merge", "discover_page");
            pairArr[1] = TuplesKt.m137to("enter_method", str);
            pairArr[2] = TuplesKt.m137to("first_game_live_tab", String.valueOf(this.LJI));
            pairArr[3] = TuplesKt.m137to("second_game_live_tab", String.valueOf(this.LJFF));
            pairArr[4] = TuplesKt.m137to("anchor_id", String.valueOf(room.ownerUserId));
            pairArr[5] = TuplesKt.m137to("room_id", room.getIdStr());
            LiveMode streamType = room.getStreamType();
            if (streamType != null) {
                int i3 = C410982Om.LIZ[streamType.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                str2 = "third_party";
                            }
                        } else {
                            str2 = "game";
                        }
                    } else {
                        str2 = "voice";
                    }
                } else {
                    str2 = "video";
                }
            }
            pairArr[6] = TuplesKt.m137to("live_type", str2);
            pairArr[7] = TuplesKt.m137to("action_type", "click");
            Map<String, String> mutableMapOf = MapsKt__MapsKt.mutableMapOf(pairArr);
            long LIZIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ();
            if (LIZIZ > 0) {
                mutableMapOf.put("user_id", String.valueOf(LIZIZ));
            }
            C4574547f.LIZ().LIZJ("livesdk_live_show", mutableMapOf, new Object[0]);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C3028a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C3028a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{viewGroup}, this, LIZ, false, 1);
        if (proxy2.isSupported) {
            return (C3028a) proxy2.result;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131699984, viewGroup, false);
        this.LIZLLL = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        return new C3028a(LIZ2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C3028a c3028a, int i) {
        Room room;
        String str;
        String str2;
        C3028a c3028a2 = c3028a;
        if (!PatchProxy.proxy(new Object[]{c3028a2, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(c3028a2);
            if (!PatchProxy.proxy(new Object[]{c3028a2, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported && (room = this.LIZIZ.get(i).getRoom()) != null) {
                TextView textView = c3028a2.LJFF;
                RoomStats stats = room.getStats();
                ImageModel imageModel = null;
                if (stats != null) {
                    str = stats.getUserCountStr();
                } else {
                    str = null;
                }
                textView.setText(str);
                TextView textView2 = c3028a2.f25838LJ;
                User owner = room.getOwner();
                if (owner != null) {
                    str2 = owner.getNickName();
                } else {
                    str2 = null;
                }
                textView2.setText(str2);
                c3028a2.LIZJ.setText(room.getTitle());
                c3028a2.LIZIZ.setOnClickListener(new View$OnClickListenerC100267PeH(room, this, c3028a2));
                M0Q.LIZ(c3028a2.LIZ, ImageModel.genBy(room.getCoverUrl()));
                HSImageView hSImageView = c3028a2.LIZLLL;
                User owner2 = room.getOwner();
                if (owner2 != null) {
                    imageModel = owner2.getAvatarMedium();
                }
                M0Q.LIZ(hSImageView, imageModel);
            }
        }
    }

    public C3027d(String str, String str2, String str3) {
        this.f25837LJ = str;
        this.LJFF = str2;
        this.LJI = str3;
    }
}
