package com.bytedance.android.live.emoji;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.emoji.BaseEmoji;
import com.bytedance.android.live.base.model.emoji.EmojiUriNode;
import com.bytedance.android.live.emoji.api.IEmojiService;
import com.bytedance.android.live.emoji.api.p332a.AbstractC4230a;
import com.bytedance.android.live.emoji.api.p333b.C4231a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.p518ui.RtlViewPagerShower;
import com.bytedance.android.livesdk.chatroom.p518ui.SSGridLayoutManager;
import com.bytedance.common.utility.Lists;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.List;
import p003X.C120611Xdd;
import p003X.C120612Xde;
import p003X.C134211br9;
import p003X.C134213brB;
import p003X.C134333bt7;
import p003X.C134335bt9;
import p003X.C134336btA;
import p003X.C134338btC;
import p003X.C134340btE;
import p003X.C91122LvA;
import p003X.C91132LvK;
import p003X.M1T;

/* loaded from: classes17.dex */
public class EmojiService implements IEmojiService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24843);
    }

    public EmojiService() {
        ServiceManager.registerService(IEmojiService.class, this);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public List<BaseEmoji> getRecommendEmojiList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        return new C134213brB().LIZIZ();
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public List<C4231a> parseEmojiIndexList(CharSequence charSequence) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{charSequence}, LIZ, C134211br9.LIZ, false, 7);
        if (proxy2.isSupported) {
            return (List) proxy2.result;
        }
        return LIZ.LIZIZ.LIZ(charSequence);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public List<EmojiUriNode> parseEmojiUriList(CharSequence charSequence) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{charSequence}, LIZ, C134211br9.LIZ, false, 8);
        if (proxy2.isSupported) {
            return (List) proxy2.result;
        }
        return LIZ.LIZIZ.LIZIZ(charSequence);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public C134333bt7 createEmojiEditText(Context context, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (C134333bt7) proxy.result;
        }
        C134335bt9 c134335bt9 = new C134335bt9(context);
        c134335bt9.setTextEmojiSize(i);
        return c134335bt9;
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public String getStringForMaxLength(String str, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Iterator<C4231a> it = parseEmojiIndexList(str).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4231a next = it.next();
            if (next.LIZJ > i && i >= next.LIZIZ) {
                i = next.LIZIZ;
                break;
            }
        }
        return str.substring(0, Math.min(i, str.length()));
    }

    @Override // p003X.AbstractC459134Dr
    public Spannable parseEmoji(Spannable spannable, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (Spannable) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, LIZ, C134211br9.LIZ, false, 3);
        if (proxy2.isSupported) {
            return (Spannable) proxy2.result;
        }
        return LIZ.LIZIZ.LIZIZ(spannable, i);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public Spannable parseEmojiForMiniGame(Spannable spannable, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (Spannable) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, LIZ, C134211br9.LIZ, false, 4);
        if (proxy2.isSupported) {
            return (Spannable) proxy2.result;
        }
        return LIZ.LIZIZ.LIZ(spannable, i);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public SpannableString parseEmojiV2(SpannableString spannableString, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{spannableString, Integer.valueOf(i)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (SpannableString) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{spannableString, Integer.valueOf(i)}, LIZ, C134211br9.LIZ, false, 6);
        if (proxy2.isSupported) {
            return (SpannableString) proxy2.result;
        }
        return LIZ.LIZIZ.LIZ(spannableString, i);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public Spannable parseOnlyEmoji(Spannable spannable, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (Spannable) proxy.result;
        }
        C134211br9 LIZ = C134211br9.LIZ();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{spannable, Integer.valueOf(i)}, LIZ, C134211br9.LIZ, false, 5);
        if (proxy2.isSupported) {
            return (Spannable) proxy2.result;
        }
        return LIZ.LIZIZ.LIZJ(spannable, i);
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public SpannableString parseEmojiWithFontSize(Context context, CharSequence charSequence, float f, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, charSequence, Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (SpannableString) proxy.result;
        }
        return C134211br9.LIZ().LIZ(charSequence, f, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public View createEmojiSelectPanel(Context context, boolean z, int i, M1T m1t) {
        int i2;
        int i3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), m1t}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C134336btA c134336btA = new C134336btA(context);
        c134336btA.setOnEmojiSelectListener(m1t);
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z), Integer.valueOf(i)}, c134336btA, C134336btA.LIZ, false, 1).isSupported) {
            c134336btA.LJII = z;
            if (c134336btA.LJII) {
                i2 = 3;
            } else {
                i2 = 2;
            }
            c134336btA.LJIIIIZZ = i2;
            if (c134336btA.LJII) {
                i3 = 6;
            } else {
                i3 = 12;
            }
            c134336btA.LJIIIZ = i3;
            c134336btA.LJIIJ = c134336btA.LJIIIIZZ * c134336btA.LJIIIZ;
            c134336btA.LJIIJJI = i;
            if (!PatchProxy.proxy(new Object[0], c134336btA, C134336btA.LIZ, false, 2).isSupported) {
                c134336btA.LIZIZ = (RecyclerView) c134336btA.findViewById(2131169151);
                c134336btA.LIZLLL = (RtlViewPagerShower) c134336btA.findViewById(2131184797);
                c134336btA.LIZJ = new C134340btE(c134336btA.getContext(), c134336btA.LJIIIIZZ, c134336btA.LJIIIZ, c134336btA.LJII, c134336btA.LJIIJJI, false);
                c134336btA.LIZJ.LIZJ = c134336btA;
                c134336btA.LIZIZ.setAdapter(c134336btA.LIZJ);
                c134336btA.LIZIZ.setLayoutManager(new SSGridLayoutManager(c134336btA.getContext(), c134336btA.LJIIIIZZ, 0, false));
                c134336btA.LIZIZ.setHasFixedSize(true);
                c134336btA.LIZIZ.setItemViewCacheSize(36);
                if (!PatchProxy.proxy(new Object[0], c134336btA, C134336btA.LIZ, false, 5).isSupported) {
                    C120611Xdd c120611Xdd = new C120611Xdd(c134336btA);
                    c120611Xdd.LIZ(c134336btA.LJIIIIZZ).LIZIZ(c134336btA.LJIIIZ);
                    c120611Xdd.LIZ(c134336btA.LIZIZ);
                    c134336btA.LIZIZ.addOnScrollListener(new C120612Xde(c134336btA));
                }
                c134336btA.LIZLLL.setMargin((int) c134336btA.getContext().getResources().getDimension(2131429344));
                c134336btA.LIZLLL.LIZ(c134336btA.getContext().getResources().getDrawable(2130855782), c134336btA.getContext().getResources().getDrawable(2130855783));
            }
            if (!PatchProxy.proxy(new Object[0], c134336btA, C134336btA.LIZ, false, 3).isSupported) {
                List<BaseEmoji> LIZIZ = C134211br9.LIZ().LIZIZ();
                if (!PatchProxy.proxy(new Object[]{LIZIZ}, c134336btA, C134336btA.LIZ, false, 4).isSupported && !Lists.isEmpty(LIZIZ)) {
                    C134340btE c134340btE = c134336btA.LIZJ;
                    if (!PatchProxy.proxy(new Object[]{LIZIZ}, c134340btE, C134340btE.LIZ, false, 1).isSupported) {
                        List<BaseEmoji> LIZ = c134340btE.LIZ(LIZIZ);
                        c134340btE.LIZIZ.clear();
                        if (LIZ != null) {
                            c134340btE.LIZIZ.addAll(LIZ);
                        }
                    }
                    c134336btA.LIZJ.notifyDataSetChanged();
                    c134336btA.LJI = (LIZIZ.size() / c134336btA.LJIIJ) + 1;
                    c134336btA.LIZLLL.LIZ(c134336btA.LJI, c134336btA.f17796LJ);
                }
            }
        }
        return c134336btA;
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public View createNewEmojiSelectPanel(Context context, boolean z, int i, C91132LvK c91132LvK, AbstractC4230a abstractC4230a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), c91132LvK, abstractC4230a}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C91122LvA c91122LvA = new C91122LvA(context, null, 0, i, z, c91132LvK);
        c91122LvA.setOnCommentSendDelegate(abstractC4230a);
        return c91122LvA;
    }

    @Override // com.bytedance.android.live.emoji.api.IEmojiService
    public View createVSEmojiSelectPanel(Context context, boolean z, int i, int i2, M1T m1t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), m1t}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C134338btC c134338btC = new C134338btC(context, i2);
        c134338btC.setOnEmojiSelectListener(m1t);
        c134338btC.LIZ(z, i);
        return c134338btC;
    }
}
