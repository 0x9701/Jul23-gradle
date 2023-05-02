package eth.ox9701.cache.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("his_config_info")
public class HisConfigInfo implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer nid;
    private String dataId;
    private String groupId;
    private String appName;
    private String content;
    private String md5;
    private String gmtCreate;
    private String srcUser;
    private String srcIp;
    private String opType;
    private String tenantId;

}
