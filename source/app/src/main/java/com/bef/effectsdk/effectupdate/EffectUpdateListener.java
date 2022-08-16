package com.bef.effectsdk.effectupdate;

import android.util.Pair;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.geckox.GeckoConfig;
import com.bytedance.geckox.listener.GeckoUpdateListener;
import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.geckox.utils.ResLoadUtils;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes2.dex */
public class EffectUpdateListener extends GeckoUpdateListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public GeckoConfig mConfig;
    public File mModulesDir;
    public File mModulesUpdateDir;
    public String mUpdateSuccessFileName;
    public final ArrayList<String> mUpdateSuccessList = new ArrayList<>();
    public final ArrayList<String> mUpdateFailedList = new ArrayList<>();

    static {
        Covode.recordClassIndex(9551);
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onActivateFail(UpdatePackage updatePackage, Throwable th) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onActivateSuccess(UpdatePackage updatePackage) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onCheckRequestIntercept(int i, Map<String, List<Pair<String, Long>>> map, Throwable th) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onCheckServerVersionFail(Map<String, List<Pair<String, Long>>> map, Throwable th) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onCheckServerVersionSuccess(Map<String, List<Pair<String, Long>>> map, Map<String, List<UpdatePackage>> map2) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onDownloadFail(UpdatePackage updatePackage, Throwable th) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onDownloadSuccess(UpdatePackage updatePackage) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onLocalNewestVersion(LocalPackageModel localPackageModel) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onUpdateStart(UpdatePackage updatePackage) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onUpdating(String str) {
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onUpdateFinish() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (this.mUpdateFailedList.size() > 0) {
            this.mUpdateFailedList.clear();
        } else if (this.mUpdateSuccessList.size() == 0) {
        } else {
            Iterator<String> it = this.mUpdateSuccessList.iterator();
            while (it.hasNext()) {
                it.next();
            }
            List<Pair<String, Long>> allLocalChannels = ResLoadUtils.getAllLocalChannels(this.mConfig.getResRootDir(), this.mConfig.getAccessKey());
            if (allLocalChannels != null) {
                Iterator<Pair<String, Long>> it2 = allLocalChannels.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        String str = (String) it2.next().first;
                        z = copyDirectory(new File(ResLoadUtils.getChannelPath(this.mConfig.getResRootDir(), this.mConfig.getAccessKey(), str)), new File(this.mModulesUpdateDir, str));
                        if (!z) {
                            break;
                        }
                    } else if (z) {
                        try {
                            new File(this.mModulesUpdateDir, this.mUpdateSuccessFileName).createNewFile();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            this.mUpdateSuccessList.clear();
        }
    }

    public void setConfig(GeckoConfig geckoConfig) {
        this.mConfig = geckoConfig;
    }

    public void setModulesDir(File file) {
        this.mModulesDir = file;
    }

    public void setUpdateDir(File file) {
        this.mModulesUpdateDir = file;
    }

    public void setUpdateSuccessFileName(String str) {
        this.mUpdateSuccessFileName = str;
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onUpdateFailed(UpdatePackage updatePackage, Throwable th) {
        if (PatchProxy.proxy(new Object[]{updatePackage, th}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        this.mUpdateFailedList.add(updatePackage.getChannel());
    }

    @Override // com.bytedance.geckox.listener.GeckoUpdateListener
    public void onUpdateSuccess(UpdatePackage updatePackage, long j) {
        if (PatchProxy.proxy(new Object[]{updatePackage, new Long(j)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.mUpdateSuccessList.add(updatePackage.getChannel());
    }

    private boolean copyDirectory(File file, File file2) {
        MethodCollector.m14708i(660);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{file, file2}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(660);
            return booleanValue;
        }
        try {
            if (file.isDirectory()) {
                if (!file2.exists() && !file2.mkdirs()) {
                    MethodCollector.m14707o(660);
                    return false;
                }
                String[] list = file.list();
                if (list != null) {
                    for (int i = 0; i < list.length; i++) {
                        if (!copyDirectory(new File(file, list[i]), new File(file2, list[i]))) {
                            MethodCollector.m14707o(660);
                            return false;
                        }
                    }
                }
            } else {
                File parentFile = file2.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    MethodCollector.m14707o(660);
                    return false;
                }
                if (file2.exists()) {
                    C116971W2r.LIZ(file2);
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                byte[] bArr = new byte[AccessibilityEventCompat.TYPE_VIEW_SCROLLED];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            MethodCollector.m14707o(660);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            MethodCollector.m14707o(660);
            return false;
        }
    }
}
