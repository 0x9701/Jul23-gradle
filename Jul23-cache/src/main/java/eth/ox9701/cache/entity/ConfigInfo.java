package eth.ox9701.cache.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;

/**
 * config_info
 * @TableName config_info
 */
@TableName(value ="config_info")
public class ConfigInfo implements Serializable {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * data_id
     */
    private String dataId;

    /**
     * 
     */
    private String groupId;

    /**
     * content
     */
    private String content;

    /**
     * md5
     */
    private String md5;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 修改时间
     */
    private Date gmtModified;

    /**
     * source user
     */
    private String srcUser;

    /**
     * source ip
     */
    private String srcIp;

    /**
     * 
     */
    private String appName;

    /**
     * 租户字段
     */
    private String tenantId;

    /**
     * 
     */
    private String cDesc;

    /**
     * 
     */
    private String cUse;

    /**
     * 
     */
    private String effect;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String cSchema;

    /**
     * 秘钥
     */
    private String encryptedDataKey;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * data_id
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * data_id
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    /**
     * 
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * 
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    /**
     * content
     */
    public String getContent() {
        return content;
    }

    /**
     * content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * md5
     */
    public String getMd5() {
        return md5;
    }

    /**
     * md5
     */
    public void setMd5(String md5) {
        this.md5 = md5;
    }

    /**
     * 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * source user
     */
    public String getSrcUser() {
        return srcUser;
    }

    /**
     * source user
     */
    public void setSrcUser(String srcUser) {
        this.srcUser = srcUser;
    }

    /**
     * source ip
     */
    public String getSrcIp() {
        return srcIp;
    }

    /**
     * source ip
     */
    public void setSrcIp(String srcIp) {
        this.srcIp = srcIp;
    }

    /**
     * 
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 租户字段
     */
    public String getTenantId() {
        return tenantId;
    }

    /**
     * 租户字段
     */
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     * 
     */
    public String getcDesc() {
        return cDesc;
    }

    /**
     * 
     */
    public void setcDesc(String cDesc) {
        this.cDesc = cDesc;
    }

    /**
     * 
     */
    public String getcUse() {
        return cUse;
    }

    /**
     * 
     */
    public void setcUse(String cUse) {
        this.cUse = cUse;
    }

    /**
     * 
     */
    public String getEffect() {
        return effect;
    }

    /**
     * 
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     */
    public String getcSchema() {
        return cSchema;
    }

    /**
     * 
     */
    public void setcSchema(String cSchema) {
        this.cSchema = cSchema;
    }

    /**
     * 秘钥
     */
    public String getEncryptedDataKey() {
        return encryptedDataKey;
    }

    /**
     * 秘钥
     */
    public void setEncryptedDataKey(String encryptedDataKey) {
        this.encryptedDataKey = encryptedDataKey;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ConfigInfo other = (ConfigInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getDataId() == null ? other.getDataId() == null : this.getDataId().equals(other.getDataId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getMd5() == null ? other.getMd5() == null : this.getMd5().equals(other.getMd5()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getSrcUser() == null ? other.getSrcUser() == null : this.getSrcUser().equals(other.getSrcUser()))
            && (this.getSrcIp() == null ? other.getSrcIp() == null : this.getSrcIp().equals(other.getSrcIp()))
            && (this.getAppName() == null ? other.getAppName() == null : this.getAppName().equals(other.getAppName()))
            && (this.getTenantId() == null ? other.getTenantId() == null : this.getTenantId().equals(other.getTenantId()))
            && (this.getcDesc() == null ? other.getcDesc() == null : this.getcDesc().equals(other.getcDesc()))
            && (this.getcUse() == null ? other.getcUse() == null : this.getcUse().equals(other.getcUse()))
            && (this.getEffect() == null ? other.getEffect() == null : this.getEffect().equals(other.getEffect()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getcSchema() == null ? other.getcSchema() == null : this.getcSchema().equals(other.getcSchema()))
            && (this.getEncryptedDataKey() == null ? other.getEncryptedDataKey() == null : this.getEncryptedDataKey().equals(other.getEncryptedDataKey()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getDataId() == null) ? 0 : getDataId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getMd5() == null) ? 0 : getMd5().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        result = prime * result + ((getSrcUser() == null) ? 0 : getSrcUser().hashCode());
        result = prime * result + ((getSrcIp() == null) ? 0 : getSrcIp().hashCode());
        result = prime * result + ((getAppName() == null) ? 0 : getAppName().hashCode());
        result = prime * result + ((getTenantId() == null) ? 0 : getTenantId().hashCode());
        result = prime * result + ((getcDesc() == null) ? 0 : getcDesc().hashCode());
        result = prime * result + ((getcUse() == null) ? 0 : getcUse().hashCode());
        result = prime * result + ((getEffect() == null) ? 0 : getEffect().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getcSchema() == null) ? 0 : getcSchema().hashCode());
        result = prime * result + ((getEncryptedDataKey() == null) ? 0 : getEncryptedDataKey().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", dataId=").append(dataId);
        sb.append(", groupId=").append(groupId);
        sb.append(", content=").append(content);
        sb.append(", md5=").append(md5);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append(", srcUser=").append(srcUser);
        sb.append(", srcIp=").append(srcIp);
        sb.append(", appName=").append(appName);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", cDesc=").append(cDesc);
        sb.append(", cUse=").append(cUse);
        sb.append(", effect=").append(effect);
        sb.append(", type=").append(type);
        sb.append(", cSchema=").append(cSchema);
        sb.append(", encryptedDataKey=").append(encryptedDataKey);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}