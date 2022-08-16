package com.bytedance.android.live.effect.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.p1594ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.KEF;
import p003X.KM9;

/* loaded from: classes5.dex */
public class FilterModel {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Effect effect;
    public KEF filterConfig;
    public int filterType;
    public boolean hasFilterConfig;
    public boolean isNew;
    public LocalFilterModel localFilter;
    public String replaceBeauty;
    public List<String> tags;
    public int usedType;

    static {
        Covode.recordClassIndex(24555);
    }

    public FilterModel() {
    }

    public Effect getEffect() {
        return this.effect;
    }

    public int getFilterType() {
        return this.filterType;
    }

    public LocalFilterModel getLocalFilter() {
        return this.localFilter;
    }

    public String getReplaceBeauty() {
        return this.replaceBeauty;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public int getUsedType() {
        return this.usedType;
    }

    public boolean isFilterConfig() {
        return this.hasFilterConfig;
    }

    public boolean isNew() {
        return this.isNew;
    }

    public int getCurrentLevel() {
        if (this.hasFilterConfig) {
            return this.filterConfig.LIZLLL;
        }
        return 0;
    }

    public int getDefaultLevel() {
        if (this.hasFilterConfig) {
            return this.filterConfig.LIZJ;
        }
        return 0;
    }

    public int getMaxLevel() {
        if (this.hasFilterConfig) {
            return this.filterConfig.LIZ;
        }
        return 0;
    }

    public int getMinLevel() {
        if (this.hasFilterConfig) {
            return this.filterConfig.LIZIZ;
        }
        return 0;
    }

    public String getEffectId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Effect effect = this.effect;
        if (effect != null) {
            return effect.getEffectId();
        }
        return "";
    }

    public String getFilterId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            return this.effect.getEffectId();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return null;
        }
        return localFilterModel.getId();
    }

    public String getName() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2) {
                return null;
            }
            return this.effect.getName();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return null;
        }
        return localFilterModel.getName();
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return getFilterId().hashCode();
    }

    public String getFilterPath() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = this.filterType;
        if (i != 0 && i != 1) {
            if (i != 2 || !new File(this.effect.getUnzipPath(), "config.json").exists()) {
                return "";
            }
            return new File(this.effect.getUnzipPath()).getAbsolutePath();
        }
        LocalFilterModel localFilterModel = this.localFilter;
        if (localFilterModel == null) {
            return "";
        }
        return localFilterModel.getFilterFilePath();
    }

    public void setEffect(Effect effect) {
        this.effect = effect;
    }

    public void setFilterType(int i) {
        this.filterType = i;
    }

    public void setLocalFilter(LocalFilterModel localFilterModel) {
        this.localFilter = localFilterModel;
    }

    public void setNew(boolean z) {
        this.isNew = z;
    }

    public void setReplaceBeauty(String str) {
        this.replaceBeauty = str;
    }

    public void setUsedType(int i) {
        this.usedType = i;
    }

    public FilterModel(Effect effect) {
        this.filterType = 2;
        this.effect = effect;
    }

    public void setCurrentLevel(int i) {
        if (this.hasFilterConfig) {
            this.filterConfig.LIZLLL = i;
        }
    }

    public void setTags(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        this.tags = new ArrayList();
        this.tags.addAll(list);
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FilterModel)) {
            return false;
        }
        return TextUtils.equals(getFilterId(), ((FilterModel) obj).getFilterId());
    }

    public void setFilterConfig(String str) {
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        if (str.equals("")) {
            this.filterConfig = null;
            this.hasFilterConfig = false;
            return;
        }
        try {
            this.filterConfig = (KEF) GsonProtectorUtils.fromJson(KM9.LIZ(), new JSONObject(str).getJSONObject("filterconfig").toString(), (Class<Object>) KEF.class);
            if (this.filterConfig.LIZ == 0) {
                z = false;
            }
            this.hasFilterConfig = z;
            this.filterConfig.LIZLLL = this.filterConfig.LIZJ;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
