package anet.channel.statist;

import anet.channel.GlobalAppRuntimeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;

@Monitor(module = "networkPrefer", monitorPoint = "strategy_stat")
/* loaded from: classes2.dex */
public class StrategyStatObject extends StatObject {
    @Dimension
    public StringBuilder errorTrace;
    @Dimension
    public int isFileExists;
    @Dimension
    public int isReadObjectSucceed;
    @Dimension
    public int isRenameSucceed;
    @Dimension
    public int isSucceed;
    @Dimension
    public int isTempWriteSucceed;
    @Measure
    public long readCostTime;
    @Dimension
    public String readStrategyFileId;
    @Dimension
    public String readStrategyFilePath;
    @Dimension
    public int type;
    @Measure
    public long writeCostTime;
    @Dimension
    public String writeStrategyFileId;
    @Dimension
    public String writeStrategyFilePath;
    @Dimension
    public String writeTempFilePath;

    static {
        Covode.recordClassIndex(2281);
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        return GlobalAppRuntimeInfo.isTargetProcess();
    }

    public StrategyStatObject(int i) {
        this.type = -1;
        this.type = i;
    }

    public void appendErrorTrace(String str, Throwable th) {
        String message = th.getMessage();
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        StringBuilder sb = this.errorTrace;
        sb.append(LoggerUtil.M_LEFT_TAG);
        sb.append(str);
        sb.append(LoggerUtil.M_RIGHT_TAG);
        sb.append(str);
        sb.append(LoggerUtil.BLANK_TAG);
        sb.append(message);
        sb.append('\n');
    }
}
