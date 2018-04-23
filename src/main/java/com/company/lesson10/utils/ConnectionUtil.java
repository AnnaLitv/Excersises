package com.company.lesson10.utils;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;

import javax.sql.DataSource;

public class ConnectionUtil {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String JDBC_DB_URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false&&serverTimezone=UTC";

    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "root";

    private static GenericObjectPool gPool = null;

    public DataSource setUpPool() throws Exception {
        Class.forName(JDBC_DRIVER);

        gPool = new GenericObjectPool();
        gPool.setMaxActive(5);
        ConnectionFactory cf = new DriverManagerConnectionFactory(JDBC_DB_URL, JDBC_USER, JDBC_PASS);

        PoolableConnectionFactory pcf = new PoolableConnectionFactory(cf, gPool, null, null, false, true);
        return new PoolingDataSource(gPool);
    }

    public GenericObjectPool getConnectionPool() {
        return gPool;
    }
}
