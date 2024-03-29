package com.kq.sharding.mapper;

import com.kq.entity.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * AccountMapper
 *
 * @author1 kq
 * @date 2019-10-12
 */
@Mapper
public interface AccountMapper {

    @Select("select id,username,phone,province,createTime from t_account limit 20")
    public List<Account> getAccountList();


    @Insert("insert into t_account(id,username,phone,createTime) values(#{id},#{username},#{phone},#{createTime})")
    void addAccount(Account o);

    @Insert("insert into t_account(username,phone,createTime) values(#{username},#{phone},#{createTime})")
    void addAccountNoId(Account o);

    @Select("select id,username,phone,province,createTime from t_account where id=#{id}")
    public Account getAccount(Long id);

}
