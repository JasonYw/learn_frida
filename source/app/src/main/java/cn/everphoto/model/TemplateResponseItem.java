package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.android.ugc.aweme.feed.model.Video;
import com.p1594ss.android.ugc.aweme.music.model.Music;
import com.p1594ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import p003X.C106862S5w;
import p003X.C83759Izh;

/* loaded from: classes4.dex */
public final class TemplateResponseItem implements Serializable {
    public static final C83759Izh Companion = new C83759Izh((byte) 0);
    @SerializedName("author")
    public final User author;
    @SerializedName("client_key")
    public final String clientKey;
    @SerializedName("desc")
    public final String description;
    @SerializedName("extra")
    public final String extra;
    @SerializedName("fragment_count")
    public final int fragmentCount;
    @SerializedName("template_id")

    /* renamed from: id */
    public final long f21069id;
    @SerializedName("is_collected")
    public final boolean isCollected;
    @SerializedName("item_type")
    public final int itemType;
    @SerializedName("md5")
    public final String md5;
    @SerializedName("music")
    public final Music music;
    @SerializedName("nle_template_md5")
    public final String nleTemplateMd5;
    @SerializedName("nle_template_url")
    public final String nleTemplateUrl;
    @SerializedName("sdk_version")
    public final String sdkVersion;
    @SerializedName("share_id")
    public final String shareId;
    @SerializedName("template_url")
    public final String templateUrl;
    @SerializedName("title")
    public final String title;
    @SerializedName("usage_amount")
    public final long usageAmount;
    @SerializedName("video")
    public final Video video;

    static {
        Covode.recordClassIndex(3628);
    }

    public TemplateResponseItem() {
        this(0L, null, null, null, null, null, null, 0, 0L, null, false, null, 0, null, null, null, null, null, 262143);
    }

    public TemplateResponseItem(long j, User user, Music music, Video video, String str, String str2, String str3, int i, long j2, String str4, boolean z, String str5, int i2, String str6, String str7, String str8, String str9, String str10) {
        C106862S5w.LIZ(str, str2, str3, str4, str5, str9, str10);
        this.f21069id = j;
        this.author = user;
        this.music = music;
        this.video = video;
        this.title = str;
        this.description = str2;
        this.templateUrl = str3;
        this.fragmentCount = i;
        this.usageAmount = j2;
        this.extra = str4;
        this.isCollected = z;
        this.sdkVersion = str5;
        this.itemType = i2;
        this.md5 = str6;
        this.shareId = str7;
        this.clientKey = str8;
        this.nleTemplateUrl = str9;
        this.nleTemplateMd5 = str10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TemplateResponseItem(long r23, com.p1594ss.android.ugc.aweme.profile.model.User r25, com.p1594ss.android.ugc.aweme.music.model.Music r26, com.p1594ss.android.ugc.aweme.feed.model.Video r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, int r31, long r32, java.lang.String r34, boolean r35, java.lang.String r36, int r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43) {
        /*
            r22 = this;
            r1 = r43
            r18 = r39
            r17 = r38
            r15 = r36
            r10 = r31
            r20 = r41
            r13 = r34
            r4 = r25
            r8 = r29
            r19 = r40
            r11 = r32
            r2 = r23
            r6 = r27
            r9 = r30
            r16 = r37
            r7 = r28
            r0 = r1 & 1
            if (r0 == 0) goto L26
            r2 = -1
        L26:
            r0 = r1 & 2
            if (r0 == 0) goto L2b
            r4 = 0
        L2b:
            r0 = r1 & 8
            if (r0 == 0) goto L30
            r6 = 0
        L30:
            r0 = r1 & 16
            java.lang.String r21 = "not_set"
            if (r0 == 0) goto L38
            r7 = r21
        L38:
            r0 = r1 & 32
            if (r0 == 0) goto L3e
            r8 = r21
        L3e:
            r0 = r1 & 64
            if (r0 == 0) goto L44
            r9 = r21
        L44:
            r0 = r1 & 128(0x80, float:1.794E-43)
            r14 = 0
            if (r0 == 0) goto L4a
            r10 = 0
        L4a:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L50
            r11 = 0
        L50:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L56
            r13 = r21
        L56:
            r0 = r1 & 1024(0x400, float:1.435E-42)
            if (r0 != 0) goto L5c
            r14 = r35
        L5c:
            r0 = r1 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L62
            r15 = r21
        L62:
            r0 = r1 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L68
            r16 = -1
        L68:
            r0 = r1 & 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L6e
            r17 = r21
        L6e:
            r0 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L74
            r18 = 0
        L74:
            r0 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L7c
            r19 = 0
        L7c:
            r0 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L83
            r20 = r21
        L83:
            r0 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 != 0) goto L8a
            r21 = r42
        L8a:
            r5 = 0
            r1 = r22
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.everphoto.model.TemplateResponseItem.<init>(long, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.music.model.Music, com.ss.android.ugc.aweme.feed.model.Video, java.lang.String, java.lang.String, java.lang.String, int, long, java.lang.String, boolean, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void");
    }
}
