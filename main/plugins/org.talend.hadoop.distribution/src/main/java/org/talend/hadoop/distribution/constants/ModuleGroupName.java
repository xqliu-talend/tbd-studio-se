package org.talend.hadoop.distribution.constants;

public enum ModuleGroupName {
    GCS("GCS-GROUP");
    
    private String baseName;
    
    private ModuleGroupName(String baseName) {
        this.baseName = baseName;
    }
    
    public String get(String distributionVersion) {
        return this.baseName + "-" + distributionVersion;
    }
}
