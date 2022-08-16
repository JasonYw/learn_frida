package com.bytedance.android.live.effect.model;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public class LocalFilterModel {
    public int coverResId;
    public String filterFilePath;

    /* renamed from: id */
    public String f26226id;
    public String name;

    static {
        Covode.recordClassIndex(24557);
    }

    public LocalFilterModel() {
    }

    public int getCoverResId() {
        return this.coverResId;
    }

    public String getFilterFilePath() {
        return this.filterFilePath;
    }

    public String getId() {
        return this.f26226id;
    }

    public String getName() {
        return this.name;
    }

    public void setCoverResId(int i) {
        this.coverResId = i;
    }

    public void setFilterFilePath(String str) {
        this.filterFilePath = str;
    }

    public void setId(String str) {
        this.f26226id = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public LocalFilterModel(String str, int i, String str2, String str3) {
        this.f26226id = str;
        this.coverResId = i;
        this.name = str2;
        this.filterFilePath = str3;
    }
}
