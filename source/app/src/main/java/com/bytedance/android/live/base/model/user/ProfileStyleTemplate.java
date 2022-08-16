package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes12.dex */
public class ProfileStyleTemplate {
    @SerializedName("template_description")
    public String templateDescription;
    @SerializedName("template_id")
    public long templateId;
    @SerializedName("template_name")
    public String templateName;
    @SerializedName("template_url")
    public ImageModel templateUrl;

    static {
        Covode.recordClassIndex(14180);
    }

    public String getTemplateDescription() {
        return this.templateDescription;
    }

    public long getTemplateId() {
        return this.templateId;
    }

    public String getTemplateName() {
        return this.templateName;
    }

    public ImageModel getTemplateUrl() {
        return this.templateUrl;
    }
}
