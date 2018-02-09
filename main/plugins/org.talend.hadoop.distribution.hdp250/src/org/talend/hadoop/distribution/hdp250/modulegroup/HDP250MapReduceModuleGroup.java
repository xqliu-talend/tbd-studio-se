// ============================================================================
//
// Copyright (C) 2006-2018 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.hadoop.distribution.hdp250.modulegroup;

import java.util.HashSet;
import java.util.Set;

import org.talend.hadoop.distribution.DistributionModuleGroup;
import org.talend.hadoop.distribution.condition.BasicExpression;
import org.talend.hadoop.distribution.condition.ComponentCondition;
import org.talend.hadoop.distribution.condition.SimpleComponentCondition;
import org.talend.hadoop.distribution.constants.MRConstant;
import org.talend.hadoop.distribution.hdp250.HDP250Constant;

public class HDP250MapReduceModuleGroup {

    public static Set<DistributionModuleGroup> getModuleGroups() {
        Set<DistributionModuleGroup> hs = new HashSet<>();
        hs.add(new DistributionModuleGroup(HDP250Constant.HDFS_MODULE_GROUP.getModuleName()));
        hs.add(new DistributionModuleGroup(HDP250Constant.MAPREDUCE_MODULE_GROUP.getModuleName()));
        hs.add(new DistributionModuleGroup(HDP250Constant.MAPREDUCE_PARQUET_MODULE_GROUP.getModuleName()));
        hs.add(new DistributionModuleGroup(HDP250Constant.MAPREDUCE_PARQUET_MRREQUIRED_MODULE_GROUP.getModuleName(), true, null));

        ComponentCondition useAtlas = new SimpleComponentCondition(new BasicExpression(MRConstant.USE_ATLAS));
        hs.add(new DistributionModuleGroup(HDP250Constant.ATLAS_HDP_2_5.getModuleName(), false, useAtlas));
        return hs;
    }
}
