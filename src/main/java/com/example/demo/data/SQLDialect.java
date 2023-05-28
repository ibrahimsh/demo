package com.example.demo.data;

import java.sql.Types;

import org.hibernate.dialect.Dialect;
/*
import org.hibernate.dialect.function.StandardSQLFunction;
import org.hibernate.dialect.function.SQLFunctionTemplate;
import org.hibernate.dialect.function.VarArgsSQLFunction;
import org.hibernate.type.StringType;
*/
public class SQLDialect extends Dialect {

}
    /*
    public SQLDialect() {
        registerColumnTypes(Types.INTEGER,"");
        registerColumnTypes(Types.TINYINT, "tinyint");
        registerColumnTypes(Types.SMALLINT, "smallint");
        registerColumnTypes(Types.INTEGER, "integer");
        registerColumnTypes(Types.BIGINT, "bigint");
        registerColumnTypes(Types.FLOAT, "float");
        registerColumnTypes(Types.REAL, "real");
        registerColumnTypes(Types.DOUBLE, "double");
        registerColumnTypes(Types.NUMERIC, "numeric");
        registerColumnTypes(Types.DECIMAL, "decimal");
        registerColumnTypes(Types.CHAR, "char");
        registerColumnTypes(Types.VARCHAR, "varchar");
        registerColumnTypes(Types.LONGVARCHAR, "longvarchar");
        registerColumnTypes(Types.DATE, "date");
        registerColumnTypes(Types.TIME, "time");
        registerColumnTypes(Types.TIMESTAMP, "timestamp");
        registerColumnTypes(Types.BINARY, "blob");
        registerColumnTypes(Types.VARBINARY, "blob");
        registerColumnTypes(Types.LONGVARBINARY, "blob");
        // registerColumnType(Types.NULL, "null");
        registerColumnTypes(Types.BLOB, "blob");
        registerColumnTypes(Types.CLOB, "clob");
        registerColumnTypes(Types.BOOLEAN, "integer");

        registerFunction("concat", new VarArgsSQLFunction(StringType.INSTANCE, "", "||", ""));
        registerFunction("mod", new SQLFunctionTemplate(StringType.INSTANCE, "?1 % ?2"));
        registerFunction("substr", new StandardSQLFunction("substr", StringType.INSTANCE));
        registerFunction("substring", new StandardSQLFunction("substr", StringType.INSTANCE));
    }

    public boolean supportsIdentityColumns() {
        return true;
    }

    public boolean hasDataTypeInIdentityColumn() {
        return false; // As specify in NHibernate dialect
    }

    public String getIdentityColumnString() {
        // return "integer primary key autoincrement";
        return "integer";
    }

    public String getIdentitySelectString() {
        return "select last_insert_rowid()";
    }

    public boolean supportsLimit() {
        return true;
    }

    protected String getLimitString(String query, boolean hasOffset) {
        return new StringBuffer(query.length() + 20).append(query).append(hasOffset ? " limit ? offset ?" : " limit ?")
                .toString();
    }

    public boolean supportsTemporaryTables() {
        return true;
    }

    public String getCreateTemporaryTableString() {
        return "create temporary table if not exists";
    }

    public boolean dropTemporaryTableAfterUse() {
        return false;
    }

    public boolean supportsCurrentTimestampSelection() {
        return true;
    }

    public boolean isCurrentTimestampSelectStringCallable() {
        return false;
    }

    public String getCurrentTimestampSelectString() {
        return "select current_timestamp";
    }

    public boolean supportsUnionAll() {
        return true;
    }

    public boolean hasAlterTable() {
        return false; // As specify in NHibernate dialect
    }

    public boolean dropConstraints() {
        return false;
    }

    public String getAddColumnString() {
        return "add column";
    }

    public String getForUpdateString() {
        return "";
    }

    public boolean supportsOuterJoinForUpdate() {
        return false;
    }

    public String getDropForeignKeyString() {
        throw new UnsupportedOperationException("No drop foreign key syntax supported by SQLiteDialect");
    }

    public String getAddForeignKeyConstraintString(String constraintName, String[] foreignKey, String referencedTable,
                                                   String[] primaryKey, boolean referencesPrimaryKey) {
        throw new UnsupportedOperationException("No add foreign key syntax supported by SQLiteDialect");
    }

    public String getAddPrimaryKeyConstraintString(String constraintName) {
        throw new UnsupportedOperationException("No add primary key syntax supported by SQLiteDialect");
    }

    public boolean supportsIfExistsBeforeTableName() {
        return true;
    }

    public boolean supportsCascadeDelete() {
        return false;
    }
}
*/