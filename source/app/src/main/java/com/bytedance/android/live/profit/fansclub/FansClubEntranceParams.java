package com.bytedance.android.live.profit.fansclub;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class FansClubEntranceParams {
    public final Page LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f26557LJ;
    public Entrance LJFF;
    public boolean LJI;

    /* loaded from: classes12.dex */
    public enum Entrance {
        Unspecified,
        UserInfoFansClubWidget,
        SubscribeEmojiPanel,
        PersonalProfile;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33263);
        }

        public static Entrance valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Entrance) (proxy.isSupported ? proxy.result : Enum.valueOf(Entrance.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Entrance[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Entrance[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    /* loaded from: classes12.dex */
    public enum Page {
        Default,
        SendGiftJoin,
        AutoReactivate;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(33264);
        }

        public static Page valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Page) (proxy.isSupported ? proxy.result : Enum.valueOf(Page.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Page[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Page[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(33262);
    }

    public FansClubEntranceParams(Page page, boolean z, String str, String str2, String str3, Entrance entrance, boolean z2) {
        C106862S5w.LIZ(page, str, str2, str3, entrance);
        this.LIZ = page;
        this.LIZIZ = z;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26557LJ = str3;
        this.LJFF = entrance;
        this.LJI = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ FansClubEntranceParams(com.bytedance.android.live.profit.fansclub.FansClubEntranceParams.Page r9, boolean r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.bytedance.android.live.profit.fansclub.FansClubEntranceParams.Entrance r14, boolean r15, int r16) {
        /*
            r8 = this;
            r7 = r15
            r6 = r14
            r4 = r12
            r2 = r10
            r3 = r11
            r1 = r16 & 2
            r0 = 0
            if (r1 == 0) goto Lb
            r2 = 0
        Lb:
            r0 = r16 & 4
            java.lang.String r5 = ""
            if (r0 == 0) goto L12
            r3 = r5
        L12:
            r0 = r16 & 8
            if (r0 == 0) goto L17
            r4 = r5
        L17:
            r0 = r16 & 16
            if (r0 != 0) goto L1c
            r5 = r13
        L1c:
            r0 = r16 & 32
            if (r0 == 0) goto L22
            com.bytedance.android.live.profit.fansclub.FansClubEntranceParams$Entrance r6 = com.bytedance.android.live.profit.fansclub.FansClubEntranceParams.Entrance.Unspecified
        L22:
            r0 = r16 & 64
            if (r0 == 0) goto L27
            r7 = 0
        L27:
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.profit.fansclub.FansClubEntranceParams.<init>(com.bytedance.android.live.profit.fansclub.FansClubEntranceParams$Page, boolean, java.lang.String, java.lang.String, java.lang.String, com.bytedance.android.live.profit.fansclub.FansClubEntranceParams$Entrance, boolean, int):void");
    }
}
