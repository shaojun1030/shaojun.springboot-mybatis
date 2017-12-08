package com.example.multipledatasource.common.conf;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.sql.Connection;

@Configuration
@MapperScan(basePackages = MybatisMysqlConfig.PACKAGE, sqlSessionFactoryRef = "mysqlSessionFactory")
public class MybatisMysqlConfig {
    static Logger logger = LoggerFactory.getLogger(MybatisMysqlConfig.class);
    static final String PACKAGE = "com.example.multipledatasource.dao.mysql";
    static final String MAPPER_LOCATION = "mybatis/mysql/*Mapper.xml";
    @Autowired
    @Qualifier("mysqlDatasource")
    private DataSource mysqlDatasource;

    @Bean(name = "mysqlSessionFactory")
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(mysqlDatasource); // 使用mysql数据源
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(MAPPER_LOCATION));
        Connection connection = mysqlDatasource.getConnection();//连接测试
        connection.close();
        logger.info("检查mysql数据库连接成功...");
        return factoryBean.getObject();
    }

    @Bean(name = "mysqlSqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        SqlSessionTemplate template = new SqlSessionTemplate(sqlSessionFactory()); // 使用上面配置的Factory
        return template;
    }
}
