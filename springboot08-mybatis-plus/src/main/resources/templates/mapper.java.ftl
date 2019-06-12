package ${package.Mapper};

import ${package.Entity}.${entity};
import ${superMapperClassPackage};

/**
*
* ${entity}Mapper 接口
*
* @Project: ${cfg.project}
* @Author: ${author}
* @Date: ${date}
* @Description:
*/
<#if kotlin>
interface ${table.mapperName} : ${superMapperClass}<${entity}>
<#else>
public interface ${table.mapperName} extends ${superMapperClass}<${entity}> {

}
</#if>