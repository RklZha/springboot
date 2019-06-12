package ${package.Service};

import ${package.Entity}.${entity};
import ${superServiceClassPackage};

/**
*
* ${entity} 服务类
*
* @Project: ${cfg.project}
* @Author: ${author}
* @Date: ${date}
* @Description:
*/
<#if kotlin>
    interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass}<${entity}> {

}
</#if>