package com.kq.sharding.insertdata.dao;

import com.kq.sharding.insertdata.entity.Account;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * AccountDao
 *
 * @author kq
 * @date 2019-10-11
 */
@Repository
public class AccountDao extends BaseDao{

    /**
     * 获取账号列表
     * @return
     */
    public List<Account> getAccountList(){

        String sql = "select id,username,phone,province,createtime from account";
        List<Account> list = this.jdbcTemplate.query(sql, new RowMapper<Account>() {
            @Override
            public Account mapRow(ResultSet rs, int i) throws SQLException {

                Account account = new Account();
                account.setId(rs.getLong("id"));
                account.setPhone(rs.getString("phone"));
                account.setUsername(rs.getString("username"));
                account.setProvince(rs.getString("province"));
                account.setCreateTime(rs.getDate("createtime"));

                return account;
            }
        });

        return list;
    }

}
