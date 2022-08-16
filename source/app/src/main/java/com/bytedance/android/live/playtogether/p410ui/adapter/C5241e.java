package com.bytedance.android.live.playtogether.p410ui.adapter;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.UserHonor;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.playtogether.viewmodel.C5244c;
import com.bytedance.android.live.profit.fansclub.AbstractC5267o;
import com.bytedance.android.live.profit.fansclub.C5256c;
import com.bytedance.android.live.profit.fansclub.C5265k;
import com.bytedance.android.livesdk.message.model.C8913hd;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC392731gp;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C392701gm;

/* renamed from: com.bytedance.android.live.playtogether.ui.adapter.e */
/* loaded from: classes.dex */
public final class C5241e extends RecyclerView.Adapter<C5240a> {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(PlayTogetherAnchorOnInvitedAdapter$members$2.INSTANCE);
    public final AbstractC392731gp LIZJ;
    public final LifecycleOwner LIZLLL;

    static {
        Covode.recordClassIndex(33146);
    }

    private final List<Object> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (List) (proxy.isSupported ? proxy.result : this.LIZIZ.mo27335getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return LIZ().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (LIZ().get(i) instanceof C5244c) {
            return 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onViewRecycled(C5240a c5240a) {
        C5240a c5240a2;
        C5240a c5240a3 = c5240a;
        if (!PatchProxy.proxy(new Object[]{c5240a3}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(c5240a3);
            ALogger.m15797i("Together#PlayTogetherAnchorOnInvitedAdapter", "[pt_a_team_r]onViewRecycled, " + c5240a3);
            if (!(c5240a3 instanceof C392701gm)) {
                c5240a2 = null;
            } else {
                c5240a2 = c5240a3;
            }
            C392701gm c392701gm = (C392701gm) c5240a2;
            if (c392701gm != null && !PatchProxy.proxy(new Object[0], c392701gm, C392701gm.LIZ, false, 2).isSupported) {
                c392701gm.LIZ();
                c392701gm.LIZIZ = null;
            }
            super.onViewRecycled(c5240a3);
        }
    }

    public C5241e(AbstractC392731gp abstractC392731gp, LifecycleOwner lifecycleOwner) {
        C106862S5w.LIZ(abstractC392731gp, lifecycleOwner);
        this.LIZJ = abstractC392731gp;
        this.LIZLLL = lifecycleOwner;
    }

    public final void LIZ(List<C5244c> list, int i) {
        if (PatchProxy.proxy(new Object[]{list, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        ALogger.m15801d("Together#PlayTogetherAnchorOnInvitedAdapter", "[pt_a_team]updateTeamMembersAutoFillEmptySeats, members: " + list.size() + ", seats: " + i);
        LIZ().clear();
        LIZ().addAll(list);
        int size = i - list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LIZ().add(new Object());
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ C5240a onCreateViewHolder(ViewGroup viewGroup, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewGroup, Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (C5240a) proxy.result;
        }
        C106862S5w.LIZ(viewGroup);
        if (i == 0) {
            final View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131700093, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            return new C5240a(LIZ2) { // from class: X.1gq
                static {
                    Covode.recordClassIndex(33136);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(LIZ2);
                    C106862S5w.LIZ(LIZ2);
                }
            };
        }
        View LIZ3 = C116971W2r.LIZ(LayoutInflater.from(viewGroup.getContext()), 2131700094, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        return new C392701gm(LIZ3, this.LIZLLL, this.LIZJ);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(C5240a c5240a, int i) {
        C5240a c5240a2 = c5240a;
        if (!PatchProxy.proxy(new Object[]{c5240a2, Integer.valueOf(i)}, this, LIZ, false, 4).isSupported) {
            C106862S5w.LIZ(c5240a2);
            if (LIZ().get(i) instanceof C5244c) {
                if (!(c5240a2 instanceof C392701gm)) {
                    c5240a2 = null;
                }
                final C392701gm c392701gm = (C392701gm) c5240a2;
                if (c392701gm != null) {
                    Object obj = LIZ().get(i);
                    if (obj != null) {
                        final C5244c c5244c = (C5244c) obj;
                        if (!PatchProxy.proxy(new Object[]{c5244c}, c392701gm, C392701gm.LIZ, false, 1).isSupported) {
                            C106862S5w.LIZ(c5244c);
                            ALogger.m15801d("Together#OnInvitedPlayerVH", "[pt_a_team]bind, viewModel: " + c392701gm.LIZIZ + " -> " + c5244c + ", " + c392701gm + LoggerUtil.BLANK_TAG + c392701gm.itemView);
                            c392701gm.LIZ();
                            if (!PatchProxy.proxy(new Object[]{c5244c}, c392701gm, C392701gm.LIZ, false, 4).isSupported) {
                                Observer<Long> observer = new Observer<Long>() { // from class: X.1KV
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(33138);
                                    }

                                    @Override // androidx.lifecycle.Observer
                                    public final /* synthetic */ void onChanged(Long l) {
                                        Long l2 = l;
                                        if (!PatchProxy.proxy(new Object[]{l2}, this, LIZ, false, 1).isSupported) {
                                            C392701gm c392701gm2 = C392701gm.this;
                                            if (l2 == null) {
                                                l2 = 0L;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(l2, "");
                                            long longValue = l2.longValue();
                                            Integer value = c5244c.LIZIZ().getValue();
                                            if (value == null) {
                                                value = 0;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(value, "");
                                            c392701gm2.LIZ(longValue, value.intValue());
                                        }
                                    }
                                };
                                ALogger.m15801d("Together#OnInvitedPlayerVH", "[pt_a_team_o]addObservers, new observer: " + observer);
                                c5244c.LIZJ().observe(c392701gm.LJIIL, observer);
                                c392701gm.LIZJ = observer;
                                Observer<Integer> observer2 = new Observer<Integer>() { // from class: X.1KU
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(33139);
                                    }

                                    @Override // androidx.lifecycle.Observer
                                    public final /* synthetic */ void onChanged(Integer num) {
                                        Integer num2 = num;
                                        if (!PatchProxy.proxy(new Object[]{num2}, this, LIZ, false, 1).isSupported) {
                                            ALogger.m15801d("Together#OnInvitedPlayerVH", "[pt_a_team]status changed: " + num2 + LoggerUtil.BLANK_TAG + C392701gm.this);
                                            C392701gm c392701gm2 = C392701gm.this;
                                            Long value = c5244c.LIZJ().getValue();
                                            if (value == null) {
                                                value = 0L;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(value, "");
                                            long longValue = value.longValue();
                                            if (num2 == null) {
                                                num2 = 0;
                                            }
                                            Intrinsics.checkNotNullExpressionValue(num2, "");
                                            c392701gm2.LIZ(longValue, num2.intValue());
                                        }
                                    }
                                };
                                c5244c.LIZIZ().observe(c392701gm.LJIIL, observer2);
                                c392701gm.LIZLLL = observer2;
                                Observer<C8913hd> observer3 = new Observer<C8913hd>() { // from class: X.3Xp
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(33140);
                                    }

                                    @Override // androidx.lifecycle.Observer
                                    public final /* synthetic */ void onChanged(C8913hd c8913hd) {
                                        User user;
                                        final C5256c c5256c;
                                        boolean z;
                                        Boolean bool;
                                        boolean z2;
                                        C5265k LIZ2;
                                        C8913hd c8913hd2 = c8913hd;
                                        if (!PatchProxy.proxy(new Object[]{c8913hd2}, this, LIZ, false, 1).isSupported) {
                                            ALogger.m15801d("Together#OnInvitedPlayerVH", "[pt_a_team]member changed: " + c8913hd2 + LoggerUtil.BLANK_TAG + C392701gm.this);
                                            if (c8913hd2 != null && (user = c8913hd2.LIZ) != null) {
                                                final C392701gm c392701gm2 = C392701gm.this;
                                                if (!PatchProxy.proxy(new Object[]{user}, c392701gm2, C392701gm.LIZ, false, 5).isSupported) {
                                                    M0Q.LIZIZ((ImageView) c392701gm2.LJFF, user.getAvatarThumb(), 2130857688);
                                                    TextView textView = c392701gm2.LJI;
                                                    String nickName = user.getNickName();
                                                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nickName, 6, "..."}, c392701gm2, C392701gm.LIZ, false, 8);
                                                    if (proxy.isSupported) {
                                                        nickName = (String) proxy.result;
                                                    } else if (nickName == null) {
                                                        nickName = "";
                                                    } else if (nickName.length() > 6) {
                                                        StringBuilder sb = new StringBuilder();
                                                        String substring = nickName.substring(0, 6);
                                                        Intrinsics.checkNotNullExpressionValue(substring, "");
                                                        sb.append(substring);
                                                        sb.append("...");
                                                        nickName = sb.toString();
                                                    }
                                                    textView.setText(nickName);
                                                    if (user.mo25553getUserHonor() != null) {
                                                        UserHonor mo25553getUserHonor = user.mo25553getUserHonor();
                                                        Intrinsics.checkNotNullExpressionValue(mo25553getUserHonor, "");
                                                        ImageModel LJIIJ = mo25553getUserHonor.LJIIJ();
                                                        C429102yO c429102yO = C429102yO.LIZIZ;
                                                        ImageView imageView = c392701gm2.LJIIIZ;
                                                        Intrinsics.checkNotNullExpressionValue(imageView, "");
                                                        C429102yO.LIZ(c429102yO, LJIIJ, imageView, 16.0f, null, 8, null);
                                                    } else {
                                                        ImageView imageView2 = c392701gm2.LJIIIZ;
                                                        Intrinsics.checkNotNullExpressionValue(imageView2, "");
                                                        imageView2.setVisibility(8);
                                                    }
                                                    TextView textView2 = c392701gm2.LJIIJJI;
                                                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                                                    textView2.setVisibility(8);
                                                    AbstractC5267o LIZJ = C458444Ba.LIZJ();
                                                    ImageModel imageModel = null;
                                                    if (LIZJ != null && (LIZ2 = LIZJ.LIZ(user)) != null) {
                                                        c5256c = LIZ2.LIZIZ;
                                                    } else {
                                                        c5256c = null;
                                                    }
                                                    StringBuilder sb2 = new StringBuilder("[pt_a_team]");
                                                    sb2.append(user.getNickName());
                                                    sb2.append(" -> isNull: ");
                                                    if (c5256c == null) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    sb2.append(z);
                                                    sb2.append(", isValid: ");
                                                    if (c5256c != null) {
                                                        bool = Boolean.valueOf(c5256c.LIZ());
                                                    } else {
                                                        bool = null;
                                                    }
                                                    sb2.append(bool);
                                                    sb2.append(", badge isNull: ");
                                                    if (c5256c != null && c5256c.f26558LJ != null) {
                                                        z2 = false;
                                                    } else {
                                                        z2 = true;
                                                    }
                                                    sb2.append(z2);
                                                    ALogger.m15797i("Together#OnInvitedPlayerVH", sb2.toString());
                                                    if (c5256c != null && c5256c.LIZ() && c5256c.f26558LJ != null) {
                                                        C4324038w c4324038w = c5256c.f26558LJ;
                                                        if (c4324038w != null) {
                                                            imageModel = c4324038w.LIZJ;
                                                        }
                                                        LinearLayout linearLayout = c392701gm2.LJIIJ;
                                                        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
                                                        linearLayout.setVisibility(0);
                                                        M0Q.LIZ((View) c392701gm2.LJIIJ, imageModel, true, new AbstractC91424M0c() { // from class: X.3Xo
                                                            public static ChangeQuickRedirect LIZ;

                                                            static {
                                                                Covode.recordClassIndex(33143);
                                                            }

                                                            @Override // p003X.AbstractC91424M0c
                                                            public final void LIZ(Exception exc) {
                                                            }

                                                            @Override // p003X.AbstractC91424M0c
                                                            public final void LIZ(Bitmap bitmap) {
                                                                float f;
                                                                DisplayMetrics displayMetrics;
                                                                if (PatchProxy.proxy(new Object[]{bitmap}, this, LIZ, false, 1).isSupported || bitmap == null) {
                                                                    return;
                                                                }
                                                                Resources LIZ3 = LK5.LIZ();
                                                                if (LIZ3 != null && (displayMetrics = LIZ3.getDisplayMetrics()) != null) {
                                                                    f = displayMetrics.density / 3.0f;
                                                                } else {
                                                                    f = 1.0f;
                                                                }
                                                                LK5.LIZ(C392701gm.this.LJIIJ, M0Q.LIZ(bitmap, f));
                                                                TextView textView3 = C392701gm.this.LJIIJJI;
                                                                Intrinsics.checkNotNullExpressionValue(textView3, "");
                                                                textView3.setText(c5256c.LIZIZ);
                                                            }
                                                        });
                                                        ALogger.m15797i("Together#OnInvitedPlayerVH", "[pt_a_team]set fans club info VISIBLE for " + user.getNickName() + ", [" + c5256c.LIZIZ + LoggerUtil.M_RIGHT_TAG);
                                                        return;
                                                    }
                                                    LinearLayout linearLayout2 = c392701gm2.LJIIJ;
                                                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                                                    linearLayout2.setVisibility(8);
                                                    ALogger.m15797i("Together#OnInvitedPlayerVH", "[pt_a_team]set fans club info GONE for " + user.getNickName());
                                                }
                                            }
                                        }
                                    }
                                };
                                c5244c.LIZ().observe(c392701gm.LJIIL, observer3);
                                c392701gm.f276LJ = observer3;
                            }
                            c392701gm.LIZIZ = c5244c;
                            c392701gm.LJII.setOnClickListener(new View.OnClickListener() { // from class: X.1gn
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(33141);
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    C392701gm.this.LJIILIIL.LIZIZ(c5244c);
                                }
                            });
                            c392701gm.LJIIIIZZ.setOnClickListener(new View.OnClickListener() { // from class: X.1go
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(33142);
                                }

                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                                        return;
                                    }
                                    C392701gm.this.LJIILIIL.LIZ(c5244c);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.playtogether.viewmodel.PlayTeamMemberViewModel");
                }
            }
        }
    }
}
