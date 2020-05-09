package com.duminda.dremio.providers;

import com.duminda.dremio.filters.ReminderFilter;
import com.duminda.dremio.mappers.DremioMapper;
import com.duminda.dremio.model.Reminder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlTable;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.duminda.dremio.model.ReminderDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

@Service
public class ReminderProvider {

    @Autowired
    DremioMapper mapper;

    public List<Reminder> getReminderLevels_old(int level){

            BasicColumn[] selectList = BasicColumn.columnList(idReminder.as("idReminder"), reminderNo, reminderLevel,
                    idForm, reminderCode, reminderShortDescriptionENG, reminderShortDescriptionFIN,reminderDescription);

            SelectStatementProvider selectStatement = select(selectList)
                    .from(SqlTable.of("VM_Reminder"))
                    .where(reminderLevel, isEqualTo(level))
                    .build().render(RenderingStrategies.SPRING_NAMED_PARAMETER);

            return mapper.findReminderByLevel_old(selectStatement);
    }

    public List<Reminder> getReminderLevels(int level){
        return mapper.findReminderByLevel(new ReminderFilter(level));
    }
}
