package com.duminda.dremio.mappers;


import com.duminda.dremio.builders.ReminderSqlBuilder;
import com.duminda.dremio.filters.ReminderFilter;
import com.duminda.dremio.model.Reminder;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.List;
import java.util.Optional;

@Mapper
public interface DremioMapper {

    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id="ReminderResult", value= {
            @Result(column="idReminder", property="idReminder", jdbcType= JdbcType.VARCHAR, id=true),
            @Result(column="reminderNo", property="reminderNo", jdbcType=JdbcType.INTEGER),
            @Result(column="reminderLevel", property="reminderLevel", jdbcType=JdbcType.INTEGER),
            @Result(column="idForm", property="idForm", jdbcType=JdbcType.VARCHAR),
            @Result(column="reminderCode", property="reminderCode", jdbcType=JdbcType.VARCHAR),
            @Result(column="reminderShortDescriptionENG", property="reminderShortDescriptionENG", jdbcType=JdbcType.VARCHAR),
            @Result(column="reminderShortDescriptionFIN", property="reminderShortDescriptionFIN", jdbcType=JdbcType.VARCHAR),
            @Result(column="reminderDescription", property="reminderDescription", jdbcType=JdbcType.VARCHAR)
    })
    List<Reminder> findReminderByLevel_old(SelectStatementProvider selectStatement);

   /* @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ReminderResult")
    Optional<Reminder> selectOne(SelectStatementProvider selectStatement);*/

    @SelectProvider(type= ReminderSqlBuilder.class, method="getAllReminders")
    List<Reminder> findReminderByLevel(ReminderFilter filter);

}
