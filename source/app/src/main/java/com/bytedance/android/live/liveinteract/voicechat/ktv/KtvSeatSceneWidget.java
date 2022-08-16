package com.bytedance.android.live.liveinteract.voicechat.ktv;

import android.animation.ObjectAnimator;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4369e;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.C4377t;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.base.C4374l;
import com.bytedance.android.live.liveinteract.digitavatar.ktvavatar.KtvDigitAvatarWidget;
import com.bytedance.android.live.liveinteract.multianchor.model.MicDress;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget;
import com.bytedance.android.live.liveinteract.voicechat.p395wm.AbstractC5143z;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.C6848be;
import com.bytedance.android.livesdk.config.C6853bj;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import com.facebook.drawee.interfaces.DraweeController;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC78986HBs;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3E8;
import p003X.C3Q0;
import p003X.C409882Kg;
import p003X.C80557Hp9;
import p003X.C80596Hpm;
import p003X.C80784Hso;
import p003X.HDJ;
import p003X.IOU;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class KtvSeatSceneWidget extends VoiceChatSceneBaseWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C80557Hp9 LIZLLL;

    /* renamed from: LJ */
    public KtvDigitAvatarWidget f26491LJ;
    public final AbstractC5143z LJFF;
    public final C4377t LJI;
    public final C4369e LJII;

    static {
        Covode.recordClassIndex(31419);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700422;
    }

    @Override // com.bytedance.android.live.liveinteract.voicechat.VoiceChatSceneBaseWidget, com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 22).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZ(Map<String, Integer> map) {
        List<LinkPlayerInfo> arrayList;
        List<LinkPlayerInfo> arrayList2;
        HDJ hdj;
        HDJ hdj2;
        boolean z = true;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        C80557Hp9 c80557Hp9 = this.LIZLLL;
        if (c80557Hp9 != null && !PatchProxy.proxy(new Object[]{map}, c80557Hp9, C80557Hp9.LIZ, false, 17).isSupported) {
            C106862S5w.LIZ(map);
            AbstractKtvSeatListAdapter abstractKtvSeatListAdapter = c80557Hp9.LJJII;
            if (abstractKtvSeatListAdapter == null || (arrayList = abstractKtvSeatListAdapter.LIZ()) == null) {
                arrayList = new ArrayList<>();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                LinkPlayerInfo linkPlayerInfo = arrayList.get(i2);
                Integer num = map.get(linkPlayerInfo.LIZLLL());
                if (!TextUtils.isEmpty(linkPlayerInfo.LIZLLL()) && !TextUtils.equals(linkPlayerInfo.LIZLLL(), "0") && num != null && num.intValue() != linkPlayerInfo.LJJJJ) {
                    linkPlayerInfo.LJJJJ = num.intValue();
                    if (linkPlayerInfo.LJJJJ > 0 && linkPlayerInfo.LJIIL != 0 && (hdj2 = c80557Hp9.LJJIJIIJI) != null && hdj2.LIZ(linkPlayerInfo.LIZLLL())) {
                        HDJ hdj3 = c80557Hp9.LJJIJIIJI;
                        User LIZ = linkPlayerInfo.LIZ();
                        long id = LIZ != null ? LIZ.getId() : 0L;
                        String LIZLLL = linkPlayerInfo.LIZLLL();
                        Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                        hdj3.LIZ(id, LIZLLL, linkPlayerInfo.LJIIL, linkPlayerInfo.LJJLIIIJJIZ, true);
                    }
                    C4374l c4374l = c80557Hp9.LJJIII;
                    if (c4374l != null) {
                        c4374l.LIZ(num.intValue(), i2);
                    }
                    c80557Hp9.LJJJJL.LIZ(i2, linkPlayerInfo.LJJJJ, linkPlayerInfo.LIZ());
                }
            }
            AbstractKtvSeatListAdapter abstractKtvSeatListAdapter2 = c80557Hp9.LJJIFFI;
            if (abstractKtvSeatListAdapter2 == null || (arrayList2 = abstractKtvSeatListAdapter2.LIZ()) == null) {
                arrayList2 = new ArrayList<>();
            }
            int size2 = arrayList2.size();
            while (i < size2) {
                LinkPlayerInfo linkPlayerInfo2 = arrayList2.get(i);
                Integer num2 = map.get(linkPlayerInfo2.LIZLLL());
                if (!TextUtils.isEmpty(linkPlayerInfo2.LIZLLL()) && !TextUtils.equals(linkPlayerInfo2.LIZLLL(), "0") && num2 != null && num2.intValue() != linkPlayerInfo2.LJJJJ) {
                    linkPlayerInfo2.LJJJJ = num2.intValue();
                    if (linkPlayerInfo2.LJJJJ > 0 && linkPlayerInfo2.LJIIL != 0 && (hdj = c80557Hp9.LJJIJIIJI) != null && hdj.LIZ(linkPlayerInfo2.LIZLLL()) == z) {
                        HDJ hdj4 = c80557Hp9.LJJIJIIJI;
                        User LIZ2 = linkPlayerInfo2.LIZ();
                        long id2 = LIZ2 != null ? LIZ2.getId() : 0L;
                        String LIZLLL2 = linkPlayerInfo2.LIZLLL();
                        Intrinsics.checkNotNullExpressionValue(LIZLLL2, "");
                        hdj4.LIZ(id2, LIZLLL2, linkPlayerInfo2.LJIIL, linkPlayerInfo2.LJJLIIIJJIZ, true);
                    }
                    C4374l c4374l2 = c80557Hp9.LJJIIJ;
                    if (c4374l2 != null) {
                        c4374l2.LIZ(num2.intValue(), i);
                    }
                    c80557Hp9.LJJJJL.LIZ(i, linkPlayerInfo2.LJJJJ, linkPlayerInfo2.LIZ());
                }
                i++;
                z = true;
            }
        }
    }

    public final void LIZ() {
        C80557Hp9 c80557Hp9;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 6).isSupported && (c80557Hp9 = this.LIZLLL) != null) {
            c80557Hp9.LIZIZ();
        }
    }

    public final void LIZIZ() {
        C80557Hp9 c80557Hp9;
        if (!PatchProxy.proxy(new Object[0], this, LIZJ, false, 10).isSupported && (c80557Hp9 = this.LIZLLL) != null && !PatchProxy.proxy(new Object[0], c80557Hp9, C80557Hp9.LIZ, false, 57).isSupported) {
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter = ((IInteractService) service).getLinkUserInfoCenter();
            if (linkUserInfoCenter != null) {
                linkUserInfoCenter.LIZIZ(c80557Hp9.LJJJ);
            }
            IService service2 = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service2, "");
            AbstractC78986HBs<LinkPlayerInfo> linkUserInfoCenter2 = ((IInteractService) service2).getLinkUserInfoCenter();
            if (linkUserInfoCenter2 != null) {
                linkUserInfoCenter2.LIZIZ(c80557Hp9.LJJJI);
            }
        }
    }

    public final int LIZJ() {
        int itemCount;
        RecyclerView.ViewHolder viewHolder;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C80557Hp9 c80557Hp9 = this.LIZLLL;
        if (c80557Hp9 == null) {
            return 0;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c80557Hp9, C80557Hp9.LIZ, false, 50);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        AbstractKtvSeatListAdapter abstractKtvSeatListAdapter = c80557Hp9.LJJIFFI;
        if (abstractKtvSeatListAdapter == null || (itemCount = abstractKtvSeatListAdapter.getItemCount()) <= 0) {
            return -1;
        }
        while (true) {
            RecyclerView recyclerView = c80557Hp9.LJIILJJIL;
            if (recyclerView != null) {
                viewHolder = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C80784Hso) {
                return i;
            }
            if (i != itemCount) {
                i++;
            } else {
                return -1;
            }
        }
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZJ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(voiceLiveTheme);
        C80557Hp9 c80557Hp9 = this.LIZLLL;
        if (c80557Hp9 != null && !PatchProxy.proxy(new Object[]{voiceLiveTheme}, c80557Hp9, C80557Hp9.LIZ, false, 52).isSupported) {
            C106862S5w.LIZ(voiceLiveTheme);
            C80596Hpm c80596Hpm = c80557Hp9.LJJIJ;
            if (c80596Hpm != null) {
                c80596Hpm.LIZ(voiceLiveTheme);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(boolean z) {
        C80557Hp9 c80557Hp9;
        int i;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZJ, false, 14).isSupported && (c80557Hp9 = this.LIZLLL) != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, c80557Hp9, C80557Hp9.LIZ, false, 12).isSupported) {
            if (z != 0) {
                i = LK5.LIZLLL(2131429235);
            } else {
                i = 0;
            }
            ObjectAnimator.ofFloat(c80557Hp9.LIZLLL, "translationY", i).setDuration(300L).start();
        }
    }

    public final void LIZ(int i) {
        C80557Hp9 c80557Hp9;
        HSImageView hSImageView;
        Integer valueOf;
        Integer valueOf2;
        String LIZJ2;
        Integer num;
        C6848be value;
        int i2;
        MicDress micDress;
        MicDress.VoiceWave voiceWave;
        User owner;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 1).isSupported && (c80557Hp9 = this.LIZLLL) != null && !PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c80557Hp9, C80557Hp9.LIZ, false, 16).isSupported) {
            if (c80557Hp9.LJJIIZI != i) {
                c80557Hp9.LJJIIZI = i;
                View view = c80557Hp9.LJIIL;
                if (view != null && view.getVisibility() == 8) {
                    if (c80557Hp9.LJJIIZI > 0) {
                        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, c80557Hp9, C80557Hp9.LIZ, false, 20).isSupported) {
                            if (c80557Hp9.LJJJJI) {
                                valueOf2 = c80557Hp9.LJJJIL;
                            } else {
                                valueOf2 = Integer.valueOf(c80557Hp9.LIZJ);
                            }
                            ImageModel imageModel = null;
                            DraweeController draweeController = null;
                            imageModel = null;
                            imageModel = null;
                            if (valueOf2 != null && valueOf2.intValue() == 0) {
                                PipelineDraweeControllerBuilder mo27962setUri = Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse(c80557Hp9.LJJJJ));
                                HSImageView hSImageView2 = c80557Hp9.LJIIJJI;
                                if (hSImageView2 != null) {
                                    draweeController = hSImageView2.getController();
                                }
                                AbstractDraweeController mo27965build = mo27962setUri.mo27967setOldController(draweeController).setAutoPlayAnimations(true).mo27965build();
                                HSImageView hSImageView3 = c80557Hp9.LJIIJJI;
                                if (hSImageView3 != null) {
                                    hSImageView3.setController(mo27965build);
                                }
                            } else {
                                if (c80557Hp9.LJJJJI) {
                                    LIZJ2 = c80557Hp9.LJJJJ;
                                } else {
                                    SettingKey<C6853bj> settingKey = LiveSettingKeys.LIVE_KTV_ROOM_UI_RESOURCE;
                                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                                    C6853bj value2 = settingKey.getValue();
                                    Intrinsics.checkNotNullExpressionValue(value2, "");
                                    LIZJ2 = value2.LIZJ();
                                }
                                Room room = c80557Hp9.LJJJJLI;
                                if (room != null && (owner = room.getOwner()) != null) {
                                    num = Integer.valueOf(owner.getGender());
                                } else {
                                    num = null;
                                }
                                if (c80557Hp9.LJJJJI) {
                                    value = c80557Hp9.LJJJJIZL;
                                } else {
                                    SettingKey<C6848be> settingKey2 = LiveConfigSettingKeys.LIVE_KTV_VOLUME_ANIM_CONFIG;
                                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                                    value = settingKey2.getValue();
                                }
                                if (num != null) {
                                    i2 = num.intValue();
                                } else {
                                    i2 = 0;
                                }
                                Intrinsics.checkNotNullExpressionValue(valueOf2, "");
                                String LIZ = value.LIZ(i2, i, valueOf2.intValue());
                                if (LIZ == null) {
                                    LIZ = LIZJ2;
                                }
                                LinkPlayerInfo LIZ2 = c80557Hp9.LIZ();
                                if (LIZ2 != null && LIZ2.LIZIZ()) {
                                    IOU iou = c80557Hp9.LJIJJ;
                                    if (iou != null) {
                                        LinkPlayerInfo LIZ3 = c80557Hp9.LIZ();
                                        if (LIZ3 != null && (micDress = LIZ3.LJJIJL) != null && (voiceWave = micDress.LIZIZ) != null) {
                                            imageModel = voiceWave.LIZ(i);
                                        }
                                        iou.LIZIZ(imageModel);
                                    }
                                } else {
                                    IOU iou2 = c80557Hp9.LJIJJ;
                                    if (iou2 != null) {
                                        iou2.LIZ(LIZ);
                                    }
                                }
                            }
                            HSImageView hSImageView4 = c80557Hp9.LJIIJJI;
                            if (hSImageView4 != null) {
                                hSImageView4.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (c80557Hp9.LJJJJI) {
                        valueOf = c80557Hp9.LJJJIL;
                    } else {
                        valueOf = Integer.valueOf(c80557Hp9.LIZJ);
                    }
                    if (valueOf != null && valueOf.intValue() == 0) {
                        c80557Hp9.LIZLLL();
                        return;
                    }
                    IOU iou3 = c80557Hp9.LJIJJ;
                    if (iou3 == null) {
                        return;
                    }
                    iou3.LIZ();
                    return;
                }
                c80557Hp9.LIZLLL();
                return;
            }
            LinkPlayerInfo LIZ4 = c80557Hp9.LIZ();
            if (LIZ4 == null || !LIZ4.LIZIZ() || (hSImageView = c80557Hp9.LJIIJJI) == null) {
                return;
            }
            hSImageView.setVisibility(0);
        }
    }

    public final void LIZ(List<LinkPlayerInfo> list) {
        List mutableList;
        C4374l c4374l;
        boolean z;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZJ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        C80557Hp9 c80557Hp9 = this.LIZLLL;
        if (c80557Hp9 != null && !PatchProxy.proxy(new Object[]{list}, c80557Hp9, C80557Hp9.LIZ, false, 13).isSupported) {
            C106862S5w.LIZ(list);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, c80557Hp9, C80557Hp9.LIZ, false, 54);
            if (proxy.isSupported) {
                mutableList = (List) proxy.result;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((LinkPlayerInfo) obj).LJFF()) {
                        arrayList.add(obj);
                    }
                }
                mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
            }
            List<LinkPlayerInfo> LIZ = c80557Hp9.LIZ(list);
            List<LinkPlayerInfo> LIZIZ = c80557Hp9.LIZIZ(list);
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ2 != null) {
                LIZ2.LJJZ().LIZ(new C3E8(mutableList.size(), LIZ2.LJJZ().LIZ().LIZIZ));
                IUser LIZ3 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                long id = LIZ3.getId();
                C2WC<Boolean> LJJZZI = LIZ2.LJJZZI();
                if (!(LIZ instanceof Collection) || !LIZ.isEmpty()) {
                    for (LinkPlayerInfo linkPlayerInfo : LIZ) {
                        User LIZ4 = linkPlayerInfo.LIZ();
                        if (LIZ4 != null && LIZ4.getId() == id) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                LJJZZI.LIZ(Boolean.valueOf(z));
            }
            if (!PatchProxy.proxy(new Object[]{LIZIZ}, c80557Hp9, C80557Hp9.LIZ, false, 14).isSupported && (c4374l = c80557Hp9.LJJIIJ) != null) {
                c4374l.LIZ(LIZIZ);
            }
            AbstractKtvSeatListAdapter abstractKtvSeatListAdapter = c80557Hp9.LJJII;
            if (abstractKtvSeatListAdapter != null) {
                abstractKtvSeatListAdapter.LIZ(LIZ);
            }
            if (true ^ LIZ.isEmpty()) {
                RecyclerView recyclerView = c80557Hp9.LJIILL;
                if (recyclerView != null) {
                    recyclerView.setVisibility(0);
                }
                View view = c80557Hp9.LJIILLIIL;
                if (view != null) {
                    C3Q0.LIZLLL(view, LK5.LIZ(8.0f));
                }
            } else {
                RecyclerView recyclerView2 = c80557Hp9.LJIILL;
                if (recyclerView2 != null) {
                    recyclerView2.setVisibility(8);
                }
                View view2 = c80557Hp9.LJIILLIIL;
                if (view2 != null) {
                    C3Q0.LIZLLL(view2, LK5.LIZ(8.0f));
                }
            }
            AbstractKtvSeatListAdapter abstractKtvSeatListAdapter2 = c80557Hp9.LJJIFFI;
            if (abstractKtvSeatListAdapter2 != null) {
                abstractKtvSeatListAdapter2.LIZ(LIZIZ);
            }
            c80557Hp9.LJJIIJZLJL.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0633  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e5  */
    /* JADX WARN: Type inference failed for: r3v149 */
    /* JADX WARN: Type inference failed for: r3v59, types: [android.widget.FrameLayout, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v31, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v42, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r4v50, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdk.chatroom.p517u.C6306l r22, com.bytedance.ies.sdk.widgets.WidgetManager r23) {
        /*
            Method dump skipped, instructions count: 1624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.voicechat.ktv.KtvSeatSceneWidget.LIZ(com.bytedance.android.livesdk.chatroom.u.l, com.bytedance.ies.sdk.widgets.WidgetManager):void");
    }

    public KtvSeatSceneWidget(AbstractC5143z abstractC5143z, C4377t c4377t, C4369e c4369e) {
        C106862S5w.LIZ(abstractC5143z, c4377t, c4369e);
        this.LJFF = abstractC5143z;
        this.LJI = c4377t;
        this.LJII = c4369e;
    }
}
