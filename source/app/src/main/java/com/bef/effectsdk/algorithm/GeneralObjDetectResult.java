package com.bef.effectsdk.algorithm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class GeneralObjDetectResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ObjectInfo[] obj_infos;
    public String obj_infos_data;
    public int obj_num;
    public int res;

    static {
        Covode.recordClassIndex(9544);
    }

    public ObjectInfo[] getObjectInfos() {
        return this.obj_infos;
    }

    public String getObjectInfosData() {
        return this.obj_infos_data;
    }

    public int getObjectNum() {
        return this.obj_num;
    }

    public int getResult() {
        return this.res;
    }

    public GeneralObjDetectResult() {
        this.res = -1;
    }

    public void logData() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        for (int i = 0; i < this.obj_num; i++) {
            this.obj_infos[i].logData();
        }
    }

    public void ObjectInfosData(String str) {
        this.obj_infos_data = str;
    }

    public void setObjectInfos(ObjectInfo[] objectInfoArr) {
        this.obj_infos = objectInfoArr;
    }

    public void setObjectNum(int i) {
        this.obj_num = i;
    }

    public void setResult(int i) {
        this.res = i;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
    }

    public GeneralObjDetectResult(int i, ObjectInfo[] objectInfoArr, String str) {
        this.obj_num = i;
        this.obj_infos = objectInfoArr;
        this.obj_infos_data = str;
    }
}
