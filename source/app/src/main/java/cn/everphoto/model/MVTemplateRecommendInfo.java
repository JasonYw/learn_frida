package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ttve.model.refactor.algorithm.VEModelMVTemplateInfo;
import java.io.Serializable;
import p003X.C106862S5w;

/* loaded from: classes13.dex */
public final class MVTemplateRecommendInfo implements Serializable {
    public final MusicFeatInfo[] music_edit_info;
    public final VEModelMVTemplateInfo[] templates_info;

    static {
        Covode.recordClassIndex(3618);
    }

    public final MusicFeatInfo[] getMusic_edit_info() {
        return this.music_edit_info;
    }

    public final VEModelMVTemplateInfo[] getTemplates_info() {
        return this.templates_info;
    }

    public MVTemplateRecommendInfo(VEModelMVTemplateInfo[] vEModelMVTemplateInfoArr, MusicFeatInfo[] musicFeatInfoArr) {
        C106862S5w.LIZ((Object) vEModelMVTemplateInfoArr);
        this.templates_info = vEModelMVTemplateInfoArr;
        this.music_edit_info = musicFeatInfoArr;
    }
}
