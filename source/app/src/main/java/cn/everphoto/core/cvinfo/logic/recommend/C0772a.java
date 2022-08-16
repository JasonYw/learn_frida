package cn.everphoto.core.cvinfo.logic.recommend;

import cn.everphoto.model.MVTemplateRecommendInfo;
import cn.everphoto.model.MusicInfo;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.everphoto.core.cvinfo.logic.recommend.a */
/* loaded from: classes13.dex */
public final class C0772a {
    public final MusicInfo LIZ;

    static {
        Covode.recordClassIndex(3595);
    }

    public C0772a() {
        this(null, null, 3);
    }

    public C0772a(MusicInfo musicInfo, MVTemplateRecommendInfo mVTemplateRecommendInfo) {
        this.LIZ = musicInfo;
    }

    public /* synthetic */ C0772a(MusicInfo musicInfo, MVTemplateRecommendInfo mVTemplateRecommendInfo, int i) {
        this((i & 1) != 0 ? null : musicInfo, null);
    }
}
