package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class MergedTemplateItem implements Serializable {
    @SerializedName("ulike_info")
    public final TemplateResponseItem cutSameInfo;
    @SerializedName("mv_info")
    public final MvModel mvInfo;
    @SerializedName("template_id")
    public final long templateId;
    @SerializedName("template_type")
    public final int type;
    @SerializedName("url_prefix")
    public final String[] urlPrefix;

    static {
        Covode.recordClassIndex(3619);
    }

    public MergedTemplateItem() {
        this(0L, 0, null, null, null, 31);
    }

    public MergedTemplateItem(long j, int i, TemplateResponseItem templateResponseItem, MvModel mvModel, String[] strArr) {
        this.templateId = j;
        this.type = i;
        this.cutSameInfo = templateResponseItem;
        this.mvInfo = mvModel;
        this.urlPrefix = strArr;
    }

    public /* synthetic */ MergedTemplateItem(long j, int i, TemplateResponseItem templateResponseItem, MvModel mvModel, String[] strArr, int i2) {
        this((i2 & 1) != 0 ? -1L : j, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? null : templateResponseItem, null, null);
    }
}
